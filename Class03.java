package Java09;

class Caaa // �w�q���OCaaa
{
	private int value;

	public Caaa() {
		this(10);// �I�s���غc���ɡAvalue���ȷ|�Q�]�w��10
		System.out.println("value=" + value);
	}

	public Caaa(int i) {
		value = i;
		System.out.println("value=" + value);
	}
}

public class Class03 {
	public static void main(String args[]) {
		Caaa obj1 = new Caaa();
		Caaa obj2 = new Caaa(12);
	}
}
//(b)��21��O�I�s�S���޼ƪ��A��22��h�O�I�s���޼ƪ��C
//(c)�_,�]���@���ɮ׸̥u�঳�@�� public �����O�A�ӥB�P�{���x�s����r�ɦW�ۦP�C
//(d)�i�b��L���O�I�s value�ҥH�èS���v�T�C