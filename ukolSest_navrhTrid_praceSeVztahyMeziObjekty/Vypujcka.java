package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.time.LocalDate;

public class Vypujcka {
  private Kniha kniha;
  private Uzivatel uzivatel;
  private LocalDate datumVypujceni;
  private LocalDate datumVraceni;

  public Vypujcka(Kniha kniha, Uzivatel uzivatel, LocalDate datumVypujceni) {
    this.kniha = kniha;
    this.uzivatel = uzivatel;
    this.datumVypujceni = datumVypujceni;
    this.datumVraceni = null; // Kniha zatím nebyla vrácena
  }

  public Kniha getKniha() {
    return kniha;
  }

  public Uzivatel getUzivatel() {
    return uzivatel;
  }

  public LocalDate getDatumVypujceni() {
    return datumVypujceni;
  }

  public LocalDate getDatumVraceni() {
    return datumVraceni;
  }

  public void vratitKnihu(LocalDate datumVraceni) {
    this.datumVraceni = datumVraceni;
  }
}