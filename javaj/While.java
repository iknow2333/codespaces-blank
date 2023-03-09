package javaj;
public class While {
    public static void main(String[] args) {
        int i = 0;
        while (i * i < 100000) {
            i++;
        }
        System.out.println("i=" + i);
        System.out.println("i*i=" + (i * i));

        i = 1;
        int summ = 0;
        while (i <= 100) {
            summ += i;
            i++;
        }
        System.out.println("sum=" + summ);
    }

}