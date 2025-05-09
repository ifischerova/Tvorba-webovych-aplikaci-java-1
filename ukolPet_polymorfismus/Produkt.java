package ukolPet_polymorfismus;

import java.math.BigDecimal;

public abstract class Produkt {
  private String nazev;
  private BigDecimal cenaZaklad;

  public Produkt(String nazev, BigDecimal cenaZaklad) {
    if (nazev == null || nazev.isEmpty()) {
      throw new IllegalArgumentException("Název produktu nesmí být prázdný.");
    }
    if (cenaZaklad == null || cenaZaklad.compareTo(BigDecimal.ZERO) < 0) {
      throw new IllegalArgumentException("Cena základu musí být kladná.");
    }
    this.nazev = nazev;
    this.cenaZaklad = cenaZaklad;
  }

  public String getNazev() {
    return nazev;
  }

  public BigDecimal getCenaZaklad() {
    return cenaZaklad;
  }

  public void setNazev(String nazev) {
    this.nazev = nazev;
  }

  public void setCenaZaklad(BigDecimal cenaZaklad) {
    this.cenaZaklad = cenaZaklad;
  }

  public abstract BigDecimal getCenaProZakaznika();
}