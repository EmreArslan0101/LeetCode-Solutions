/**
 * @param {string} num
 * @return {string}
 */
var largestGoodInteger = function(num) {

    //Firstly, I initialized an variable for our digit values of the output string
    //If output string is "XXX", value of the output variable is X
    //We initialized it as -1, because range of possible X values is 0 <= X <= 9 and this range doesn't include -1
    //We will use -1 for understanding if there is 3-same digit value or not
    let output = -1;

    for(let i = 0;i<num.length-2;i++) {
        
        if(num[i] == num[i+2] && num[i] == num[i+1]){
            //Initialized a variable that holds our current value that we are on...
            const curr = num[i]+num[i]+num[i];

            //...and compared with the old value
            //If old value is smaller than the current value, we equalize the new value to old value
            if(output < curr)
                output = curr;
        }

    }

    //If our initial value hasn't changed (If it is -1), we return blank string that means there is no 3-same digit value
    //If our initial value has changed (If it is any number but -1), we return blank string that means there is 3-same digit value
    return output == -1 ? "" : output;

};