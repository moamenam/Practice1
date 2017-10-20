package arr.sort;

import java.util.*;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[2000000];
		for(int i=0;i<arr.length;i++)
			arr[i]=(int)(Math.random()*1000000);
		Date d = new Date();
		long start=d.getTime();
		
		//Arrays.sort(arr);
		QuickSort<Integer> qs=new QuickSort<>(arr);
		
		//System.out.println("10th item:"+qs.randomizedSelect(0, arr.length-1, 500));
		qs.quickSort(0, arr.length-1);
//		RaddixSort<Integer> rx = new RaddixSort<>(arr);
//		MergeSort<Integer> ms=new MergeSort<>(arr);
//		ms.mergeSort(0, arr.length);

		d = new Date();
		long end=d.getTime();
		long x=end-start;
		
		/*for(int i=0;i<arr.length-1;i++){	
			System.out.println(arr[i]);
			if(arr[i]>arr[i+1]){
				System.out.println("error");
				break;
			}
		}*/
		System.out.println(arr[499]);
		System.out.println(x);
	}

}
