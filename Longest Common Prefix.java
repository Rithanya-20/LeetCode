class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Map<Character, Integer> myMap = new HashMap<>();

        //set a common word

        String str1 = strs[0];
        int clen = str1.length();
        String common = "";
        int count =1;
        String final1="";
        if(strs.length == 1){
            return strs[0];
        }

        for(int i=1; i < strs.length; i++){

           

            int k=0;
            String s1 = strs[i];
            int s1len = s1.length();
           
             int min = clen < s1len ? clen : s1len;
            

            if(common == ""){
                while( k < min && (str1.charAt(k) == s1.charAt(k))){
                common += str1.charAt(k);
                k++;

                 }
                 count++;
                 final1 = common; //aa

                 if(final1 == ""){return "";}

            }
            else{
                String cm2 = "";
                while( k < min && (str1.charAt(k) == s1.charAt(k))){
                cm2 += str1.charAt(k);
                k++;

                 }
                 
                

                // if(common == cm2){
                if(final1 == cm2){

                    // final1 = cm2;
                    // count++;

                }
                else{

                    if(final1.length() < cm2.length()){
                        
                    }
                    else{
                     final1 = cm2;
                    }
                    //  common = final1;

                }

               


            }

            
           

        }

        // if(count == strs.length){
        //     return common;
        // }


       return final1;
    }
}
