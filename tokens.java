import java.io.*;
import java.util.*;

public class Solution {

   
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Input-e illana 0 print panrom
        if (!scan.hasNextLine()) {
            System.out.println(0);
            scan.close();
            return;
        }
        
        String s = scan.nextLine().trim();
        
        // String empty-ah irundha 0 print panrom
        if (s.isEmpty()) {
            System.out.println(0);
            scan.close();
            return;
        }
        
        // English letters illadha symbols/spaces vechu split panrom
        String[] tokens = s.split("[^A-Za-z]+");
        
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
        
        scan.close();
    }
}

//Sample Input

//He is a very very good boy, isn't he?
//Sample Output

/*10
He
is
a
very
very
good
boy
isn
t
he*/

