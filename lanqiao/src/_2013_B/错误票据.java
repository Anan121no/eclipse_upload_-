package _2013_B;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * ĳ���ܵ�λ�·���ĳ��Ʊ�ݣ���Ҫ������ȫ���ջء�
ÿ��Ʊ����Ψһ��ID�š�ȫ������Ʊ�ݵ�ID���������ģ���ID�Ŀ�ʼ���������ѡ���ġ�
��Ϊ������Ա�������¼��ID�ŵ�ʱ������һ�����������ĳ��ID�Ϻţ�����һ��ID�غš�
���������ͨ����̣��ҳ��Ϻŵ�ID���غŵ�ID��
����ϺŲ����ܷ�����������С�š�
�����ʽ
Ҫ�������������һ������N(N<100)��ʾ��������������
���Ŷ���N�����ݡ�
ÿ�����ݳ��Ȳ��ȣ����ÿո�ֿ������ɸ���������100������������������100000������ע�����ں���ĩ�����ж���Ŀո���ĳ�����Ҫ�ܴ�����Щ�ո�
ÿ����������һ��ID�š�
�����ʽ
Ҫ��������1�У�����������m n���ÿո�ָ���
���У�m��ʾ�Ϻ�ID��n��ʾ�غ�ID
��������1:
2
5 6 8 11 9 
10 12 9
�������1:
7 9
��������2:
6
164 178 108 109 180 155 141 159 104 182 179 118 137 184 115 124 125 129 168 196
172 189 127 107 112 192 103 131 133 169 158 
128 102 110 148 139 157 140 195 197
185 152 135 106 123 173 122 136 174 191 145 116 151 143 175 120 161 134 162 190
149 138 142 146 199 126 165 156 153 193 144 166 170 121 171 132 101 194 187 188
113 130 176 154 177 120 117 150 114 183 186 181 100 163 160 167 147 198 111 119
�������2:
105 120
 */
public class ����Ʊ�� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList<Integer>();
		int N = in.nextInt();
		in.nextLine();//�û��з�������Ч���Ե����з�
		for (int i = 0; i < N; i++) {
			String line = in.nextLine();
			String[] split = line.split(" ");
			for (int j = 0; j < split.length; j++) {
				list.add(Integer.parseInt(split[j]));
				
			}
		}
//		System.out.println(list.size());
		Collections.sort(list);
		int a = 0,b = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i)-list.get(i-1)==2) {//�˴��õȺ�����Ϊ�������2��2�ĵ�ַ����2�ĵ�ַ
				a = list.get(i)-1;
			}
			if (list.get(i).equals(list.get(i-1))) {//�Ƚ�����(�˴�ָ����integer��������)��ͬ��equals,==�ȵ��Ƕ���ĵ�ַ
				b=list.get(i);
			}
		}	
		System.out.println(a+" "+b);
	}
}
