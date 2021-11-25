public class Dsa{
    public static void main(String[] args) {
       // System.out.println("x");    
      int data = 1010;
      System.out.println(intToBinary((int) 221));
    }
    public static int recursivePrintNumbers(int number){
        if ( number < 1 )return number;  return recursivePrintNumbers(number -1) + number;
     }
     public static int  factorial(int n) {
         if(n <= 1) return 1; return factorial(n-1) * n;
     }
     public static int fibonacci( int n) {
         if(n <= 0 ) return 0; 
         if(n == 1 ) return 1;return (fibonacci(n-1 ) + fibonacci(n - 2));
     }
     public static int sumOfdigit(int number) {
      if(number <= 0 ) return number;
     return (number%10) +  sumOfdigit((number - (number%10))/10);
    }
    public static int  power(int number,int power) {
      return  (power < 1) ? 1 : number * power(number, --power);
    }
    public static int gratherComunDivisor(int aNumber,int bNumber) {
      if(aNumber < 0 || bNumber < 0 ) return -1;
      if(bNumber == 0) return aNumber; return gratherComunDivisor(bNumber,aNumber%bNumber);
    }
    public static int intToBinary(int number) {
      if(number == 0 ) return 0;
      return (number%2)  + (intToBinary(number/2) *10 );
    }
}