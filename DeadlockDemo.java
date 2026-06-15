public class DeadlockDemo {
    
    private final  Object lockA= new Object();
    private final  Object lockB= new Object();

    public void methodOne(){

        synchronized(lockA){
            System.out.println("thread 1:Holding lockA");
            try{Thread.sleep (100); } catch (InterruptedException e){}
            synchronized(lockB){
                  System.out.println("Thread 1 : Holding lockA & lockB...");
            }
            }

        }
        public void methodTwo(){
            synchronized(lockB){
                System.out.println("thread 2:Holding lockB..");
                try{Thread.sleep (100); } catch (InterruptedException e){}
                synchronized(lockA){
                      System.out.println("Thread 2 : Holding lockb & lockA...");
                }
                }

        }
        public static void main(String[] args){
            DeadlockDemo demo = new DeadlockDemo();
            Thread t1 = new Thread(()-> demo.methodOne());
            Thread t2 = new Thread(()-> demo.methodTwo());

            t1.start();
            t2.start();
            
        }


    }

