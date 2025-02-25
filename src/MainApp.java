public class MainApp {
    public static void main(String[] args) {
        int [] a = new int[10];
        int[] deneme = {5,5,5,5};


        int[] b = ArrayApp.arrayAdd(a, deneme);

        ArrayApp.arrayPrint(b);
        System.out.println();
        ArrayApp.arrayPrint(a);

    }


}
