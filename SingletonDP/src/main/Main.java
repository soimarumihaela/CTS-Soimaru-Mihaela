package main;
import singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		Singleton s1;
		s1= Singleton.getInstanta();
		Singleton s2;
		s2= Singleton.getInstanta();
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
}
