package A13;

import java.util.Arrays;

/*
 * һ�����������ྭ���㷨�����������ϣ������ȡ�
��ʵ��Ӧ��ʱ���������������һЩ�����Ҫ������û��Ҫ������Щ�����㷨�����Ը���ʵ������������õĽⷨ��
���磬��һ�����������е����ֽ��з�������
ʹ�ø���������ˣ����������Ҷˣ�0���в���ע��������ص��ǣ�������������������ڲ���Ҫ�����򡣿�����������ص�ͨ��1������ɨ��ͽ���ս��!!
���µĳ���ʵ���˸�Ŀ�ꡣ
����xָ���������������飬len������ĳ��ȡ�
void sort3p(int* x, int len)
{
int p = 0;
int left = 0;
int right = len-1;
while(p<=right){
	if(x[p]<0){
		int t = x[left];
		x[left] = x[p];
		x[p] = t;
		left++;
		p++;
	}
	else if(x[p]>0){
		int t = x[right];
		x[right] = x[p];
		x[p] = t;
		right--;			
	}
	else{
		__________________________;  //���λ��
	}
}
}
����������飺
25,18,-2,0,16,-5,33,21,0,19,-16,25,-3,0
�������Ϊ��
-3,-2,-16,-5,0,0,0,21,19,33,25,16,18,25
 */
//���˼·����С��0�ķ�����ߣ�����0�ķ����ұߡ�����0��p++Ҳ���Ƿŵ�ǰ�ĺ���
public class �������� {
	public static void main(String[] args) {
		int []x = {25,18,-2,0,16,-5,33,21,0,19,-16,25,-3,0};
		int len = x.length;
		sort3p(x, len);
		System.out.println(Arrays.toString(x));
	}
		static void sort3p(int x[], int len){
		int p = 0;
		int left = 0;//�±�
		int right = len-1;//����±�
		while(p<=right){
			if(x[p]<0){
				int t = x[left];
				x[left] = x[p];
				x[p] = t;		//Ԫ��С��0����Ԫ�غ�leftλ�ý���
				left++;
				p++;
			}
			else if(x[p]>0){
				int t = x[right];
				x[right] = x[p];
				x[p] = t;
				right--;		//Ԫ�ش���0����Ԫ�غ�leftλ�ý���	
			}
			else{	//Ԫ�ص���0
				p++;	 //���λ��
			}
		}	
	}
}

