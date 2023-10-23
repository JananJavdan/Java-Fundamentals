package FinalExample1;

public class FinalExample {
    //final variable, direct initialize
    final int THRESHOLD = 5;
    // a final static variable PI, direct initialize
    static final double PI = 3.141592653589793;
    // blank final variable
static final int DAYS_OF_THE_WEEK;
// blank final variable
final int MINIMUM;

// instance initializer block
{
 int CAPACITY = 25;
}
// static initializer
    static {
    DAYS_OF_THE_WEEK = 7;
}
    /*
     *constructor for initializing MINIMUM Note that if there are more than one constructor,
     *you must initialize MINIMUM in them also
     */

   public FinalExample() {
        MINIMUM = 0;

   }

}
