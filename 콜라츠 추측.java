class Solution 
{ 
  public int solution(int num) {
      int answer = 0;
      int i;
      
      for(i=0; i<500; i++) // 500이 될때까지 반복
      {  
	 if(num==1)// num이 1이면 반환
          {
              return answer;  
          }
        
          if(num%2==1) // num이 홀수라면
          {
              num=num*3+1;
              answer++;
          }
          
          if(num%2==0) // num이 짝수라면
          {
              num=num/2;
              answer++;
          }
        
          
         
      }
      
      if(i==500) // 500번 반복했는데도 답이안나오면
      {
      answer=-1; // -1 값 리턴
      }
      return answer;
      
      
  }
}