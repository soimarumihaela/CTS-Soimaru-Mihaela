package facade;

public class Facade {

	public static void deschideUsi(Autobuz autobuz) {
		autobuz.deschideUsaFata();
		autobuz.deschideUsaMijloc();
		autobuz.deschideUsaSpate();
	}
	
	public static void elibereazaUsi(Autobuz autobuz) {
		autobuz.elibereazaUsaFata();
		autobuz.elibereazaUsaMijloc();
		autobuz.elibereazaUsaSpate();
	}
}
