package chain;

public class TramvaiHandler extends MijlocTransportHandler {

	public TramvaiHandler(int pragSuperior) {
		super(pragSuperior);
		
	}

	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta<super.pragSuperior) {
			System.out.println("Se recomanda utilizarea tramvaiului pentru o distanta mai mica de "+distanta+" km");
		}
		else {
			super.getUrmatorulMijlocTransportHandler().recomandaMijlocTransport(distanta);
		}
		
	}

}
