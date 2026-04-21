// Program 2: Demonstration of throws keyword

import java.io.*;

class ThrowsExample {

    static void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(file);

        System.out.println(br.readLine());

        br.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }
    }
}