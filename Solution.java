
/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int max;

   int numb1 = Integer.parseInt(reader.readLine());
    max = numb1;
    
   int numb2 = Integer.parseInt(reader.readLine());
   if (numb2 > max){
      max = numb2; 
   }
   int numb3 = Integer.parseInt(reader.readLine());
    if (numb3 > max){
      max = numb3; 
   }
   int numb4 = Integer.parseInt(reader.readLine());
   if (numb4 > max){
      max = numb4; 
   }
   
   System.out.println(max);
   
  

 }
}
