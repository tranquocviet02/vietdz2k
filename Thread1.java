package BT1801;

import BT1801.SharedData;
import BT1801.Thread2;
import java.util.Random;

public class Thread1 extends Thread {
	Thread2 dubai2;
	SharedData data;

	public Thread1(SharedData data) {
		this.data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random omai = new Random();
		while (true) {
			int number = omai.nextInt(101);
			data.setTotal(number);
			System.out.println("Thread1 number:" + number);
			System.out.println("total:"+data.getTotal());
			if (data.getTotal() > 100 || data.getTotal() < -100) {
				System.out.println("Dừng Lại Cho Tao !");
				System.exit(0);
				
			}
			try {
				Thread1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}