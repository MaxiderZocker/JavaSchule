import java.io.FileInputStream;
import java.io.IOException;

public class Aufgabe6 {

    public static void main(String[] args) throws IOException {
    	  if (args.length != 1) {
              System.out.println("Usage: java IntegerReader <filename>");
              return;
          }

        String filename = args[0];

        try (FileInputStream inputStream = new FileInputStream(filename)) {
            // Read header
            byte[] header = new byte[4];
            if (inputStream.read(header) != 4) {
                throw new IOException("Error reading header");
            }

            int bytesPerInt = header[0];

            // Check valid byte per integer
            if (bytesPerInt != 1 && bytesPerInt != 2 && bytesPerInt != 4) {
                throw new IOException("Invalid bytes per integer in header");
            }

            // Read and print data
            while (true) {
                byte[] data = new byte[bytesPerInt];
                int bytesRead = inputStream.read(data);
                if (bytesRead == -1) {
                    break;
                }

                // Convert data to integer based on bytes per integer
                int value = 0;
                for (int i = 0; i < bytesRead; i++) {
                    value = (value << 8) | (data[i] & 0xFF);
                }

                System.out.println(value);
            }
        }
    }
}
