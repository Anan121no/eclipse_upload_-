package _2013_C;

import java.util.Scanner;

/*
 * ��������
С���������Ŀ����������3�������顣���ڽ������춼�ڼӰ��ء�Ϊ����ʿ����С�Ŵ����ÿ���鷢һ�����ң��ݴ����ܲ��ԣ�������Ҫ���ǣ�
1. ����ĺ�������������ͬ
2. �����ڱ�����ƽ�ֺ��ң���Ȼ�ǲ��ܴ���ģ�
3. �����ṩ����1,2��������С��������Լ�ָ����
�����ʽ
�����������������a, b, c����ʾÿ�������ڼӰ���������ÿո�ֿ���a,b,c<30��
�����ʽ
���һ������������ʾÿ�����ҵ�������
��������1
2 4 5
�������1
20
��������2
3 1 1
�������2
3
 */
public class _07���ҵ����� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int max = a*b*c;
		for (int i = 1; i < max; i++) {
			if (i%a==0&&i%b==0&&i%c==0) {
				System.out.println(i);
				break;
			}
		}
	}
}
