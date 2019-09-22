import java.util.Arrays;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] a1=new int [answers.length]; // 수포자 1번이 답
        int[] a2=new int [answers.length]; // 수포자 2번이 답
        int[] a3=new int [answers.length]; // 수포자 3번의 답
        int[] a22={1,3,4,5};
        int score[]=new int[3];
        int big=0,size=1;       
        int[] a33={3,3,1,1,2,2,4,4,5,5};
        int count=1,count2=0,count3=0;
        
        for (int i=0; i<answers.length; i++)
        {
           a1[i]=count; // 1 2 3 4 5 1 2 3 4 5 ...
            count++;
            if(count==6)
            {
                count=1;
            }
         }
        
        for (int i=0; i<answers.length; i++)
        {
            if(i%2==0) // 0 2 4 6 8 등 2의 배수이면
            {
                a2[i]=2; // 2번답 기입
            }
            else
            {
                a2[i]=a22[count2]; // a22 의 n번째 배열을 기입 
                count2++;
                if(count2==4)
                {
                    count2=0;
                }
            }
         }
        for (int i=0; i<answers.length; i++)
        {
            a3[i]=a33[count3]; // a33의 n번째 배열 기입
            count3++;
            if(count3==10)
            {
                count3=0;
            }
         }
        //------------------------------답 기입 종료
        for (int i=0; i<answers.length; i++)
        {
            if(answers[i]==a1[i])  // 1번째 수포자와 답이 같으면
            {
                score[0]=score[0]+1; // 1번째 수포자의 정답갯수1증가
            }
            if(answers[i]==a2[i])
            {
                score[1]=score[1]+1;
            }
            if(answers[i]==a3[i])
            {
                score[2]=score[2]+1;
            }
        }
        
        big=score[0]; // 1번째 수포자의 정답 갯수가 1등이라고 가정
        
        for (int i=1; i<3; i++) // 10 30 20   10 20 30    30 20 10  10 10 10   10 10 15
        {
            if(big==score[i])
            {
                size=size+1; // 배열의 크기만 증가시켜줌
            }
            
            if(big<score[i]) // 가장 많이 맞춘사람 보다 높은 사람이나타나면
            {
                big=score[i];  // 높은 사람을 교체 해준다    
                size = 1;
            }
        }
        
        int[] answer = new int[size];
        
        for (int i=0; i<3; i++)
        {
            if(big==score[i])
            {
                answer[i]=i+1;// i+1 번째 사람이 가장 많이 맞춤
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}