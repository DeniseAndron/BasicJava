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
        //To get the length of an array, we can access the length field of the array object eg return topics.length
        System.out.println(betterPrintout);


        String[] students = {"Sade", "Alexus", "Sam", "Koma"};
        // it holds doubles and has 4 indexes
        double[] mathScores = new double[4];
        //we set the 0th index to 94.5
        mathScores[0] = 94.5;
        mathScores[2] = 76.8;
        System.out.println("The number of students in the class is " + students.length + ".");
    }


//The args parameter is another example of a String array. In this case, the array args contains the arguments that we pass in from the terminal when we run the class file.

}
