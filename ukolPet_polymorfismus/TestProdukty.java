package ukolPet_polymorfismus;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestProdukty {
  public static void main(String[] args) {
    List<Produkt> produkty = new ArrayList<>();

  
    produkty.add(new DigitalniProdukt("E-kniha", BigDecimal.valueOf(200)));
    produkty.add(new FyzickyProdukt("Notebook", BigDecimal.valueOf(15000), BigDecimal.valueOf(200), 2));
    produkty.add(new FyzickyProdukt("Lednice", BigDecimal.valueOf(10000), BigDecimal.valueOf(500), 15));


    for (Produkt produkt : produkty) {
      System.out.println("Produkt: " + produkt.getNazev());
      System.out.println("Cena pro zákazníka: " + produkt.getCenaProZakaznika() + " Kč");
      System.out.println();
    }
  }
}