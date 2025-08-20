import java.util.*;
class Solution {
    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer> once = new HashSet<>();
        List<Integer> twice = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(once.contains(num)){
                twice.add(num);
            }
            else{
                once.add(num);
            }
        }
        return twice;
    }
    public static void main(String[] args)
    {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}