# python 자료형 : 튜플, 인덱싱, 슬라이싱

a = ('한국', '중국', '일본')

print(a[0])   # (a) -> 한국
print(a[1:])  # (b) -> ('중국', '일본') : 튜플은 소괄호로 묶여서 출력된다

a[1] = '미국'  # (c) -> TypeError: 'tuple' object does not support item assignment
# 오류 발생 : 추가, 삭제, 변경 등이 불가능한 [읽기 전용] 객체
print(a)