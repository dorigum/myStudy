// switch-case 문 + 후위 증감 연산자

#include <stdio.h>
int main() {
    int c = 1;

    switch(3) {  // switch(3) : case 3으로 가라는 의미
        case 1 : c += 3;
        case 2 : c++;
        case 3 : c = 0;   // c = 0
        case 4 : c += 3;  // c = c+3 : c = 3
        case 5 : c -= 10; // c = c-10 : c = -7
            break;  // switch-case문 종료, break가 없으면 아래쪽 case로 계속 진행됨
        case 6 : c++;
        default : c--;
    }
    printf("c: %d", c);  // c: -7

    return 0;
}