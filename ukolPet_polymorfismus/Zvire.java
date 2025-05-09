package ukolPet_polymorfismus;

public abstract class Zvire {
  public abstract void vydejZvuk(); // Abstraktní metoda, kterou musí potomci implementovat

  public void info() {
    System.out.println("Jsem zvíře!");
  }
}