# python 정렬 알고리즘 : 삽입 정렬(Insertion sort)
# a[j+1] = a[j] : 오른쪽에 왼쪽 값을 넣는다 (우측으로 쉬프트하라!)

def sort(a):
    for i in range(1, len(a)):
        j = i-1
        key = a[i]
        while a[j] > key and j >= 0:
            a[j+1] = a[j]  # 앞의 값을 한 칸 뒤로(우측으로) 이동시키는 쉬프트(Shift)의 의미가 있음 -> ★삽입 정렬의 핵심 코드
            j = j-1
        a[j+1] = key
        print(a)  # (a)
    return a

ret = sort([7, 4, 5, 1, 3])
print(ret)