package arr.sort;

import java.util.Arrays;

public class RaddixSort<T extends Comparable<T>>{
	T[] arr;
	T[] outArr;
	Arrays x;
	public RaddixSort(T[] in) {
		arr=in.clone();
		outArr=in;
		raddixSort();
		//Arrays.sort(in);
	}
	Long tmp = Long.MIN_VALUE;
	private void raddixSort() {
		// TODO Auto-generated method stub
		tmp = new Long(Long.MIN_VALUE);
		for(int i=0;i<arr.length;i++){
			if(((Integer)arr[i]).intValue()>tmp)
				tmp = (long) ((Integer)arr[i]).intValue();
		}
		int rounds = (int)Math.ceil( Math.log10(tmp));
		for(int i=0;i<rounds;i++)
		{
			countSort(i+1);
			arr=outArr.clone();
		}
		
	}
	private void countSort(int digitNo )
	{
		int count[]=new int[10];
		int tmpArr[]=new int[arr.length];
		int myDigit = (int) Math.pow(10, digitNo);
		for(int i=0;i<arr.length;i++){
			tmpArr[i]=(((int)arr[i])%myDigit)/(myDigit/10);
			count[tmpArr[i]]++;
		}
		int total=0;
		for(int i=0;i<10;i++){
			int oldCount = count[i];
			count[i] = total;
			total += oldCount;	
		}
		for(int i=0;i<arr.length;i++){
			outArr[count[tmpArr[i]]]=arr[i];
			count[tmpArr[i]]++;
		}
	}
}
