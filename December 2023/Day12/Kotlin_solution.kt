class Solution {
    fun maxProduct(nums: IntArray): Int {
        
        var max1Indice = 0 
        var max2Indice = 0

        for(i in 1 until nums.size) {
            if(nums[i] > nums[max1Indice]) {
                max1Indice = i;
            }
        }

        if(max1Indice == 0)
            max2Indice++;
        
        for(i in 1 until nums.size) {
            if(i == max1Indice) continue;
            if(nums[i] > nums[max2Indice]) {
                max2Indice = i;
            }
        }

        return (nums[max1Indice]-1)*(nums[max2Indice]-1);

    }
}