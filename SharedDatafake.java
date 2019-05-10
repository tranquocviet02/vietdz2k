package BT1801;

public class SharedDatafake{

	public static void main(String[] args) {
		
		SharedData data=new SharedData();
                
		Thread1 dubai1=new Thread1(data);
		Thread2 dubai2=new Thread2(data);
		dubai1.start();
		dubai2.start();
		

		
	}
}