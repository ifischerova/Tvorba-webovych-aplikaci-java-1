package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.util.ArrayList;
import java.util.List;

public class Kniha {
  private String nazev;
  private String isbn;
  private int pocetStran;
  private List<Autor> autori; // Many-to-Many vztah

  public Kniha(String nazev, String isbn, int pocetStran) {
    this.nazev = nazev;
    this.isbn = isbn;
    this.pocetStran = pocetStran;
    this.autori = new ArrayList<>();
  }

  public String getNazev() {
    return nazev;
  }

  public void setNazev(String nazev) {
    this.nazev = nazev;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public int getPocetStran() {
    return pocetStran;
  }

  public void setPocetStran(int pocetStran) {
    this.pocetStran = pocetStran;
  }

  public List<Autor> getAutori() {
    return autori;
  }

  public void pridatAutora(Autor autor) {
    if (!autori.contains(autor)) {
      autori.add(autor);
      autor.pridatKnihu(this); // Obousměrná vazba
    }
  }
}