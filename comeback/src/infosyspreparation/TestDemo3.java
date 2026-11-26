package infosyspreparation;

public class TestDemo3 {

	
	    public static int maxProduct(int[] nums) {
	        int min_product= nums[0];
	        int max_product = nums[0];

	        for(int i = 1;i<nums.length;i++){

	            min_product = min_product* nums[i];
	            

	            if(max_product< min_product){
	                max_product = min_product;
	            }
	        }
	        return max_product;
	    }
	
	public static void main(String[] args) {
		int [ ] array = {2, -5, -2, -4, 3};
		int result =maxProduct(array);
		System.out.println(result);
	}
}
