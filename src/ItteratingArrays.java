import java.util.ArrayList;

public class ItteratingArrays {

    public static void main(String[] args) {
//Create empty array list
        ArrayList<Double> expenses = new ArrayList<>();
        // add values to the list
        expenses.add(74.46);
        expenses.add(63.99);
        expenses.add(10.57);
        expenses.add(81.37);
        //create total variable
        double total = 0;

        // Iterate over expenses
        for(int i=0; i < expenses.size(); i++){
            //Add each element to the total
            total = total + expenses.get(i);

        }


        System.out.println(total);

    }

}
