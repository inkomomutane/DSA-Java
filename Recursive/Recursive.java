package Recursive;
/**
 * @author Nelson Alexandre Mutane
 * 
 */
public class Recursive {

    public int recursivePrintNumbers(int number) {
        System.out.println(number);
        if (number < 1)
            return number;
        return recursivePrintNumbers(number - 1) + number;
    }

    public int factorial(int number) {
        if (number <= 1)
            return 1;
        return factorial(number - 1) * number;
    }

    public int fibonacci(int number) {
        if (number <= 0)
            return 0;
        if (number == 1)
            return 1;
        return (fibonacci(number - 1) + fibonacci(number - 2));
    }

    public int sumOfDigit(int number) {
        if (number <= 0)
            return number;
        return (number % 10) + sumOfDigit((number - (number % 10)) / 10);
    }

    public int power(int number, int power) {
        return (power < 1) ? 1 : number * power(number, --power);
    }

    public int greaterCommuneDivisor(int aNumber, int bNumber) {
        if (aNumber < 0 || bNumber < 0)
            return -1;
        if (bNumber == 0)
            return aNumber;
        return greaterCommuneDivisor(bNumber, aNumber % bNumber);
    }

    public String intToBinary(int number) {
        if (number == 0)
            return "";
        return (intToBinary(number / 2)) + "" + (number % 2);
    }

    public String reverseString(String reversibleString) {
        if(reversibleString.length() < 1) return reversibleString;
        else
        return reverseString(reversibleString.substring(1)) + reversibleString.charAt(0);
    }
}
