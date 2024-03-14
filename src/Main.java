import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            StringBuilder content = new StringBuilder();
            String dong;
            while ((dong = reader.readLine()) != null) {
                content.append(dong).append("\n");
            }
            reader.close();

            String replacedContent = content.toString().replaceAll("Nha Trang", "Vũng Tàu");

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write(replacedContent);
            writer.close();

            System.out.println("Đã thay thế và ghi nội dung vào tệp " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

