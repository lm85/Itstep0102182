/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 quick sort
 Zvolme v zadaném poli libovolný prvek a říkejme mu pivot. 
 Nyní můžeme pole přeházet tak, aby na jedné straně byly prvky větší než pivot, 
 na druhé menší než pivot a pivot samotný byl umístěn přesně mezi těmito částmi. 
 Tento postup můžeme zopakovat pro obě rozdělené části 
 (bez pivota, ten je již umístěn na správném místě). 
 Proceduru opakujeme tak dlouho, dokud nenarazíme na všechny triviálně řešitelné 
 podproblémy (pole velikosti 1). 
 V tento okamžik je celé pole seřazeno od nejvyššího prvku.

 bubble sort
 https://www.algoritmy.net/article/3/Bubble-sort
 (3 2 8 7 6) //zadání pole, řaďmě od největšího k nejmenšímu
 (3 2 8 7 6) // 3 a 2 jsou v korektním pořadí, posuňme se o index
 (3 2 8 7 6) // 8 > 2, prohoďme je
 (3 8 2 7 6) // 7 > 2, prohoďme je (zde je vidět probublávání nejlehčí dvojky vzhůru)
 (3 8 7 2 6) // 6 > 2, prohoďme je
 (3 8 7 6 2) // nový průchod polem: na posledním místě je nejlehčí prvek, tudíž se nám řazená úloha o jedna zkrátila, 8 > 3, prohoďme je
 (8 3 7 6 2) // 7 > 3, prohoďme je
 (8 7 3 6 2) // 6 > 3, prohoďme je
 (8 7 6 3 2) // seřazeno 

 selection sort
 https://www.algoritmy.net/article/4/Selection-sort
 (3 2 8 7 6) // zadání pole, řaďmě od největšího k nejmenšímu
 (3 2 8 7 6) // nejvyšší číslo je 8, prohoďme ho tedy s číslem 3 na indexu 0
 (8 2 3 7 6) // nejvyšší číslo je 7, prohoďme ho tedy s číslem 2 na indexu 1
 (8 7 3 2 6) // nejvyšší číslo je 6, prohoďme ho tedy s číslem 3 na indexu 2
 (8 7 6 2 3) // nejvyšší číslo je 3, prohoďme ho tedy s číslem 2 na indexu 3
 (8 7 6 3 2) // seřazeno 

 Insertion sort využívá tohoto myšlenkového postupu:
 https://www.algoritmy.net/article/8/Insertion-sort
 (3 2 8 7 6) // Zadání, prvek 3 je triviálně seřazen
 (3 2 8 7 6) // Vezmeme dvojku a vložíme jí na správné místo (tam už je)
 (3 2 8 7 6) // 8 vložíme na první místo, zbytek čísel posuneme
 (8 3 2 7 6) // 7 vložíme mezi 8 a 3, 3 a 2 posuneme
 (8 7 3 2 6) // 6 vložíme mezi 7 a 3, čísla 3 a 2 posuneme
 (8 7 6 3 2) // seřazeno 

 MERGE SORT
 https://www.algoritmy.net/article/13/Merge-sort
 Mergesort je stabilní řadicí algoritmus typu rozděl a panuj s asymptotickou 
 složitostí O(n \\cdot \\log{n}). Merge sort pracuje na bázi slévání 
 již seřazených částí pole za pomoci dodatečného pole velikosti n.
 Merge sort byl vynalezen v roce 1945 Johnem von Neumannem. 

 HEAP SORT
 Základem heapsortu je binární halda, jejíž základní vlastností je, že se chová jako prioritní fronta. Pokud z prioritní fronty postupně odebíráme prvky, tak je zřejmé, že tím dochází k jejich řazení. Celý postup se skládá z následujících kroků:

 Postavme haldu nad zadaným polem.
 Utrhněme vrchol haldy (prvek s nejvyšší prioritou - nejvyšší nebo nejnižší prvek dle způsobu řazení).
 Prohoďme utržený prvek s posledním prvkem haldy.
 Zmenšeme haldu o 1 (prvky řazené dle priority na konci pole jsou již seřazené).
 Opravme haldu tak, aby splňovala požadované vlastnosti (přestaly platit v momentě prohození prvků).
 Dokud má halda prvky GOTO: 2.
 Pole je seřazené v opačném pořadí, než je priorita prvků.

dale
 https://www.algoritmy.net/article/17/Heapsort
Shaker sort
counting sort
radix sort
bucket sort
shell sort
blogo sort
comb sort
drop sort
block merge sort
*/
package opakovanipole;

import java.util.Arrays;

/**
 *
 * @author Milan Z
 */
public class OpakovaniPole {

