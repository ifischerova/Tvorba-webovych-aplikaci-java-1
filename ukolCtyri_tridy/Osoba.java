package ukolCtyri_tridy;

public class Osoba {
  private String jmeno;
  private String prijmeni;
  private int vek;

  // Konstruktor s parametry
  public Osoba(String jmeno, String prijmeni, int vek) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.vek = vek;
  }
  
  // Gettery
  public String getJmeno() {
    return jmeno;
  }

  public String getPrijmeni() {
    return prijmeni;
  }

  public int getVek() {
    return vek;
  }

  // Settery
  public void setJmeno(String jmeno) {
    this.jmeno = jmeno;
  }

  public void setPrijmeni(String prijmeni) {
    this.prijmeni = prijmeni;
  }

  public void setVek(int vek) {
    if (vek >= 0) {
      this.vek = vek;
    } else {
      System.out.println("Vek nemuze byt zaporny.");
    }
  }

  // Rozsireni
  public void pozdrav() {
    System.out.println("Ahoj, jmenuji se " + jmeno + " " + prijmeni + " a je mi " + vek + " let.");
  }
}
