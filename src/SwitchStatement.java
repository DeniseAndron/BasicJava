/*public class SwitchStatement {
    public static void main(String[] args) {
        String course = "Biology";

        switch (course) {
            case "Algebra":
                // Enroll in Algebra
            case "Biology":
                // Enroll in Biology
            case "History":
                // Enroll in History
            case "Theatre":
                // Enroll in Theatre
            default:
                System.out.println("Course not found");
        }

    }
}
/*An alternative to chaining if-then-else conditions together is to use the switch statement.
This conditional will check a given value against any number of conditions and run the code block where there is a match.
 */


public class SwitchStatement {
    boolean isFilled;
    double billAmount;
    String shipping;

    public SwitchStatement(boolean filled, double cost, String shippingMethod) {
        if (cost > 24.00) {
            System.out.println("High value item!");
        }
        isFilled = filled;
        billAmount = cost;
        shipping = shippingMethod;
    }

    public void ship() {
        if (isFilled) {
            System.out.println("Shipping");
            System.out.println("Shipping cost: " + calculateShipping());
        } else {
            System.out.println("Order not ready");
        }
    }
//We’ll check the value of the instance field shipping.
//
//When shipping matches "Regular", shippingCost should be 0.
//When shipping matches "Express", shippingCost should be 1.75.
//The default should assign .50 to shippingCost.
    public double calculateShipping() {
        double shippingCost;
        // declare switch statement here
        switch (shipping){
            case "Regular":
                shippingCost = 0;
                break;
            case "Express":
                shippingCost = 1.75;
                break;
            default:
                shippingCost = .50;
        }

        return shippingCost;
    }

    public static void main(String[] args) {
        // do not alter the main method!
        SwitchStatement book = new SwitchStatement(true, 9.99, "Express");
        SwitchStatement chemistrySet = new SwitchStatement(false, 72.50, "Regular");

        book.ship();
        chemistrySet.ship();
    }
}
