package myJavaStudy;

// 정보처리기사 실기 156번
// 삽입 정렬 (Insertion sort)
// 정보처리기사에서 다루는 알고리즘 중, 유일하게 쉬프트하는 정렬

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
				a[j+1] = a[j];	// 뒤의 값을 앞의 값으로 바꿔라
				j--;			// 우측으로 쉬프트 하라는 의미
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
