public class App {
    public static void main(String[] args) {
        Human h = null;
        String gender = "Male";
        if (gender.equals("Male")) {
            h = new Male();
        } else {
            h = new Female();
        }
        h.name = "Sam";
        h.welcomeMsg();
    }
}

