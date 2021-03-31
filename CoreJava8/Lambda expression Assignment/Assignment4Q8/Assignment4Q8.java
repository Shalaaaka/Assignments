class source{
  int number = 1;
  int numOfThreads;
  int numInSequence;
  source(int numInSequence, int numOfThreads){
    this.numInSequence = numInSequence;
    this.numOfThreads = numOfThreads;
  }
  public void printNum(int result){
    synchronized(this) {
      while (number < numInSequence - 1) {
        while(number % numOfThreads != result){
          try {
            this.wait();
          } catch (InterruptedException e) {

            e.printStackTrace();
          }
        }
        System.out.println(Thread.currentThread().getName() + " - " + number++);
        this.notifyAll();
      }
    }
  }
}
class SeqRunnable implements Runnable{
  source sp;
  int result;
  static Object sharedObj = new Object();
  SeqRunnable(source sp, int result){
    this.sp = sp;
    this.result = result;
  }
  @Override
  public void run() {
    sp.printNum(result);
  }
}
public class Assignment4Q8  {
  final static int NUMBERS_IN_SEQUENCE = 10;
  final static int NUMBER_OF_THREADS = 3;
  public static void main(String[] args) {
    
    source sp = new source(NUMBERS_IN_SEQUENCE, NUMBER_OF_THREADS);
    
    Thread t1 = new Thread(new SeqRunnable(sp, 1), "Thread1");
    Thread t2 = new Thread(new SeqRunnable(sp, 2), "Thread2");
    Thread t3 = new Thread(new SeqRunnable(sp, 0), "Thread3");

    t1.start();
    t2.start();
    t3.start();
  }
}

//need to learn concept properly