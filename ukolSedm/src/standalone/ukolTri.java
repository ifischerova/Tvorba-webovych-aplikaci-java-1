package ukolSedm.src.standalone;
import java.util.Scanner;

public class ukolTri {
    public static void main(String args []) {
      Scanner scanner = new Scanner(System.in);

      vypisCisel(scanner);
      soucetCisel(scanner);
      faktorialCisla(scanner);
      obracenyVypis(scanner);
      prumerZadanychCisel(scanner);
      vypisSudychCisel(scanner);
      hledaniMinimaMaxima(scanner);
      vypisVzestupneSestupne(scanner);
      nasobkyCisla(scanner);
      mocninyCisla(scanner);
      dokonaleCislo(scanner);

      scanner.close();
    }

/* Výpis čísel
Napište program, který vypíše čísla od 1 do 20 pomocí `for` cyklu. Proveďte alternativu pro ostatní typy cyklů.
*/

public static void vypisCisel(Scanner scanner) {
  System.out.println("Výpis čísel od 1 do 20 pomocí for cyklu:");
  for (int i = 1; i <= 20; i++) {
      System.out.print(i + " ");
  }
  System.out.println();
}
public static void vypisCiselWhile(Scanner scanner) {
  System.out.println("Výpis čísel od 1 do 20 pomocí while cyklu:");
  int i = 1;
  while (i <= 20) {
      System.out.print(i + " ");
      i++;
  }
  System.out.println();
}

public static void vypisCiselDoWhile(Scanner scanner) {
  System.out.println("Výpis čísel od 1 do 20 pomocí do-while cyklu:");
  int i = 1;
  do {
      System.out.print(i + " ");
      i++;
  } while (i <= 20);
  System.out.println();
}

/* Součet Čísel
Vytvořte program, který spočítá součet čísel od 1 do 100 pomocí `while` cyklu.*/
public static void soucetCisel(Scanner scanner) {
  int soucet = 0;
  int i = 1;
  while (i <= 100) {
      soucet += i;
      i++;
  }
  System.out.println("Součet čísel od 1 do 100 je: " + soucet);
}


/* Faktoriál Čísla
Napište program, který vypočítá faktoriál čísla `n` (např. `n!`) pomocí `for` cyklu. Číslo `n` může být zadáno uživatelem. Zkuste se zamyslet, jak byste upravili výpočet, v případě, že na vstupu budu číslo menší než nula.
*/

public static void faktorialCisla(Scanner scanner) {
  System.out.print("Zadejte číslo pro výpočet faktoriálu: ");
  int n = scanner.nextInt();
  if (n < 0) {
      System.out.println("Faktoriál není definován pro záporná čísla.");
      return;
  }
  int faktorial = 1;
  for (int i = 1; i <= n; i++) {
      faktorial *= i;
  }
  System.out.println("Faktoriál " + n + " je: " + faktorial);
}

/* Obrácený Výpis
Vytvořte program, který vypíše čísla od 10 do 1 v obráceném pořadí pomocí `while` cyklu.
*/

public static void obracenyVypis(Scanner scanner) {
  System.out.println("Obrácený výpis čísel od 10 do 1 pomocí while cyklu:");
  int i = 10;
  while (i >= 1) {
      System.out.print(i + " ");
      i--;
  }
  System.out.println();
} 

/* Průměr zadaných čísel
Napište program, který umožní uživateli zadávat čísla dokud nezadá číslo 0. Poté vypočítá a vypíše průměr všech zadáných čísel pomocí `do-while` cyklu.
*/
public static void prumerZadanychCisel(Scanner scanner) {
  int soucet = 0;
  int pocet = 0;
  int cislo;
  do {
      System.out.print("Zadejte číslo (0 pro konec): ");
      cislo = scanner.nextInt();
      if (cislo != 0) {
          soucet += cislo;
          pocet++;
      }
  } while (cislo != 0);
  
  if (pocet > 0) {
      double prumer = (double) soucet / pocet;
      System.out.println("Průměr zadaných čísel je: " + prumer);
  } else {
      System.out.println("Žádná čísla nebyla zadána.");
  }
}

/* Výpis sudých čísel
Vytvořte program, který vypíše všechna sudá čísla od 2 do 50 pomocí `for` cyklu.*/

public static void vypisSudychCisel(Scanner scanner) {
        System.out.println("Výpis sudých čísel od 2 do 50 pomocí for cyklu:");
        for (int i = 2; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

/* Hledání Minima a Maxima
Napište program, který požádá uživatele, aby zadal 10 čísel, a poté najde a vypíše nejmenší a největší z nich pomocí `for` cyklu.
*/

public static void hledaniMinimaMaxima(Scanner scanner) {
  int min = Integer.MAX_VALUE;
  int max = Integer.MIN_VALUE;
  
  for (int i = 0; i < 10; i++) {
      System.out.print("Zadejte číslo " + (i + 1) + ": ");
      int cislo = scanner.nextInt();
      if (cislo < min) {
          min = cislo;
      }
      if (cislo > max) {
          max = cislo;
      }
  }
  
  System.out.println("Nejmenší číslo je: " + min);
  System.out.println("Největší číslo je: " + max);
}

/* Výpis čísel ve vzestupné a sestupné řadě
Vytvořte dva programy: jeden vypíše čísla od 1 do 10 ve vzestupném pořadí a druhý ve sestupném pořadí, oba pomocí `for` cyklu.
*/
public static void vypisVzestupneSestupne(Scanner scanner) {
  System.out.println("Výpis čísel od 1 do 10 ve vzestupném pořadí:");
  for (int i = 1; i <= 10; i++) {
      System.out.print(i + " ");
  }
  System.out.println();
  
  System.out.println("Výpis čísel od 10 do 1 v sestupném pořadí:");
  for (int i = 10; i >= 1; i--) {
      System.out.print(i + " ");
  }
  System.out.println();
}


/* Násobky čísla

Napište program, který pro zadané číslo `n` vypíše prvních deset jeho násobků pomocí `while` cyklu.
*/
public static void nasobkyCisla(Scanner scanner) {
  System.out.print("Zadejte číslo pro výpis násobků: ");
  int n = scanner.nextInt();
  int i = 1;
  while (i <= 10) {
      System.out.println(n + " * " + i + " = " + (n * i));
      i++;
  }
}
/* Mocniny čísla

/* Vytvořte program, který vrátí mocninu čísla do zadaného čísla */

public static void mocninyCisla(Scanner scanner) {
    System.out.print("Zadejte číslo pro výpočet mocnin: ");
    int cislo = scanner.nextInt();
    System.out.print("Zadejte exponent: ");
    int exponent = scanner.nextInt();
    
    double vysledek = Math.pow(cislo, exponent);
    System.out.println(cislo + " na " + exponent + " je: " + vysledek);
  }

/* Dokonalé číslo je označení pro číslo, u kterého platí, že je součtem všech svých dělitelů (kromě sebe samého). Vytvořte program, který otestuje, zda je zadané číslo dokonalé 
*/
public static void dokonaleCislo(Scanner scanner) {
    System.out.print("Zadejte číslo pro kontrolu dokonalosti: ");
    int cislo = scanner.nextInt();
    int soucetDelitelu = 0;
    
    for (int i = 1; i < cislo; i++) {
        if (cislo % i == 0) {
            soucetDelitelu += i;
        }
    }
    
    if (soucetDelitelu == cislo) {
        System.out.println(cislo + " je dokonalé číslo.");
    } else {
        System.out.println(cislo + " není dokonalé číslo.");
    } 
  } 
}



