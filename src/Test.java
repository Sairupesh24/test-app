public class Test {


    public static void main(String[] args) {
        System.out.println("Welcome to IDX");
        int x = 10;
        String name = "IDX";
        boolean y = true;
        System.out.println(y);
        int a = 20, b = 30;
        boolean c = a<b;
        System.out.println(c);
        if (a<b){
            System.out.println("inside if condition");
        }
        for (int i = 0; i<10; i++){
            System.out.println(i);
        }
        int arr[]={10,20,50,60};
        System.out.println(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        display();
        int result = add(4,5);
        System.out.println(result);
    }

    public static void display(){
        System.out.println("Inside Display Function");
    }
    public static int add(int x, int y){
        return x+y;
    }
}
