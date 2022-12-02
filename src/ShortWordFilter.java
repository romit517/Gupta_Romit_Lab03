public class ShortWordFilter implements Filter{
    @Override

    public boolean accept(Object x) {

        //To check if it is a string...

        if (x instanceof String){

            String str = (String) x;

            //Returning true if string length is lesser than 5 else make it false.

            return str.length() < 5;

        }

        return false; // which implies that our 'x' is not a string.

    }

}
