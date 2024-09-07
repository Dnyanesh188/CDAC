class Program8 {
    public static void main(String[] args) {
        
        int intValue = 100;
        float floatValue = 25.75f;
        double doubleValue = 123.456;
        long longValue = 123456789L;
        short shortValue = 32000;
        byte byteValue = 120;
        boolean booleanValue = true;
        char charValue = 'A';

        
        String intString1 = Integer.toString(intValue);
        String floatString1 = Float.toString(floatValue);
        String doubleString1 = Double.toString(doubleValue);
        String longString1 = Long.toString(longValue);
        String shortString1 = Short.toString(shortValue);
        String byteString1 = Byte.toString(byteValue);
        String booleanString1 = Boolean.toString(booleanValue);
        String charString1 = Character.toString(charValue);

        
        String intString2 = String.valueOf(intValue);
        String floatString2 = String.valueOf(floatValue);
        String doubleString2 = String.valueOf(doubleValue);
        String longString2 = String.valueOf(longValue);
        String shortString2 = String.valueOf(shortValue);
        String byteString2 = String.valueOf(byteValue);
        String booleanString2 = String.valueOf(booleanValue);
        String charString2 = String.valueOf(charValue);

        
        System.out.println("Using toString() method:");
        System.out.println("int to String: " + intString1);
        System.out.println("float to String: " + floatString1);
        System.out.println("double to String: " + doubleString1);
        System.out.println("long to String: " + longString1);
        System.out.println("short to String: " + shortString1);
        System.out.println("byte to String: " + byteString1);
        System.out.println("boolean to String: " + booleanString1);
        System.out.println("char to String: " + charString1);

        System.out.println("\nUsing String.valueOf() method:");
        System.out.println("int to String: " + intString2);
        System.out.println("float to String: " + floatString2);
        System.out.println("double to String: " + doubleString2);
        System.out.println("long to String: " + longString2);
        System.out.println("short to String: " + shortString2);
        System.out.println("byte to String: " + byteString2);
        System.out.println("boolean to String: " + booleanString2);
        System.out.println("char to String: " + charString2);
    }
}