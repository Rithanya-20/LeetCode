class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        Stack<Character> rev = new Stack<>();

        if(str.length() == 1){
            return false;
        }

        Map<Character, Character> myMap = new HashMap<>();
        myMap.put(')','(');
        myMap.put('}','{');
        myMap.put(']','[');
        for(int i=0; i < str.length(); i++ ){
            s.push(str.charAt(i));
        }
        int count = 0;
        int i=0;
        while(!s.isEmpty()){
            i++;
            Character popped = s.pop();
             System.out.println(i +"popped "+popped);
            if( popped.equals('}') || popped.equals(']') || popped.equals(')') ){
                count++;

                Character top;
               
              
                if(!s.isEmpty()){ top = s.peek(); }
                else{ top = '-'; }
               

                if( top.equals(myMap.get(popped)) ){
                   
                    char temp = s.pop();
                    System.out.println(i +"popped "+temp);
                }

                else if( myMap.containsKey(top) ){
                    rev.push(popped);
                     System.out.println(i +"Rev push "+popped);
                    char top_pop = s.pop();
                    rev.push(top_pop);
                     System.out.println(i +"Rev push "+top_pop);
                }
                // else if(top != myMap.get(popped)){
                //     return false;
                // }
                else{
                    return false;
                }
            }
           if( popped.equals('{') || popped.equals('[') || popped.equals('(') ){
              
            Character rev_top;
              
                if(!rev.isEmpty()){ rev_top = rev.peek(); }
                else{

                    rev_top = '-';


                }
                
                 if(count == 0){
                    return false;
                 }                  
                
                 else if( popped.equals(myMap.get(rev_top)) ){
                   char rev_pop = rev.pop();
                    System.out.println(i +"Rev pop "+ rev_pop);
                 }
                 else{
                    return false;
                 }                 

            }

            if(s.isEmpty() && (!rev.isEmpty()) ){
                return false;
            }
        }

      return true;

    }
}
