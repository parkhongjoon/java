package Exam;

public class Exam01 {

   public static void main(String[] args) {
	 //Byte Ÿ��
	      byte num1 = -128;
	      byte num2 = -30;
	      byte num3 = 0;
	      byte num4 = 30;
	      byte num5 = 127;

	      System.out.println(num1);
	      System.out.println(num2);
	      System.out.println(num3);
	      System.out.println(num4);
	      System.out.println(num5);
	      
	      //char Ÿ��
	      char c1 = 'A';  //���ڸ� ���� ����
	      char c2 = 65;  // �������� ����
	      char c3='\u0041'; //�����ڵ�, 16������ ����
	      
	      System.out.println(c1);
	      System.out.println(c2);
	      System.out.println(c3);
	      
	      char c4 = '��';
	      char c5 = 44032;
	      char c6 ='\uac00' ;
	      
	      int uniCode = c4;
	            
	      System.out.println(c4);
	      System.out.println(c5);
	      System.out.println(c6);
	      System.out.println(uniCode);
	   }

	}