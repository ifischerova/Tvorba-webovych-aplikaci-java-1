package ukolPet_polymorfismus;

public class Potomek extends Rodic {
  public Potomek() {
    super(); // Volání konstruktoru rodiče
    System.out.println("Konstruktor potomka.");
  }

  @Override
  public void pozdrav() {
    super.pozdrav(); // Volání metody pozdrav() z rodiče
    System.out.println("Pozdrav z potomka.");
  }
}