// 정보처리기사 실기
// 159번
// 배열에 접근하는 방법
// 한국 베트남 중국 캐나다 러시아

int main(){
    char * a[5] = {"한국", "일본", "중국", "미국", "러시아"};

    a[1] = "베트남";
    a[3] = "캐나다";

    for(int i=0; i<5; i++)
        printf("%s ", a[i]);

    return 0;
}