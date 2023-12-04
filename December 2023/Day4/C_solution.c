char* largestGoodInteger(char* num) {

    //Firstly, I initialized an variable for our digit values of the output string
    //If output string is "XXX", value of the output variable is X
    //We initialized it as -1, because range of possible X values is '0' <= X <= '9' and this range doesn't include -1
    //We will use -1 for understanding if there is 3-same digit value or not
    short int output = -1, numLen = strlen(num);

    for(short int i = 0;i<numLen-2;i++) {
        
        if(num[i] == num[i+2] && num[i] == num[i+1]){

            //Initialized a variable that holds our current digit value that we are on...
            char curr = num[i];

            //...and compare with the old value
            //If old value is smaller than the current value, we equalize the new value to old value
            //Using one digit is ok because all digits of the output number are same
            if(output < curr)
                output = curr;
        }

    }

    if(output == -1)
        //If our initial value hasn't changed (If it is -1), we return blank string that means there is no 3-same digit value
        return "";
    else {
        //If our initial value has changed (If it is any number but -1), we return blank string that means there is 3-same digit value
        //We initialize a char pointer with length of for our value that we will return ('X'+'X'+'X'+'\0')
        //We initialize a pointer, because we must return a char pointer (char*)
        //If you don't return a pointer or return something else but pointer, the answer cannot be read 
        char* outputStr = (char*)malloc(4);
        outputStr[0] = output;
        outputStr[1] = output;
        outputStr[2] = output;
        outputStr[3] = '\0';
        return outputStr;
    }

}