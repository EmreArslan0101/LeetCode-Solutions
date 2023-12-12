#include <string.h>
#pragma GCC optimize("O3","unroll-loops")
int maxProduct(int* nums, int numsSize) {
    
    int max1Indice = 0, max2Indice = 0;

    for(size_t i = 1;i<numsSize;i++) {
        if(nums[i] > nums[max1Indice]) {
            max1Indice = i;
        }
    }

    if(!max1Indice)
        max2Indice++;
    
    for(size_t i = 1;i<numsSize;i++) {
        if(i == max1Indice) continue;
        if(nums[i] > nums[max2Indice]) {
            max2Indice = i;
        }
    }

    return (nums[max1Indice]-1)*(nums[max2Indice]-1);

}