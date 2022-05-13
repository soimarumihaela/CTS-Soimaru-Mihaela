package memento;

public class Autobuz {
	
	private String numeSofer;
	private float consum;
	private int an;
	private String model;
	private int nrLoc;
	
	public String getNumeSofer() {
		return numeSofer;
	}
	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}
	public float getConsum() {
		return consum;
	}
	public void setConsum(float consum) {
		this.consum = consum;
	}
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		this.an = an;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNrLoc() {
		return nrLoc;
	}
	public void setNrLoc(int nrLoc) {
		this.nrLoc = nrLoc;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [numeSofer=");
		builder.append(numeSofer);
		builder.append(", consum=");
		builder.append(consum);
		builder.append(", an=");
		builder.append(an);
		builder.append(", model=");
		builder.append(model);
		builder.append(", nrLoc=");
		builder.append(nrLoc);
		builder.append("]");
		return builder.toString();
	}
	
	public AutobuzMemento save() {
		AutobuzMemento nou =new AutobuzMemento();
		return nou;
	}
	

}
