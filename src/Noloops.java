public class Noloops {
    public static void main(String[] args) {
        printWihtoutLoop(1);
    }

    public static void printWihtoutLoop(int n){
        if(n <= 20){
            System.out.println(n);
            printWihtoutLoop( n+1 );
        }
    }
}
