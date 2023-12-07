#include <stddef.h>

char* largestOddNumber(char* num) {

    //We get length once for not running function more than one
    //size_t needs headers like <stddef.h> for running normally
    //But we don't have to use this header for the question in leetcode
    //Because leetcode provides these headers already for you
    size_t numLen = strlen(num);
    

    for(int i = numLen-1;i>=0;i--) {
        //We get odd number chars with controlling them if their ascii value is odd too
        //ASCII value of '1' is 49 and numbers from 0 to 9 are in consecutive order from 49 ('1') to 57('9')
        //Also, just number strings will be passed as parameter; there will be no letter in strings
        //So that, It is okay to check if they are odd with that way
        if(num[i] % 2) {
            //We put NULL ('\0' or 0) end of the string for truncnating our string as we want for output value
            num[i+1] = 0;
            return num;
        }
    }

    //If there is no odd value, we just return blank string
    return "";


}