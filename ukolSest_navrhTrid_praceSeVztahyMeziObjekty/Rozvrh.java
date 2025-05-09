package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.util.ArrayList;
import java.util.List;

public class Rozvrh {
  private Trida trida; // One-to-One vztah
  private List<Predmet> predmety; // Seznam předmětů v rozvrhu

  public Rozvrh(Trida trida) {
    this.trida = trida;
    this.predmety = new ArrayList<>();
    trida.setRozvrh(this); // Svázání rozvrhu s třídou
  }

  public Trida getTrida() {
    return trida;
  }

  public List<Predmet> getPredmety() {
    return predmety;
  }

  public void pridatPredmet(Predmet predmet) {
    predmety.add(predmet);
  }
}