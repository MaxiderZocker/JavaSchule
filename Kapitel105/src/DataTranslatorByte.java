import java.io.*;

public class DataTranslatorByte {
    public static void main(String[] args) throws IOException {
        String fileName = "Aufgabe8in.dat";
        DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(fileName));

        // Write header (1 for byte data size)
        //dataOut.writeInt(1);

        // Write some byte values
        dataOut.writeByte(10);
        dataOut.writeByte(83);
        dataOut.writeByte(127);
        dataOut.writeByte(23);
        dataOut.writeByte(38);
        dataOut.writeByte(106);
        dataOut.writeByte(10);
        dataOut.writeByte(83);
        dataOut.writeByte(127);
        dataOut.writeByte(23);
        dataOut.writeByte(38);
        dataOut.writeByte(106);
        dataOut.writeByte(10);
        dataOut.writeByte(83);
        dataOut.writeByte(127);
        dataOut.writeByte(23);
        dataOut.writeByte(38);
        dataOut.writeByte(106);
        dataOut.writeByte(10);
        dataOut.writeByte(83);
        dataOut.writeByte(127);
        dataOut.writeByte(23);
        dataOut.writeByte(38);
        dataOut.writeByte(106);
        dataOut.writeByte(10);
        dataOut.writeByte(83);
        dataOut.writeByte(127);
        dataOut.writeByte(23);
        dataOut.writeByte(38);
        dataOut.writeByte(106);

        dataOut.close();
    }
}
