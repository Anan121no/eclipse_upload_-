package _2014_A;
/*
 * д��־�ǳ���ĳ�����������Ҫ���� t1.log, t2.log, t3.log �����ļ�������
д����־��Ҳ����˵��һ��д��t1.log���ڶ���д��t2.log��... ���Ĵ���Ȼ
д��t1.log����˷�����
����Ĵ���ģ������������д�벻ͬ��־�ļ����߼���
public class A
{
private static int n = 1;

public static void write(String msg)
{
String filename = "t" + n + ".log";
n = ____________;
System.out.println("write to file: " + filename + " " + msg);
}
}
�ϴ��룺
public class Main
{
����private static int n = 1;
����public static void main(String args[]){
��������for (int i = 0; i<=100; i++) {
������������write(i,"1111");
��������}
����}
����public static void write(int n, String msg)
����{
��������n = n%3+1;
��������String filename = "t" + n + ".log";
��������System.out.println("write to file: " + filename + " " + msg);
����}
}
 */
public class _04д��־ {
	private static int n = 1;

	public static void write(String msg)
	{
	String filename = "t" + n + ".log";
//	n = n%3+1;
	n = ++n%4==0?1:n;
//	System.out.println(n);
	System.out.println("write to file: " + filename + " " + msg);
	}
	public static void main(String[] args) {
		_04д��־.write("msg");
		write("msg");
		write("msg");
		write("msg");
		write("msg");
	}
}
