/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int mid = 0;

        //High is always true

        while(low <= high){
            mid = low + (high - low)/2;
            System.out.println("low "+low+" mid "+mid+ " high "+high);

           if(isBadVersion(mid) == false){
                low = mid + 1;
                
            }

           
            else if(isBadVersion(mid) == true ){
                
                if(isBadVersion(low) == false){
                    high = mid;
                }

                else if(isBadVersion(low) == true){
                    return low;
                }
               
            }
              
           
            
        }

        return mid;
    }
}
