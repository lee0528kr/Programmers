class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      int big=0,small=0; // 큰 수와 작은 수를 담을 변수 선언
      if(a>b) // a가 b보다 크다면
      {
          big=a;
          small=b;
      }
      else if(a==b) // a와 b가 같다면
      {
          big=a;
          small=b;
      }
      else	   // b가 a보다 크다면
      {
          big=b;
          small=a;
      }
      for (int i=small; i<=big; i++) // 작은수에서 큰수 까지 더해준다.
      {
          answer+=i;
      }
      return answer;
  }
}