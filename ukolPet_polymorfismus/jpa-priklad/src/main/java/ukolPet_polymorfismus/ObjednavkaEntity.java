package ukolPet_polymorfismus;

import jakarta.persistence.Entity;

@Entity
public class ObjednavkaEntity extends BaseEntity {
  private String cisloObjednavky;

  public ObjednavkaEntity(String cisloObjednavky) {
    this.cisloObjednavky = cisloObjednavky;
  }

  public ObjednavkaEntity() {}

  public String getCisloObjednavky() {
    return cisloObjednavky;
  }

  public void setCisloObjednavky(String cisloObjednavky) {
    this.cisloObjednavky = cisloObjednavky;
  }

  @Override
  public String getEntityType() {
    return "Objednavka";
  }
}