package A13;

import java.util.Scanner;

/*
 * ��������
����ͼ��ʾ��3 x 3 �ĸ�������д��һЩ������
+--*--+--+
|10* 1|52|
+--****--+
|20|30* 1|
*******--+
| 1| 2| 3|
+--+--+--+
��������ͼ�е��Ǻ��߼������õ��������֣�ÿ�����ֵ����ֺͶ���60��
�����Ҫ������������ж����Ը�����m x n �ĸ����е��������Ƿ���Էָ�Ϊ�������֣�ʹ����������������ֺ���ȡ�
������ڶ��ֽ��������������ϽǸ��ӵ��Ǹ���������ĸ��ӵ���С��Ŀ��
����޷��ָ����� 0��
�����ʽ
�����ȶ����������� m n �ÿո�ָ� (m,n<10)��
��ʾ���Ŀ�Ⱥ͸߶ȡ�
��������n�У�ÿ��m�����������ÿո�ֿ���ÿ������������10000��
�����ʽ
���һ����������ʾ�����н��У��������Ͻǵķָ������ܰ�������С�ĸ�����Ŀ��
��������1
3 3
10 1 52
20 30 1
1 2 3
�������1
3
��������2
4 3
1 1 1 1
1 30 80 2
1 1 1 100
�������2
10
 */
public class _09������_ͬB08 {
	static int[][] g;
	private static int n;
	private static int m;
	private static int total;
	private static int ans = Integer.MAX_VALUE;
	static int[][] vis;
	static void dfs(int i,int j,int steps,int sum) {
		if(i<0||i==n||j<0||j==m||vis[i][j]==1) return;//���ڣ��߽��Լ��߹��Ķ�����
		if(sum==total/2) {
			ans=Math.min(ans, steps);
			return;
		}
		if (sum>total/2) return;
		vis[i][j]=1;//�߹��ı��Ϊ1
		dfs(i+1, j, steps+1, sum+g[i][j]);//down
		dfs(i-1, j, steps+1, sum+g[i][j]);//up
		dfs(i, j-1, steps+1, sum+g[i][j]);//left
		dfs(i, j+1, steps+1, sum+g[i][j]);//right
		vis[i][j] = 0;//һ��·������ǻ���
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
