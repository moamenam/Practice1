package arr.sort;

import java.util.Arrays;

public class QuickSort<T extends Comparable<T>>{
	T[] arr;
	Arrays x;
	int rquiredInd=0;
	public QuickSort(T[] in) {
		arr=in;
		//quickSort(0,arr.length-1);
		//Arrays.sort(in);
	}
	void quickSort(int startInd,int lastInd){
		if(lastInd-startInd<=0)
			return;
		if(lastInd-startInd==1)
		{
			if(arr[startInd].compareTo(arr[lastInd])>0)
				swap(startInd,lastInd);
			return;
		}
		int pivot = partition(startInd, lastInd);
		
		quickSort(startInd, pivot-1);
		quickSort(pivot+1,lastInd);
		
	}
	int partition(int startInd,int lastInd){
		int p;
		int j=0 ;
		int i=0;
		try{
		p= findPivot(startInd, lastInd);
		swap(p,startInd);
		j = lastInd+1;
		i = startInd;
		while(true){
			do{ 
				j --;
			}while(arr[j].compareTo(arr[startInd])>0);
			do{ 
				i ++;
			}while((arr[i].compareTo(arr[startInd])<=0)&&(i<j));
			if(i<j)
				swap(i, j);
			else
			{
				swap(startInd,j);
				return j;
			}
		}}
		catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
	int findPivot(int startInd,int lastInd){
		
		return (int) ((Math.random()*(lastInd-startInd))+startInd);
	}
	void swap(int i,int j)
	{
		T tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
	T randomizedSelect(int startInd,int lastInd,int requiredInd){
		this.rquiredInd=requiredInd;
		if(startInd==lastInd)
			return arr[startInd];
		int partition= partition(startInd, lastInd);
		int pos= partition-startInd+1;
		if(requiredInd==pos)
			return arr[partition];
		else if(requiredInd<pos)
			return randomizedSelect(startInd,partition-1,requiredInd);
		else
			return randomizedSelect(partition+1,lastInd,requiredInd-pos);
	}

}
