package singleton;

public class Singleton {
	
	//eager init singleton
	//private static Singleton instanta=new Singleton();
	//public static Singleton getInstanta() {
	//	return instanta;
	//}
	//construcor privat pt Singleton  
	
	//private Singleton() {
		
	//}
	
	//lazy init singleton
	
	private static Singleton instanta = null;
	public static Singleton getInstanta() {
		if(instanta == null) {
			instanta=new Singleton();
		}
		return instanta; 
	}
	private Singleton() {
		
	}

}
