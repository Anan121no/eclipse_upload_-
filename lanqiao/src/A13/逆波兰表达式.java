package A13;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * 正常的表达式称为中缀表达式，运算符在中间，主要是给人阅读的，机器求解并不方便。
例如：3 + 5 * (2 + 6) - 1
    而且，常常需要用括号来改变运算次序。
    相反，如果使用逆波兰表达式（前缀表达式）表示，上面的算式则表示为：
    - + 3 * 5 + 2 6 1
    不再需要括号，机器可以用递归的方法很方便地求解。
    为了简便，我们假设：
    1. 只有 + - * 三种运算符
    2. 每个运算数都是一个小于10的非负整数   
    下面的程序对一个逆波兰表示串进行求值。
    其返回值为一个结构：其中第一元素表示求值结果，第二个元素表示它已解析的字符数。
	public static void main(String[] args) {
		//逆波兰表达式字符串
		String s = "-+3*5+261";
		//得到计算结果数组
		int[] result = evaluate(s);
		//打印结果
		System.out.println(result[0]);
	}
	//计算逆波兰的递归函数
	static int[] evaluate(String x){
		if(x.length()==0) 
			return new int[] {0,0};		
		char c = x.charAt(0);
		if(c>='0' && c<='9') 
			return new int[] {c-'0',1};		
		int[] v1 = evaluate(x.substring(1));
		int[] v2 = evaluate(x.substring(1+v1[1]));  //填空位置		
		int v = Integer.MAX_VALUE;
		if(c=='+') v = v1[0] + v2[0];
		if(c=='*') v = v1[0] * v2[0];
		if(c=='-') v = v1[0] - v2[0];		
		return new int[] {v,1+v1[1]+v2[1]};
	}
 */
public class 逆波兰表达式 {
	public static void main(String[] args) {
		//逆波兰表达式字符串
		String s = "-+3*5+261";
		//得到计算结果数组
		int[] result = evaluate(s);
		//打印结果
		System.out.println(result[0]);
	}
	
	//计算逆波兰的递归函数
	static int[] evaluate(String x){
		if(x.length()==0) 
			return new int[] {0,0};
		char c = x.charAt(0);//获得第一个字符
		if(c>='0' && c<='9') //此字符0-9
			return new int[] {c-'0',1};
		int[] v1 = evaluate(x.substring(1));//第一个字符是运算符，截取后面的部分
		int[] v2 = evaluate(x.substring(1+v1[1]));  //填空位置
		int v = Integer.MAX_VALUE;
		if(c=='+') v = v1[0] + v2[0];
		if(c=='*') v = v1[0] * v2[0];
		if(c=='-') v = v1[0] - v2[0];
		return new int[] {v,1+v1[1]+v2[1]};
	}

}
