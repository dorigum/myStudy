package myStudy;

// ����ó����� �Ǳ� 152��
// ���� ���� (Bubble sort)
// ���� ���ڿ� ���� ������ ũ�⸦ ���Ͽ� ����

// i=0 : 4 5 1 3 7
// i=1 : 4 1 3 5 7
// i=2 : 1 3 4 5 7
// i=3 : 1 3 4 5 7

public class bubble1 {
	static void align(int a[]) {
		int temp;
		for (int i=0; i<4; i++) {
			for (int j=0; j<4-i; j++) {
				if(a[j]>a[j+1]) {  // ���� ���� ���� ������ ũ�ٸ�
					temp = a[j];   // �ӽú����� ���� ���� �ְ�,
					a[j] = a[j+1]; // ���� �ڸ��� ���� ���� �ְ�,
					a[j+1] = temp; // ���� �ڸ��� �ӽú��� ���� �ִ´�.
				}				   // -> ���� �ڸ��� ���� �ڸ� ���ڸ� �ٲٰ� ����
			}
			
			for (int x=0; x<5; x++) {
				System.out.print(a[x] + " "); // (a)
			}
			
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		int a[] = {7, 4, 5, 1, 3};
		align(a);
	}
}
