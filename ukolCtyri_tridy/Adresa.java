package ukolCtyri_tridy;

public class Adresa {
  private String ulice;
  private String mesto;
  private String psc;

  public Adresa(String mesto, String ulice, String psc) {
   this.ulice = ulice;
   this.mesto = mesto;
   setPsc(psc); 
  }

  public String getUlice() {
    return ulice;
  }

  public String getMesto() {
    return mesto;
  }

  public String getPsc() {
    return psc;
  }

  public void setUlice(String ulice) {
    this.ulice = ulice;
  }

  public void setMesto(String mesto) {
    this.mesto = mesto;
  }

  public void setPsc(String psc) {
    if (psc.length() < 4) {
      System.out.println("PSC je kratke, musi mit 5 znaku.");
    } else if ( psc.length() > 5) {
      System.out.println("PSC je dlouhe, musi mit 5 znaku.");
    } else {
      this.psc = psc;
    }
  }
}
