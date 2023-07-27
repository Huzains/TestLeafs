package week1.day2;

public class FindDuplicates 
{
    public static void main(String[] args) 
    {
        int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};

        System.out.println("find a duplicate");
        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                System.out.println(nums[i]);
            }
        }
    }
}