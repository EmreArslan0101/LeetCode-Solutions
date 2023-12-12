class Solution {
    public int maxProduct(int[] nums) {
        
        int max1Indice = 0, max2Indice = 0;

        for(int i = 1;i<nums.length;i++) {
            if(nums[i] > nums[max1Indice]) {
                max1Indice = i;
            }
        }

        if(max1Indice == 0)
            max2Indice++;
        
        for(int i = 1;i<nums.length;i++) {
            if(i == max1Indice) continue;
            if(nums[i] > nums[max2Indice]) {
                max2Indice = i;
            }
        }

        return (nums[max1Indice]-1)*(nums[max2Indice]-1);

    }
}