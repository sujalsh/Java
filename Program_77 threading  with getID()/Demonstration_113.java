class ThreadId extends Thread{
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId() +
            "is running");
        }catch(Exception e){
            //Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
public class Demonstration_113 {
    public static void main(String[] args){
        int n = 8; // Number of Threads
        for(int i=0;i<8;i++){
            ThreadId object = new ThreadId();
            object.start();
        }
    }
}