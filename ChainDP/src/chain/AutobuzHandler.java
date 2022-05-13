package chain;

public class AutobuzHandler extends MijlocTransportHandler {

	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta<5) {
			System.out.println("Se recomanda utilizarea autobuzului pentru o distanta mai mica de "+distanta+" km");
		}
		else {
			super.getUrmatorulMijlocTransportHandler().recomandaMijlocTransport(distanta);
		}
		
	}

}
