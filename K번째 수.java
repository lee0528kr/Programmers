import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) 
    {
        int[] answer = new int[commands.length]; // 배열크기 선언
        
        int cnt=0;  // array2의 방을 설정하기 위한 변수 
	int cnt2=0; // answer의 방을 설정하기 위한 변수
   
            for (int i=0; i<commands.length; i++) //commands의 길이만큼 반복
            {
                int length = commands[i][1]-commands[i][0]+1; //commands의 원소에 따라 길이 설정
                
                int[] array2 = new int[length]; // length 만큼의 복사 배열 생성
               for (int k = commands[i][0]-1; k<=commands[i][1]-1; k++)
               {
                      
                       array2[cnt]=array[k]; // array의 값을 array2에 선택적 복사
                       cnt=cnt+1; 
               }
                cnt=0; // 카운트 변수 초기화
                Arrays.sort(array2);
                int choice=commands[i][2]-1; // commands i번째의 마지막 원소의 값 저장
                
                answer[cnt2]=array2[choice]; // answer에 값 저장
                cnt2=cnt2+1; // cnt2 변수 증가(answer의 방 설정 변수)
         
            }     
        
        return answer;
    }

}