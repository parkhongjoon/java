package sec04;

public class ResourceOpenClose implements AutoCloseable{

	//�ʵ�
	private String name;
	
	//������
	public ResourceOpenClose(String name) {
		this.name = name;
		System.out.println(name + "����");
	}

	public String read1() {
		System.out.println(name + "�б�");
		return "100";
	}
	
	public String read2() {
		System.out.println(name + "�б�");
		return "ȫ�浿";
	}

	@Override
	public void close() throws Exception {
		System.out.println(name + "�ݱ�");
	}

}