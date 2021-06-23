# python 정렬 알고리즘 : 버블 정렬(Bubble sort)

def sort(a):
    length = len(a) -1
    for i in range(length):
        for j in range(length-i):
            if a[j] > a[j+1]:  # ★버블 정렬의 핵심 코드
                a[j], a[j+1] = a[j+1], a[j]  # 앞의 수가 뒤의 수보다 크면 둘의 자리를 바꿔라
            print(a)  # (a)
        return a

ret = sort([7, 4, 5, 1, 3])
print(ret)

# i=0 : [4, 5, 1, 3, 7]
# i=1 : [4, 1, 3, 5, 7]
# i=2 : [1, 3, 4, 5, 7]
# i=3 : [1, 3, 4, 5, 7]