a = ['한국', '중국', '일본', '러시아', '태국']
a.append('호주')  # 리스트의 맨 뒤에 요소 추가 -> ['한국', '중국', '일본', '러시아', '태국', '호주']
a.insert(1, '미국')  # a[1] 위치에 요소 삽입, 기존 요소는 쉬프트 -> ['한국', '미국', '중국', '일본', '러시아', '태국', '호주']
a.remove('일본')  # 요소 제거 -> ['한국', '미국', '중국', '러시아', '태국', '호주']

print(a[1:4])  # a에서 첫번째 인덱스~(4-1)인덱스 값까지 출력 -> ['미국', '중국', '러시아']
# 주의!!!
# a[1:4] : 1~(4-1)까지 -> 네번째 값 까지 아님!!!!