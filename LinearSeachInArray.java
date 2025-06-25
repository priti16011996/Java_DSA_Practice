public class LinearSeachInArray {

    public static int LinearSeach(int a[],int b)
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == b)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[] = {5,10,15,25,14,85,36,75,85,45,68,75};
        int key = 25;
        int index = LinearSeach(marks,key);
        System.out.println(index);
    }
}
