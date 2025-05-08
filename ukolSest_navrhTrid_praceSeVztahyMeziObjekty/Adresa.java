package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

public class Adresa {
  private String ulice;
  private String mesto;
  private String psc;

  public Adresa(String ulice, String mesto, String psc) {
    this.ulice = ulice;
    this.mesto = mesto;
    this.psc = psc;
  }

  public String getUlice() {
    return ulice;
  }

  public void setUlice(String ulice) {
    this.ulice = ulice;
  }

  public String getMesto() {
    return mesto;
  }

  public void setMesto(String mesto) {
    this.mesto = mesto;
  }

  public String getPsc() {
    return psc;
  }

  public void setPsc(String psc) {
    this.psc = psc;
  }

  public String getKompletniAdresa() {
    return ulice + ", " + mesto + ", " + psc;
  }
}