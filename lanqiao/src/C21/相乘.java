package C21;
import java.math.BigInteger;
public class ПаіЛ {
public static void main(String[] args) {
	solve1();
	new ПаіЛ().run();
}
public static void solve1() {
	        BigInteger big=new BigInteger("2021");
	        BigInteger qi=new BigInteger("1000000007");
	        BigInteger target = new BigInteger("999999999");
	        for(int i=1;i<1000000007;i++){
	            if(big.multiply(new BigInteger(i+"")).mod(qi).compareTo(target) == 0){
	                System.out.println(i);
	                return;
	            }
	        }
	        System.out.println(0);
//	        System.out.println(BigInteger.valueOf(17812964).multiply(big).mod(qi).compareTo(target));
	    }

	    int N = 1000000007, M = 999999999;

	    void run() {
	        for (int i = 1; i <= N; i++)
	            if (i * 2021L % N == M) System.out.println(i);
	    }
	}
