import java.util.*;
import java.io.*;

public class A3 {
    public static void main(String[] args) {
        try {
            String in = args[0];
            String op = args[1];
            File input = new File(in);
            File output = new File(op);
            PrintWriter pr = new PrintWriter(output);
            Scanner s = new Scanner(input);
            while (s.hasNextLine()) {
                String result = s.nextLine();
                result = result.replaceAll("[0-9]", "*");
                pr.write(result.toLowerCase());
                pr.println();
                System.out.println(result.toLowerCase());
            }
            pr.flush();
            s.close();
        } catch (Exception e) {
            System.out.println("File error ");
        }
    }
}