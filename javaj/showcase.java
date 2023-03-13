package javaj;

public class showcase {
    public static void main(String[] args) {
        int[] array = new int[500];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                continue;
            }
            for (int j = 2; j < array[i]; j++) {
                if (array[i] % j == 0) {
                    array[i] = 0;
                    break;
                }
            }
        }
        for (int element : array) {
            if (element != 0) {
                System.out.printf("%d ", element);
            }
        }  
    }
}
