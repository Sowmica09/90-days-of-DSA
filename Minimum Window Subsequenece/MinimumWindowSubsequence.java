class Solution {
    static String minWindow(String str1, String str2) {
        // code here
        String window ="";
        int j=0,min=str1.length()+1;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(j)) j++;
            
            // If all characters in T have been matched
            if(j==str2.length()){  
                int end = i+1;   // Store the end index of the window
                j--;      // Move j back to the last character in T
                // Backtrack to find the start of the subsequence
                while(j>=0){   
                    if(str1.charAt(i)==str2.charAt(j)) j--;
                    i--;
                }
                // Move i, j forward to the correct position
                i++;
                j++;
                // If the current window length is smaller than min
                if(end-i <min){
                    min = end-i;
                    window= str1.substring(i,end);
                }
            }
        }
        return window;
    }
}
