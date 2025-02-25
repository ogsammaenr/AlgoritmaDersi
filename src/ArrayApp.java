import java.util.Arrays;
import java.util.Random;

public class ArrayApp {
    public static void arrayPrint (int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] createRandomArray(int[] array){
        Random rand = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(0,51);
        }
        return array;
    }
    public static int[] arrayAdd(int[] array, int... elements){

        array = Arrays.copyOf(array, array.length + elements.length);
        for (int i = 0; i < elements.length; i++){
            array[i+ array.length] = elements[i];
        }
        return array;
    }


}
