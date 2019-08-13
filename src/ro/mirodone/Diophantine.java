package ro.mirodone;

public class Diophantine {

    // function to find the GCD of 2 numbers

   private int gcd (int a, int b){
        return (a % b == 0) ? Math.abs(b) : gcd(b, a%b);
    }

    // function to check the solution
    boolean isPossible ( int first, int second, int result) {
        return (result % gcd(first, second) == 0);
    }



}
