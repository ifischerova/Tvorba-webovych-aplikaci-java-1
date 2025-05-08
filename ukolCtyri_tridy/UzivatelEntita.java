package ukolCtyri_tridy;

public class UzivatelEntita { 
  private Long id;
  private String jmeno;
  private String email;


  public UzivatelEntita() {}

  public UzivatelEntita(Long id, String jmeno, String email) {
    this.id = id;
    setJmeno(jmeno);;
    setEmail(email);
  }
  
  public Long getId() {
    return id;
  }

  public String getJmeno() {
    return jmeno;
  }

  public String getEmail() {
    return email;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setJmeno(String jmeno) {
    if (jmeno == null || jmeno.isEmpty()) {
      throw new IllegalArgumentException("Jméno nesmí být prázdné.");
    }
    this.jmeno = jmeno;
  }

  public void setEmail(String email) {
    if (email == null ||email.isEmpty()) {
      throw new IllegalArgumentException("Email nesmi byt prazdnej!");
    }
    this.email = email;
  }
}
