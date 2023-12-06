class Solution {
    fun totalMoney(n: Int): Int {
        //lastWeek is for how much money has been added to our bank account
        //lastMonday is for how much money we have been added to our bank acount in last week's monday
        var lastWeek = 28
        var lastMonday = 1
        var output = 0
        //We initialized a _n variable, because function parameters are constant value (val) in kotlin
        var _n = n

        while(_n != 0) {
            //If there is a whole week to pass
            //We just add money of this week as whole
            //So we added lastWeek to our return value (output)
            if(_n > 7) {
                //We add money per week
                output += lastWeek
                //For passing a week and getting the next week's whole money we add 7 to lastWeek,
                //Adding 7 is okay because, in every week lastMonday increases 1 and it increases all day's money as 1
                //That results as increasing the whole week's money as 7
                lastWeek += 7;
                //For passing a week, we decrease n with 7
                _n -= 7;
            }
            else {
                //We add money per day
                output += lastMonday
                _n--
            }
            //In every week passings, increasing lastMonday as 1 is okay because in the next monday, we pust one more than the last monday's money
            //In every day passings after there is no enough week, increasing lastMonday as 1 is okay because the saving money per day increases as 1 per day, and we use lastMonday as data holder of next day's money 
            lastMonday++
        }

        return output
    }
}