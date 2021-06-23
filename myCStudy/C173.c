// 삽입 정렬 (Insertion sort)

// i=0 : 4 7 5 1 3
// i=1 : 4 5 7 1 3
// i=2 : 1 4 5 7 3
// i=3 : 1 3 4 5 7

#include <stdio.h>
void sort(int a[]) {
    int n = 5;

    for (int i=1; i<n; i++) {
        int key = a[i];
        int j = i-1;

        while (j>=0 && a[j]>key) {
            a[j+1] = a[j];   // 뒤의 값을 앞의 값으로 바꿔라 -> 우측으로 쉬프트(Shift) 하라는 의미! : ★삽입 정렬의 특징
            j--;
        }
        a[j+1] = key;

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