class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcount=0;
        int ycount=0;
        for (int i=0; i<s.length(); i++) // 입력받은 문자열의 길이만큼 반복
        {
            String r = s.substring(i,i+1);  // 한글자씩 추출하여서
            if (r.equals("p") || r.equals("P")) // p라면
            {
                pcount=pcount+1;             //pcount 증가
            }
            
            if (r.equals("Y") || r.equals("y")) // y라면
            {
                ycount=ycount+1;             //ycount 증가      
            }
        }
            
        if(pcount!=ycount||(pcount==0&&ycount==0)) //p의갯수와 y의 갯수가 다르거나 p와y가 둘다없다면 
        {
            answer=false;  	         //false값
        }

        return answer;
    }
}
