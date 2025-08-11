public class bsExecise {
    public static void BS(int rollno[], int marks[]) {
        int n = marks.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) { // sort by marks
                    // swap marks
                    int tempMarks = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempMarks;
                    // swap corresponding roll numbers
                    int tempRoll = rollno[j];
                    rollno[j] = rollno[j + 1];
                    rollno[j + 1] = tempRoll;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int rollno[] = {4, 7, 5, 3};
        int marks[] = {40, 30, 80, 70};
        BS(rollno, marks);
        System.out.println("RollNo\tMarks");
        for (int i = 0; i < rollno.length; i++) {
            System.out.println(rollno[i] + "\t" + marks[i]);
        }
    }
}