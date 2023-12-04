class Solution {
    fun largestGoodInteger(num: String): String {
        
        //Firstly, I initialized an variable for our digit values of the output string
        //If output string is "XXX", value of the output variable is X
        //We initialized it as 0 here as NULL (not as '0'), because range of possible X values is '0' <= X <= '9' and this range doesn't include \0
        //We will use \0 for understanding if there is 3-same digit value or not
        var output: Char = '\u0000'

        for (i in 0 until (num.length-2)) {
            if(num[i] == num[i+2] && num[i] == num[i+1]) {
                //Initialized our current value that we are on...
                val curr = num[i]
                //...and compare with the old value
                //If old value is smaller than the current value, we equalize the new value to old value
                if(output < curr)
                    output = curr
            }
        }

        //If our initial value hasn't changed (If it is \0), we return blank string that means there is no 3-same digit value
        //If our initial value has changed (If it is any number but \0), we return blank string that means there is 3-same digit value
        return if (output == '\u0000') "" else output.toString().repeat(3)
        
    }

}