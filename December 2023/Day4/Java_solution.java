class Solution {
    public String largestGoodInteger(String num) {

        //Firstly, I initialized an variable for our digit values of the output string
        //If output string is "XXX", value of the output variable is X
        //We initialized it as -1, because range of possible X values is 0 <= X <= 9 and this range doesn't include -1
        //We will use -1 for understanding if there is 3-same digit value or not
        int output = -1;

        for(int i = 0;i<num.length()-2;i++) {
            if(num.charAt(i) == num.charAt(i+2) && num.charAt(i) == num.charAt(i+1)){
                //Initialized our current value that we are on...
                int curr = (int)num.charAt(i);
                //...and compare with the old value
                //If old value is smaller than the current value, we equalize the new value to old value
                if(output < curr)
                    output = curr;
            }
        }

        //If our initial value hasn't changed (If it is \0), we return blank string that means there is no 3-same digit value
        //If our initial value has changed (If it is any number but \0), we return blank string that means there is 3-same digit value
        return output == -1 ? "" : ""+(char)output+(char)output+(char)output;

    }
}