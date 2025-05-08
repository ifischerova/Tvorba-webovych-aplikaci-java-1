package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

public class PolozkaObjednavky {
  private Produkt produkt;
  private int pocetKusu;
  private double cenaZaKus; // Cena v okamžiku objednání

  public PolozkaObjednavky(Produkt produkt, int pocetKusu) {
    this.produkt = produkt;
    this.pocetKusu = pocetKusu;
    this.cenaZaKus = produkt.getCena(); // Kopie ceny produktu v okamžiku objednání
  }

  public Produkt getProdukt() {
    return produkt;
  }

  public int getPocetKusu() {
    return pocetKusu;
  }

  public double getCenaZaKus() {
    return cenaZaKus;
  }

  public double getCenaCelkem() {
    return pocetKusu * cenaZaKus;
  }
}