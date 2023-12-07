class Solution {
    fun largestOddNumber(num: String): String {
        //For creating a reverse for loop, we use "(start) downTo (end)" range operator
        for(i in num.length-1 downTo 0) {
            //We get odd number chars with controlling them if their unicode value is odd too
            //Unicode value of '1' is 49 and numbers from 0 to 9 are in consecutive order from 49 ('1') to 57('9')
            //Also, just number strings will be passed as parameter; there will be no letter in strings
            //So that, It is okay to check if they are odd with that way
            if(num[i].toInt() % 2 == 1) {
                //We get substring from 0 to index wherever will it be considering output
                return num.substring(0,i+1)
            }
        }

        //If there is no odd value, we just return blank string
        return ""
    }
}