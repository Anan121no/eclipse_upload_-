package A13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * ��������
�ܾ���ǰ��T������ǰ���١�Ϊ�˸��õع�����ң������޽��˴����Ŀ���·�����������׶��������ڵĸ�����С�
Ϊ��ʡ���ѣ�T���Ĵ��Ǿ���˼�����ƶ���һ��������޽�������ʹ���κ�һ������ж��ܴ��׶�ֱ�ӻ���ͨ����������м�ӵ��
ͬʱ��������ظ���������У����׶�����ÿ������еķ�������Ψһ�ġ�
J��T����Ҫ�󳼣���Ѳ���ڸ������֮�䣬������顣���ԣ���һ��������ͣ��ص���һ�����г���J��������顣
����һ��Ǯ�������ڴ���������м��·�ѡ�
������J���֣��������ĳ������ͣ�����������������н������У���������·���������߹��ľ����йأ����ߵ�xǧ�׵���x+1ǧ����һǧ���У�x����������
�����ѵ�·����x+10��ô�ࡣҲ����˵��1ǧ�׻���11����2ǧ��Ҫ����23��
J����֪��������ĳһ�����г������м䲻��Ϣ��������һ�����У����п��ܻ��ѵ�·��������Ƕ����أ�
�����ʽ
����ĵ�һ�а���һ������n����ʾ�����׶����ڵ�T�����ĳ�����
���д�1��ʼ���α�ţ�1�ų���Ϊ�׶���
������n-1�У�����T���ĸ���·��T���ĸ���·һ����n-1����
ÿ����������Pi, Qi, Di����ʾ����Pi�ͳ���Qi֮����һ������·������ΪDiǧ�ס�
�����ʽ
���һ����������ʾ��J��໨�ѵ�·���Ƕ��١�
��������1
5
1 2 2
1 3 1
2 4 5
2 5 4
�������1
135
�����ʽ
��J�ӳ���4������5Ҫ����135��·�ѡ�
 */
public class _10�󳼵��÷� {

	private static int n;
	private static long max = -1;
	private static int pnt = -1;
	private static List<Node>[] g;
	static long dis2money(Long dis) {
		return 11*dis+dis*(dis-1)/2;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		g = new List[n+1];
		for (int i = 0; i <=n; i++) {
			g[i] = new ArrayList<Node>();
		}
		for (int i = 0; i < n-1; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			long c = in.nextInt();
			g[a].add(new Node(b,c));
			g[b].add(new Node(a,c));
		}
		//��1Ϊ������һ���˵�
		dfs(1,1,0);
		System.out.println(pnt);//��ӡ�ҵ��Ķ˵�
		dfs(pnt, pnt, 0);
		System.out.println(pnt);
		System.out.println(dis2money(max));
	}
	private static void dfs(int from,int num,long dis) {
		// TODO Auto-generated method stub
		boolean isLeaf = true;
		List<Node> neighbors = g[num];
		for (int i = 0; i < neighbors.size(); i++) {
			Node neighbor = neighbors.get(i);
			if (neighbor.num==from) {
				continue;
			}
			isLeaf=false;
			dfs(num, neighbor.num, dis+neighbor.dis);
		}
		if (isLeaf&&dis>max) {//��Ҷ�ӽڵ�
			max=dis;
			pnt=num;
		}
	}
	static class Node{
		int num;
		long dis;
		public Node(int num, long dis) {
			super();
			this.num = num;
			this.dis = dis;
		}
	}
}
