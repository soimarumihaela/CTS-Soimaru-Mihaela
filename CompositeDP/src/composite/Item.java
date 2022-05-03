package composite;

public interface Item {
    public void adaugaItem(Item item);
    public void stergeItem(Item item);
    public void descrieItem();
    public Item getItem(int position);
    public float calculeazSumaGarantata(float pretPerLoc);

}
