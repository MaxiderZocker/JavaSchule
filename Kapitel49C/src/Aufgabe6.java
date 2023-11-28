import java.io.*;

class Aufgabe6 {

    public static void main(String[] args) throws IOException {
        int[][] data = {{3, 2, 5},
        				{1, 4, 4, 8, 13},
        				{9, 1, 0, 2},
        				{0, 2, 6, 3, -1, -8}};

        // max und min deklarieren

        // Summe berechnen
        for (int zeile = 0; zeile < data.length; zeile++) {
            int c = 0;
            for (int spalte = 0; spalte < data[zeile].length/2; spalte++) {
                c = data[zeile][spalte];
                data[zeile][spalte] = data[zeile][(data[zeile].length - (1 + spalte))];
                data[zeile][(data[zeile].length - (1 + spalte))] = c;
            }
        }

        for (int zeile = 0; zeile < data.length; zeile++) {
            System.out.println();
            for (int spalte = 0; spalte < data[zeile].length; spalte++) {
                System.out.print(data[zeile][spalte]);
                if (spalte < data[zeile].length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}