package chapter.second.noDeadMain;

/**
 * Created by wuyan on 2016/3/4.
 */
public class PrintString implements Runnable {
    private volatile boolean isContinuePrint = true;
    public void setContinuePrint(boolean isContinuePrint){
        this.isContinuePrint = isContinuePrint;
    }
    public void printStringMethod(){
        try{
            while(isContinuePrint){
                System.out.println("run printStringMethod threadName=" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
