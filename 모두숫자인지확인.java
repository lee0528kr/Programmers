class Solution 
{
  public boolean solution(String s) {
      boolean answer = false;
      char a;
      if(s.length()==4) //문자열의 길이가 4인지 확인
      {
          for(int i=0; i<4; i++)
          {
                  a=s.charAt(i);
                  if((65<=a&&a<=90)||(97<=a&&a<=122)) // a~z 또는 A~Z인지 확인(문자인지)
                  {
                      answer=false;
                      return false; // FALSE를 반환하고 종료
                  }
              else
              {
                  answer=true;
              }
          }
      }
      if(s.length()==6) // 문자열의 길이가 6인지 확인
      {
          for(int i=0; i<6; i++)
          {
                  a=s.charAt(i);
                  if((65<=a&&a<=90)||(97<=a&&a<=122))  // a~z 또는 A~Z인지 확인(문자인지)
                  {
                      answer=false;
                      return false; // FALSE를 반환하고 종료
                  }  
                  else
                  {
                       answer=true;
                  }
          }
      }
    
      return answer;
  }
}