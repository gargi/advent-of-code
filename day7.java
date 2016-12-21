import java.util.*;
import java.io.*;


public static void main(Strings[] args){
  try
  {
     File file = new File("/Users/gargi/input.txt");
     BufferedReader br = new BufferedReader(new FileReader(file));
     text = br.readLine();
     br.close();
    //  System.out.println(input);
   } catch (IOException e)
  {
     e.printStackTrace();
  }
  String line = text.split("\n");
  int sum = 0;
  for (int i = 0; i < line.length(); i++){
    if (checkAdress(line) == true)
      sum += 1;
  }
  System.out.println(sum);
}

public static boolean checkAdress(String s){
  int j = 0;
  for (j < s.length - 5){
      if (s.charAt(j) == '['){
      {
        j++;
        StringBuffer sb = new StringBuffer();
        while (s.charAt(i) != ']')
        {
          sb.append(s.charAt(i));
          j++;
        }
      if (checkABBA(sb.toString() == true)
          return false;
    }
      stringBuffer sd = new StringBuffer();
      while (j < j+4)

  }

}

public static boolean checkABBA(String str){
  if (s.charAt(i) == s.charAt(i + 3)){
      if (s.charAt(i) != s.charAt(i + 1) && s.charAt(i + 1) != s.charAt(i + 2))
          return true;
  }
}
