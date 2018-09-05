package com.hwmulty;

import java.util.concurrent.TimeUnit;

public class hwmulty1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e1) {
		}
		System.out.println("Finish " + Thread.currentThread().getName());

		}

}
class MyThread extends Thread {
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