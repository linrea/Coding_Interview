package codinginterview;

public class MergeSort
{
	public static int[] mergesort(int[] arr)
	{
		if(arr.length<=1) return arr;
		
		int[] helper=new int[arr.length];
		mergesort(arr,helper,0, arr.length-1);
		return arr;
		
	}
	public static void mergesort(int[] arr,int [] helper, int left, int right)
	{
		if(right>left){
		int mid=(right+left)/2;
		mergesort(arr,helper,left, mid);
		mergesort(arr,helper,mid+1,right);
		merge(arr,helper,left,mid,right);
		}
	}
	public static void merge(int[] arr,int [] helper, int left, int mid, int right)
	{
		for(int i=left;i<=right;i++)
		{
			helper[i]=arr[i];
		}
		int cur=left,helpleft=left,helpright=mid+1;
		while(helpleft<=mid&&helpright<=right)
		{
			if(helper[helpleft]<=helper[helpright])
				{
				arr[cur]=helper[helpleft];
				helpleft++;
				}
			else
			{
				arr[cur]=helper[helpright];
				helpright++;
			}
			cur++;
		}
		int remain=mid-helpleft;
		for(int i=0;i<=remain;i++)
		{
			arr[cur+i]=helper[helpleft+i];
		}
		/*int lp=left,rp=mid+1,helpp=left;
		while(lp<=mid&&rp<=right)
		{
			if(arr[lp]<=arr[rp])
			{
				helper[helpp]=arr[lp];
				lp++;
				helpp++;
			}
			else
			{
				helper[helpp]=arr[rp];
				rp++;
				helpp++;
			}
		}
		if(helpp<=right)
		{
			int i,length;
			if(lp<=mid)
			{
				i=lp;
				length=mid;
			}
			else
			{
				i=rp;
				length=right;
			}
			for(;i<=length;i++)
			{
				helper[helpp]=arr[i];
			}			
		}	
		for(int i=left;i<=right;i++)
		{
			arr[i]=helper[i];
		}*/
	}
	public static void main(String[] args)
	{
		int[] a={1,8,2,0,4,5,3,2,2,2};
		int[] result=mergesort(a);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
		
	}
}
