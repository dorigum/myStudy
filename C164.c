// 164번
// 후위 증감 연산자

#include <stdio.h>
int main() {
    int a = 11;

    if (a == 10)
        a--;
    else if (a > 10)
        a++;    // a=11
    else
        a+=10;

    printf("a=%d", a--); // else if에서의 후위 증감 연산자 : a=12

    // a=12

    return 0;
}