package myStudy;

// ����ó����� �Ǳ� 154��
// ���� ���� (Selection sort)
// (i=0), j���� = (1, 2, 3, 4)
// i[0]�� ��ġ�� 7�� �����ϰ�, ���� �ּҰ��� ã�Ƽ� �ڸ��� �ٲ�

// i=0 : 7 4 5 1 3 -> ((7�� ������)�ּҰ��� 1�̹Ƿ�) -> 1 4 5 7 3 (1�� 7�� ��ġ ��ȯ)
// i=1 : 1 4 5 7 3 -> ((1�� ������)�ּҰ��� 3�̹Ƿ�) -> 1 3 5 7 4 (3�� 4�� ��ġ ��ȯ)
// i=2 : 1 3 5 7 4 -> ((3�� ������)�ּҰ��� 4�̹Ƿ�) -> 1 3 4 7 5 (4�� 5�� ��ġ ��ȯ)
// i=3 : 1 3 4 7 5 -> ((5�� ������)�ּҰ��� 7�̹Ƿ�) -> 1 3 4 5 7 (5�� 7�� ��ġ ��ȯ)

public class selection1 {
	static void sort(int[] a) {
		int n = a.length;
		
		for (int i=0; i<n-1; i++) {
			int idxLeast = i;
			
			for (int j=i+1; j<n; j++) {
				if(a[j]<a[idxLeast]) {
					idxLeast = j;
				}
			}
			
			if (idxLeast != i) {
				int tmp = a[i];
				a[i] = a[idxLeast];
				a[idxLeast] = tmp;
			}
			
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
