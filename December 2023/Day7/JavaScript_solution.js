/**
 * @param {string} num
 * @return {string}
 */
var largestOddNumber = function(num) {

    for(let i = num.length-1;i>=0;i--) {
        //We get odd number chars with controlling them if their ascii value is odd too
        //JavaScript does type correction in this kind of situations,...
        //...so that we don't have to do any type casting in these situations
        //JavaScript handles this situations itself 
        //Also, just number strings will be passed as parameter; there will be no letter in strings
        //So that, It is okay to check if they are odd with that way
        if(num[i] % 2) {
            //We get substring from 0 to index wherever will it be considering output
            return num.substring(0,i+1);
        }
    }

    //If there is no odd value, we just return blank string
    return "";

};