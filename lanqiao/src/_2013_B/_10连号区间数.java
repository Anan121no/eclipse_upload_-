package _2013_B;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * ��������
С����Щ��һֱ��˼������һ����ֶ���Ȥ�����⣺
��1~N��ĳ��ȫ�������ж��ٸ����������أ�������˵����������Ķ����ǣ�
�������[L, R] �������Ԫ�أ��������еĵ�L������R��Ԫ�أ�����������ܵõ�һ������ΪR-L+1�ġ����������У������������������䡣
��N��С��ʱ��С�����Ժܿ������𰸣����ǵ�N����ʱ������Ͳ�����ô���ˣ�����С����Ҫ��İ�����
�����ʽ
��һ����һ��������N (1 <= N <= 50000), ��ʾȫ���еĹ�ģ��
�ڶ�����N����ͬ������Pi(1 <= Pi <= N)�� ��ʾ��N�����ֵ�ĳһȫ���С�
�����ʽ
���һ����������ʾ��ͬ�����������Ŀ��
��������1
4
3 2 4 1
�������1
7
��������2
5
3 4 2 5 1
�������2
9
���ͣ�
��һ�������У���7����������ֱ��ǣ�[1,1], [1,2], [1,3], [1,4], [2,2], [3,3], [4,4]
�ڶ��������У���9����������ֱ��ǣ�[1,1], [1,2], [1,3], [1,4], [1,5], [2,2], [3,3], [4,4], [5,5]
 */
public class _10���������� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int [n+1];
		for (int i = 1; i < n+1; i++) {
			arr[i] = in.nextInt();
		}
		int ans = 0;
		for (int i = 1; i < n+1; i++) {
			int max = arr[i];
			int min = arr[i];
			for (int j = i; j <n+1; j++) {
				if(arr[j]>max)max=arr[j];
				if(arr[j]<min)min=arr[j];
				if(i==j) {
//					System.out.printf("[%d,%d]\n",i,j);//���鷽ʽ��ӡi��j
					ans++;
				}
				else {//i<j
					if (max-min==j-i) ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
