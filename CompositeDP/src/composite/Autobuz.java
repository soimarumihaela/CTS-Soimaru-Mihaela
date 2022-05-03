package composite;

public class Autobuz implements Item{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void adaugaItem(Item item) {
        System.out.println("Nu se poate adauga. Nod frunza");
    }

    @Override
    public void stergeItem(Item item) {
        System.out.println("Nu se poate sterge. Nod frunza");
    }

    @Override
    public void descrieItem() {
        System.out.println(this.toString());
    }

    @Override
    public Item getItem(int position) {
        System.out.println("Nu se poate obtine. Nod frunza");
        return null;
    }

    @Override
    public float calculeazSumaGarantata(float pretPerLoc) {
        return pretPerLoc*nrLocuri+model.length();
    }

    @Override
    public String toString() {
        return "Autobuz:\n"+
                "producator='" + producator + '\n' +
                "model='" + model + '\n' +
                "nrLocuri=" + nrLocuri+'\n';
    }
}
