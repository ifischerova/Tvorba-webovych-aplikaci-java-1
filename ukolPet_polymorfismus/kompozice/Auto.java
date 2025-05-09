package ukolPet_polymorfismus.kompozice;

public class Auto {
  private String znacka;
  private Motor motor; // Kompozice: Auto má motor

  public Auto(String znacka, Motor motor) {
    this.znacka = znacka;
    this.motor = motor;
  }

  public String getZnacka() {
    return znacka;
  }

  public void setZnacka(String znacka) {
    this.znacka = znacka;
  }

  public Motor getMotor() {
    return motor;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public void jet() {
    motor.start(); // Použití metody Motor
    System.out.println("Auto " + znacka + " jede s výkonem " + motor.getVykon() + " koní.");
  }
}