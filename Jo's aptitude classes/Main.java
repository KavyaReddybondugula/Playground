def gcd(a,b):
	if (a == 0):
		return b; 
	return gcd(b % a, a); 
a=int(input())
b=int(input())
c=int(input())
d=int(input())
result=gcd(a,gcd(b,c))
if d==result:
  print("Answer is correct.")
else:
  print("Answer is wrong.")

