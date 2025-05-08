package ukolCtyri_tridy;

public class UzivatelDTO {
  private String jmeno;
  private String email;
  
  public UzivatelDTO(String jmeno, String email) {
    this.jmeno = jmeno;
    this.email = email;
  }

  // Gettery a settery
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
}
