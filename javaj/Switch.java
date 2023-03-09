package javaj;
public class Switch {
    public static void main(String[] args) {
        char grade;
        int testscore = 90;
        switch (testscore / 10) {
            case 9:
                grade = 'a';
                break;
            case 8:
                grade = 'b';
                break;
            case 7:
            case 6:
                grade = 'c';
                break;
            default:
                grade = 'd';
        }
        System.out.println("Grade = " + grade);
    }
}
