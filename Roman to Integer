class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> myMap = new HashMap<>();
        myMap.put('I',1);
        myMap.put('V',5);
        myMap.put('X',10);
        myMap.put('L',50);
        myMap.put('C',100);
        myMap.put('D',500);
        myMap.put('M',1000);

        int count = 0;


        int len = s.length();

        

        for(int i=len-1; i>=0; i--){
          
                char c = s.charAt(i);
                if(i>0 && s.charAt(i) != s.charAt(i-1)){
                if((myMap.get(s.charAt(i)) > myMap.get(s.charAt(i-1))) && (s.charAt(i-1) == 'I' || s.charAt(i-1) == 'X' || s.charAt(i-1) == 'C'  )){
                    count += (myMap.get(s.charAt(i)) - myMap.get(s.charAt(i-1)));
                    i--;
                }
                else{
                    count += myMap.get(s.charAt(i));
                }
                }
                else{
                    count += myMap.get(s.charAt(i));
                }

          
        }

        return count;
        
    }
}
