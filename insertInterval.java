//insert an interval into sorted non-overlapping list of intervals. Merge if necessary
// Find where it belongs. 
// if new.low limit > pos.high limit, then pos++
// if new.high < curr.low, then pos--
// else, new.low <= pos.high || new.high >= curr.low would also make it a merge
//when you merge, pick the lowest low and the highest high. 
//if new.low is lower, then will maybe have to merge to the left. If new.high is higher will maybe have to merge to the right

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
 
        ArrayList<Interval> result = new ArrayList<Interval>();
        //loop through intervals 
        for(int i = 0; i < intervals.size(); i++){
          if(newInterval.high <  intervals.get(i).start){
            //insert in the left. check if gotta merge to the left
           }else if(newInterval.start > intervals.get(i).high){
            //insert to the right. check if merge to the right
           }else{
            //merge. if newInterval.start is lower, merge to the left. If newInterval.high is higher, merge to the right
            }
         }
     }
}
            
