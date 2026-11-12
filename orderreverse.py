s=input("enter a string:")
words=s.split()
res=[]
i=len(words)-1

while i >= 0:
    res.append(words[i])
    i -= 1

print(" ".join(res))

sample input: i love cats
output:cats love i
