import java.util.Scanner;

public class Student_calculator {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total subjects:");
		int subnum = sc.nextInt();
		int marks[] = new int[subnum];
		int score = 0;
		System.out.println("Enter "+subnum+" subject marks: ");
		for(int i=0;i<subnum;i++) {
			marks[i] = sc.nextInt();
			score = score + marks[i];
		}
		int total_marks = score;
		double average_percent = (double)score/subnum;
		System.out.println("**RESULTS**");
		System.out.println("Total Marks: "+total_marks);
		System.out.println("Average Percentage: "+average_percent);
		if(average_percent>=90) {
			System.out.println("Grade: A");
		}
		else if(average_percent>=80) {
			System.out.println("Grade: B");
		}
		else if(average_percent>=70) {
			System.out.println("Grade: C");
		}
		else if(average_percent>=60) {
			System.out.println("Grade: D");
		}
		else {
			System.out.println("Grade: Fail");
		}
		sc.close();
	}

}
