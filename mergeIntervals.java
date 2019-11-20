//return a matrix of intervals in order and merged when appropiate. ex: [2,4] [1,3] --> [1,4] 
class Solution {
    public int[][] merge(int[][] intervals) {
        //prev and next pointers 
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, (arr,arr2) -> Integer.compare(arr[0],arr2[0])); //sort based on starting points
        List<int[]> merged = new ArrayList<int[]>();
        merged.add(intervals[0]);
        for(int next = 1; next < intervals.length; next++){
            int last = merged.size()-1;
            if(intervals[next][0] <= merged.get(last)[1] || intervals[next][0] == merged.get(last)[0])                     {
                //merge 
                merged.get(last)[1] = Math.max(merged.get(last)[1],intervals[next][1]);
            }else{
                merged.add(intervals[next]); //no merging, just add to the list
            }
        }
        return merged.toArray(new int[merged.size()][2]);
    }
}
