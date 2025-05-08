package ukolCtyri_tridy;

public class TestKatalog {
  public static void main( String[] args) {
    Katalog katalog = new Katalog();

    katalog.pridejProdukt(new Produkt("Detektivka", 250));
    katalog.pridejProdukt(new Produkt("Maso", 2500));
    katalog.pridejProdukt(new Produkt("Sunka", 300));

    katalog.vypisVsechnyProdukty();
    katalog.najdiNejdrazsiProdukt();
  }

  
}
