package ukolPet_polymorfismus;

public class TestController {
  public static void main(String[] args) {
    // Vytvoření instancí potomků
    BaseController c1 = new UzivatelController();
    BaseController c2 = new ProduktController();
    BaseController c3 = new ObjednavkaController();

    // Zavolání metody vypisEndpointInfo() na každém kontroleru
    c1.vypisEndpointInfo();
    c2.vypisEndpointInfo();
    c3.vypisEndpointInfo();

    // Zavolání metody obsluzZadost() na každém kontroleru
    c1.obsluzZadost();
    c2.obsluzZadost();
    c3.obsluzZadost();
  }
}