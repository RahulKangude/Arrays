package arraysdemo;

public class Synchro1  {
  public static void main(String[] args) {
	new  Syncru2 ().start();
	new  Syncru2 ().start();
}
}

class Syncru2 extends Thread{
	@Override
	synchronized public void run() {
		System.out.println("start");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("end");
		}
	}
}