    /**
     * Bublinkove razeni (od nejvyssiho)
     *
     * @param array pole k serazeni
     */
    public static void main(String[] args) {
        // pole bubble sort
        int pole[] = {3, 2, 8, 7, 6};
        // pevne zadani 2 rozmerneho pole int pole2[][] = {{3,2,8,7,6},{3,2,8,7,6},{3,2,8,7,6}};

        /*
         jednoduchy quick sort
         Arrays.sort(pole);
        

         System.out.println("quick sort"); // printuji nazev sortu a pak hodnoty        
         // vypis pole
         for (int i = 0; i < pole.length; i++) {
         System.out.println("pole j:" + " " + pole[i] + " ");

         }
         */
        for (int i = 0; i < pole.length - 1; i++) {

            for (int j = 0; j < pole.length - i - 1; j++) {
                if (pole[j] > pole[j + 1]) {
                    int tmp = pole[j];
                    pole[j] = pole[j + 1];
                    pole[j + 1] = tmp;
                }
            }
        }

        System.out.println("Bubble sort"); // printuji nazev sortu a pak hodnoty        
        // vypis pole
        for (int i = 0; i < pole.length; i++) {
            System.out.println("pole j:" + " " + pole[i] + " ");

        }

        System.out.println();

        // selection sort
        for (int i = 0; i < pole.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < pole.length; j++) {
                if (pole[j] > pole[maxIndex]) {
                    maxIndex = j;
                }
            }
            int tmp = pole[i];
            pole[i] = pole[maxIndex];
            pole[maxIndex] = tmp;
        }

        System.out.println();

        // vypis pole
        System.out.println("Selection sort"); // printuji nazev sortu a pak hodnoty                
        for (int i = 0; i < pole.length; i++) {
            System.out.println("pole j:" + " " + pole[i] + " ");
        }

        for (int i = 0; i < pole.length - 1; i++) {

            int j = i + 1;

            int tmp = pole[j];

            while (j > 0 && tmp > pole[j - 1]) {

                pole[j] = pole[j - 1];

                j--;

            }

            pole[j] = tmp;

        }

        System.out.println();

        // vypis pole
        System.out.println("insertion sort"); // printuji nazev sortu a pak hodnoty                
        for (int i = 0; i < pole.length; i++) {
            System.out.println("pole j:" + " " + pole[i] + " ");
        }

        System.out.println();

    }

    /**
     * MERGE SORT Razeni slevanim (od nejvyssiho)
     *
     * @param array pole k serazeni
     * @param aux pomocne pole stejne delky jako array
     * @param left prvni index na ktery se smi sahnout
     * @param right posledni index, na ktery se smi sahnout
     */
    public static void mergeSort(int[] array, int[] aux, int left, int right) {
        if (left == right) {
            return;
        }
        int middleIndex = (left + right) / 2;
        mergeSort(array, aux, left, middleIndex);
        mergeSort(array, aux, middleIndex + 1, right);
        merge(array, aux, left, right);

        for (int i = left; i <= right; i++) {
            array[i] = aux[i];
        }
    }

    /**
     * Slevani pro Merge sort
     *
     * @param array pole k serazeni
     * @param aux pomocne pole (stejne velikosti jako razene)
     * @param left prvni index, na ktery smim sahnout
     * @param right posledni index, na ktery smim sahnout
     */
    private static void merge(int[] pole, int[] aux, int left, int right) {
        int middleIndex = (left + right) / 2;
        int leftIndex = left;
        int rightIndex = middleIndex + 1;
        int auxIndex = left;
        while (leftIndex <= middleIndex && rightIndex <= right) {
            if (pole[leftIndex] >= pole[rightIndex]) {
                aux[auxIndex] = pole[leftIndex++];
            } else {
                aux[auxIndex] = pole[rightIndex++];
            }
            auxIndex++;
        }
        while (leftIndex <= middleIndex) {
            aux[auxIndex] = pole[leftIndex++];
            auxIndex++;
        }
        while (rightIndex <= right) {
            aux[auxIndex] = pole[rightIndex++];
            auxIndex++;
        }

        System.out.println();

    }

    /**
     * Heapsort - razeni haldou
     *
     * @param array pole k serazeni
     * @param descending true, pokud ma byt pole serazeno sestupne, false pokud
     * vzestupne
     */
    public static void heapSort(Comparable[] pole, boolean descending) {

        for (int i = pole.length / 2 - 1; i >= 0; i--) {

            repairTop(pole, pole.length - 1, i, descending ? 1 : -1);

        }

        for (int i = pole.length - 1; i > 0; i--) {

            swap(pole, 0, i);

            repairTop(pole, i - 1, 0, descending ? 1 : -1);

        }

    }

    /**
     * Umisti vrchol haldy na korektni misto v halde (opravi haldu)
     *
     * @param array pole k setrizeni
     * @param bottom posledni index pole, na ktery se jeste smi sahnout
     * @param topIndex index vrsku haldy
     * @param order smer razeni 1 == sestupne, -1 == vzestupne
     */

    private static void repairTop(Comparable[] pole, int bottom, int topIndex, int order) {
        Comparable tmp = pole[topIndex];
        int succ = topIndex * 2 + 1;
        if (succ < bottom && pole[succ].compareTo(pole[succ + 1]) == order) {
            succ++;
        }

        while (succ <= bottom && tmp.compareTo(pole[succ]) == order) {
            pole[topIndex] = pole[succ];
            topIndex = succ;
            succ = succ * 2 + 1;
            if (succ < bottom && pole[succ].compareTo(pole[succ + 1]) == order) {
                succ++;
            }
        }
        pole[topIndex] = tmp;
    }

/**
* Prohodi prvky haldy
* @param array pole
* @param left index prvniho prvku
* @param right index druheho prvku
*/
private static void swap(Comparable[] pole, int left, int right) {
Comparable tmp = pole[right];
pole[right] = pole[left];
pole[left] = tmp;
}
    
}
