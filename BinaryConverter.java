public class BinaryConverter {
    /**
     * Write a static method convertInt that converts the specified int into its binary equivalent using the following algorithm:
     * Declare a String to be returned.
     * Divide the integer, x, by 2.
     * Add the remainder to the return String.
     * Repeat steps 2 and 3 until x reaches 0.
     * @param input
     * @return
     */
    public static String convertInt(int input)
    {
        String tobeReturned = "";
        while (input > 0)
        {
            tobeReturned = (input % 2) + tobeReturned;
            input = input / 2;
        }
        return tobeReturned;
    }

    /**
     * Write a static method convertDouble that converts the specified double into its binary equivalent using the following algorithm (Note: algorithm only works for numbers less than 1):
     * Declare a String to be returned.
     * Multiply the double, x, by 2.
     * Add the number before the decimal to the return String.
     * If x is greater than or equal to 1, subtract 1.
     * Repeat steps 2-4 until x reaches 0.
     * @param input
     * @return
     */


    public static String convertDouble(double input)
    {
        String tobeReturned = "0.";
        while (input > 0)
        {

            input = input * 2;

            if (input > 1 || input == 1) // When the input is repeatedly multiplied by 2 until it reaches 1 (or more), it falls into this if statement. A "1" is added to the string for its binary value.
            {
                tobeReturned = tobeReturned + "1";
                input = input - 1;
            }
            else // A 0 is added for each mutiplication of input * 2 before it reaches or crosses "1".
            {
                tobeReturned = tobeReturned + "0";
            }

        }
        return tobeReturned;
    }

    /**
     * Write a static method convert that will convert the specified double into its binary equivalent.
     * This method differs from convertDouble in that it should work with any double.
     *
     * @param input
     * @return
     */
    public static String convert ( double input)
    {
        int partInteger = (int) input;
        double partFraction = input - partInteger;
        if ( partFraction > 0)
        {
            return convertInt(partInteger) + "." + convertDouble(partFraction).substring(2); // If theres a fraction part, it adds the int part of it to the fraction part of it, and formats it properly by adding a "." and starting from the 3rd character from input.
        }
        if (partFraction == 0)
        {
            return convertInt(partInteger);
        }
        return "";
    }


}


