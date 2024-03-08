class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];
        for(char task:tasks){
            freq[task-'A']++;
        }
        Arrays.sort(freq);
        int maxFreq = freq[25];//At last index we find char with max repetition
        int ideal = (maxFreq-1)*n;
        for(int i=24;i>=0;i--){
            ideal = ideal - Math.min(maxFreq-1,freq[i]);
        }
        return tasks.length+Math.max(ideal,0); // ideal time cannot be -ve so if its -ve then we cap it as 0;
    }
}
