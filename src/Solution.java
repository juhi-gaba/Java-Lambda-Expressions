import main.MyMath;
import main.PerformOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Juhi Gaba
 */
public class Solution {

    /**
     * Entry point
     *
     * @param args Arguments
     * @throws IOException Input Output exception.
     */
    public static void main(String[] args) throws IOException {

        MyMath myMath = new MyMath();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bufferedReader.readLine());

        PerformOperation performOperation;
        boolean ret = false;
        String result = null;

        while (T--> 0) {

            String s = bufferedReader.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);

            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (ch == 1) {
                performOperation = myMath.isOdd();
                ret = MyMath.checker(performOperation, num);
                result = (ret) ? "ODD" : "EVEN";
            }
            else if (ch == 2) {
                performOperation = myMath.isPrime();
                ret = MyMath.checker(performOperation, num);
                result = (ret) ? "PRIME" : "COMPOSITE";
            }
            else if (ch == 3) {
                performOperation = myMath.isPalindrome();
                ret = MyMath.checker(performOperation, num);
                result = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }

            System.out.println(result);
        }
    }
}
