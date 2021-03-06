package Miscellaneous;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
     
     Set<Integer> set = new HashSet<Integer>();
     Set<Integer> result = new HashSet<Integer>();
     
     for(int i = 0 ; i< nums1.length; i ++)
        set.add(nums1[i]);
        
     for(int i = 0; i< nums2.length; i++)
     {
         if(set.contains(nums2[i]))
            result.add(nums2[i]);
     }
     
     int[] ans = new int[result.size()];
     
     int i =0;
     for(Integer num : result)
     {
         ans[i++] = num;
     }
     
     return ans;
    }
}
