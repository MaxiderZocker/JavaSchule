import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Aufgabe2 {

    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Usage: java FileSplitter <bigFile> <baseName> <chunkSize>");
            return;
        }

        String bigFile = args[0];
        String baseName = args[1];
        int chunkSize = Integer.parseInt(args[2]);

        File inputFile = new File(bigFile);
        long fileSize = inputFile.length();

        int numChunks = (int) Math.ceil((double) fileSize / chunkSize);

        try (FileInputStream inputStream = new FileInputStream(inputFile)) {
            for (int i = 0; i < numChunks - 1; i++) {
                byte[] data = new byte[chunkSize];
                int bytesRead = inputStream.read(data);
                String chunkName = baseName + i;
                writeChunk(chunkName, data);
            }

            // Handle the last chunk (may be smaller than chunkSize)
            byte[] lastChunkData = new byte[(int) (fileSize % chunkSize)];
            int bytesRead = inputStream.read(lastChunkData);
            String lastChunkName = baseName + (numChunks - 1);
            writeChunk(lastChunkName, lastChunkData);
        }

        System.out.println("File split successfully!");
    }

    private static void writeChunk(String chunkName, byte[] data) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(chunkName)) {
            outputStream.write(data);
        }
    }
}