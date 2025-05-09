package ukolPet_polymorfismus;

public class TestSluzby {
  public static void main(String[] args) {
    // Použití ConsoleSluzba
    ZakladniSluzba sluzba = new ConsoleSluzba();
    sluzba.zapisUdalost("Ahoj, console!");

    // Použití FileSluzba
    sluzba = new FileSluzba();
    sluzba.zapisUdalost("Ahoj, file!");
  }
}