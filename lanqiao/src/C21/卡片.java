package C21;

import java.util.HashMap;

/*
 * С���кܶ����ֿ�Ƭ��ÿ�ſ�Ƭ�϶������� 0 �� 9��
С��׼������Щ��Ƭ��ƴһЩ��������� 1 ��ʼƴ����������ÿƴһ�����ͱ�����������Ƭ�Ͳ�������ƴ�������ˡ�
С����֪���Լ��ܴ� 1 ƴ�����١�
���磬��С���� 30 �ſ�Ƭ������ 0 �� 9 �� 3 �ţ���С������ƴ�� 1 �� 10��
����ƴ 11 ʱ��Ƭ 1 �Ѿ�ֻ��һ���ˣ�����ƴ�� 11��
����С�������� 0 �� 9 �Ŀ�Ƭ�� 2021 �ţ��� 20210 �ţ�����С�����Դ� 1
ƴ�����٣�
��ʾ������ʹ�ü������̽�����⡣

 */
public class ��Ƭ {
	public static void main(String[] args) {
		 HashMap<Integer, Integer> map = new HashMap<>();
	        for(int i = 0;i < 10;i++) map.put(i,2021);
	        int start = 1;
	        while(true){
	            String tmp = start + "";
	            for (char item : tmp.toCharArray()) {
	                if (map.get(item - 48) != 0) map.put(item - 48, map.get(item - 48) - 1);
	                else {
	                    System.out.println(start - 1);
	                    return;
	                };
	            }
	            start++;
	        }
	}
}
