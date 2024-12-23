public class CreditCardChecker
{
    /**
     * CreditCardChecker’s check method will return
     * true if the specified 8-digit int is a valid
     * credit card number.  The following process is
     * used to verify actual credit card numbers
     * but, for simplicity, we will describe it for
     * numbers with 8 digits instead of 16:
     *
     * Precondition: User must input 8 digit  instead of 16
     * digit credit card number
     *
     * @param creditNum
     * @return
     */
    public static boolean check (int creditNum)
    {
        int i = 0;
        int adddedValue = 0;
        while (creditNum > 0)
        {
            int value = creditNum % 10;
            creditNum = creditNum / 10;
            // This if statement identifies if the position is even, and if it is, it adds every other digit from the rightmost
            if (i % 2 == 0)
            {
                adddedValue = adddedValue + value;
            }
            else
            {
                value = value * 2; // If the position is odd, the digits are doubled
                while (value > 9)
                {
                    value = value - 9; // Uses a very interesting method to add the digits of the productssSSSSSSS togeter. For example, if you get 18, and you subtract 9, you get 9. This is the equivalent of 1 + 8. This can be done with numbers like 27 as well. 2 + 7 = 9. 27 - 9 = 18. Once again repeat 18- 9 = 9. 2 + 7 = 9.
                }
                adddedValue = adddedValue + value;
            }
            i++;
        }
        return adddedValue % 10 == 0; // Returns true or false based on whether this condition is true or not.  If true, then number is valid. If false, then number is invalid.
    }
}



