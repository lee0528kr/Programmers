import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) 
    {
        int[] answer = new int[commands.length]; // �迭ũ�� ����
        
        int cnt=0;  // array2�� ���� �����ϱ� ���� ���� 
	int cnt2=0; // answer�� ���� �����ϱ� ���� ����
   
            for (int i=0; i<commands.length; i++) //commands�� ���̸�ŭ �ݺ�
            {
                int length = commands[i][1]-commands[i][0]+1; //commands�� ���ҿ� ���� ���� ����
                
                int[] array2 = new int[length]; // length ��ŭ�� ���� �迭 ����
               for (int k = commands[i][0]-1; k<=commands[i][1]-1; k++)
               {
                      
                       array2[cnt]=array[k]; // array�� ���� array2�� ������ ����
                       cnt=cnt+1; 
               }
                cnt=0; // ī��Ʈ ���� �ʱ�ȭ
                Arrays.sort(array2);
                int choice=commands[i][2]-1; // commands i��°�� ������ ������ �� ����
                
                answer[cnt2]=array2[choice]; // answer�� �� ����
                cnt2=cnt2+1; // cnt2 ���� ����(answer�� �� ���� ����)
         
            }     
        
        return answer;
    }

}