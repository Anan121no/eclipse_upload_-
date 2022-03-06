package A13;

import java.util.Scanner;

/*
 * 问题描述
如下图所示，3 x 3 的格子中填写了一些整数。
+--*--+--+
|10* 1|52|
+--****--+
|20|30* 1|
*******--+
| 1| 2| 3|
+--+--+--+
我们沿着图中的星号线剪开，得到两个部分，每个部分的数字和都是60。
本题的要求就是请你编程判定：对给定的m x n 的格子中的整数，是否可以分割为两个部分，使得这两个区域的数字和相等。
如果存在多种解答，请输出包含左上角格子的那个区域包含的格子的最小数目。
如果无法分割，则输出 0。
输入格式
程序先读入两个整数 m n 用空格分割 (m,n<10)。
表示表格的宽度和高度。
接下来是n行，每行m个正整数，用空格分开。每个整数不大于10000。
输出格式
输出一个整数，表示在所有解中，包含左上角的分割区可能包含的最小的格子数目。
样例输入1
3 3
10 1 52
20 30 1
1 2 3
样例输出1
3
样例输入2
4 3
1 1 1 1
1 30 80 2
1 1 1 100
样例输出2
10
 */
public class _09减格子_同B08 {
	static int[][] g;
	private static int n;
	private static int m;
	private static int total;
	private static int ans = Integer.MAX_VALUE;
	static int[][] vis;
	static void dfs(int i,int j,int steps,int sum) {
		if(i<0||i==n||j<0||j==m||vis[i][j]==1) return;//出口：边界以及走过的都走了
		if(sum==total/2) {
			ans=Math.min(ans, steps);
			return;
		}
		if (sum>total/2) return;
		vis[i][j]=1;//走过的标记为1
		dfs(i+1, j, steps+1, sum+g[i][j]);//down
		dfs(i-1, j, steps+1, sum+g[i][j]);//up
		dfs(i, j-1, steps+1, sum+g[i][j]);//left
		dfs(i, j+1, steps+1, sum+g[i][j]);//right
		vis[i][j] = 0;//一条路走完后标记回溯
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		m = in.nextInt();
		n = in.nextInt();
		g = new int[n][m];
		vis = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				g[i][j] = in.nextInt();
				total += g[i][j];
			}
		}
		dfs(0, 0, 0, 0);
		System.out.println(ans);
	}
}
