package _2013_B;
/* ����������
���������ǿ��Ա�ʾΪ���������ı�ֵ�����֡�һ������£������ý��Ƶ�С����ʾ������Щ
ʱ�򣬲����������������������������ʾһ����������
��ʱ�����ǿ��Խ���һ�����������ࡱ������Ĵ������ʵ�������Ŀ�ꡣΪ�˼�������ֻ��
���˼ӷ��ͳ˷����㡣
class Rational
{
private long ra;
private long rb;
private long gcd(long a, long b){
if(b==0) return a;
return gcd(b,a%b);
}
public Rational(long a, long b){
ra = a;
rb = b;
long k = gcd(ra,rb);
if(k>1){ //��ҪԼ��
ra /= k;
rb /= k;
}
}
// �ӷ�
public Rational add(Rational x){
return ________________________________________; //���λ��
}
// �˷�
public Rational mul(Rational x){
return new Rational(ra*x.ra, rb*x.rb);
}
public String toString(){
if(rb==1) return "" + ra;
return ra + "/" + rb;
}
}
ʹ�ø����ʾ����
Rational a = new Rational(1,3);
Rational b = new Rational(1,6);
Rational c = a.add(b);
System.out.println(a + "+" + b + "=" + c);
*/
public class _05������_ͬC05 {
	public static void main(String[] args) {
		class Rational
		{
		private long ra;
		private long rb;
		private long gcd(long a, long b){
		if(b==0) return a;
		return gcd(b,a%b);
		}
		public Rational(long a, long b){
		ra = a;
		rb = b;
		long k = gcd(ra,rb);
		if(k>1){ //��ҪԼ��
		ra /= k;
		rb /= k;
		}
		}
		// �ӷ�
		public Rational add(Rational x){
//			System.out.println("ra:"+ra+"  "+"x.ra:"+x.ra);
		return new Rational(ra*x.rb+rb*x.ra,  rb*x.rb);//���λ��
		}
		// �˷�
		public Rational mul(Rational x){
		return new Rational(ra*x.ra, rb*x.rb);
		}
		public String toString(){
		if(rb==1) return "" + ra;
		return ra + "/" + rb;
		}
		}
		Rational a = new Rational(2,3);
		Rational b = new Rational(5,6);
		Rational c = a.add(b);
		System.out.println(a + "+" + b + "=" + c);
	}
}
