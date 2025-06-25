import java.util.*;

public class Array_01{
    public static void main(String[] args) {
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int phy_marks = sc.nextInt();
        int chem_marks = sc.nextInt();
        int math_marks = sc.nextInt();
        marks[0]= phy_marks;
        marks[1]= chem_marks;
        marks[2]= math_marks;
        System.out.println("Physics Marks:"+marks[0]);
        System.out.println("Chemistry Marks: "+marks[1]);
        System.out.println("MathematicsMarks:"+marks[2]);

        int percentage = (marks[0]+marks[0]+marks[0])/3;

        System.out.println("Percentage Marks:"+percentage+"%");
    }
}