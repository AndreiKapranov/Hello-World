package grsu.example.hui.fivefour;

class ����� {

	private String �����;
	private String ��������;
	private ���� _����;
	private int ���_�������;

	public �����() {
		this.����� = "�����";
		this.�������� = "��������";
		this._���� = null;
		this.���_������� = 0;
	}

	public String get�����() {
		return �����;
	}

	public void set�����(String �����) {
		this.����� = �����;
	}

	public String get��������() {
		return ��������;
	}

	public void set��������(String ��������) {
		this.�������� = ��������;
	}

	public ���� get_����() {
		return _����;
	}

	public void set_����(���� _����) {
		this._���� = _����;

	}

	public int get���_�������() {
		return ���_�������;
	}

	public void set���_�������(int ���_�������) {
		this.���_������� = ���_�������;
	}

}

enum ���� {

	�������_����������

	, �������_����������, �������, �����, ���������, ��������, �������_����������
}

public class Application5l4 {
	public static void main(String[] args) {
		����� � = new �����();
		�.set�����("�.�����");
		�.set��������("������");
		�.set_����(����.valueOf("�������"));
		�.set���_�������(1915);
		System.out.println("�����:" + "\n" + "�����: " + �.get�����() + "\n" + "��������: " + �.get��������() + "\n"
				+ "����: " + �.get_����() + "\n" + "��� �������: " + �.get���_�������());
	}

}
