/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
    
    let max1Indice = 0, max2Indice = 0;

    for(let i = 1;i<nums.length;i++) {
        if(nums[i] > nums[max1Indice]) {
            max1Indice = i;
        }
    }

    if(!max1Indice)
        max2Indice++;
    
    for(let i = 1;i<nums.length;i++) {
        if(i == max1Indice) continue;
        if(nums[i] > nums[max2Indice]) {
            max2Indice = i;
        }
    }

    return (nums[max1Indice]-1)*(nums[max2Indice]-1);

};