import java.util.*;

public class 3Sum {
   
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums); // Sort the array first

        for (int i = 0; i < n; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1, k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    // Skip duplicates for j and k
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }

        return ans;
    }

    // Example usage
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = s.threeSum(nums);

        for (List<Integer> triplet : res) {
            System.out.println(triplet);
        }
    }
}

    

