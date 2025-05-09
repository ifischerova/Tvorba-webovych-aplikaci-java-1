package ukolPet_polymorfismus;

public class FileSluzba extends ZakladniSluzba {
  @Override
  public Logger vytvorLogger() {
    return new FileLogger(); // Vrací instanci FileLogger
  }
}