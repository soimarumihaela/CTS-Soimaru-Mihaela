package chain;

public abstract class MijlocTransportHandler {

	 MijlocTransportHandler urmatorulMijlocTransportHandler;
	 

	public MijlocTransportHandler getUrmatorulMijlocTransportHandler() {
		return urmatorulMijlocTransportHandler;
	}

	public void setUrmatorulMijlocTransportHandler(MijlocTransportHandler urmatorulMijlocTransportHandler) {
		this.urmatorulMijlocTransportHandler = urmatorulMijlocTransportHandler;
	}

	public MijlocTransportHandler() {
		super();
		this.urmatorulMijlocTransportHandler=null;
	}
	
	public abstract void recomandaMijlocTransport(double distanta);
	 
	 
		
	
	
}
