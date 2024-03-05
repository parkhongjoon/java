package sec09;

public class InstanceOfExam {
   
   //�޼��� -- main()���� �ٷ� ȣ���ϱ� ���� ��������� ����
   // �Ű������� Person�̶�� Ŭ�󽺸� ����Ѱ��� �������̴� 
   // ��ư� �������� Person�� Int���� ���̶�� ��������.
   public static void personInfo(Person person) {
      System.out.println("name :" + person.name);
      person.walk();
   
   
   //person�� student Ÿ������ Ȯ��
   if(person instanceof Student) {
      //Student ��ü�� ��� ���� Ÿ�� ��ȯ
      Student student = (Student) person;
      //Student ��ü�� ������ �ִ� �ʵ� �� �޼��� ���
      System.out.println("StudentNo :" + student.studentNo);
      
      student.study();
       }
   }

   /*
    * java 12 �̻��� ��� person�� �����ϴ� ��ü�� student Ÿ���� ��� �ٷ� student ����
    *  if(person instanceof Student student){
    *       System.out.println("StudentNo :" + student.studentNo);
           student.study();
    *  }
    */
   
   public static void main(String[] args) {
      //person ��ü�� �Ű������� �����ϰ� �ٷ� personInfo() �޼��� ȣ��
      Person p1 = new Person("ȫ�浿"); // �θ�(person) �����ڰ� ���ȴ�.
      personInfo(p1);
      
      System.out.println();
      
      Person p2 = new Student("��ö��", 10);
      personInfo(p2); // �ڽ�(student) �����ڰ� ���ȴ�.
      

   }

}