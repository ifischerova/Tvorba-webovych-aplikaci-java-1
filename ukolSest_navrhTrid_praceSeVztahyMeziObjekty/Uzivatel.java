package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

public class Uzivatel {
  private String jmeno;
  private String prijmeni;

  public Uzivatel(String jmeno, String prijmeni) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
  }

  public String getJmeno() {
    return jmeno;
  }

  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }

  public String getPrijmeni() {
    return prijmeni;
  }

  public void setPrijmeni(String prijmeni) {
    this.prijmeni = prijmeni;
  }
}