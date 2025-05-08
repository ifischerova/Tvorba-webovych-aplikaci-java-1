package ukolCtyri_tridy;

public class TestObjednavka {
  public static void main(String[] args) {
    Objednavka objednavka = new Objednavka();

    objednavka.pridejPolozku(new PolozkaObjednavky(new Produkt("chleba", 500),5));
    objednavka.pridejPolozku(new PolozkaObjednavky(new Produkt("mleko", 50),5));
    objednavka.pridejPolozku(new PolozkaObjednavky(new Produkt("vejce", 500),5));

    System.out.println(objednavka.getCelkem());
  }
  
}
