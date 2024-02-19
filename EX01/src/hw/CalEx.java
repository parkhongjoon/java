package hw;

import java.util.Scanner;

public class CalEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cal c1 = new Cal();

        c1.powerOn();

        boolean r = true;
        while (r) {
            System.out.println("-------------------------------------------");
            System.out.println("1.���� | 2.���� | 3.����| 4.������ | 5.����");
            System.out.println("-------------------------------------------");
            System.out.print("���� > ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
                    int num1 = sc.nextInt();
                    System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
                    int num2 = sc.nextInt();
                    int result1 = c1.add(num1, num2);
                    System.out.println("������� : " + result1);
                    break;
                case 2:
                    System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
                    int num3 = sc.nextInt();
                    System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
                    int num4 = sc.nextInt();
                    int result2 = c1.min(num3, num4);
                    System.out.println("������� : " + result2);
                    break;
                case 3:
                    System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
                    int num5 = sc.nextInt();
                    System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
                    int num6 = sc.nextInt();
                    double result3 = c1.cro(num5, num6);
                    System.out.println("������� : " + result3);
                    break;
                case 4:
                    System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
                    int x = sc.nextInt();
                    System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
                    int y = sc.nextInt();
                    double result4 = c1.divide(x, y);
                    System.out.println("������ ��� : " + result4);
                    break;
                case 5:
                    r = false;
                    break;
                default:
                    System.out.println("�߸��� �޴��� �����ϼ̽��ϴ�.");
            }
        }

        c1.powerOff();
    }
}