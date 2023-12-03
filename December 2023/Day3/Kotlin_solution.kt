class Solution {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        
        var allPoints : Int = 0

        for(i in 1 until points.size) {
            allPoints += abs(points[i][0]-points[i-1][0]).coerceAtLeast(abs(points[i][1]-points[i-1][1]))
        }
            
        return allPoints

    }
}
