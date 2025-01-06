package algo;

class Solution {
  
	int a;
	
	public static void main(String[] args) {
		
		String[] strs = new String[]{"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
		
		Solution 	one = new Solution();
		Solution 	two = new Solution();
		one.a=10;
		two=one;
		two.a=20;
		System.out.println("one a: "+one.a+" two a: "+two.a);
	}
	
	public static String longestCommonPrefix(String[] strs) { 
		StringBuilder result = new StringBuilder("");
		if(strs.length>1) 
		{
	        boolean flag=true;
	        String data=strs[0];        
	        int index=0;        
	        
	        while(flag){
	            char a=data.charAt(index);
	           for(int i=1;i<strs.length;i++){
	                if(strs[i].charAt(index)==a) {
	                    continue;
	                }
	               else{
	            	   System.out.println("strs[i].charAt(index) : "+strs[i].charAt(index)+" a : "+a);
	                   flag=false;
	                   break;
	               }
	            }
	           index++;
	           if(flag)
	           result.append(a);
	        }
		}else {
			if(strs.length == 1)
				result.append(strs[0]);
		}
        return result.toString();               
    }
}