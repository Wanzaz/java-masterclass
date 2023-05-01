class Variables {
    public static void main(String[] args) {
        // INTEGER (32 bits)
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        
        int myTotal = (minIntValue / 2);

        System.out.println("Integer Minimum Value = " + minIntValue);
        System.out.println("Integer Maximum Value = " + maxIntValue);
        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " ; " + Integer.MAX_VALUE + ")");

        System.out.println(maxIntValue + 1); // overflow
        System.out.println(minIntValue - 1); // underflow

        // numbers are possible to be written as this example to be more readable
        int maxIntTest = 2_147_483_647;

        // BYTE = has the smallest range (8 bits)
        System.out.println("Byte Value Range (" + Byte.MIN_VALUE + " ; " + Byte.MAX_VALUE + ")");

        // SHORT (16 bits)
        System.out.println("Short Value Range (" + Short.MIN_VALUE + " ; " + Short.MAX_VALUE + ")");
        System.out.println("Width size of Short in bits = " + Short.SIZE);

        // LONG (64 bits)
        // 'l' or 'L' has to be added to the end of the number to recognised as Long type
        // otherwise it will be recognised as Integer
        long longValue = 100L; 
        System.out.println("Long Value Range (" + Long.MIN_VALUE + " ; " + Long.MAX_VALUE + ")");


        // CASTING
        short minShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;
        byte minByteValue = Byte.MIN_VALUE, maxByteValue = Byte.MAX_VALUE;

        // Java can make assumptions about literal values, 
        // that it can't make about expressions with variables
        // byte newByteValue1 = (minByteValue / 2); // causes ERROR
        byte newByteValue1 = (byte) (minByteValue / 2); // CASTING
        byte newByteValue2 = (-128 / 2);


        // Primitive Types Challenge
        byte byteVar = 97;
        short shortVar = 33;
        int intVar = 25;
        long longTotal = 50_000L + 10L * (byteVar + shortVar + intVar);
        System.out.println(longTotal);


        // Floating-point Numbers
        // Double - 64 bits (The DEFAULT TYPE)
        // Float - 32 bits
        System.out.println("Float Value Range (" + Float.MIN_VALUE + " ; " + Float.MAX_VALUE + ")");
        System.out.println("Double Value Range (" + Double.MIN_VALUE + " ; " + Double.MAX_VALUE + ")");
        float floatValue = 5f;
        double doubleValue = 5d;

        // float otherFloatValue = 5.25; ERROR because default type is DOUBLE
        float otherFloatValue = (float) (5.25);

        // Dividing
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        // Floating-point Challenge
        double numberOfPounds = 225d;
        double convertedKilograms = numberOfPounds * 0.45359237;
        System.out.println("Converted kilograms = " + convertedKilograms);


        // CHAR
        // Char - 16 bits
        // Unicode
        char myChar = '\u0044'; // 'D'
        char myChar1 = 68; // 'D'

        // The char Challenge
        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar = 63;
        System.out.println("My values are: " + mySimpleChar + myUnicodeChar + myDecimalChar);

        // BOOLEAN
        boolean trueBooleanValue = true;
        boolean falseBooleanValue = false;

        // String
        // strings are Immutable
        // StringBuilder class is mutable
        String myString = "This is a string";
        myString = myString + ", and this is more.";
        String wish = "I wish I had \u00241,000,000.00";
        System.out.println(wish);

        String lastString = "10"; int myInt = 50;
        String lastStringEnd = lastString + myInt;
        System.out.println(lastStringEnd);


        // Operators, Operands and Expressions
        char firstChar = 'A', secondChar = 'B';
        System.out.println(firstChar + secondChar); // 131
        System.out.println("" + firstChar + secondChar); // AB

        // Remainder Operator - Modulo
        System.out.println(10 % 5 == 0);

        // Abbreviating Operators
        // {} - for longer statements in JShell
        // result++ -> result = result + 1;
        //      = Post-fix Increment Operator
        // result-- -> result = result - 1;
        //      = Post-fix Decrement Operator

        // Compound Assignment Operator Challenge
        // result -= 5.5; is equal to 
        //      result = (int) (result - 5.5);
        {
            int result = 10;
            // result = result - 5.5; ERROR
            result = (int) (result - 2.5);
            result -= 5.5;
            System.out.println("result = " + result);
        }
    }
}
