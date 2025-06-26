public class ReverseArray {
    public static void reverseArray(int a[])
    {
        int start =0;
        int last = a.length-1;
        while(start < last)
        {
            int temp = a[last];
            a[last] = a[start];
            a[start]= temp;
            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int a[] = {5,10,15,25,13,98,56,78};
        reverseArray(a);
        for(int i=0;i<a.length; i++)
        {
            System.out.print(a[i] +" ");
        }
    }
}
