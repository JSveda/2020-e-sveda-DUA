package com.main;

import java.util.Scanner;

/**
 * The type Algorithms.
 */
public class Algorithms {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //System.out.println(isDelitelny(20, 3));
        printNasobkyCislaZIntervalu(20, 100);
        //printDvojiceScitancu(6);
        //System.out.println(isInArray(new int[] {1, 2, 3, 4, 5, 6}, 3));
        //System.out.println(vypocetPolynomu(1, new int[] {0, -2, 6, -8, 0, 0, 5}));
        //System.out.println(maxHodnota(0, 0, 0, -1));
        //System.out.println(cifernySoucet(2092));
        //System.out.println(hasCifra(0, 0));
        //System.out.println(pocetCifer(-27));
        //System.out.println(pocetRuznychCifer(202201));
        //System.out.println(covertTimeFromHours(3));
        //System.out.println(covertTimeFromMinutes(75));
        //System.out.println(covertTimeFromSec(3668));
        //System.out.println(nejvetsiSpolecnyDelitelEukliduvAlgoritmus(1, 2));
        //System.out.println(nejvetsiSpolecnyDelitelEfektivneji(2, 4));
        //System.out.println(nejvetsiSpolecnyDelitelRekurzivne(5, 10));
        //System.out.println(nejmensiSpolecnyNasobek(28, 72));
        //System.out.println(isPrvocislo(73));
        //System.out.println(Arrays.toString(eratostedovoSito(31)));
        //printPrvociselnyRozklad(30);
        //System.out.println(pocetRuznychPrvocinitelu(30));
        //System.out.println(soucetPrvocinitelu(8));
        //System.out.println(vypocetPolynomu(new float[] {1.0F, 0F, 3.0F, -4.0F}, 2.0F));
        //System.out.println(indexOfArrSimpleForLoop(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 5));
        //System.out.println(indexOfArrSimpleWhileLoop(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 5));
        //System.out.println(indexOfSeZarazkou(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 5));
        //System.out.println(indexOfBinarniVyhledavani(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 5));
        //System.out.println(maxHodnotaPole(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
        //System.out.println(Arrays.toString(readMinMaxZeVstupuOnline()));
        //System.out.println(Arrays.toString(readMaxMax2Vstupu()));
        //System.out.println(nejdelsiSekvenceCiselZeVstupu());
        //System.out.println(Arrays.toString(posunPrvkuPole1Dopedu(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12})));
        //System.out.println(Arrays.toString(posunPrvkuPole1Dozadu(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12})));
        //System.out.println(Arrays.toString(posunPrvkuPoleLibovolneDopredu(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, 14)));
        //System.out.println(pocetRuznychPrvkuPole(new Integer[] {0, 1, 2, 2, 4, 5, 6, 7, 8, 9, 10, 12, 12}));
        //System.out.println(Arrays.toString(selectSort(new int[]{0, 3, 2, 8, 8, 9, 0, 60, 28, 9, 10, 11, 12})));
        //System.out.println(Arrays.toString(insertSort(new int[]{0, 3, 2, 8, 8, 9, 0, 60, 28, 9, 10, 11, 12})));
        //System.out.println(Arrays.toString(bubbleSort(new int[]{0, 3, 2, 8, 8, 9, 0, 60, 28, 9, 10, 11, 12})));
        //System.out.println(soucetPrvkuMatice(new int[][] {{1, 2, 3}, {2, 4, 6}}));
        //System.out.println(soucetPrvkuPodHlavniDiagonalouMatice(new int[][] {{1, 2, 3}, {2, 4, 6}}));
        //System.out.println(Arrays.toString(getZitra(31, 12, 2000)));
    }

    /*
      EUKLEIDŮV ALGORITMUS
      Tento lagoritmus slouží k nalezení největšího společného dělitele dvou čísel různých od nuly.
      Program dostane na vstupu dvě čísla. Zjistí, jeké z nich je větší a na základě výsledku odečte
      menší číslo od většího. Tímto způsobem pokračuje, dokud nejsou obě původní čísla stejná. V tu
      chvíli již máme výsledek, jímž je jedno z upravených vstupních čísel.

      TEST PRVOČÍSELNOSTI
      Tento algoritmus zjišťuje, zda vstupní celé číslo různé od nuly a jedničky je prvočíslem.
      Nejprve rozhodne, pomocí zbytkového dělení, zda je číslo sudé. Když tato podmínka platí, vrátí
      true, když je vstupní číslo 2 nebo false, když je jakékoli jiné sudé číslo. Nyní zkouší pro
      všechna lichá čísla do odmocniny ze vstupního čísla, zda jsou dělitelná právě jedním z těchto
      lichých čísel. Když ano, program vrátí false a skončí. Pokud tato podmínka neplatí, vrátí true,
      neboť testované číslo je prvočíslem.

      PRVOČÍSELNÝ ROZKLAD
      Tento algoritmus vypíše prvočíselný rozklad vstupního přirozeného čísla. Algoritmus zkouší dělit
      všechna čísla od 2 do vstupního čísla, dokud se z vstupního čísla nestane 1. Pokud nalezne takové
      číslo, že při dělení není zbytek, opakovaně vypisuje toto číslo a zárověň jím dělí vstupní číslo,
      dokud stále není při dělení zbytek. Ve chvíli, kdy je, tak pokračuje s číslem o 1 větší.
      Příklad: pro číslo 20 vypíše program: 2 2 5

      ERATOSTEDOVO SÍTO
      Tento Algoritmus se snaží najít všechna prvočísla od 0 do konceIntervalu, jež je zadaný v hlavičce
      metody. Vrací pole typu boolean, kde index pole značí číslo a hodnota na tomto indexu, zda je (true)
      nebo není (false) prvočíslem. Program nejdříve vytvoří pole o velikosti konecIntervalu + 1, pak do
      pole vloží pomocí for cyklu hodnoty true. Pro každé číslo od 2 do konceIntervalu vyhodnotí podmínku,
      zda je hodnota na indexu nynějšího čísla, pro které je testována, hodnota true. Když ano, pak do pole
      s indexy, jež odpovídají násobkům tohoto čísla menšího než je interval, uloží hodnotu false. Takto
      program pokračuje až do chvíle, kdy vyzkoušel každý další prvek v poli. V tu chvíli pole vrátí.

      BINÁRNÍ VYHLEDÁVÁNÍ
      Tento algoritmus slouží k vyhledání čísla v poli, tedy vrátí index, na kterém se toto číslo v poli
      nachází. Důležitou podmínkou je, že pole musí být seřazené podle velikosti vzestupně.

      HORNEROVO SCHÉMA


      SELECT SORT


      INSERT SORT


      BUBBLE SORT


      MERGE SORT


      HEAP SORT


     */

    /**
     * Is delitelny boolean.
     *
     * @param delenec the delenec
     * @param delitel the delitel
     * @return the boolean
     */
    public static boolean isDelitelny(int delenec, int delitel) {
        return delenec % delitel == 0;
    }

    /**
     * Print delitelna cisla z intervalu.
     *
     * @param delitel        the delitel
     * @param konecIntervalu the konec intervalu
     */
    public static void printNasobkyCislaZIntervalu(int delitel, int konecIntervalu) {
        int pocitadlo = delitel;
        while (pocitadlo <= konecIntervalu) {
            System.out.println(pocitadlo);
            pocitadlo += delitel;
        }
    }

    int najdiVPoli(int hledaneCislo, int[] pole) {
        int index = -1;
        for (int i = 0; i < pole.length; i++) {
            if (i == hledaneCislo) {
                index = i;
            }
        }

        return index;
    }

    void printNasobkyCislaZIntervaluxx(int delitel, int konecIntervalu) {
        for (int i = 0; i <= konecIntervalu; i++) {
            if (i % delitel == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     * Print dvojice scitancu.
     *
     * @param x the x
     */
    public static void printDvojiceScitancu(int x) {
        for (int i = 0; i <= x; i++) {
            System.out.println(i + " " + (x - i));
        }
    }

    /**
     * Is in array boolean.
     *
     * @param arr          the arr
     * @param hledaneCislo the hledane cislo
     * @return the boolean
     */
    public static boolean isInArray(int[] arr, int hledaneCislo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == hledaneCislo)
                return true;
        }

        return false;
    }

    /**
     * Calculate polynom int.
     *
     * @param x   the x
     * @param arr the arr
     * @return the int
     */
    public static int vypocetPolynomu(int x, int[] arr) {
        int vysledek = 0;
        int prubezneX = 1;
        for (int i = 0; i < arr.length; i++) {
            vysledek += prubezneX * arr[i];
            prubezneX *= x;
        }

        return vysledek;
    }

    /**
     * Max hodnota int.
     *
     * @param a the a
     * @param b the b
     * @param c the c
     * @param d the d
     * @return the int
     */
    public static int maxHodnota(int a, int b, int c, int d) {
        if (a >= b && a >= c && a >= d)
            return a;
        if (b >= c && b >= d)
            return b;
        if (c >= d)
            return c;

        return d;
    }

    /**
     * Ciferny soucet int.
     *
     * @param x the x
     * @return the int
     */
    public static int cifernySoucet(int x) {
        int cifernySoucet = 0;
        while (x != 0) {
            cifernySoucet += x % 10;
            x /= 10;
        }

        return cifernySoucet;
    }

    /**
     * Has cifra boolean.
     *
     * @param x     the x
     * @param cifra the cifra
     * @return the boolean
     */
    public static boolean hasCifra(int x, int cifra) {
        if (x == 0) return cifra == 0;
        while (x != 0) {
            if (x % 10 == cifra)
                return true;
            x /= 10;
        }

        return false;
    }

    /**
     * Pocet cifer int.
     *
     * @param x the x
     * @return the int
     */
    public static int pocetCifer(int x) {
        if (x == 0) return 1;
        int pocetCifer = 0;
        while(x != 0) {
            x /= 10;
            pocetCifer++;
        }

        return pocetCifer;
    }

    /**
     * Pocet ruznych cifer int.
     *
     * @param x the x
     * @return the int
     */
    public static int pocetRuznychCifer(int x) {
        if (x == 0) return 1;
        int ruzneCifry = 0;
        int[] cifry = new int[9];
        for (int i = 0; i < cifry.length; i++) {
            cifry[i] = 0;
        }
        while (x != 0) {
            cifry[x % 10]++;
            x /= 10;
        }

        for (int i = 0; i < cifry.length; i++) {
            if (cifry[i] != 0)
                ruzneCifry++;
        }

        return ruzneCifry;
    }

    /**
     * Covert time from sec string.
     *
     * @param sec the sec
     * @return the string
     */
    public static String covertTimeFromSec(int sec) {
        int h = sec/3600;
        sec %= 3600;
        int min = sec/60;
        sec %= 60;
        return ("h: " + h + " -- min: " + min + " -- sec: " + sec);
    }

    /**
     * Covert time from minutes string.
     *
     * @param min the min
     * @return the string
     */
    public static String covertTimeFromMinutes(int min) {
        int h = min/60;
        min %= 60;
        return ("h: " + h + " -- min: " + min + " -- sec: 0");
    }

    /**
     * Covert time from hours string.
     *
     * @param h the h
     * @return the string
     */
    public static String covertTimeFromHours(int h) {
        return ("h: " + h + " -- min: 0 -- sec: 0");
    }

    /**
     * Nejvetsi spolecny delitel eukliduv algoritmus int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int nejvetsiSpolecnyDelitelEukliduvAlgoritmus(int a, int b) {
        while(a != b) {
            if (a < b)
                b -= a;
            else
                a -= b;
        }

        return a;
    }

    /**
     * Nejvetsi spolecny delitel efektivneji int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int nejvetsiSpolecnyDelitelEfektivneji(int a, int b) {
        int c;
        while (b != 0) {
            c = b;
            b = a % b;
            a = c;
        }

        return a;
    }

    /**
     * Nejvetsi spolecny delitel rekurzivne int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int nejvetsiSpolecnyDelitelRekurzivne(int a, int b) {
        if (b == 0) return a;
        return nejvetsiSpolecnyDelitelRekurzivne(b, a % b);
    }

    /**
     * Nejmensi spolecny nasobek int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public static int nejmensiSpolecnyNasobek(int a, int b) {
        return ((a * b) / nejvetsiSpolecnyDelitelRekurzivne(a, b));
    }

    /**
     * Is prvocislo boolean.
     *
     * @param x the x
     * @return the boolean
     */
    public static boolean isPrvocislo(int x) {
        if (x % 2 == 0) return x == 2;
        int pocitadlo = 3;
        while (pocitadlo * pocitadlo <= x) {
            if (x % pocitadlo == 0)
                return false;
            pocitadlo += 2;
        }

        return true;
    }

    /**
     * Eratostedovo sito boolean [ ].
     *
     * @param konecIntervalu the konec intervalu
     * @return the boolean [ ]
     */
    public static boolean[] eratostedovoSito(int konecIntervalu) {
        boolean[] prvocisla = new boolean[konecIntervalu + 1];
        for (int i = 0; i < prvocisla.length; i++) {
            prvocisla[i] = true;
        }

        int pocitadlo = 2;
        while (pocitadlo * pocitadlo <= konecIntervalu) {
            if (prvocisla[pocitadlo]) {
                int i = 2 * pocitadlo;
                while (i <= konecIntervalu) {
                    prvocisla[i] = false;
                    i += pocitadlo;
                }
            }
            pocitadlo++;
        }

        return prvocisla;
    }

    /**
     * Print prvociselny rozklad.
     *
     * @param x the x
     */
    public static void printPrvociselnyRozklad(int x) {
        int pocitadlo = 2;
        while (x > 1) {
            if (x % pocitadlo == 0) {
                x /= pocitadlo;
                System.out.println(pocitadlo);
            } else {
                pocitadlo++;
            }
        }
    }

    /**
     * Pocet ruznych prvocinitelu int.
     *
     * @param x the x
     * @return the int
     */
    public static int pocetRuznychPrvocinitelu(int x) {
        int pocitadlo = 2;
        int ruzniPrvocinitele = 0;
        int posledni = -1;
        while (x > 1) {
            if (x % pocitadlo == 0) {
                x /= pocitadlo;
                if (pocitadlo != posledni) {
                    ruzniPrvocinitele++;
                    posledni = pocitadlo;
                }
            } else {
                pocitadlo++;
            }
        }

        return ruzniPrvocinitele;
    }

    /**
     * Soucet prvocinitelu int.
     *
     * @param x the x
     * @return the int
     */
    public static int soucetPrvocinitelu(int x) {
        int soucet = 0;
        int pocitadlo = 2;
        while (x > 1) {
            if (x % pocitadlo == 0) {
                soucet += pocitadlo;
                x /= pocitadlo;
            } else {
                pocitadlo++;
            }
        }

        return soucet;
    }

    /**
     * Vypocet polynomu float.
     *
     * @param arr the arr
     * @param x   the x
     * @return the float
     */
    public static float vypocetPolynomu(float[] arr, float x) {
        float vysledek = 0F;
        for (int i = arr.length - 1; i >= 0; i--) {
            vysledek = vysledek * x + arr[i];
        }

        return vysledek;
    }

    /**
     * Index of arr simple for loop int.
     *
     * @param arr          the arr
     * @param hledaneCislo the hledane cislo
     * @return the int
     */
    public static int indexOfArrSimpleForLoop(int[] arr, int hledaneCislo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == hledaneCislo)
                return i;
        }

        return -1;
    }

    /**
     * Index of arr simple while loop int.
     *
     * @param arr          the arr
     * @param hledaneCislo the hledane cislo
     * @return the int
     */
    public static int indexOfArrSimpleWhileLoop(int[] arr, int hledaneCislo) {
        int i = 0;
        while(i < arr.length && arr[i] != hledaneCislo) i++;
        return ((i == arr.length) ? -1 : i);
    }

    /**
     * Index of se zarazkou int.
     *
     * @param arr          the arr
     * @param hledaneCislo the hledane cislo
     * @return the int
     */
    public static int indexOfSeZarazkou(int[] arr, int hledaneCislo) {
        //pole je zadane s prázdným polem na konci
        arr[arr.length - 1] = hledaneCislo;
        int i = 0;
        while (arr[i] != hledaneCislo) i++;
        return ((i == arr.length - 1) ? -1 : i);
    }

    /**
     * Index of binarni vyhledavani int.
     *
     * @param arr          the arr
     * @param hledaneCislo the hledane cislo
     * @return the int
     */
    public static int indexOfBinarniVyhledavani(int[] arr, int hledaneCislo) {
        int leva = 0;
        int prava = arr.length - 1;
        int stred = (leva + prava) / 2;
        while (leva < prava && arr[stred] != hledaneCislo) {
            if (hledaneCislo < arr[stred])
                prava = stred - 1;
            else
                leva = stred + 1;
            stred = (leva + prava) / 2;
        }
        return ((arr[stred] == hledaneCislo) ? stred : -1);
    }

    /**
     * Max hodnota pole int.
     *
     * @param arr the arr
     * @return the int
     */
    public static int maxHodnotaPole(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    /**
     * Read min max ze vstupu online int [ ].
     *
     * @return the int [ ]
     */
    public static int[] readMinMaxZeVstupuOnline() {
        /*
        int min, max, vstup;
        if (!konecVstupu) {
            vstup = read();
            min = max = vstup;
        } else {
            return null, null;
        }

        while (!konecVstupu) {
            vstup = read();
            if (vstup > max) {
                max = vstup;
            } else if (vstup < min) {
                min = vstup;
            }
        }

        return min, max;
         */

        // program počítá jen s pěti čísli na vstupu pro funkčnost a zjednodušení
        Scanner scanner = new Scanner(System.in);
        int max, min;
        max = min = scanner.nextInt();
        System.out.println("vstup: " + max);

        for (int i = 0; i < 4; i++) {
            int vstup = scanner.nextInt();
            System.out.println("vstup: " + vstup);
            if (vstup > max) {
                max = vstup;
            } else if (vstup < min) {
                min = vstup;
            }
        }

        return new int[] {min, max};
    }

    /**
     * Read max max 2 vstupu int [ ].
     *
     * @return the int [ ]
     */
    public static int[] readMaxMax2Vstupu() {
        /*
        int max, max2, vstup;
        if (!konecVstupu) {
            vstup = read();
            max = max2 = vstup;
        } else {
            return null, null;
        }

        while (!konecVstupu) {
            vstup = read();
            if (vstup > max) {
                max2 = max;
                max = vstup;
            } else if (vstup < max2) {
                max2 = vstup;
            }
        }

        return max, max2;
         */

        // program počítá jen s pěti čísli na vstupu pro funkčnost a zjednodušení
        Scanner scanner = new Scanner(System.in);
        int max, max2;
        max = max2 = scanner.nextInt();
        System.out.println("vstup: " + max);

        for (int i = 0; i < 4; i++) {
            int vstup = scanner.nextInt();
            System.out.println("vstup: " + vstup);
            if (vstup > max) {
                max2 = max;
                max = vstup;
            } else if (vstup > max2) {
                max2 = vstup;
            }
        }

        return new int[] {max, max2};
    }

    /**
     * Nejdelsi sekvence cisel ze vstupu int.
     *
     * @return the int
     */
    public static int nejdelsiSekvenceCiselZeVstupu() {
        /*
        int cislo, pocet, maxPocet;
        if (!konecVstupu) {
            cislo = read();
            pocet = maxPocet = 1;
        } else {
            return null, null;
        }
        while (!konecVstupu) {
            int vstup = read();
            if (vstup == cislo) {
                pocet++;
            } else {
                if (pocet > maxPocet) {
                    maxPocet = pocet;
                }
                cislo = vstup;
                pocet = 1;
            }
        }

        return maxPocet;
         */

        // program počítá jen s pěti čísli na vstupu pro funkčnost a zjednodušení
        Scanner scanner = new Scanner(System.in);
        int pocet, maxPocet, cislo;
        cislo = scanner.nextInt();
        System.out.println("vstup: " + cislo);
        pocet = maxPocet = 1;

        for (int i = 0; i < 4; i++) {
            int vstup = scanner.nextInt();
            System.out.println("vstup: " + vstup);
            if (vstup == cislo) {
                pocet++;
            } else {
                if (pocet > maxPocet) {
                    maxPocet = pocet;
                }
                cislo = vstup;
                pocet = 1;
            }
        }

        if (pocet > maxPocet) {
            maxPocet = pocet;
        }

        return maxPocet;
    }

    /**
     * Posun prvku pole 1 dopedu int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public static int[] posunPrvkuPole1Dopedu(int[] arr) {
        int posledniPrvek = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        arr[0] = posledniPrvek;

        return arr;
    }

    /**
     * Posun prvku pole 1 dozadu int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public static int[] posunPrvkuPole1Dozadu(int[] arr) {
        int prvniPrvek = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = prvniPrvek;

        return arr;
    }

    /**
     * Posun prvku pole libovolne dopredu int [ ].
     *
     * @param arr   the arr
     * @param posun the posun
     * @return the int [ ]
     */
    public static int[] posunPrvkuPoleLibovolneDopredu(int[] arr, int posun) {
        while (posun > arr.length) posun -= arr.length;
        int[] vysadaPrvku = new int[posun];

        int j = 0;
        for (int i = arr.length - posun;j < vysadaPrvku.length; i++) {
            vysadaPrvku[j] = arr[i];
            j++;
        }

        for (int i = arr.length - posun - 1; i >= 0; i--) {
            arr[i + posun] = arr[i];
        }

        for (int i = 0; i < vysadaPrvku.length; i++) {
            arr[i] = vysadaPrvku[i];
        }

        return arr;
    }

    /**
     * Pocet ruznych prvku pole int.
     *
     * @param arr the arr
     * @return the int
     */
    public static int pocetRuznychPrvkuPole(Integer[] arr) {
        int ruzneHodnoty = 0;
        int vyskrtavac;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                vyskrtavac = arr[i];
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] != null && arr[j] == vyskrtavac) arr[j] = null;
                }

                ruzneHodnoty++;
            }
        }
        return ruzneHodnoty;
    }

    /**
     * Select sort int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] <= arr[i]) {
                    int vymena = arr[i];
                    arr[i] = arr[j];
                    arr[j] = vymena;
                }
            }
        }

        return arr;
    }

    /**
     * Insert sort int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int nynejsiCislo = arr[i];
            if (nynejsiCislo < arr[i - 1]) {
                int indexProVlozeni = 0;
                while (arr[indexProVlozeni] < nynejsiCislo) indexProVlozeni++;

                for (int j = i; j > indexProVlozeni; j--) {
                    arr[i] = arr[i - 1];
                }

                arr[indexProVlozeni] = nynejsiCislo;
            }
        }
        return arr;
    }

    /**
     * Bubble sort int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public static int[] bubbleSort(int[] arr) {
        boolean zmena = true;
        while (zmena) {
            boolean nynejsiZmena = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    int vymena = arr[i];
                    arr[i] = arr[i-1];
                    arr[i - 1] = vymena;
                    nynejsiZmena = true;
                }
            }

            zmena = nynejsiZmena;
        }

        return arr;
    }

    /**
     * Soucet prvku matice int.
     *
     * @param arr the arr
     * @return the int
     */
    public static int soucetPrvkuMatice(int[][] arr) {
        int vysledek = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                vysledek += arr[i][j];
            }
        }

        return vysledek;
    }

    /**
     * Soucet prvku pod hlavni diagonalou matice int.
     *
     * @param arr the arr
     * @return the int
     */
    public static int soucetPrvkuPodHlavniDiagonalouMatice(int[][] arr) {
        int vysledek = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                vysledek += arr[i][j];
            }
        }

        return vysledek;
    }

    /**
     * Transpozice matice int [ ] [ ].
     *
     * @param arr the arr
     * @return the int [ ] [ ]
     */
    public static int[][] transpoziceMatice(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                int vymena = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = vymena;
            }
        }

        return arr;
    }

    /**
     * Is prestupny boolean.
     *
     * @param rok the rok
     * @return the boolean
     */
    public static boolean isPrestupny(int rok) {
        if (rok % 100 == 0) return (rok % 400 == 0);
        else return rok % 4 == 0;
    }

    /**
     * Get zitra int [ ].
     *
     * @param den   the den
     * @param mesic the mesic
     * @param rok   the rok
     * @return the int [ ]
     */
    public static int[] getZitra(int den, int mesic, int rok) {
        int[] mesice = {0, 31, (isPrestupny(rok)) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (den < mesice[mesic]) {
            return new int[] {den + 1, mesic, rok};
        } else {
            if (mesic == 12) {
                return new int[] {1, 1, rok + 1};
            } else {
                return new int[] {1, mesic + 1, rok};
            }
        }
    }
}
