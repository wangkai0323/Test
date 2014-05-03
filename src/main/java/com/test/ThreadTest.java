package com.test;

/**
 * Created by aries on 5/3/14.
 */
public class ThreadTest {
    public static void main(String[] args) {
        R r = new R();
        for (int i = 0; i < 10; i++)
            new Thread(r).start();

    }


    static class R implements Runnable {
        private int x = 0;

        public void run() {

            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {

                }
                System.out.println(x++);

            }
        }
    }
}
