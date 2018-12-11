package com.exam;

import java.util.ArrayList;

public class Order {
	ArrayList bag=new ArrayList();
	public void add(Ticket t){
		bag.add(t);
	}
	public void print(){
		System.out.println("Result:");
		for(int i=0;i<bag.size();i++){
			Ticket t=(Ticket)bag.get(i);
			System.out.println(t.origin+" "+t.destination+" "+t.price+" "+t.quantity+" "+t.price*t.quantity);
		}
	}

}
