package C21;
import java.util.Scanner;
/*
 * 小蓝要和朋友合作开发一个时间显示的网站。在服务器上，朋友已经获取了当前的时间，用一个整数表示，值为从 1970 19701970 年 1 11 月 1 日 00 : 00 : 00 00:00:0000:00:00 到当前时刻经过的毫秒数。
  现在，小蓝要在客户端显示出这个时间。小蓝不用显示出年月日，只需显示出时分秒即可，毫秒也不用显示，直接舍去即可。
  给定一个用整数表示的时间，请将这个时间对应的时分秒输出。
输入：46800999
输出：13:00:00
 */


public class 时间显示 {

    public static void main(String[] args) { 
    	new 时间显示().run(); 
    	}
    void run() {
        long t = new Scanner(System.in).nextLong();
        System.out.printf("%02d:%02d:%02d",
            t / 3600000 % 24, t / 60000 % 60, t / 1000 % 60);
    }
}

