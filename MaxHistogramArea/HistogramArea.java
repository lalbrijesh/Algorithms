/*
 Author: Brijesh Lal
 
 Program to find the largest rectangular area in a histogram.
 */
 
import java.util.Stack;

public class HistogramArea {

	public static int histogramMaxArea(int a[]){
		int n = a.length;
		Stack<Integer> stk = new Stack<>();
		int i=0;
		int currentArea = 0;
		int maxArea = 0;
		
		while(i<n){
			if(stk.isEmpty() || a[stk.peek()]<=a[i]){
				stk.push(i);
				i++;
			}
			else{
				int temp = stk.pop();
				if(stk.isEmpty())
					currentArea = a[temp] * i;
				else
					currentArea = a[temp] * (i-stk.peek()-1);
				if(currentArea>maxArea)
					maxArea = currentArea;
				}
		}
		while(stk.isEmpty()!=true){
			int temp = stk.pop();
			if(stk.isEmpty())
				currentArea = a[temp] * i;
			else
				currentArea = a[temp] * (i-stk.peek()-1);
			
			if(currentArea>maxArea)
				maxArea = currentArea;
		}
		return maxArea;
	}
	
	public static void main(String args[]){
		int[] h = {2, 3, 1};
		System.out.println(histogramMaxArea(h));
	}
}
