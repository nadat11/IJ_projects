
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        //int has a width 32
        int myMinValue = Integer.MIN_VALUE;//-2_147_483_648;
        int myMaxValue = Integer.MAX_VALUE; //2_147_483_647;
        int myTotal= (myMinValue/2);
        System.out.println("Integer min value: "+myMinValue);
        System.out.println("Integer max value: "+myMaxValue);
        System.out.println("My integer: " + myTotal);

        //short has a width 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("MyNewShortValue: "+ myNewShortValue);

        //byte has a width 8
        byte myByteValue = -128;
        byte myNewByteValue= (byte) (myByteValue/2);
        System.out.println("MyNewByteValue: " + myNewByteValue);
        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Byte Min Value: " +myMinByteValue);
        System.out.println("Byte Max Value: "+ myMaxByteValue);

        //short has a width 16
        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("Short Min Value: " +myMinShortValue);
        System.out.println("Short Max Value: "+ myMaxShortValue);

        //long has a width 64
        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("Long Min Value: " +myMinLongValue);
        System.out.println("Long Max Value: "+ myMaxLongValue);

        long myLongValue =100L;

        byte byteValue= 10;
        short shortValue=20;
        int intValue = 50;
        long longTotal = 50000L + 10L * (byteValue +shortValue+intValue);
        System.out.println("longTotal: "+longTotal);
        short shortTotal = (short) (1000 + 10 * (byteValue+shortValue+intValue));
        System.out.println("shortValue: " + shortTotal );

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min: " + myMinFloatValue);
        System.out.println("Float max: "+ myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min: " + myMinDoubleValue);
        System.out.println("Double max: "+ myMaxDoubleValue);

        double pounds= 200d;
        double kilograms= pounds*0.45359237d;
        System.out.println("Pounds to kilograms: "+kilograms);

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyRight = '\u00A9';
        System.out.println(myCopyRight);

        boolean isCustomerOverTwentyOne = true;

        boolean isCar = false;
        if(isCar){
            System.out.println("This is supposed not to hapend");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true!");
        }
    }
}
