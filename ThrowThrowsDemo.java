import java.io.*;

class ThrowThrowsDemo {

    // Method declares it may throw IOException
    public static void readFile(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName); // may cause FileNotFoundException
        BufferedReader br = new BufferedReader(fr);
        System.out.println("First line: " + br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            // Here we actually throw exception if file not found
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
