package lambdas;

public class RunnableLambaExample {
    static void main(String[] args) {
        /*
        prior Java 8
        */
        Runnable runn = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runn).start();

        /*
        Java 8 Lamba
          */
        Runnable runnableLamba = () -> {
            System.out.println("Inside Runnable 2");
        };

        Runnable runnableLambda2 = () -> System.out.println("Inside Runnable 3");

        new Thread(runnableLamba).start();
        new Thread(runnableLambda2).start();

        //Shortest
        new Thread(() -> System.out.println("Inside Runnable 4")).start();
    }
}
