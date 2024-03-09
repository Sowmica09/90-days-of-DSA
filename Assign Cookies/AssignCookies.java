class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int greed=0;
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                greed++;
                i++;
            }
            j++;
        }
        return greed;
    }
}
