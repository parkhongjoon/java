package sec10;

   //�߻�Ŭ����
   //�߻�Ŭ������ ���� ��ü�� ������ ���Ѵ�.
public abstract class Phone {

   //�ʵ� 
   String owner;
   
   //������
   
   Phone(String owner){
      this.owner = owner;
   }
   
   //�޼���
   //�θ�� ���� �س��� �ڽĵ��� ��üȭ�Ѵ� = ������ �޼��� �������̵� �ȴ�.
   //abstract ����Ÿ�� �޼����̸�(�Ű�����); -> ���� ����{} �� ������ �ʴ´�.
   void turnOn() {
      System.out.println("���� ������ �մϴ�.");
   }
   void turnOff() {
      System.out.println("���� ������ ���ϴ�.");
   }
   
}