package myStudy;

// ����ó����� �Ǳ� 156��
// ���� ���� (Insertion sort)
// ����ó����翡�� �ٷ�� �˰��� ��, �����ϰ� ����Ʈ�ϴ� ����

// i=0 : 4 7 5 1 3
// i=1 : 4 5 7 1 3
// i=2 : 1 4 5 7 3
// i=3 : 1 3 4 5 7

public class insertion1 {
	static void sort(int[] a) {
		int n = a.length;
		
		for (int i=1; i<n; i++) {
			int key = a[i];
			int j = i-1;
			
			while (j>=0 && a[j] > key) {
				a[j+1] = a[j];	// ���� ���� ���� ������ �ٲ��
				j--;			// �������� ����Ʈ �϶�� �ǹ�
			}
			a[j+1] = key;
			
			for (int x=0; x<a.length; x++) {
				System.out.print(a[x] + " "); // (a)
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7, 4, 5, 1, 3};
		sort(a);
	}
}
