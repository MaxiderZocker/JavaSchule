import java.io.*;

public class DataTranslatorShort {
    public static void main(String[] args) throws IOException {
        String fileName = "Aufgabe6Short.dat";
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(fileName));

        // Write header (2 for short data size)
        dataOut.writeInt(2);

        // Write some short values
        dataOut.writeShort(250);
        dataOut.writeShort(-3000);
        dataOut.writeShort(32767);

        dataOut.close();
    }
}
