package Java09;

class CRational // �������O
{
	public int n;
	public int d;

	public void setND(int num, int den) {
		n = num;
		d = den;
	}

	public void setN(int num) // �]�w���l
	{
		n = num;
	}

	public void setD(int num) // �]�w����
	{
		d = num;
	}

	public void show() {
		System.out.println(n + "/" + d); // ��ܤ���
	}

}

public class Classa10 {
	public static void main(String args[]) {
		CRational aaa = new CRational();
		aaa.setND(3, 5);
		aaa.show();
	}
}