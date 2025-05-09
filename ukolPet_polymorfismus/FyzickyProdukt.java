package ukolPet_polymorfismus;

import java.math.BigDecimal;

public class FyzickyProdukt extends Produkt {
  private BigDecimal nakladNaDopravu;
  private double vaha;

  public FyzickyProdukt(String nazev, BigDecimal cenaZaklad, BigDecimal nakladNaDopravu, double vaha) {
    super(nazev, cenaZaklad);
    if (nakladNaDopravu == null || nakladNaDopravu.compareTo(BigDecimal.ZERO) < 0) {
      throw new IllegalArgumentException("Náklady na dopravu musí být kladné.");
    }
    if (vaha < 0) {
      throw new IllegalArgumentException("Váha musí být kladná.");
    }
    this.nakladNaDopravu = nakladNaDopravu;
    this.vaha = vaha;
  }

  @Override
  public BigDecimal getCenaProZakaznika() {
    BigDecimal celkovaCena = getCenaZaklad().add(nakladNaDopravu);
    if (vaha > 10) { 
      celkovaCena = celkovaCena.add(BigDecimal.valueOf(50));
    }
    return celkovaCena;
  }
}