import java.io.*;

public class Aufgabe1 {
    public static void main(String[] args) {

    	String newFile = args[args.length - 1];

        // Check if newFile already exists
        File newOutputFile = new File(newFile);
        if (newOutputFile.exists()) {
            System.out.println("Error: Output file already exists.");
            return;
        }

        try (FileOutputStream out = new FileOutputStream(newFile);
             BufferedOutputStream bout = new BufferedOutputStream(out)) {

            for (int i = 0; i < args.length - 1; i++) {
                String source = args[i];
                File sourceFile = new File(source);

                // Check if source file exists
                if (!sourceFile.exists()) {
                    System.out.println("Error: Source file not found: " + source);
                    continue;
                }

                try (FileInputStream in = new FileInputStream(sourceFile);
                     BufferedInputStream bin = new BufferedInputStream(in)) {

                    int b;
                    while ((b = bin.read()) != -1) {
                        bout.write(b);
                    }

                } catch (IOException e) {
                    System.out.println("Error reading file: " + source);
                }
            }

            System.out.println("Files concatenated successfully.");

        } catch (IOException e) {
            System.out.println("Error creating output file.");
        }
    }
}