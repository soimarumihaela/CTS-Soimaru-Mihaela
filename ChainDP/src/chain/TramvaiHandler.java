package chain;

public class TramvaiHandler extends MijlocTransportHandler {

	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta<10) {
			System.out.println("Se recomanda utilizarea tramvaiului pentru o distanta mai mica de "+distanta+" km");
		}
		else {
			super.getUrmatorulMijlocTransportHandler().recomandaMijlocTransport(distanta);
		}
		
	}

}
