import java.io.*;
import java.util.*;

public class Main {
    // 2차원 평면 위의 점 N개가 주어질 때, x좌표 -> y좌표 순서로 정렬 후 출력
    public static void main(String[] args) throws IOException {

        /* [1] 입력 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 2차원 평면 위 점의 개수 N (1 ≤ N ≤ 100,000)
        int[][] arrList = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrList[i][0] = Integer.parseInt(st.nextToken());
            arrList[i][1] = Integer.parseInt(st.nextToken());
        }

        /* [2] 정렬 */
        Arrays.sort(arrList, (a, b) -> a[1] != b[1] ? a[1] - b[1] : a[0] - b[0]); // y좌표가 다를 경우 y좌표 오름차순

        /* [3] 출력 */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arrList[i][0] + " " + arrList[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}