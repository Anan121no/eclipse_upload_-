package _2013_C;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * ����������
�������ǲ����ٽ��еȷֵ��������磺2 3 5 7 11 �ȡ�
9 = 3 * 3 ˵��������3�ȷ֣��������������
���ǹ�����1949�꽨�������ֻ���� 1 9 4 9 ��4�����ֿ�Ƭ��
��������ڷ����ǵ��Ⱥ�˳�򣨵���Ƭ���ܵ��ŰڷŰ������ǲ������Խת�䣡����
��ô��������ɶ��ٸ�4λ�������أ�
* ����������
* ��������������������磺1949��4919 ������Ҫ��
 */
public class _02������ {
	static void f(int [] arr,int k) {
		if (k==4) {
			Check(arr);
//			System.out.println(Arrays.toString(arr));
		}
		for (int i = k; i < 4; i++) {
			int t = arr[k];
			arr[k]=arr[i];
			arr[i]=t;
			f(arr, k+1);
			t = arr[k];
			arr[k]=arr[i];
			arr[i]=t;
		}
	}
	static Set<Integer> set = new HashSet<Integer>();
	static private void Check(int[] arr) {
		boolean flag = true;
		// TODO Auto-generated method stub
		int x = arr[0]*1000+arr[1]*100+arr[2]*10+arr[3];
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if (x%i==0) {
				flag = false;
//				System.out.println(x+"f");
				break;
			}
		}
		if (flag) {
			set.add(x);
//			System.out.println(x+"t");
		}
	}
	public static void main(String[] args) {
		int []arr= {1,4,9,9};
		f(arr, 0);
//		System.out.println(set);
		System.out.println(set.size());
	}
}
