//Instead of actually deleting something, just keep track of the latest end point. If overlap,
//delete the one with larger end point
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length <=1 ){
            return 0;
        }
        Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        int end = intervals[0][1];
        int del = 0;
        for (int i=1; i<intervals.length; i++){
            if(intervals[i][0] < end){
                //overlap!
                end = Math.min(end,intervals[i][1]);
                del++; //deleted the one with the bigger endpoint
            }else{
                end = intervals[i][1];
            }
        }
        return del;
    }
}
                  
