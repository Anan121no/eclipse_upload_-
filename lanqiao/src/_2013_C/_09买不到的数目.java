package _2013_C;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * С������һ���ǹ��ꡣ������Ĳã���ˮ���ǰ���4��һ����7��һ�������֡��ǹ����ܲ������
    С���������ǵ�ʱ�������������ְ�װ����ϡ���Ȼ��Щ�ǹ���Ŀ���޷���ϳ����ģ�����Ҫ�� 10 ���ǡ�
    ������ü��������һ�£������ְ�װ����£�������򵽵�������17������17���κ����ֶ�������4��7��ϳ�����
    �����Ҫ���������֪������װ������ʱ�����������ϳ������֡�
���룺
��������������ʾÿ�ְ�װ���ǵĿ���(��������1000)
Ҫ�������
һ������������ʾ������򵽵�����
����Ҫ�����޽�����
���磺
�û����룺
4 7
����Ӧ�������
17
�����磺
�û����룺
3 5
����Ӧ�������
7
 */
public class _09�򲻵�����Ŀ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		solve(a, b);
		enumeration(a, b);
	}
	//��ʽ��
	static private void solve(int a,int b) {
		// TODO Auto-generated method stub
		int res = a*b-a-b;
		System.out.println(res);
	}
	//ö�ٷ�
	static private void enumeration(int a,int b) {
		// TODO Auto-generated method stub
		int max = a*b;
		Set<Integer> ss = new HashSet<Integer>();
		for (int i = 0; a*i < max; i++) {
			for (int j = 0; a*i+b*j < max; j++) {
				ss.add(a*i+b*j);
			}
		}
		for (int i = max-1; i >= 0; i--) {
			if (!ss.contains(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}
