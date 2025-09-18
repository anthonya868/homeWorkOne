package isDivisible;

//Write a method that returns whether a is divisible by b.
//
//Your method signature should be
//
//public boolean isDivisible(int a, int b)

public class IsDivisible {
    public boolean isDivisible(int a, int b){
        try {
            if (a%b == 0){
                return true;
            }
            else {
                return false;
            }
        }
        catch (ArithmeticException e) {
            return false;
        }
    }
}
