class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] res = new int[intervals.length+1][2]; //worst case scenario there is no merging and just add it to the end
        int counterRes = 0;
        for(int i[] : intervals){
            int intervalEnd = i[1];
            int intervalStart = i[0];
           if(newInterval == null || intervalEnd < newInterval[0]){
               //then just add it like normal 
               res[counterRes] = i;
               counterRes++;
           }else if(newInterval[1] < intervalStart){
               //insert newInterval first. then interval
               res[counterRes] = newInterval;
               newInterval = null;
               counterRes++;
               res[counterRes] = i;
               counterRes++;
           }else{
               //merge!
               newInterval[0] = Math.min(newInterval[0], intervalStart);
               newInterval[1] = Math.max(newInterval[1], intervalEnd);
           }
        }if(newInterval != null){
            //then add it
            res[counterRes] = newInterval;
            counterRes++;
        }
        int[][] rightSize = new int[counterRes][2];
        for(int i = 0; i < rightSize.length; i++){
            rightSize[i] = res[i];
        }
        return rightSize; 
    }
}
