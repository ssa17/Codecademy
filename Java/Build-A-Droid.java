public class Droid {

  int batteryLevel;
  String name;

  //construct Droid
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  //Output name of Droid
  public String toString(){
    return "Hi! My name is " + name;
  }

  //
  public void performTask(String task){
    System.out.println(name + " is performing a task: " + task);
    batteryLevel -= 10;
    System.out.println("Battery level now..." + batteryLevel + "%");
  }

  public static void main(String[] args){
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
    Codey.performTask("Running");
    Codey.performTask("Computing");
    Codey.performTask("Calulating Death");
    System.out.println(Codey.batteryLevel);
  }
}
