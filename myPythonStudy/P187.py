# python 정렬 알고리즘 : 선택 정렬(Selection sort)
# 항상 최소 값의 위치를 임시변수에 저장하는 것이 선택 정렬의 특징!

def sort(a):
    for i in range(len(a)-1):
        min_idx = i
        for j in range(i+1, len(a)):
            if a[min_idx] > a[j]:  # ★선택 정렬의 핵심 코드
                min_idx = j        # 임시변수(min_idx)의 위치에 있는 값보다 작은 값이 있다면 그 값의 위치를 임시변수에 저장
            if min_idx != i:       # min_idx의 값이 변경되었다면 둘의 위치를 바꿔라
                a[i], a[min_idx] = a[min_idx], a[i]
            print(a)  # (a)
        return a

ret = sort([7, 4, 5, 1, 3])
print(ret)