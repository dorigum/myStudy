// 정보처리기사 실기
// 161번
// 배열 + 삼항 연산자

#include <stdio.h>
int main(){
    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;

    int ret1[3] = {1, 2, 3};
    int ret2[3] = {4, 5, 6};
    int ret3[3] = {7, 8, 9};

    int* ret = (a > b) ? ret1 : (c < d) ? ret2 : ret3;
    // a > b -> 10 > 20 -> F
    // c < d -> 30 < 40 -> T : ret2
    // ret2의 값인 4 5 6 출력

    for(int i=0; i<3; i++)
        printf("%d ", ret[i]);

    return 0;
}