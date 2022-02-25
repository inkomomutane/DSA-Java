
import Arrays.ArrayProblems;
import Recursive.Recursive;

/**
 * @author Nelson Alexandre Mutane
 * 
 */

public class Main {
    public static void main(String[] args) {     
        ArrayProblems arrayProblems = new ArrayProblems();   
    //    Recursive recusive = new Recursive();
    //    System.out.println(recusive.factorial(41));
    //    System.out.println(recusive.fibonacci(42));
    //    System.out.println(recusive.intToBinary(1563749802));
    //    recusive.recursivePrintNumbers(344);
    //    System.out.println(recusive.sumOfdigit(42345333));
    //    System.out.println(recusive.gratherComunDivisor(4,45));
    //    System.out.println(recusive.power(5,11));
    //    System.out.println(recusive.reverseString("reversableString"));
    String [] test =  {
        "Java",
        
        "Python",
        "PHP",
        "C#",
        "C Programming",
        "C++"
    };
     test = arrayProblems.sortArrayAsc(test);
        for (String i : test) {
            System.out.print(i+ ",");
        }
    }
}
