class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        double ratio[][]= new double[n][2];
        for(int i=0;i<arr.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=(double)arr[i].value/arr[i].weight;
        }
        // ascending order based on ratio
        Arrays.sort(ratio,Comparator.comparingDouble(o ->o[1]));
        int capacity = W;
        double finalValue =0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity>=arr[idx].weight){
                //include full value;
             finalValue+=arr[idx].value;
             capacity-=arr[idx].weight;
            }else{
                finalValue += (ratio[i][1] * capacity);
                capacity=0;
                break;
            }
        }
        return finalValue;
    }
}
