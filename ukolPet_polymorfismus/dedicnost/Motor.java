package ukolPet_polymorfismus.dedicnost;

public class Motor {
  private int vykon;

  public Motor(int vykon) {
    this.vykon = vykon;
  }

  public int getVykon() {
    return vykon;
  }

  public void setVykon(int vykon) {
    this.vykon = vykon;
  }

  public void start() {
    System.out.println("Motor byl nastartován.");
  }
}