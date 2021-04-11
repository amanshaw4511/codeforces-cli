import java.io.*;
import java.util.*;

public class Solution {


    // static int solve(int[] arr) {
    //     int n = arr.length;
    //     return 0;
    // }

    public static void main(String... args) throws IOException {
        FastReader fr = new FastReader();
        fr.loadLine();
        int cases = fr.nextInt();

        while (cases-- > 0) {

            // fr.loadLine();
            // int n = fr.nextInt();

            // int[] arr = new int[n];

            // fr.loadLine();
            // for (int i=0; i<n; i++)
            //     arr[i] = fr.nextInt();

            // int res = solve(arr);
            // System.out.println(res);

        }
    }
}

class FastReader {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    String readLine() throws IOException {
        return br.readLine();
    }

    void loadLine() throws IOException {
        st = new StringTokenizer(br.readLine());
    }

    int nextInt() {
        return Integer.parseInt(st.nextToken());
    }

    long nextLong() {
        return Long.parseLong(st.nextToken());
    }

    double nextDouble() {
        return Double.parseDouble(st.nextToken());
    }

    char nextChar() {
        return st.nextToken().charAt(0);
    }

    String nextString() {
        return st.nextToken();
    }

}
