package sanjiao;

public class sanjiao {
	public static String T(double a,double b,double c)
	{

		if((a+b<=c)||(a+c<=b)||(b+c<=a))
		{return "无法构成三角形";}
		else if(a==b&&b==c)
		{return "等边三角形";}
		else if(a==b||a==c||b==c)
		{return "等腰三角形";}
		else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==a*a))
		{return "直角三角形";}
		
		else
		{return "不规则三角形";}
		}

		public static void main(String[] args) {
		System.out.println(sanjiao.T(11, 5, 12));
		}
}
