import java.util.Arrays;

public class App {

    public static int[] arr= {55, 12, 66, 49, 75, 88, 88, 24, 64, 2, 5, 7};
    public static void main(String[] args) throws Exception {
        mergeSort(0,arr.length-1);
        System.out.println(Arrays.toString(arr));        
    }
    public static void mergeSort (int start, int end)
    {
        if(start<end)
        {
            int mid = (start+end)/2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);
            merge(start, end, mid);
        }
    }

    public static void merge(int start, int end, int mid)
    {
        int i = start;
        int j = mid+1;
        int k=0;
        int[] temp = new int[end-start+1];

        while(i<=mid && j<=end)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                k+=1;
                i+=1;
            }
            else
            {
                temp[k]=arr[j];
                k+=1;
                j+=1;
            }
        }

        while(i<=mid)
        {
            temp[k]=arr[i];
            k+=1;
            i+=1;
        }
        while(j<=end)
        {
            temp[k]=arr[j];
            k+=1;
            j+=1;
        }

        for(int m=start; m<=end;m++)
        {
            arr[m]=temp[m-start];
        }
    }
}
