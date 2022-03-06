package A13;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * �����ı��ʽ��Ϊ��׺���ʽ����������м䣬��Ҫ�Ǹ����Ķ��ģ�������Ⲣ�����㡣
���磺3 + 5 * (2 + 6) - 1
    ���ң�������Ҫ���������ı��������
    �෴�����ʹ���沨�����ʽ��ǰ׺���ʽ����ʾ���������ʽ���ʾΪ��
    - + 3 * 5 + 2 6 1
    ������Ҫ���ţ����������õݹ�ķ����ܷ������⡣
    Ϊ�˼�㣬���Ǽ��裺
    1. ֻ�� + - * ���������
    2. ÿ������������һ��С��10�ķǸ�����   
    ����ĳ����һ���沨����ʾ��������ֵ��
    �䷵��ֵΪһ���ṹ�����е�һԪ�ر�ʾ��ֵ������ڶ���Ԫ�ر�ʾ���ѽ������ַ�����
	public static void main(String[] args) {
		//�沨�����ʽ�ַ���
		String s = "-+3*5+261";
		//�õ�����������
		int[] result = evaluate(s);
		//��ӡ���
		System.out.println(result[0]);
	}
	//�����沨���ĵݹ麯��
	static int[] evaluate(String x){
		if(x.length()==0) 
			return new int[] {0,0};		
		char c = x.charAt(0);
		if(c>='0' && c<='9') 
			return new int[] {c-'0',1};		
		int[] v1 = evaluate(x.substring(1));
		int[] v2 = evaluate(x.substring(1+v1[1]));  //���λ��		
		int v = Integer.MAX_VALUE;
		if(c=='+') v = v1[0] + v2[0];
		if(c=='*') v = v1[0] * v2[0];
		if(c=='-') v = v1[0] - v2[0];		
		return new int[] {v,1+v1[1]+v2[1]};
	}
 */
public class �沨�����ʽ {
	public static void main(String[] args) {
		//�沨�����ʽ�ַ���
		String s = "-+3*5+261";
		//�õ�����������
		int[] result = evaluate(s);
		//��ӡ���
		System.out.println(result[0]);
	}
	
	//�����沨���ĵݹ麯��
	static int[] evaluate(String x){
		if(x.length()==0) 
			return new int[] {0,0};
		char c = x.charAt(0);//��õ�һ���ַ�
		if(c>='0' && c<='9') //���ַ�0-9
			return new int[] {c-'0',1};
		int[] v1 = evaluate(x.substring(1));//��һ���ַ������������ȡ����Ĳ���
		int[] v2 = evaluate(x.substring(1+v1[1]));  //���λ��
		int v = Integer.MAX_VALUE;
		if(c=='+') v = v1[0] + v2[0];
		if(c=='*') v = v1[0] * v2[0];
		if(c=='-') v = v1[0] - v2[0];
		return new int[] {v,1+v1[1]+v2[1]};
	}

}
