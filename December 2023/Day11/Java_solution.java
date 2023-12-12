class Solution {
    public int findSpecialInteger(int[] arr) {

        int currCount = 1;

        for(int i = 1;i<arr.length;i++) {

            if(arr[i-1] == arr[i])
                currCount += 1;
            else {
                currCount = 1;
            }

            if(currCount > (arr.length / 4)) {
                return arr[i];
            }

        }

        return arr[0];
        
    }
}