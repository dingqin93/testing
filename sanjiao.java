package sanjiao;

public class sanjiao {
	public static String T(double a,double b,double c)
	{

		if((a+b<=c)||(a+c<=b)||(b+c<=a))
		{return "�޷�����������";}
		else if(a==b&&b==c)
		{return "�ȱ�������";}
		else if(a==b||a==c||b==c)
		{return "����������";}
		else if((a*a+b*b==c*c)||(a*a+c*c==b*b)||(c*c+b*b==a*a))
		{return "ֱ��������";}
		
		else
		{return "������������";}
		}

		public static void main(String[] args) {
		System.out.println(sanjiao.T(11, 5, 12));
		}
}
