package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        //test code 1

        Diophantine diophantine = new Diophantine();
        Diophantine2 diophantine2 = new Diophantine2();

       /* int first = 309;
        int second = 37;
        int result = 90005;*/

        int first = 2;
        int second = 3;
        int result = 7;

        if(diophantine.isPossible(first, second, result))
            System.out.println(" Possible");
        else
            System.out.println("Not Possible");

        diophantine2.equation(first, second, result);

    }
}
