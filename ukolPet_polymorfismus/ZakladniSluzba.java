package ukolPet_polymorfismus;

public abstract class ZakladniSluzba {
  public abstract Logger vytvorLogger(); // Abstraktní metoda pro vytvoření loggeru

  public void zapisUdalost(String msg) {
    Logger logger = vytvorLogger(); // Získání loggeru pomocí tovární metody
    logger.log(msg); // Použití loggeru pro záznam zprávy
  }
}