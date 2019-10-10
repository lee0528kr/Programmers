class Solution {
  public int[] solution(int[] arr, int divisor) {
      int[] answer2 = new int[arr.length];
      int temp;
      int count =0;
      for(int i=0; i<arr.length; i++)//나눠지는 수를 저장할 answer2에 값 넣기
      {
          if(arr[i]%divisor==0)
          {
              answer2[count]=arr[i];
              count++;
          }
      }
      
      if(count==0) // 나눠지는 수가 없다면
      {
      int[] answer = new int[1]; // -1 반환
      answer[0] = -1;
      return answer;    
      }
      
      if(count>=1)// 나눠지는 수가 있다면
      {
      int[] answer = new int [count];
        for(int i=0; i<count; i++)
        {
          answer[i]=answer2[i]; // 옮겨담기
        }
      
     for(int j=0; j<count-1; j++) // 오름차순 정렬
      {
		for (int i = j+1; i < count; i++) 
        {
			if(answer[j]>answer[i]) // 오름차순 정렬
            {
             temp= answer[j];
             answer[j]=answer[i];
             answer[i]=temp;
            }
		}
      }
     return answer;  
      }
      
    
   
    return answer2; // 의미 없음
  }
}