package isInteger;
//    Given a string, determine if it is an integer. For example the
//    string “123” is an integer, but the string “hello” is not.
//
//    It is an integer if all of the characters in the string are digits.
//
//    Return true if it is an integer, or false if it is not.
//
public class IsInteger {
    public boolean isInteger(String a) {
        try {
            Integer.parseInt(a);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}
