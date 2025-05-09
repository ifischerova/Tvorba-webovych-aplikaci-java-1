package ukolPet_polymorfismus;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
  @Override
  public void log(String msg) {
    try (FileWriter writer = new FileWriter("log.txt", true)) {
      writer.write(msg + "\n");
      System.out.println("FileLogger: Zpráva byla zapsána do souboru.");
    } catch (IOException e) {
      System.err.println("FileLogger: Chyba při zápisu do souboru.");
    }
  }
}