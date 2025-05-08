package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.util.ArrayList;
import java.util.List;

public class Objednavka {
  private UzivatelProdukt zakaznik;
  private List<PolozkaObjednavky> polozky;

  public Objednavka(UzivatelProdukt zakaznik) {
    this.zakaznik = zakaznik;
    this.polozky = new ArrayList<>();
  }

  public UzivatelProdukt getZakaznik() {
    return zakaznik;
  }

  public List<PolozkaObjednavky> getPolozky() {
    return polozky;
  }

  public void pridatPolozku(PolozkaObjednavky polozka) {
    polozky.add(polozka);
  }

  public double getCelkovaCena() {
    return polozky.stream().mapToDouble(PolozkaObjednavky::getCenaCelkem).sum();
  }
}