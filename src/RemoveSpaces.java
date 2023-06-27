public class RemoveSpaces {
    public static void main(String[] args) {
        String strg = "India     Is My    Country";
        String Str = strg.replaceAll("\\s", "");
        System.out.println(Str);
    }
}
