package ukolPet_polymorfismus;

import jakarta.persistence.Entity;

@Entity
public class UzivatelEntity extends BaseEntity {
  private String jmeno;
  private String email;

  public UzivatelEntity(String jmeno, String email) {
    this.jmeno = jmeno;
    this.email = email;
  }

  public UzivatelEntity() {
    // Bezparametrický konstruktor pro JPA
  }

  public String getJmeno() {
    return jmeno;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String getEntityType() {
    return "Uzivatel";
  }
}