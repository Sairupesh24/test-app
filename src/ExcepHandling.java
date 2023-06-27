import java.io.IOException;

public class ExcepHandling {
    public static void main(String[] args) throws IOException{
        String name = "Krishna";
        int x =10, y=0;

        try{
            String upName = name.toUpperCase();
            System.out.println(upName);
            int z = x/y;
            System.out.println(z);
        } catch (NullPointerException e){
            System.out.println("Name should not be null.");
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException.");
        } finally {
            System.out.println("Final close some resources..");
        }
    }
}
