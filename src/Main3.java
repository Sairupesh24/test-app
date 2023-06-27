import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        try {
            Chicken chicken = new Chicken(name, age);
            System.out.println(chicken);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
