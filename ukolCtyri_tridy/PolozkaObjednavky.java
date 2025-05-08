package ukolCtyri_tridy;

public class PolozkaObjednavky {
  private Produkt produkt;
  private int mnozstvi;

  public PolozkaObjednavky(Produkt produkt, int mnozstvi) {
    this.produkt = produkt;
    this.mnozstvi = mnozstvi;
  }

  public Produkt getProdukt() {
    return produkt;
  }

  public int getMnozstvi() {
    return mnozstvi;
  }

  public void setProdukt(Produkt produkt) {
    this.produkt = produkt;
  }

  public void setMnozstvi(int mnozstvi) {
    this.mnozstvi = mnozstvi;
  }

  public double getCenaZaPolozku() {
    return mnozstvi * produkt.getCena();
  }
}
