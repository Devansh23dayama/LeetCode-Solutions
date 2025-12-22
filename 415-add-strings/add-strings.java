class Solution {
    public String addStrings(String num1, String num2) {
       
      
      int n =num1.length() -1;
      int m = num2.length() -1;
      
      int carry = 0;
      String res = "";
      while(n>=0 || m>=0) {
    	  int d1 = 0;
    	  int d2 = 0;
    	  if(n>=0)
    		  d1 = num1.charAt(n) - '0';
    	  if(m>=0)
    		  d2 = num2.charAt(m) - '0';
    	  
    	  int val = d1 + d2 + carry;
    	  int add = val%10;
    	  carry = val/10;
    	  res = (char)(add + '0') +res;
    	  n--;
    	  m--;
      }
      if(carry>0)
    	  res = (char)(carry+'0') + res;
           return res;
	}
    }
