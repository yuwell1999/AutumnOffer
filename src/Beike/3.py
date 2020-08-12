N = int(input())
huo = 0
inp = [int(n) for n in input().split()]

for i in inp:
    huo = i | huo

low = 0
high = 0
ans = pow(10, 9) + 1
tmp = 0
while high < len(inp):
    tmp |= inp[high]
    if tmp != huo:
        high += 1
    else:
        ans = min(ans, high + 1 - low)
        low += 1
        high = low
        tmp = 0
print(ans)
