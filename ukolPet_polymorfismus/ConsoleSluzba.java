package ukolPet_polymorfismus;

public class ConsoleSluzba extends ZakladniSluzba {
  @Override
  public Logger vytvorLogger() {
    return new ConsoleLogger(); // Vrací instanci ConsoleLogger
  }
}