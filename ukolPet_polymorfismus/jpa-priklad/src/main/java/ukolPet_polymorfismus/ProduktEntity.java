package ukolPet_polymorfismus;

import jakarta.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class ProduktEntity extends BaseEntity {
  private String nazev;
  private BigDecimal cena;

  public ProduktEntity(String nazev, BigDecimal cena) {
    this.nazev = nazev;
    this.cena = cena;
  }

  public ProduktEntity() {}

  public String getNazev() {
    return nazev;
  }

  public void setNazev(String nazev) {
    this.nazev = nazev;
  }

  public BigDecimal getCena() {
    return cena;
  }

  public void setCena(BigDecimal cena) {
    this.cena = cena;
  }

  @Override
  public String getEntityType() {
    return "Produkt";
  }
}