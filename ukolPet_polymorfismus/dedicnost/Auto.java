package ukolPet_polymorfismus.dedicnost;

public class Auto extends Motor {
  private String znacka;

  public Auto(String znacka, int vykon) {
    super(vykon); // Volání konstruktoru Motor
    this.znacka = znacka;
  }

  public String getZnacka() {
    return znacka;
  }

  public void setZnacka(String znacka) {
    this.znacka = znacka;
  }

  public void jet() {
    System.out.println("Auto " + znacka + " jede s výkonem " + getVykon() + " koní.");
  }
}