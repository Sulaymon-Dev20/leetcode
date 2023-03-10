package uz.leetcode.traskModel;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class FizzBuzz {
    private int n;
    private int i;
    Semaphore fizz = new Semaphore(0);
    Semaphore buzz = new Semaphore(0);
    Semaphore fizzbuzz = new Semaphore(0);
    Semaphore number = new Semaphore(1);

    public FizzBuzz(int n) {
        this.n = n;
        this.i = 1;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (true) {
            fizz.acquire();
            if (i <= n) {
                printFizz.run();
                releaseNextSemaphore(++i);
            } else {
                releaseAll();
                return;
            }
        }
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (true) {
            buzz.acquire();
            if (i <= n) {
                printBuzz.run();
                releaseNextSemaphore(++i);
            } else {
                releaseAll();
                return;
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (true) {
            fizzbuzz.acquire();
            if (i <= n) {
                printFizzBuzz.run();
                releaseNextSemaphore(++i);
            } else {
                releaseAll();
                return;
            }
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            number.acquire();
            if (i <= n) {
                printNumber.accept(i);
                releaseNextSemaphore(++i);
            } else {
                releaseAll();
                return;
            }
        }
    }

    private void releaseNextSemaphore(int i) {
        if (i % 3 == 0) {
            if (i % 5 == 0) {
                fizzbuzz.release();
            } else {
                fizz.release();
            }
        } else {
            if (i % 5 == 0) {
                buzz.release();
            } else {
                number.release();
            }
        }
    }

    private void releaseAll() {
        fizz.release();
        buzz.release();
        fizzbuzz.release();
        number.release();
    }
}
