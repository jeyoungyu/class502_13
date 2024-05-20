package exam01;

import java.sql.SQLOutput;

public class Ex07 {
    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(() -> {
            Thread th2 = Thread.currentThread();
            while (true) {

               // try {
                    System.out.println("isInterrupted : " + th2.isInterrupted());
                    for (int j = 0; j < 1000000000L; j++);
                   // Thread.sleep(10000); // WAITING - 일시 정지
              //  } catch (InterruptedException e) { // RUNNABLE - 실행대기
               //     System.out.println("InteruptedException 발생 !");
              //  }
            }
        });

        th.start();

        Thread.sleep(3000);

        th.interrupt(); // InterruptedException 발생 , isInterrupted -> true

        {

        }
    }
}

