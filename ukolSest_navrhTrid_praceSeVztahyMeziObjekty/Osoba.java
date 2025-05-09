package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.time.LocalDate;

public class Osoba {
  private String jmeno;
  private String prijmeni;
  private LocalDate datumNarozeni;
  private Adresa adresa; // Agregace: Osoba má adresu

  public Osoba(String jmeno, String prijmeni, LocalDate datumNarozeni, Adresa adresa) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.datumNarozeni = datumNarozeni;
    this.adresa = adresa;
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

  public LocalDate getDatumNarozeni() {
    return datumNarozeni;
  }

  public void setDatumNarozeni(LocalDate datumNarozeni) {
    this.datumNarozeni = datumNarozeni;
  }

  public Adresa getAdresa() {
    return adresa;
  }

  public void setAdresa(Adresa adresa) {
    this.adresa = adresa;
  }

  public void vypisInformace() {
    System.out.println("Jméno: " + jmeno + " " + prijmeni);
    System.out.println("Datum narození: " + datumNarozeni);
    System.out.println("Adresa: " + adresa.getKompletniAdresa());
  }
}