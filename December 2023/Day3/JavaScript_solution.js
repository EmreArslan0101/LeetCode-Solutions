/**
 * @param {number[][]} points
 * @return {number}
 */
var minTimeToVisitAllPoints = function(points) {
    
    let allPoints = 0;

    for(let i = 1;i<points.length;i++) {
        
        const diff = [Math.abs(points[i-1][0]-points[i][0]),Math.abs(points[i-1][1]-points[i][1])];

        if(diff[0] > diff[1])
            allPoints += diff[0];
        else
            allPoints += diff[1];

    }

    return allPoints;

};
