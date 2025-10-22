package LeetCode;

public class LongestConsecutiveSequence {
  public int solution(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for(int n : nums) {
      set.add(n); 
     }
    int theLargest = 0
    for(int n : set) {
      int start = n;
      int end = n;
      if(!set.contains(start - 1)) {
        while(set.contains(end)) {
          end++; 
       }
     } 
     theLargest = Math.max(theLargest, end - start);
    }
    return theLargest;
  }    
}
