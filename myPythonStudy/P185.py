class Calculator:  # class : 클래스 선언
    def add(self, x, y):  # def : 함수 선언
        return x + y
    def mul(self, x, y):
        return x * y

cal = Calculator()
x = cal.add(10, 20)
y = cal.mul(10, 20)

print(x, y)  # 30 200