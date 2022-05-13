package chain;

public class AutobuzHandler extends MijlocTransportHandler {

	public AutobuzHandler(int pragSuperior) {
		super(pragSuperior);
		
	}

	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta<super.pragSuperior) {
			System.out.println("Se recomanda utilizarea autobuzului pentru o distanta mai mica de "+distanta+" km");
		}
		else {
			super.getUrmatorulMijlocTransportHandler().recomandaMijlocTransport(distanta);
		}
		
	}

}
