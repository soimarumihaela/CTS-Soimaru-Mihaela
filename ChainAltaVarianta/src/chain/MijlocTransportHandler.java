package chain;

public abstract class MijlocTransportHandler {

	 MijlocTransportHandler urmatorulMijlocTransportHandler;
	 protected int pragSuperior;
	 
	 
	
	public MijlocTransportHandler getUrmatorulMijlocTransportHandler() {
		return urmatorulMijlocTransportHandler;
	}

	public void setUrmatorulMijlocTransportHandler(MijlocTransportHandler urmatorulMijlocTransportHandler) {
		this.urmatorulMijlocTransportHandler = urmatorulMijlocTransportHandler;
	}

	public MijlocTransportHandler(int pragSuperior) {
		super();
		this.urmatorulMijlocTransportHandler=null;
		this.pragSuperior=pragSuperior;
	}
	
	public abstract void recomandaMijlocTransport(double distanta);
	 
	 
		
	
	
}
