package arr.sort;


public class MergeSort<T extends Comparable<T>>{
	T[] arr;
	T[] tempArr;
	public MergeSort(T[] in) {
		arr=in;
		tempArr=in.clone() ;
		mergeSort(0,arr.length);
	}
	void mergeSort(int startInd,int lastInd){
		
		if(lastInd-startInd>1)
		{
			int mid = (startInd+lastInd)/2;
			mergeSort(startInd, mid);//split first half 
			mergeSort(mid, lastInd);//split second half
			int i=startInd;
			int j=mid;
			//merge 2 half
			for (int k = startInd; k < lastInd; k++) {
				if (i < mid && (j >= lastInd || arr[i].compareTo(arr[j]) <=0)) {
					tempArr[k]=arr[i];
					i++;
				}
				else{
					tempArr[k]=arr[j];
					j++;
				}
			}
			//maintain arr
			for(int k = startInd; k < lastInd; k++)
				arr[k]=tempArr[k];
			
		}
	}
}
