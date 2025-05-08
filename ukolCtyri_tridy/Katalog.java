package ukolCtyri_tridy;

import java.util.List;
import java.util.ArrayList;

public class Katalog {
  private List<Produkt> seznamProduktu;

  public Katalog() {
    seznamProduktu = new ArrayList<Produkt>();
  }

  public void pridejProdukt(Produkt p) {
    seznamProduktu.add(p);
  }

  public void vypisVsechnyProdukty() {
    if (seznamProduktu.isEmpty()) {
      System.out.println("Katalog je prázdný.");
    } else {
      System.out.println("Seznam produktů:");
      for (Produkt p : seznamProduktu) {
        System.out.println(p);
      }
    }
  }

  public Produkt najdiNejdrazsiProdukt() {
    if (seznamProduktu.isEmpty()) {
      System.out.println("Katalog je prázdný. Nelze najít nejdražší produkt.");
      return null;
    }

    Produkt nejdrazsi = seznamProduktu.get(0);
    for (Produkt p : seznamProduktu) {
      if (p.getCena() > nejdrazsi.getCena()) {
        nejdrazsi = p;
      }
    }

    System.out.println("Nejdražší produkt: " + nejdrazsi);
    return nejdrazsi;
  } 
}

