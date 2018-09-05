package com.hwmulty;

import java.util.concurrent.TimeUnit;

public class hwmulty2 {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable myRunnable = new MyRunnable();
		Thread myThread = new Thread(myRunnable);
		myThread.start();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e1) {
		}
		System.out.println("Finish " + Thread.currentThread().getName());

		}

}
class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i + "-" + Thread.currentThread().getName());
		}
	}

}