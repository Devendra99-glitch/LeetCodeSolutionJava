// 7. Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//Example 1:
//Input: x = 123 Output: 321
//Example 2:
//Input: x = -123 Output: -321
//Example 3:
//Input: x = 120 Output: 21

public class ReverseInteger {
    public static void main(String[] args){

        System.out.println(reverseInteger(123));
    }

    // Creating a method to reverse an integer
    public static int reverseInteger(int x) {
        long reverse = 0;
        int remainder;          // variable to store the remainder of the number
        while(x != 0){          // while x is not equal to zero, that means x can either be positive or negative but not 0
            remainder = x % 10;     // we remove the last digit of the number by using the remainder operator. in this case remainder is 3;
            reverse = (reverse * 10) + remainder;   // then we multiply the reverse with 10 and add the remainder. in the first case, the reverse is 0 so it will store the last digit of the number. (i.e.3)
            x /= 10;        // then we remove the last digit from the number and go into the while loop again with 12.
        }

        return (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) ? 0 : (int)reverse; // Finally we check if the number is not 64- bit integer, as they are not allowed, and then pass the result.
    }
}
