 class Program9{
    
    int intValue;
    float floatValue;
    double doubleValue;
    long longValue;
    short shortValue;
    byte byteValue;
    boolean booleanValue;
    char charValue;

    
    static int staticIntValue;
    static float staticFloatValue;
    static double staticDoubleValue;
    static long staticLongValue;
    static short staticShortValue;
    static byte staticByteValue;
    static boolean staticBooleanValue;
    static char staticCharValue;

    public static void main(String[] args) {
        
        Program9 obj = new Program9();

        
        System.out.println("Instance variables default values:");
        System.out.println("int: " + obj.intValue);
        System.out.println("float: " + obj.floatValue);
        System.out.println("double: " + obj.doubleValue);
        System.out.println("long: " + obj.longValue);
        System.out.println("short: " + obj.shortValue);
        System.out.println("byte: " + obj.byteValue);
        System.out.println("boolean: " + obj.booleanValue);
        System.out.println("char: '" + obj.charValue + "'");

        
        System.out.println("\nStatic variables default values:");
        System.out.println("int: " + staticIntValue);
        System.out.println("float: " + staticFloatValue);
        System.out.println("double: " + staticDoubleValue);
        System.out.println("long: " + staticLongValue);
        System.out.println("short: " + staticShortValue);
        System.out.println("byte: " + staticByteValue);
        System.out.println("boolean: " + staticBooleanValue);
        System.out.println("char: '" + staticCharValue + "'");
    }
}