import java.util.Arrays;

public class removedup {
    public static void main(String[] args) {
        int nums[] ={3, 2, 2, 3};
        System.out.print(removeElement(nums, 2));
    }
    public static int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[c++] = nums[i];
            }
        }
        System.out.print(Arrays.toString(nums));
        return c;
    }
}
