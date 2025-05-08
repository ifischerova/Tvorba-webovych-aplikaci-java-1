package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

public class Produkt {
  private String nazev;
  private double cena;
  private String kategorie;
  private String vyrobce;
  private String inventarniKod;

  public Produkt(String nazev, double cena, String kategorie, String vyrobce, String inventarniKod) {
    this.nazev = nazev;
    this.cena = cena;
    this.kategorie = kategorie;
    this.vyrobce = vyrobce;
    this.inventarniKod = inventarniKod;
  }

  public String getNazev() {
    return nazev;
  }

  public double getCena() {
    return cena;
  }

  public String getKategorie() {
    return kategorie;
  }

  public String getVyrobce() {
    return vyrobce;
  }

  public String getInventarniKod() {
    return inventarniKod;
  }
}