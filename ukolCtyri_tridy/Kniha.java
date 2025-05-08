package ukolCtyri_tridy;

public class Kniha {
  private String nazev;
  private Autor autor;
  private boolean vypujcena;

  public Kniha(String nazev, Autor autor) {
    if (nazev == null || nazev.isEmpty()) {
      throw new IllegalArgumentException("Název knihy nesmí být prázdný.");
    }
    if (autor == null) {
      throw new IllegalArgumentException("Autor nesmí být null.");
    }
    this.nazev = nazev;
    this.autor = autor;
    this.vypujcena = false;
  }

  public String getNazev() {
    return nazev;
  }

  public Autor getAutor() {
    return autor;
  }

  public boolean isVypujcena() {
    return vypujcena;
  }

  public void setVypujcena(boolean vypujcena) {
    this.vypujcena = vypujcena;
  }
}