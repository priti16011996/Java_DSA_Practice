public class Array_02 {
    public static void updateMarks(int marks[], int nonchangable)
    {
        nonchangable =38;
        for(int i=0; i<marks.length; i++)
        {
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {95,78,68};
        int nonchangable=15;
        updateMarks(marks, nonchangable);

        for(int i=0; i<marks.length; i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.println(nonchangable);
    }
    
}
