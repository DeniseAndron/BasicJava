public class LearnWhileLoops {
    public static void main(String[] args) {
//    CTRL + Shift + F to format the code correctly
       // boolean loop = 4 < 5 ;   if I run this I will get true or false
        int value = 0;

        //while condition determines
        while( value < 10 ) {  // we start with value equal 0 -> this is the condition
            System.out.println("hello" +" " + value);  // we output some text -> the code I want to execute
            value =  value + 1; // whatever value is, add 1 to the value so that way it will increase and eventually will stop at 10
        }

    }
}
