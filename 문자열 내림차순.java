class Solution {
  public String solution(String s) {
      String answer = "";
      int a = s.length();
      String[] arr=new String[a];
      
      String temp2="";
      String temp="";
      
      for(int i=0; i<s.length(); i++)
      {
          temp2=s.substring(i,i+1);
          arr[i]=temp2;  
      }
      
      for(int i=0; i<s.length(); i++)
      {
          for(int j=i+1; j<s.length(); j++)
          {
              if(arr[i].compareTo(arr[j])<=-1) // s.compareTo(s2) >>s와 s2의 크기를 비교
              {                                 // ex) s가 a이고 s2가 A이면 a=97 A=65이기때문에 32를 리턴
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
          }
      }
      
      for(int i=0; i<s.length(); i++)
      {
          answer+=arr[i];
      }
      
      return answer;
  }
}