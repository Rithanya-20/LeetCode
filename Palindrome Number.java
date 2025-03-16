class Solution {
    public boolean isPalindrome(int x) {

        int reverse = 0;
        int copy = x;

        while(x > 0){
            reverse = (reverse * 10) + (x % 10);
            x = x/10;
        }

        return reverse == copy;
        
       
        // METHOD 2
        // String x = Integer.toString(intx);

        // int len = x.length() - 1;
        // int count = 0;

        // for(int i=0; i <= len; i++){

        //     if (x.charAt(i) == x.charAt(len - i) && (i < len)){

        //         count++;

        //     }
        // }

        // System.out.print(count);

        // if(count == len){
        //     return true;
        // }
        // else{
        //     return false;
        // }


    }
}
