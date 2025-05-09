module com.example.app {
    requires com.example.domain;

  // Pokud používáme moduly JDK, můžeme je přidat jako závislosti
  requires java.base; // Tento modul je implicitní, není nutné jej uvádět
  requires java.sql;  // Pokud bychom používali databáze
}