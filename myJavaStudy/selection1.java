package myJavaStudy;

// 정보처리기사 실기 154번
// 선택 정렬 (Selection sort)
// (i=0), j범위 = (1, 2, 3, 4)
// i[0]에 위치한 7은 고정하고, 제일 최소값을 찾아서 자리를 바꿈

// i=0 : 7 4 5 1 3 -> ((7을 제외한)최소값이 1이므로) -> 1 4 5 7 3 (1과 7의 위치 교환)
// i=1 : 1 4 5 7 3 -> ((1을 제외한)최소값이 3이므로) -> 1 3 5 7 4 (3과 4의 위치 교환)
// i=2 : 1 3 5 7 4 -> ((3을 제외한)최소값이 4이므로) -> 1 3 4 7 5 (4와 5의 위치 교환)
// i=3 : 1 3 4 7 5 -> ((5를 제외한)최소값이 7이므로) -> 1 3 4 5 7 (5와 7의 위치 교환)

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
