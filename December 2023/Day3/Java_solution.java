class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int allPoints = 0;
        for(char i = 1;i<points.length;i++) {
            int xDiff = Math.abs(points[i-1][0]-points[i][0]),
                yDiff = Math.abs(points[i-1][1]-points[i][1]);
            
            if(xDiff > yDiff)
                allPoints += xDiff;
            else
                allPoints += yDiff;
        }
        return allPoints;
    }
}
