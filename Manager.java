
public class Manager extends Worker
{
    public Manager() {
        wakeUp = 1000;
        workHours = 8;
    }
    
    @Override
    void work()
    {
        // Manager works
        System.out.println("Manager is managing...");
    }
    
    @Override
    public void relax() {
        // Relaxing like a manager would
        System.out.println("Relaxing like a manager would...");
    }
    
}
