package ukolPet_polymorfismus;

import java.util.ArrayList;
import java.util.List;

public class TestZvirata {
  public static void main(String[] args) {
    List<Zvire> zvirata = new ArrayList<>();

    zvirata.add(new Pes());
    zvirata.add(new Kocka());

    for (Zvire zvire : zvirata) {
      zvire.info();
      zvire.vydejZvuk();
    }
  }
}