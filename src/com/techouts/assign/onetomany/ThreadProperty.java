package com.techouts.assign.onetomany;

public class ThreadProperty extends Thread{
	@Override
	public void run() {
		System.out.println("current thread name :"+Thread.currentThread().getName());
		System.out.println("current thread priority :"+Thread.currentThread().getPriority()+" \n"+"Its checking whether current thread is daemon or not =" +Thread.currentThread().isDaemon());
		
	}


	
	

	public static void main(String[] args) {

		ThreadProperty obj=new ThreadProperty();
		Thread t1=new Thread(obj);
		t1.setName("Deepika");
		System.out.println("state of thread 1:\n"+t1.getState());
		
		t1.setPriority(8);
		t1.setDaemon(true);
		Thread t2=new Thread(obj);
		t2.setPriority(5);
		System.out.println("state of thread 2:\n"+t2.getState());
		
		Thread t3=new Thread(obj);
		t3.setPriority(3);
		System.out.println("state of thread 3:\n"+t3.getState());
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("thread 1 after calling start method:\n"+t1.getState());
		System.out.println("thread 2 after calling start method:\n"+t2.getState());
		System.out.println("thread 3 after start method:\n"+t3.getState());
		try {
			t1.sleep(5000);
			System.out.println("thread 1 after calling sleep method:\n"+t1.getState());
			t2.sleep(2000);
			System.out.println("thread2 after calling sleep method:\n"+t2.getState());
			t3.sleep(1000);
			System.out.println("thread3 after calling sleep method:\n"+t3.getState());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
	