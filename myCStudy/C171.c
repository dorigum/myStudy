// 선택 정렬 (Selection sort)

// i=0 : 1 4 5 7 3
// i=1 : 1 3 5 7 4 
// i=2 : 1 3 4 7 5
// i=3 : 1 3 4 5 7

#include <stdio.h>
void sort(int a[]) {
    int n = 5;

    for (int i=0; i<n-1; i++) {
        int min = i;    // 바깥쪽 반복문 시작 시 min에 현재 반복문 조건 값 저장

        for (int j=i+1; j<n; j++) {
            if (a[j] < a[min]) {    // 어떤 일이, 저장되어 있는 최소값보다 작다면
                min = j;            // 최소값을 그 값으로 바꾸라는 의미
            }
        }

        if (min != i) {
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
        }
        
        for (int x=0; x<5; x++) {
            printf("%d ", a[x]);    // (a)
        }
        printf("\n");
    }
}
    int main() {
        int a[] = {7, 4, 5, 1, 3};
        sort(a);

        return 0;
}