public abstract class Worker {
    int wakeUp;
    int workHours;
    
    final void dailyRoutine() {
        getUp();
        goToWork();
        work();
        returnHome();
        relax();
        sleep();
    }
    
    abstract void work();
    
    public void getUp() {
        System.out.println("Getting up at " + wakeUp + "...");
    }
    public void goToWork() {
        System.out.println("Going to work...");
    }
    public void returnHome() {
        System.out.println("Returning home...");
    }
    public void relax() {
        System.out.println("Relaxing...");
    }
    public void sleep() {
        System.out.printf("Sleeping...\n\n");
    }
}