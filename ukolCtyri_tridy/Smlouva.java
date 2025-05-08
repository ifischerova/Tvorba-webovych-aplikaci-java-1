package ukolCtyri_tridy;

public class Smlouva {
  private String cisloSmlouvy;
  private Zakaznik zakaznik;
  private boolean aktivni;

  public Smlouva(String cisloSmlouvy, Zakaznik zakaznik, boolean aktivni) {
    this.cisloSmlouvy = cisloSmlouvy;
    this.zakaznik = zakaznik;
    this.aktivni = aktivni;
  }

  public String getCisloSmlouvy() {
    return cisloSmlouvy;
  }

  public Zakaznik getZakaznik() {
    return zakaznik;
  }

  public boolean aktivni() {
    return aktivni;
  }

  public void setCisloSmlouvy(String cisloSmlouvy) {
    this.cisloSmlouvy = cisloSmlouvy;
  }

  public void setZakaznik(Zakaznik zakaznik) {
    this.zakaznik = zakaznik;
  }

  private void setAktivni(boolean aktivni) {
    this.aktivni = aktivni;
  }

  public void aktivujSmlouvu(boolean aktivni) {
     if (aktivni != true) {
      setAktivni(true);
     } 
  }

  public void zrusSmlouvu(boolean aktivni) {
    if (aktivni == true) {
      setAktivni(false);
    }
  }
}
