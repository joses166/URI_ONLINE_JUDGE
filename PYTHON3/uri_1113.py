a, b = input().split(" ")
a = int(a)
b = int(b)

while a != b:
  if a > b:
    print("Decrescente")
  else:
    print("Crescente")

  a, b = input().split(" ")
  a = int(a)
  b = int(b)
  