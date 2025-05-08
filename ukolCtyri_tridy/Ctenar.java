package ukolCtyri_tridy;

import java.util.ArrayList;
import java.util.List;

public class Ctenar {
  private String jmeno;
  private List<Kniha> vypujceneKnihy;

  public Ctenar(String jmeno) {
    if (jmeno == null || jmeno.isEmpty()) {
      throw new IllegalArgumentException("Jméno čtenáře nesmí být prázdné.");
    }
    this.jmeno = jmeno;
    this.vypujceneKnihy = new ArrayList<>();
  }

  public String getJmeno() {
    return jmeno;
  }

  public List<Kniha> getVypujceneKnihy() {
    return vypujceneKnihy;
  }

  public void vypujcitKnihu(Kniha k) {
    if (k.isVypujcena()) {
      System.out.println("Kniha '" + k.getNazev() + "' je již vypůjčená.");
      return;
    }
    k.setVypujcena(true);
    vypujceneKnihy.add(k);
    System.out.println("Čtenář '" + jmeno + "' si vypůjčil knihu '" + k.getNazev() + "'.");
  }

  public void vratitKnihu(Kniha k) {
    if (vypujceneKnihy.remove(k)) {
      k.setVypujcena(false);
      System.out.println("Čtenář '" + jmeno + "' vrátil knihu '" + k.getNazev() + "'.");
    } else {
      System.out.println("Kniha '" + k.getNazev() + "' není v seznamu vypůjčených knih čtenáře '" + jmeno + "'.");
    }
  }

  public void vypsatSeznamKnih() {
    System.out.println("Seznam vypůjčených knih čtenáře '" + jmeno + "':");
    for (Kniha k : vypujceneKnihy) {
      System.out.println("- " + k.getNazev() + " od autora " + k.getAutor().getJmeno());
    }
  }
}