package ukolPet_polymorfismus;

import java.math.BigDecimal;

public class DigitalniProdukt extends Produkt {
  public DigitalniProdukt(String nazev, BigDecimal cenaZaklad) {
    super(nazev, cenaZaklad);
  }

  @Override
  public BigDecimal getCenaProZakaznika() {
    return getCenaZaklad();
  }
}