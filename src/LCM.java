public class LCM {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        int lcm = (a > b) ? a : b;

        while(true){
            if(lcm % a == 0 && lcm % b == 0){
                System.out.println("LCM of "+a+" & "+b+" is "+lcm);
                break;
            }
            lcm++;
        }
    }
}
