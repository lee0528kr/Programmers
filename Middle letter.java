class Solution {
  public String solution(String s) {
      String answer = "";
      
      if (s.length()%2==1) // 홀수라면
      {
          int a = (s.length()/2);
          answer=s.substring(a,a+1);
      }
      else 
      {
          int a = (s.length()/2);
          answer=s.substring(a-1,a+1);
      }
      return answer;
  
  }
    public static void main(String[] args)
    {
       Solution sol=new Solution();
        Solution sol2 = new Solution();
        
        sol.solution("abcde");
        sol2.solution("qwer");
  
        
        
    }        
}