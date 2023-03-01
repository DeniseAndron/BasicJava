public class IFstatement {
    public static void main(String[] args) {
        boolean cond = 1 < 6; //condition , to test equality you use ==
        int myInt = 15;

        if(myInt < 10) {
            System.out.println("Yes, it's true"); //if statement its true perform this action

        }else if (myInt > 20) { // you can also set another if , this is an alternative, if first condition is true, stops there
            System.out.println("No, its false"); //if not perform this
        } else {
            System.out.println("None of the above");
        }
        int loop = 0;
        while (true){
            System.out.println("looping: " + loop);
            if (loop == 5) {
                break;
            }
            loop++;
            System.out.println("Running");
            //a quick example on how its looping through both
        }
    }
}
// Nested conditional statement
/*
if (outer condition) {
        if (nested condition) {
        Instruction to execute if both conditions are true
        }
        }

 */