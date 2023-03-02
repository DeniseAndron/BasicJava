public class DroidProgram {
    //instanta de battery si name
    int batteryLevel;
    String name;
    //constructorul care contine instantele cu valori
    public DroidProgram (String droidName){
        name = droidName;
        batteryLevel = 100;

    }
    //metoda principala care e rulata
    public static void main(String[] args) {
        // o noua instanta, punem valori in ea
        DroidProgram codey = new DroidProgram("Codey");
        DroidProgram levi = new DroidProgram("levi");
        System.out.println(codey);
        System.out.println(levi);
        // chemam metodele
        codey.performTask("sucking");
        levi.performTask("loving");
        levi.performTask("Crossfit");
        codey.performTask("testing");
        codey.performTask("dancing");
        codey.energyReport();
        levi.energyReport();

        codey.energyTransfer(levi, codey);
        codey.energyReport();
        levi.energyReport();
    }
    public String toString(){

        return "Hello, I'm the droid " + name;
    }

    public void performTask(String task){
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;

    }
    public void energyReport(){
        System.out.println("The battery level for " + name +" is: " + batteryLevel);
    }

    public void energyTransfer(DroidProgram first, DroidProgram second) {
       int temp;
       temp = first.batteryLevel;
       first.batteryLevel = second.batteryLevel;
       second.batteryLevel =temp;

    }


}
