/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1811;

/**
 *
 * @author asus
 */
public class Homethreadfake {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homethread htk=new Homethread();
		Thread1 dubai1=new Thread1(rdc);
		Thread2 dubai2=new Thread2(rdc);
		dubai1.start();
		dubai2.start();
	}
}
