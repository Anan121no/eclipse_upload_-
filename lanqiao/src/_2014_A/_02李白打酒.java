package _2014_A;
/*
 * 话说大诗人李白，一生好饮。幸好他从不开车。
一天，他提着酒壶，从家里出来，酒壶中有酒2斗。他边走边唱：
无事街上走，提壶去打酒。
逢店加一倍，遇花喝一斗。
这一路上，他一共遇到店5次，遇到花10次，已知最后一次遇到的是花，他正好把酒喝光了。
请你计算李白遇到店和花的次序，可以把遇店记为a，遇花记为b。则：babaabbabbabbbb 就是合理的次序。
像这样的答案一共有多少呢？请你计算出所有可能方案的个数（包含题目给出的）。
 */
public class _02李白打酒 {
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
