package Collection;
import java.util.ArrayList;
import java.util.Collection;

public class UsingArrayList {

	public static void main(String[] args) {
		Collection<Integer> nums = new ArrayList<Integer>();   //list supports index value , whereas collection dont ,  nums[2]
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		for(int n:nums) {
		System.out.println(n);
		
		
	}
	}
}
