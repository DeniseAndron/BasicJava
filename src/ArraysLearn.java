import java.util.Arrays;

public class ArraysLearn {
//    An array holds a fixed number of values of one type.
//    Arrays hold doubles, ints, booleans, or any other primitives.
//    Arrays can also contain Strings as well as object references!
    //An array looks like this:
    public ArraysLearn() {

    }
    //when creating an array method, we need to put [] when we declare
    public String[] getTopics(){
        String[] topics = {"Opinion", "Tech", "Science", "Health"};
        return topics;

    }

    public static void main(String[] args) {
        ArraysLearn sampleFeed = new ArraysLearn();
        String[] topics = sampleFeed.getTopics();
        //If we want to have a more descriptive printout of the array itself, we need a toString() method that is provided by the Arrays package in Java.
        String betterPrintout = Arrays.toString(topics);

        System.out.println(betterPrintout);
    }


}
