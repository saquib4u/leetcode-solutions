class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=Integer.MAX_VALUE;
        int index=-1;
        int dist=0;
        for(int i=0;i<points.length;i++){
            if(points[i][0]==x||points[i][1]==y){
                dist = Math.abs(points[i][0]-x) + Math.abs(points[i][1]-y);
                if(dist<min){
                    min=dist;
                    index=i;
                }
            }

        }
    return index;
    }
}