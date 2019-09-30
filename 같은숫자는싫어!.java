import java.util.*;

public class Solution
{
   public int[] solution(int []arr)
   {
     ArrayList<Integer> answer2 = new ArrayList<>();
    int value = arr[0];
    answer2.add(value);
    for (int i = 1; i < arr.length; i++)
    {
        if (value != arr[i]) 
        {
            answer2.add(arr[i]);
            value = arr[i];
        }
    }
       
      int[] answer = new int[answer2.size()];
        
        for(int k=0; k<answer2.size(); k++) {
            answer[k] = answer2.get(k);
        }
       
    return answer;
   }
}