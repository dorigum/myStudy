package myStudy;

// 정보처리기사 실기 152번
// 버블 정렬 (Bubble sort)
// 앞의 숫자와 뒤의 숫자의 크기를 비교하여 정렬

// i=0 : 4 5 1 3 7
// i=1 : 4 1 3 5 7
// i=2 : 1 3 4 5 7
// i=3 : 1 3 4 5 7

public class bubble1 {
	static void align(int a[]) {
		int temp;
		for (int i=0; i<4; i++) {
			for (int j=0; j<4-i; j++) {
				if(a[j]>a[j+1]) {  // 앞의 값이 뒤의 값보다 크다면
					temp = a[j];   // 임시변수에 앞의 값을 넣고,
					a[j] = a[j+1]; // 앞의 자리에 뒤의 값을 넣고,
					a[j+1] = temp; // 뒤의 자리에 임시변수 값을 넣는다.
				}				   // -> 앞의 자리와 뒤의 자리 숫자를 바꾸고 있음
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
