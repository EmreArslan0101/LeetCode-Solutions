#include <string.h>
#pragma GCC optimize("O3","unroll-loops")
int findSpecialInteger(int* arr, int arrSize) {
    
    int currCount = 1;

    for(register size_t i = 1;i<arrSize;i++) {

        if(arr[i-1] == arr[i])
            currCount++;
        else
            currCount = 1;

        if(currCount > (arrSize >> 2)) return arr[i];
            
    }

    return arr[0];

}