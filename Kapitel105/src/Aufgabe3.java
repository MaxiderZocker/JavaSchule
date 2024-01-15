import java.io.*;

class Aufgabe3 {
    public static void main(String[] args) {
        String fileName = "ints.dat";
        long sum = 0;
        DataInputStream instr = null;

        try {
            instr = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(fileName)));

            try {
                while (true)
                    sum += instr.readInt();
            } catch (EOFException eof) {
                System.out.println("The sum is: " + sum);
            } catch (IOException iox) {
                System.out.println("Problems reading " + fileName);
            }
        } catch (IOException iox) {
            System.out.println("I/O Problems with " + fileName);
        } finally {
            try {
                if (instr != null) {
                    instr.close();
                }
            } catch (IOException closeException) {
                System.out.println("Error closing file: " + closeException.getMessage());
            }
        }
    }
}
