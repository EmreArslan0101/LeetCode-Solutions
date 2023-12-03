int minTimeToVisitAllPoints(int** points, int pointsSize, int* pointsColSize) {
    
    int allPoints = 0;

    for(char i = 1;i<pointsSize;i++) {

        int xDiff = abs(points[i-1][0]-points[i][0]),
            yDiff = abs(points[i-1][1]-points[i][1]);
        
        if(xDiff > yDiff)
            allPoints += xDiff;
        else
            allPoints += yDiff;

    }

    return allPoints;

}
