import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Object.*;

public class day12 {
    public static void main(String[] args) throws IOException
    {
      try(BufferedReader br = new BufferedReader(new FileReader("day12_input.txt")))
      {
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null)
        {
          sb.append(line);
        //  System.out.println(line);
          sb.append(System.lineSeparator());
          line = br.readLine();
        }
        String firstPart = sb.toString();
        HashMap<String, Integer> registers1 = new HashMap<String, Integer>();
        registers1.put("a", 0);
        registers1.put("b", 0);
        registers1.put("c", 0);
        registers1.put("d", 0);
      //  System.out.println("Result = " + solve(firstPart, registers));
        String secondPart = sb.toString();
        HashMap<String, Integer> registers2 = new HashMap<String, Integer>();
        registers2.put("a", 0);
        registers2.put("b", 0);
        registers2.put("c", 1);
        registers2.put("d", 0);
        System.out.println("Result = " + solve(secondPart, registers2));

}
    }

    public static String solve(String input, HashMap<String, Integer> registers)
    {
      String[] cmds = input.split("\r?\n");
      int i = 0;

      while(i >= 0 && i < cmds.length)
      {
        System.out.println(cmds[i]);

        if(cmds[i].startsWith("cpy"))
        {
           String[] inputCpy = cmds[i].split("\\s+");
           if (inputCpy[1].matches("\\d+"))
           {
             //System.out.println("here");
             registers.put(inputCpy[2], Integer.parseInt(inputCpy[1]));
           }
           else
           {
             registers.put(inputCpy[2], registers.get(inputCpy[1]));
           }
          i++;
        }

        else if(cmds[i].startsWith("inc"))
        {
          System.out.println("there");
            String[] inputInc = cmds[i].split("\\s+");
            registers.put(inputInc[1], registers.get(inputInc[1]) + 1);
            i++;
        }

        else if(cmds[i].startsWith("dec"))
        {
          String[] inputDec = cmds[i].split("\\s+");
          registers.put(inputDec[1], registers.get(inputDec[1]) - 1);
          i++;
        }

        else if (cmds[i].startsWith("jnz"))
        {
            String[] inputJnz = cmds[i].split("\\s+");
            if (inputJnz[1].matches("\\d+"))
            {
              if (Integer.parseInt(inputJnz[1]) != 0)
                i = i + Integer.parseInt(inputJnz[2]);
                else
                  i++;
            }
            else if  (registers.get(inputJnz[1]) == 0)
                i++;
            else
            {
              System.out.println("Here is the value of b "+registers.get("b"));
              System.out.println("Here is the value of a "+registers.get("a"));
              System.out.println("Here is the value of c "+registers.get("c"));
              System.out.println("Here is the value of d "+registers.get("d"));
              i = i + Integer.parseInt(inputJnz[2]);
              System.out.println(i);
            }
        }

        else {
                throw new RuntimeException("Unknown command: " + cmds[i]);
            }
      }

      return (registers.get("a").toString());
    }
  }
