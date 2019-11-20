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
 
        ArrayList<Interval> res = new ArrayList<Interval>();
        //loop through intervals 
        for(Interval interval : intervals){
          if(interval.end < newInterval.start){
              res.add(interval); //this is before newInterval
          }else if(newInterval.end <  interval.start){
            //insert in the left. You don't have to check if merge to the left bc you already passed the previous item. You didnt merge and the item already on the list doesn't either. 
              //already sorted non-overlapping. Remember?
              res.add(newInterval); 
              newInterval = interval; //I know newInterval doesn't overlap, but maybe interval will??
           }else if(newInterval.start > intervals.end){
            //insert to the right. check if merge to the right
              res.add(interval);
              res.add(newInterval);
          }else{
            //merge. if newInterval.start is lower, merge to the left. If newInterval.high is higher, merge to the right
              res.add(new Interval(Math.min(newInterval.start, interval.start), Math.max(newInterval.end,interval.end));
              
            }
         }
     }
}
            
