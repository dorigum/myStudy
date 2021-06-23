# 조건문 (if-elif-else)

a = 11

if a == 10:
    a -= 2
elif a > 10:  # a의 조건에 부합
    a += 2    # a = a+2 -> a = 13
else:
    a = 100

print('a:', a)  # a: 13