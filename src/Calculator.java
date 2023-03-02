public class Calculator {
    //if you don't use the constructor, can delete it, java uses it in the bg

    //variabila globala in clasa
    String distanceType;
    public Calculator(String type) {
        // in constructor dam valoare la var globala
        distanceType = type;
    }
    public String Add(int a ,int b){
        int result = a + b;
        // when we return the result we have result + distancetype
        return result + distanceType;

    }
    public int Substract ( int a, int b){
        int result2 = a - b;

        return result2;
    }
    public int Multiply ( int a, int b){
        int result3 = a * b;
        return result3;

    }
    public int Divide ( int a, int b){
        int result4 = a / b;
        return result4;
    }
    public int Modulo ( int a, int b){
        int result5 = a % b;
        return result5;
    }

    public static void main (String[]args){
        //
        Calculator myCalculator = new Calculator(" mile");
        System.out.println(myCalculator.Add(5, 7));
        System.out.println(myCalculator.Substract(45, 11));
    }
}
