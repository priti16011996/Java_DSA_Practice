public class MinMaxElementInArray {
    public static int LargestSmallestElement(int a[])
    {
        int Max = Integer.MAX_VALUE;
        int Min = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++)
        {
            if(Max > a[i])
            {
                Max = a[i];
            }
            if(Min < a[i])
            {
                Min = a[i];
            }
        }
        System.out.println("Smallest Number: "+Min);
        return Max;
    }
    public static void main(String[] args) {
        int a[] ={23,12,26,78,56,8,4,2,5,6};
        int Max = LargestSmallestElement(a);
        System.out.println("Largest Element: "+Max);

    }
}
