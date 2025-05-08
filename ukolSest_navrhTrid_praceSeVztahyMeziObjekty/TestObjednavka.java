package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

public class TestObjednavka {
  public static void main(String[] args) {
    Produkt produkt1 = new Produkt("Notebook", 15000, "Elektronika", "Dell", "12345");
    Produkt produkt2 = new Produkt("Myš", 500, "Elektronika", "Logitech", "67890");

    UzivatelProdukt uzivatel = new UzivatelProdukt("Jan", "Novák", "Praha 1, Dlouhá 12", "IČO: 12345678");

    Objednavka objednavka = new Objednavka(uzivatel);

    objednavka.pridatPolozku(new PolozkaObjednavky(produkt1, 1));
    objednavka.pridatPolozku(new PolozkaObjednavky(produkt2, 2));

    System.out.println("Zákazník: " + uzivatel.getJmeno() + " " + uzivatel.getPrijmeni());
    System.out.println("Celková cena objednávky: " + objednavka.getCelkovaCena() + " Kč");
  }
}