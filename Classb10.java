package Java09;

class CRationalb // だ计摸
{
	public static int n;
	public static int d;

	public void setND(int num, int den) {
		n = num;
		d = den;
	}

	public void setN(int num) // 砞﹚だ
	{
		n = num;
	}

	public void setD(int num) // 砞﹚だダ
	{
		d = num;
	}

}

public class Classb10 {
	public static void main(String args[]) {
		CRationalb aaa = new CRationalb();
		aaa.setND(3, 5);
		show(aaa); // ず场ㄧ计(ン)
	}

	public static void show(CRationalb obj) // ま计 摸andン
	{

		System.out.println(obj.n + "/" + obj.d); // 陪ボだ计
	}
}