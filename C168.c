// 반복문 안에 switch-case 문
// Q. 다음 C코드의 출력 결과로 출력되는 "두번째" 라인을 쓰시오.

#include <stdio.h>
int main() {
    for (int i=2; i<10; i++) {  // 구구단의 3단과 7단이 출력되는 코드
        switch (i) { // i는 3, 7
        case 3:
        case 7:
             for (int j=1; j<10; j++) {  // j는 1부터 9까지 반복
                 printf("%d * %d = %d\n", i, j, i*j);  // 3 * 1 = 3 ... 7 * 9 = 63 
            }
            break;
        default:
            continue;
        }
    }
    return 0;

    // 답 : 3 * 2 = 6
}