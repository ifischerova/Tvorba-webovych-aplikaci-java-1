package ukolCtyri_tridy;

public class Autor {
  private String jmeno;

  public Autor(String jmeno) {
    if (jmeno == null || jmeno.isEmpty()) {
      throw new IllegalArgumentException("Jméno autora nesmí být prázdné.");
    }
    this.jmeno = jmeno;
  }

  public String getJmeno() {
    return jmeno;
  }
}