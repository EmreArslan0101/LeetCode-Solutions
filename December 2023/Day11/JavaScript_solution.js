/**
 * @param {number[]} arr
 * @return {number}
 */
var findSpecialInteger = function(arr) {
    
    let currCount = 1;

    for(let i = 1;i<arr.length;i++) {

        if(arr[i-1] == arr[i])
            currCount++;
        else
            currCount = 1;

        if(currCount > (arr.length >> 2)) return arr[i];
            
    }

    return arr[0];

};