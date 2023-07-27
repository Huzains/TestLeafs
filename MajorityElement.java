package Assignments;

public class MajorityElement {
	public static int findMajorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }

        return candidate;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {3, 2, 3};
        System.out.println("Output for nums1: " + findMajorityElement(nums1));

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Output for nums2: " + findMajorityElement(nums2));

	}

}
