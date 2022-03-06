package C21;
/*
 * С��ѧϰ�����·��֮���ر���ˣ���������һ���ر��ͼ��ϣ���ҵ�ͼ �е����·����
С����ͼ�� 2021 �������ɣ����α�� 1 �� 2021��
����������ͬ�Ľ�� a, b����� a �� b �Ĳ�ľ���ֵ���� 21����������� ֮��û�б���������� a �� b �Ĳ�ľ���ֵС�ڵ��� 21����������֮����һ�� ����Ϊ a �� b ����С�������������������
���磺��� 1 �ͽ�� 23 ֮��û�б���������� 3 �ͽ�� 24 ֮����һ���� ��ߣ�����Ϊ 24����� 15 �ͽ�� 25 ֮����һ������ߣ�����Ϊ 75��
����㣬��� 1 �ͽ�� 2021 ֮������·�������Ƕ��١�
 */
public class ·�� {
    public static void main(String[] args) { 
    new ·��().run(); 
    }
    int N = 2021;

    void run() {
        long[] dp = new long[N + 1];
        for (int w = 2; w <= N; w++) {
            dp[w] = Long.MAX_VALUE;
            for (int v = w - 1; v > 0 && v >= w - 21; v--)
                dp[w] = min(dp[w], dp[v] + lcm(v, w));
        }
        System.out.println(dp[N]);
    }
//������С����
    long min(long a, long b) { return a < b ? a : b; }

    int lcm(int a, int b) { return a * b / gcd(a, b); }

    int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); 
    }
}

