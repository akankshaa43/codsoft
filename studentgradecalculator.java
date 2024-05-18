import java.util.Scanner;

public class studentgradecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the subjects: ");
        int num = scanner.nextInt();

        int total_Marks_Subjects = 0;
        for(int i = 1; i <= num; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            total_Marks_Subjects += marks;
        }

        double avgPer = (double) total_Marks_Subjects / num;

        String grade;
        if(avgPer >= 90) {
            grade = "A+";
        } else if(avgPer >= 80 && avgPer<90) {
            grade = "A";
        } else if(avgPer >= 70 && avgPer<80) {
            grade = "B";
        } else if(avgPer >= 60 && avgPer<70) {
            grade = "C";
        } else if(avgPer >= 50 && avgPer<60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + total_Marks_Subjects);
        System.out.println("Average Percentage: " + avgPer);
        System.out.println("Grade: " + grade);

    }
}
