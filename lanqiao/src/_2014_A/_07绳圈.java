package _2014_A;
/*
 * ���� 100 �����ӣ���Ȼ���� 200 ����ͷ��
�������ȡ��ͷ������ԣ���������ͷ��������������������γ����ɸ���Ȧ���������Ƿ�����һ�𣩡�
���ǵ������ǣ����������γɶ��ٸ���Ȧ�ĸ������
ע�⣺�����һ����������ͨ��������ύ�����֡���Ҫ��д��������ݡ�
 */
public class _07��Ȧ {
	public static void main(String[] args) {
		double f[][] = new double[101][101];
		f[1][1] = 1;
		for (int sheng = 2; sheng <= 100; sheng++) {
			f[sheng][1] = (f[sheng-1][1]*(sheng-1)*2)/(2*sheng-1);
			for (int quan = 2; quan <= sheng; quan++) {
				f[sheng][quan]=(f[sheng-1][quan]*(sheng-1)*2+f[sheng-1][quan-1])/(2*sheng-1);
			}
		}
		double max = -1;
		double ans = -1;
		for (int i = 1; i <= 100; i++) {
			if (f[100][i]>max) {
				max = f[100][i];
				ans =i;
			}
		}
		System.out.println(ans);
	}
}
