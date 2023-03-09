package javaj;
public class Extral {
    public static void main(String[] args){
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'a';
        } else if (testscore >= 80) {
            grade = 'b';
        } else if (testscore >= 70) {
            grade = 'c';
        } else if (testscore >= 60) {
            grade = 'd';
        } else {
            grade = 'f';
        }
        System.out.println("grade = " + grade);
    }
}