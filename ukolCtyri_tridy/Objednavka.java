package ukolCtyri_tridy;

import java.util.List;
import java.util.ArrayList;

public class Objednavka { 
  private List<PolozkaObjednavky> seznamPolozek;

  public Objednavka(){ 
    this.seznamPolozek = new ArrayList<PolozkaObjednavky>();
  }

  public void pridejPolozku(PolozkaObjednavky p){
    if (p.getMnozstvi() <= 0) {
      throw new IllegalArgumentException("Množství musí být větší než 0.");
    }
    seznamPolozek.add(p);
  }

  public void odeberPolozku(Produkt produkt) {
    PolozkaObjednavky kOdstraneni = null;
    for (PolozkaObjednavky p : seznamPolozek) {
      if (p.getProdukt().equals(produkt)) {
        kOdstraneni = p;
        break;
      }
    }
    if (kOdstraneni != null) {
      seznamPolozek.remove(kOdstraneni);
      System.out.println("Položka " + produkt.getNazev() + " byla odstraněna.");
    } else {
      System.out.println("Položka " + produkt.getNazev() + " nebyla nalezena.");
    }
  }

  public double getCelkem() {
    double soucet = 0;
    for (PolozkaObjednavky polozkaObjednavky: seznamPolozek) {
      soucet += polozkaObjednavky.getCenaZaPolozku();
    }
    return soucet;
  }
  
}
