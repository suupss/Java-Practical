package Section_one.Three;

class NumberPrinter implements Runnable {
    private int number;
    private String threadName;
    

    public NumberPrinter(int number, String threadName) {
        this.number = number;
        this.threadName = threadName;
    }
    
    @Override
    public void run() {
    
        for (int i = 1; i <= 5; i++) {
            synchronized(System.out) {  
                System.out.println(threadName + " prints: " + number + " x " + i + " = " + (number * i));
                
                // Add a small pause
                try {
                    Thread.sleep(500);  
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


public class SimpleThreadDemo {
    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new NumberPrinter(2, "Thread 1"));
        Thread thread2 = new Thread(new NumberPrinter(3, "Thread 2"));
        
        
        System.out.println("Starting the threads...");
        thread1.start();
        thread2.start();
        
       
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("All threads have finished!");
    }
}