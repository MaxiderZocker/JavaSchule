import java.io.*;

public class Aufgabe5 {

    public static void main(String[] args) throws IOException {
        String inputFileName = "Aufgabe5.dat";
        String outputFileName = "Aufgabe5aus.dat";

        try (FileInputStream inputStream = new FileInputStream(inputFileName);
             FileOutputStream outputStream = new FileOutputStream(outputFileName)) {

            int data;
            while ((data = inputStream.read()) != -1) {
                if (data >= -32768 && data <= 32767) {
                    outputStream.write((short) data);
                } else {
                    System.out.println("Error: Input value " + data + " is outside the expected range (-32768 to 32767)");
                    outputStream.write((short) 0);
                }
            }
        }
    }
}
