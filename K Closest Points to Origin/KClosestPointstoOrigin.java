class Solution {
    static class Point implements Comparable <Point>{
        int x;
        int y;
        int distSq;
        int idx;
        public Point(int x, int y, int distSq,int idx){
            this.x=x;
            this.y=y;
            this.distSq=distSq;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.distSq - p2.distSq; //ascending order
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int distsq = points[i][0]*points[i][0]+ points[i][1]*points[i][1];
            pq.add(new Point(points[i][0],points[i][1],distsq,i));
        }
        int[][] ans = new int[k][2];
        for(int i=0;i<k;i++){
            int index = pq.remove().idx;
            ans[i][0]=points[index][0];
            ans[i][1]=points[index][1];
        }
        return ans;
    }
}
