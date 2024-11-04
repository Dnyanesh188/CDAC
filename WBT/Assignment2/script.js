let reservations = JSON.parse(localStorage.getItem('reservations')) || [];


function saveReservations() {
    localStorage.setItem('reservations', JSON.stringify(reservations));
}


document.getElementById('bookingForm')?.addEventListener('submit', function(event) {
    event.preventDefault();
    
    
    const transportType = document.getElementById('transportType').value;
    const route = document.getElementById('route').value;
    const departureTime = document.getElementById('departureTime').value;
    const numberOfSeats = document.getElementById('numberOfSeats').value;

    
    const reservation = {
        transportType,
        route,
        departureTime,
        numberOfSeats,
    };

    
    reservations.push(reservation);

    
    saveReservations();

    
    document.getElementById('bookingConfirmation').innerHTML = `
        <div class="alert alert-success" role="alert">
            Booking confirmed! You have booked ${numberOfSeats} seat(s) for ${transportType} on route ${route} at ${departureTime}.
        </div>
    `;

    
    document.getElementById('bookingForm').reset();
});


function displayUpcomingTrips() {
    const upcomingTripsTable = document.getElementById('upcomingTrips');
    if (!upcomingTripsTable) return; 

    
    upcomingTripsTable.innerHTML = '';

    
    const savedReservations = JSON.parse(localStorage.getItem('reservations')) || [];

    
    savedReservations.forEach((trip, index) => {
        upcomingTripsTable.innerHTML += `
            <tr>
                <td>${trip.transportType}</td>
                <td>${trip.route}</td>
                <td>${trip.departureTime}</td>
                <td>${trip.numberOfSeats}</td>
                <td><button class="btn btn-danger" onclick="cancelBooking(${index})">Cancel</button></td>
            </tr>
        `;
    });
}


function cancelBooking(index) {
    
    reservations.splice(index, 1);

    
    saveReservations();

    
    displayUpcomingTrips();
}


window.onload = function() {
    if (window.location.pathname.includes('userDashboard.html')) {
        console.log("User Dashboard loaded, attempting to display trips.");
        displayUpcomingTrips();
    }
};