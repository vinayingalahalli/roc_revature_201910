package using_thread_class;

public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		Thread t=Thread.currentThread();
		t.setPriority(8);
		t.setName("myMain");
		System.out.println(Thread.currentThread());
		
		MyThread m1=new MyThread();
		m1.setName("my-1");
		m1.setDaemon(true); //-> makes it as background thread.
		MyThread m2=new MyThread();
		m2.setName("my-2");
		m2.setDaemon(true); 
		MyThread m3=new MyThread();
		m3.setName("my-3");
		m3.setDaemon(true); 
		MyThread m4=new MyThread();
		m4.setName("my-4");
		m4.setDaemon(true); 
		MyThread m5=new MyThread();
		m5.setName("my-5");
		m5.setDaemon(true); 
		MyThread m6=new MyThread();
		m6.setName("my-6");
		m6.setPriority(10);
		m6.setDaemon(true); 
		m1.start();
		m2.start();
		m3.start();
		m4.start();
		m5.start();
		m6.start();
		
		for (int i = 0; i < 1; i++) {
			System.out.println("Printing from "+Thread.currentThread().getName()+" value of i = "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}
