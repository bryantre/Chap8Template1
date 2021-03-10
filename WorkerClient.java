
public class WorkerClient
{
    public static void main(String[] args) {
        Worker computerScientist = new ComputerScientist();
        Worker farmer = new Farmer();
        Worker manager = new Manager();
        
        computerScientist.dailyRoutine();
        farmer.dailyRoutine();
        manager.dailyRoutine();
    }
}
