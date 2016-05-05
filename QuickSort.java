package codinginterview;

public class QuickSort
{
	public static int[] quicksort(int[] arr)
	{
		if(arr.length<=1)
			return arr;		
		quicksort(arr,0,arr.length-1);
		return arr;	
	}
	public static void quicksort(int[] arr,int left, int right)
	{		
			int index=partition(arr,left,right);
			if(left<index-1)
			quicksort(arr,left,index-1);
			if(index<right)
			quicksort(arr,index,right);	
	}
	public static int partition(int[] arr,int left,int right)
	{
		int piv=arr[(right+left)/2];
		while(left<=right)
		{
			while(arr[left]<piv)
				left++;
			while(arr[right]>piv)
				right--;
			if(left<=right)
				{
				swap(arr,left,right);
				left++;
				right--;
				}				
		}
		return left;
		
	}
	public static void swap(int[] arr, int left,int right)
	{
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;		
	}
	public static void main(String[] args)
	{
		int[] a={1,8,2,0,6,4,5,3,0};
		int[] result=quicksort(a);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
		
	}

}
