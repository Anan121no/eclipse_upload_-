package _2013_C;
/*
 * С���ոտ����Ӱ����39��̨�ס����뿪��ӰԺ��ʱ��������������ǰ��̨������ǡ����39��!
վ��̨��ǰ����ͻȻ������һ�����⣺
�����ÿһ��ֻ������1����2��̨�ס�������ţ�Ȼ�����ҽ��棬���һ�������ҽţ�Ҳ����˵һ��Ҫ��ż������
��ô������39��̨�ף��ж����ֲ�ͬ���Ϸ��أ�
�������ü���������ƣ�����С��Ѱ�Ҵ𰸡�
 */
public class _04��39��̨�� {
	public static void main(String[] args) {
		f(39,0);
		System.out.println(ans);
	}
	static int ans;
	private static void f(int n, int steps) {
		// TODO Auto-generated method stub
		if(n<0)return;
		if(n==0) {
			if(steps%2==0)ans++;
			return;
		}
		
		f(n-1, steps+1);
		f(n-2, steps+1);
	} 
}
