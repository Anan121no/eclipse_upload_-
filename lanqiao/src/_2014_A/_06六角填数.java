package _2014_A;

/*
 * ��ͼ��1.png����ʾ�������У�����1~12�����֡�

ʹ��ÿ��ֱ���ϵ�����֮�Ͷ���ͬ��

ͼ�У��Ѿ����������3�����֣���������Ǻ�λ��������������Ƕ��٣�

��ͨ��������ύ�𰸣���Ҫ��д��������ݡ�

https://www.bbsmax.com/A/MAzADK9nd9/
 */
public class _06�������� {
	static int[] arr = {2,4,5,6,7,9,10,11,12};
	public static void main(String[] args) {
		f(0);
	}
	private static void f(int k) {
		// TODO Auto-generated method stub
			if(k==9) {
			check();
			return;
			}
			for (int i = k; i < 9; i++) {
			int t = arr[k];
			arr[k] = arr[i];
			arr[i] = t;
			f(k+1);
			t = arr[k];
			arr[k] = arr[i];
			arr[i] = t;
		}
	}
	private static void check() {
		// TODO Auto-generated method stub
		int r1 = 1+arr[0]+arr[3]+arr[5];
		int r2 = 1+arr[1]+arr[4]+arr[8];
		int r3 = 8+arr[0]+arr[1]+arr[2];
		int r4 = 11+arr[3]+arr[6];
		int r5 = 3+arr[2]+arr[4]+arr[7];
		int r6 = arr[5]+arr[6]+arr[7]+arr[8];
		if (r1==r2&&r2==r3&&r3==r4&&r4==r5&&r6==r5) {
			for (int i = 0; i < 9; ++i) {
				System.out.println(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
