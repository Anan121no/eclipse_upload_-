package A13;

import java.util.Scanner;
import java.util.function.ToIntFunction;

/*ȫ����
 * ��������
100 ���Ա�ʾΪ����������ʽ��100 = 3 + 69258 / 714��
�����Ա�ʾΪ��100 = 82 + 3546 / 197��
ע���������������У�����1~9�ֱ������ֻ����һ�Σ�������0����
���������Ĵ�������100 �� 11 �ֱ�ʾ����
�����ʽ
�ӱ�׼�������һ��������N (N<1000*1000)
�����ʽ
�������������������1~9���ظ�����©����ɴ�������ʾ��ȫ��������
ע�⣺��Ҫ�����ÿ����ʾ��ֻͳ���ж��ٱ�ʾ����
��������1
100
�������1
11
��������2
105
�������2
6
 */
public class _08������_ͬB09 {
	static int[] arr = {1,2,3,4,5,6,7,8,9};
	static int ans;
	private static int N;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		f(0);
		System.out.println(ans);
	}
	//ȷ��ĳһ�����еĵڼ�λ
	private static void f(int k) {
		// TODO Auto-generated method stub
		if (k==9) {
			check(arr);
			return;
		}
		//ѡ����KΪ
		for (int i = k; i < arr.length; i++) {
			//����iλ�͵�kλ����
			int t = arr[i];
			arr[i] = arr[k];
			arr[k] = t;
		//�ƽ���һ��ȥȷ��K+1
		f(k+1);
		//����
		t = arr[i];
		arr[i] = arr[k];
		arr[k] = t;
		}
	}
	//����λ��
	private static void check(int[] arr) {
		for (int i = 0; i < 8; i++) {
			int num1 = ToInt(arr,0,i);//��+��ǰ���һ������
			if (num1>N) {
				continue;
			}//"+"���������N������������
			for (int j = 1; j < 9-i; j++) {
				int num2 = ToInt(arr, i, j);
				int num3 = ToInt(arr, i+j, 9-i-j);
				if (num2%num3==0&&num1+num2/num3==N) {
					ans++;
				}
			}
		}
		// TODO Auto-generated method stub
		
	}
	private static int ToInt(int[] arr, int pos, int len) {
		int t = 1;
		int ans = 0;
		for (int i = pos + len - 1; i >= pos; i--) {
			ans+=arr[i]*t;
			t*=10;
		}
		return ans;
		// TODO Auto-generated method stub
		
	}
}
