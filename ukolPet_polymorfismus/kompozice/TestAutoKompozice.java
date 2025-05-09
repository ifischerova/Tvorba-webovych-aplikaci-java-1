package ukolPet_polymorfismus.kompozice;

public class TestAutoKompozice {
  public static void main(String[] args) {
    Motor motor = new Motor(150);
    Auto auto = new Auto("Škoda", motor);
    auto.jet(); 
  }
}