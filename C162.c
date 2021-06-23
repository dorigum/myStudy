// 163번
// 삼항 연산자

#include <stdio.h>
int main() {
    int a = 10;

    int b = (a >= 10) ? a+5 : a-5;  // T : b = a+5 = 15

    int c = (b != 15) ? b+10 : b-10;  // F : c = b-10 = 5 

    printf("b=%d, c=%d", b, c);  // b=15, c=5 출력

    return 0;   // b=15, c=5
}