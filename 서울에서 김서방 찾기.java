class Solution {
  public String solution(String[] seoul) {
      String answer = "";
      String a = "Kim";
      int d;
      int length = seoul.length;
      
      for(int i=0; i<length; i++)
      {
          if(seoul[i].equals(a))
          {   d=i;
              answer ="김서방은 "+d+"에 있다";
                  
              return answer;
          }
      }
      
      
      return answer;
  }
}