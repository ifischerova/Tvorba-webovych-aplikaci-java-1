package ukolCtyri_tridy;

public class Produkt {
    private String nazev;
    private double cena;


  public Produkt (String nazev, double cena) {
      this.nazev = nazev;
      this.cena = cena;
  }

  public String getNazev() {
    return nazev;
  }

  public double getCena() {
    return cena;
  }

  public void setNazev(String nazev) {
    this.nazev = nazev;
  }

  public void setCena(double cena) {
    if (cena >= 0) {
      this.cena = cena;
    } else {
      System.out.println("Cena nemuze byt zaporna.");
    }
  }

  @Override
  public String toString() {
    return nazev + " - " + cena + " Kč";
  }
} 


