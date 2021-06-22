int main(){
    char * a[5] = {"한국", "일본", "중국", "미국", "러시아"};

    a[1] = "베트남";
    a[3] = "캐나다";

    for(int i=0; i<5; i++)
        printf("%s ", a[i]);

    return 0;
}