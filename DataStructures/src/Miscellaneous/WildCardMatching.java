package Miscellaneous;

public class WildCardMatching {
    public boolean isMatch(String s, String p) {
     
     int sIndex = 0, pIndex = 0 , match = 0, starIdx = -1;
     
     while(s.length() > sIndex)  
     {
         if(p.length() > pIndex && ((p.charAt(pIndex) == s.charAt(sIndex))|| p.charAt(pIndex) == '?')  )
         {
             pIndex ++;
             sIndex ++;
         }
         else if(p.length() > pIndex && p.charAt(pIndex) == '*')
         {
             starIdx = pIndex;
             match = sIndex;
             pIndex ++;
         }
         else if(starIdx != -1)
         {
             pIndex = starIdx + 1;
             match ++;
             sIndex = match;
         }
         else return false;
     }
     
     while(p.length() > pIndex && p.charAt(pIndex) == '*')
        pIndex ++;

    return p.length() == pIndex;
     }
    }

