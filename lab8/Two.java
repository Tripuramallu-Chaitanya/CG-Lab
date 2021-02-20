package lab8;

import java.util.Date;

class MyThread implements Runnable{

	@Override
	public void run() {
		while(true) {
			
			try {
				System.out.println("Timer refreshed....\t"+new Date());
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class Two {

	public static void main(String[] args) {
		MyThread obj = new MyThread();
		Thread timer =new Thread(obj,"timer");
		timer.start();
		

	}

}
