package org.all;

public class Bank2 extends Bank1 {
	public void empDetails(int id) {
      System.out.println("empDetail   "+id );
	}
    public static void main(String[] args) {
    	Bank2 e1=new Bank2();
    	e1.empDetails(5);
    	e1.firstDue(560);
    	e1.secondDue(260);
    	e1.thirdDue(340);
    	
		
	}
}
