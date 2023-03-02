///*public class ConditionalOperators {
//    /*containing complex boolean relationships by reducing multiple boolean values to a single value: true or false.
//    * For example, what if we want to run a code block only if multiple conditions are true. We could use the AND operator: &&.
//    * Or, we want to run a code block if at least one of two conditions are true. We could use the OR operator: ||.
//    * Finally, we can produce the opposite value, where true becomes false and false becomes true, with the NOT operator: !.*/
//
//    //&& AND operator
//
////The OR operator, ||, is used between two boolean values and evaluates to a single boolean value.
//// If either of the two values is true, then the resulting value is true, otherwise the resulting value is false.
//
//    //Logical NOT: !
//    //The unary operator NOT, !, works on a single value. This operator evaluates to the opposite boolean to which it’s applied:
//    public static void main(String[] args) {
//        boolean hasPrerequisite = false;
//
//        if (!hasPrerequisite) {
//            System.out.println("Must complete prerequisite course!");
//            //the order of evaluation when it comes to conditional operators is as follows:
//            //Conditions placed in parentheses - ()
//            //NOT - !
//            //AND - &&
//            //OR - ||
//        }
//    }
//} */

public class ConditionalOperators {
    int carLoan = 1000;
    int loanLength = 3; // loan length of 3 years
    int interestRate = 5; // This will represent an interest rate of 5% on the loan.
    int downPayment = 2000; //This will represent the down payment provided by a user for this car purchase.
    public static void main(String[] args) {
       ConditionalOperators operator = new ConditionalOperators();  // in order to use the instance from the class, we need to create a new class instance
        if(operator.loanLength <= 0 || operator.interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan.");

        }else if(operator.downPayment >= operator.carLoan ){
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = operator.carLoan - operator.downPayment;
            int months = operator.loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * operator.interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }



    }
}
