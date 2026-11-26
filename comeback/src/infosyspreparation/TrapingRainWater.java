package infosyspreparation;

public class TrapingRainWater {

	public static void main(String[] args) {
		int [] array = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(array));
		
	}
	
	 public static  int trap(int[] height) {
	        
		 int i = 0;
		 int j = height.length-1;
		 
		 int [] leftMax = new int[height.length];
		 int [] rightMax = new int[height.length];
		 
		 leftMax[0]=height[i];
		 rightMax[j]=height[j];
		 
		 for(int a = 1;a<=j;a++) {
			 leftMax[a] = Math.max(height[a],leftMax[a-1]);
		 }
		 for(int b = j-1;b>=0;b--) {
			 rightMax[b] = Math.max(height[b],rightMax[b+1]);
		 }
		 
		 int count = 0;
		 for(int c = 0 ;c<height.length-1;c++) {
			 count = count +( Math.min(leftMax[c],  rightMax[c]) - height[c]);
		 }
		 
		 return count;
	    }
}
