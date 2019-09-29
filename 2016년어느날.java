import java.util.Calendar;

class Solution {
  public String solution(int a, int b) {
      String answer = "";
      String[] day={"FRI","SAT","SUN","MON","TUE","WED","THU"}; // 요일 담을 배열 선언
      int[] date={31,29,31,30,31,30,31,31,30,31,30,31};        // 각 월에 해당하는 날짜들 담을 배열
      int n=0;    // 총 날짜 수를 계산하기 위한 변수
      int choice;  // 날짜 수에 맞는 계산을하여 요일을 얻어내기 위한 변수
      
      for(int i=0; i<a-1; i++) // a달-1 만큼 해당하는 날짜수 n에 저장
      {
          n=n+date[i];
      }
      n=n+b-1; // n에 입력한 b일 만큼 더해줌
      
      choice = n%7; // 요일에 맞게 7로 나눈 나머지를 구해줌
      
      answer = day[choice];
      
      return answer;
  }
}