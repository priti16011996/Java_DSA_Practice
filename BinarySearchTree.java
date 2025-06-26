public class BinarySearchTree {

    public static int BinarySearchIndex(int a[], int key)
    {
        int start =0;
        int end = a.length-1;

        while(start <= end)
        {
            int mid = (start + end)/2;
            if(a[mid]== key)
            {
                return mid;
            }
            else if(a[mid]> key)
            {
                end = mid-1;;
            }
            else
            {
                start = mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {3,4,10,15,35,78,95,154,207};
        int key = 4;
        int index = BinarySearchIndex(a,key);
        if(index == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index:"+index);
        }
    }
}
