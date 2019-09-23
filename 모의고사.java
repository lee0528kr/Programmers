import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        
     
        int[] a11={1,2,3,4,5};           // 수포자 1번이 찍는 유형
        
    
        int[] a22={2,1,2,3,2,4,2,5};     // 수포자 2번이 찍는 유형
        

        int[] a33={3,3,1,1,2,2,4,4,5,5}; // 수포자 3번이 찍는 유형
        
        int score[]=new int[3]; // 수포자들의 점수를 담을 배열
        int winner=0;  //가장 많이 맞춘사람을 담아둘 변수
        int size=1; //answer 배열의 크기를 지정해 줄 변수       
        
        int count=0,count2=0,count3=0;
        
        for (int i=0; i<answers.length; i++)
        {
            if(a11[count]==answers[i])
            {
                score[0]=score[0]+1;
            }
            count++;
            if(count==5)
            {
                count=0;
            }
         }
        
        for (int i=0; i<answers.length; i++)
        {
                if(a22[count2]==answers[i])
                {
                    score[1]=score[1]+1;
                }
                count2++;
                if(count2==8)
                {
                    count2=0;
                }
         }
        
        for (int i=0; i<answers.length; i++)
        {  
            if(a33[count3]==answers[i])
            {
                score[2]=score[2]+1;
            }
             count3++;
            if(count3==10)
            {
                count3=0;
            }
         }

		 for(int s :score)
			 System.out.println(s);
                
        winner=score[0]; // 1번째 수포자의 정답 갯수가 1등이라고 가정
        
        for (int i=1; i<3; i++) // 10 30 20   10 20 30    30 20 10  10 10 10   10 10 15
        {

			if(winner==score[i])   // 0 5 1
            {
                size=size+1; // 배열의 크기만 증가시켜줌   
            }

			if(winner<score[i]) // 1번째 수포자보다 높은 사람이나타나면
            {
                winner=score[i];  // 높은 사람을 교체 해준다    
                size = 1;
            }

            
        }
        
		System.out.println(size);
        int[] answer = new int[size];
		
        int j=0;
        for (int i=0; i<3; i++)
        {
            if(winner==score[i])
            {
                answer[j]=i+1;// i+1 번째 사람이 가장 많이 맞춤
				j++;
            }
        }
		// 
        
        Arrays.sort(answer);
        
        return answer;
    }
}
