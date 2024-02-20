import java.io.*;

public class DataTranslatorInt {
    public static void main(String[] args) throws IOException {
        String fileName = "Aufgabe6Int.dat";
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(fileName));

        // Write header (4 for int data size)
        dataOut.writeInt(4);

        // Write some int values
        dataOut.writeInt(100000);
        dataOut.writeInt(-2000000);
        dataOut.writeInt(Integer.MAX_VALUE);

        dataOut.close();
    }
}
