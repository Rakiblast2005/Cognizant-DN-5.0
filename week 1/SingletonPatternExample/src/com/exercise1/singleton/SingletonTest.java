package com.exercise1.singleton;

public class SingletonTest {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("===== Singleton Validation =====");

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.log("User Authentication Success");

        System.out.println("Logger1 HashCode : " + logger1.hashCode());
        System.out.println("Logger2 HashCode : " + logger2.hashCode());

        System.out.println("Same Instance ? " + (logger1 == logger2));

        System.out.println("\n===== Concurrent Access Test =====");

        Logger[] loggerArray = new Logger[5];
        Thread[] workers = new Thread[5];

        for (int i = 0; i < workers.length; i++) {

            final int index = i;

            workers[i] = new Thread(() -> {

                loggerArray[index] = Logger.getInstance();

                loggerArray[index].log(
                        "Executed by " +
                        Thread.currentThread().getName());

            }, "Worker-" + (i + 1));
        }

        for (Thread worker : workers) {
            worker.start();
        }

        for (Thread worker : workers) {
            worker.join();
        }

        boolean singletonVerified = true;

        for (Logger logger : loggerArray) {

            if (logger != loggerArray[0]) {

                singletonVerified = false;
                break;
            }
        }

        System.out.println("\nAll threads received same instance : "
                + singletonVerified);

        if (singletonVerified) {
            System.out.println("PASS : Singleton Pattern works correctly.");
        } else {
            System.out.println("FAIL : Multiple instances detected.");
        }
    }
}