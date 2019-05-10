package BT1801;

import BT1801.SharedData;
import BT1801.Thread1;
import java.util.Random;

public class Thread2 extends Thread {
	Thread1 dubai1;
	SharedData data;
	
	public Thread2(SharedData data) {
		this.data=data;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random omai = new Random();
		while (true) {
			int number = omai.nextInt(101) - 101;
			data.setTotal(number);
			System.out.println("Thread2 number: " + number);
			System.out.println("total:"+data.getTotal());
			if (data.getTotal() > 100 || data.getTotal() < -100) {
				System.out.println("Xin Anh Hãy Dừng Lại !");
				System.exit(0);
					
			}
			try {
				Thread2.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}