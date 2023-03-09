package javaj;
public class unite_array {
    public static void main(String[] args) {
        int array1[] = { 20, 10, 50, 30, 40 };
        int array2[] = { 1, 2, 3 };
        int array[] = new int[array1.length + array2.length];
        for (int i = 0; i < array.length; i++) {
            if (i < array1.length) {
                array[i] = array1[i];
            } else {
                array[i] = array2[i - array1.length];
            }
        }
        for (int element : array) {
            System.out.printf("%d ", element);
        }
    }
}