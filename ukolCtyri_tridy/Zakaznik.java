package ukolCtyri_tridy;

public class Zakaznik {
  private String jmeno;
  private String prijmeni;
  private Adresa adresa;

  public Zakaznik(String jmeno, String prijmeni, Adresa adresa) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    setAdresa(adresa);;
  }

  public Zakaznik(String jmeno, String prijmeni) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
  }

  public String getJmeno() {
    return jmeno;
  }

  public String getPrijmeni() {
    return prijmeni;
  }

  public Adresa getAdresa() {
    return adresa;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }

  public void setPrijmeni(String prijmeni) {
    this.prijmeni = prijmeni;
  }

  public void setAdresa(Adresa a) {
    this.adresa = a;
  }
}
