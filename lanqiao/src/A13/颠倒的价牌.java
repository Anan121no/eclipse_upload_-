package A13;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * С��ĵ���ר�����������¼ܵ���Ʒ���ӻ����ɳ�Ϊ����Ʒ����ר���ꡣ
    ���۶���4λ���֣���ǧԪ���ȣ���
    С��Ϊ�˱�����������㣬ʹ����Ԥ�Ƶ���������ܵı��ǩ��ֻҪ����ɫ��Ϳ���־Ϳ����ˣ��μ�p1.jpg����
    ���ּ����и��ص㣬��һЩ���֣���������Ҳ�Ǻ�������֡��磺1 2 5 6 8 9 0 �����ԡ�����һ����������ӹҵ��ˣ��п�����ȫ�������һ���۸񣬱��磺1958 ���ŹҾ��ǣ�8561�����˼�ǧԪ��!! 
    ��Ȼ������������ܵ��������磬1110 �Ͳ��ܵ���������Ϊ0������Ϊ��ʼ���֡�
   ��һ�죬�������ڷ����ˡ�ĳ����Ա��С�İѵ����ĳ�����۸��Ƹ��ҵ��ˡ������������۸��Ƶĵ��ӻ�������ȥ��!
    ���ҵ��Ǽ۸���벻������һ����������2�ٶ࣬��һ������ȴ׬��8�ٶ࣬�ۺ�������������׬��558Ԫ��
    �������Щ��Ϣ���㣺��Ǯ���Ǹ�������ȷ�ļ۸�Ӧ���Ƕ��٣�
����һ��4λ����������ͨ�������ֱ���ύ�����֡�
ע�⣺��Ҫ�ύ�����̣�����������˵��������ݡ�
 */
//��9088
//�����������
public class �ߵ��ļ��� {
	public static void main(String[] args) {
//		System.out.println(reverse("9088"));
		ArrayList<Price> a1 = new ArrayList<Price>();
		ArrayList<Price> a2 = new ArrayList<Price>();
		for (int i = 1000; i < 10000; i++) {
			String s = "" + i;
			if (s.contains("3")||s.contains("4")||s.contains("7")) {
				continue;
			}
			String re_s = reverse(s);
			int i1 = Integer.parseInt(re_s);//�ַ���ת��������
			int plus = i1 - i;
			if (plus<-200&&plus>-300) {
				a1.add(new Price(i,plus));
			}
			if (plus<900&&plus>800) {
				a2.add(new Price(i,plus));
			}
		}
		for (Price p1:a1) {
			for (Price p2 : a2) {
				if (p1.plus+p2.plus==558) {
					System.out.println(p1.p+" "+p1.plus);
					System.out.println(p2.p+" "+p2.plus);
				}
			}
		}
	}
	private static String reverse(String s) {
		// TODO Auto-generated method stub
		char[] ans = new char[s.length()];
		for (int i = s.length()-1,j = 0; i >= 0;i--,j++) {
			char c = s.charAt(i);
			if (c=='6') {
				ans[j]='9';
			}else if (c=='9') {
				ans[j]='6';
			}else {
				ans[j] = c;
			}
		}
		return new String(ans);
	}
	private static class Price{
		int p;//ԭ��
		int plus;//�ߵ���
		public Price(int p, int plus) {
			this.p = p;
			this.plus = plus;
		}
		
	}
}




/*���ر���
*
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Price> list1 = new ArrayList<Price>();
		List<Price> list2 = new ArrayList<Price>();
		
		for(int i=1000;i<=9999;i++) {
			String str = ""+i;
			if(str.contains("3")||str.contains("4")||str.contains("7")) continue;
			if(i%10==0)continue;
			int sub = i-reverse(str);
			if(sub>=200 && sub<300) {
				Price price = new Price(i,reverse(str),sub);
				list1.add(price);
			}
			else if(sub>=-900&&sub<-800) {
				Price price = new Price(i,reverse(str),sub);
				list2.add(price);
			}
		}
		for(int ii=0;ii<list1.size();ii++) {
			for(int j=0;j<list2.size();j++) {
				if(list1.get(ii).sub+list2.get(j).sub==-558) {
					System.out.print(list1.get(ii).price+" "+list1.get(ii).rPrive+" "+list1.get(ii).sub+" ");
					System.out.println(list2.get(j).price+" "+list2.get(j).rPrive+" "+list2.get(j).sub+" ");
				}
			}
		}
		//9088
	}
	private static int reverse(String num) {
		char[] arr = num.toCharArray();
		char[] arr1 = new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i] = arr[arr.length-1-i];
			if(arr1[i]=='6')
				arr1[i]= '9';
			else if(arr1[i]=='9')
				arr1[i] = '6';
		}
		String s = new String(arr1);
		int n = Integer.valueOf(s);
		return n;
	}
	public static class Price{
		int price;
		int rPrive;
		int sub;
		public Price(int price, int rPrive, int sub) {
			this.price = price;
			this.rPrive = rPrive;
			this.sub = sub;
		}
		
	}

}
*/