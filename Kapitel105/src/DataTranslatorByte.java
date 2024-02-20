import java.io.*;

public class DataTranslatorByte {
    public static void main(String[] args) throws IOException {
        String fileName = "Aufgabe6Byte.dat";
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(fileName));

        // Write header (1 for byte data size)
        dataOut.writeInt(1);

        // Write some byte values
        dataOut.writeByte(10);
        dataOut.writeByte(-5);
        dataOut.writeByte(127);

        dataOut.close();
    }
}
