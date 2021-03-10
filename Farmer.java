
public class Farmer extends Worker
{
    public Farmer() {
        wakeUp = 500;
        workHours = 16;
    }
    
    @Override
    void work()
    {
        // Farmer is working
        System.out.println("Farmer is working hard...");
        
    }

}
