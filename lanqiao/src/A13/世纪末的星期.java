package A13;

import java.util.Calendar;

import javax.print.CancelablePrintJob;

/*
 * ��Ŀ����
����а�̳�1999��12��31��������ĩ�ա���Ȼ��ҥ���Ѿ��������ơ�

�����˳ƽ���ĳ������ĩ��12��31�գ����������һ��ᡭ

��Ȥ���ǣ��κ�һ������ĩ����ݵ�12��31�ն�������������һ!!

���ǣ���ҥ�������̡����޸�Ϊ�����ա�

1999���12��31���������壬���ʣ�δ����һ�������������һ������ĩ�꣨��xx99�꣩��12��31�������������죨�������գ���

��ش����ݣ�ֻд���4λ��������Ҫд12��31�ȶ�����Ϣ��

 */
//ʹ������API
public class ����ĩ������ {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		for (int year = 1999; year < 10000; year+=100) {
			calendar.set(Calendar.YEAR,year);
			calendar.set(Calendar.MONTH,11);
			calendar.set(calendar.DAY_OF_MONTH, 31);
			if(calendar.get(calendar.DAY_OF_WEEK)==1) {
				System.out.println(year);
				break;
			}
		}
	}
}
