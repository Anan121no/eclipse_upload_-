package _2014_A;
/*
 * ��˵��ʫ����ף�һ���������Һ����Ӳ�������
һ�죬�����žƺ����Ӽ���������ƺ����о�2���������߱߳���
���½����ߣ����ȥ��ơ�
����һ����������һ����
��һ·�ϣ���һ��������5�Σ�������10�Σ���֪���һ���������ǻ��������ðѾƺȹ��ˡ�
����������������ͻ��Ĵ��򣬿��԰������Ϊa��������Ϊb����babaabbabbabbbb ���Ǻ���Ĵ���
�������Ĵ�һ���ж����أ������������п��ܷ����ĸ�����������Ŀ�����ģ���
 */
public class _02��״�� {
	private static int ans;
	public static void main(String[] args) {
		f(5,9,2);
		System.out.println(ans);
	}
	private static void f(int dian, int hua, int jiu) {
		// TODO Auto-generated method stub
		if(dian==0&&hua==0&&jiu==1)ans++;
		if(dian>0)f(dian-1, hua, jiu*2);
		if(hua>0)f(dian, hua-1, jiu-1);
	}
}
