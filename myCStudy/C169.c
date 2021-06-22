// 정렬 알고리즘
// 버블 정렬(Bubble sort)

// i=0 (첫번째 루프) : 4 5 1 3 7
// i=1 (두번째 루프) : 4 1 3 5 7
// i=2 (세번째 루프) : 1 3 4 5 7
// i=3 (네번째 루프) : 1 3 4 5 7

#include <stdio.h>
void align(int a[]) {
    int temp;
    for (int i=0; i<4; i++) {
        for(int j=0; j<4; j++) {
            if(a[j] > a[j+1]) { // 앞의 값이 뒤의 값보다 크다면
                temp = a[j];    // 임시 변수에 앞의 값을 넣고,
                a[j] = a[j+1];  // 앞의 자리에 뒤의 값을 넣고,
                a[j+1] = temp;  // 뒤의 자리에 임시 변수 값을 넣는다.
            }                   // -> 앞의 자리와 뒤의 자리 숫자를 바꾸고 있음
        }

        for (int x=0; x<5; x++) {
            printf("%d ", a[x]); // (a)
        }
        printf("\n");
    }
}

int main() {
    int a[] = {7, 4, 5, 1, 3};
    align(a);

    return 0;
}