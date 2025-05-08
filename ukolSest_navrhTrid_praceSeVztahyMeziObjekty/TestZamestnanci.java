package ukolSest_navrhTrid_praceSeVztahyMeziObjekty;

import java.util.Arrays;

public class TestZamestnanci {
  public static void main(String[] args) {
    // Vytvoření zaměstnanců
    Zamestnanec manazer = new Manazer("Jan Novák", "001", "IT");
    Zamestnanec programator = new Programator("Petr Svoboda", "002", Arrays.asList("Java", "Python", "C++"));
    Zamestnanec ucitel = new Ucitel("Marie Dvořáková", "003", Arrays.asList("Matematika", "Fyzika"));

    // Výpis popisů zaměstnanců
    System.out.println(manazer.getPopis());
    System.out.println(programator.getPopis());
    System.out.println(ucitel.getPopis());
  }
}