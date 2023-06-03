import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        if(a.length()==b.length())

        {
            int[] c = new int[256];
            int[] d = new int[256];
            for (int i = 0; i < a.length(); i++) {
                c[(int) a.charAt(i)] += 1;
                d[(int) b.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (c[i] != d[i])
                    return false;

            }
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
