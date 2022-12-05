import os
from string import ascii_uppercase as letters

filename = "supply-stacks.txt"
here = os.path.dirname(os.path.abspath(__file__))
filepath = os.path.join(here, filename)

with open("input.txt", "r") as f:
    content = f.read().splitlines()

initial = content[:content.index("")]
masterlist = [[] for _ in range(int(initial[-1][-2]))]

for i in range(0, len(initial)-1):
    for j in range(0, len(initial[0])):
        if initial[i][j] in letters:
            temp = (j-1)//4
            masterlist[temp].append(initial[i][j])
content = content[10:]

masterlistcopy = masterlist[:]
for i in range(0, len(content)):
    temp = content[i].split(" ")
    temp = [int(x) for x in [temp[1], temp[3], temp[5]]]
    templst = (masterlist[(temp[1]-1)][:temp[0]])[::-1]
    masterlist[(temp[2]-1)] = (templst + masterlist[(temp[2]-1)])
    masterlist[(temp[1]-1)] = (masterlist[(temp[1]-1)][temp[0]:])
print("Part 1: ", end="")
for i in range(0, len(masterlist)):
    print(masterlist[i][0], end="")

masterlist = masterlistcopy[:]
for i in range(0, len(content)):
    temp = content[i].split(" ")
    temp = [int(x) for x in [temp[1], temp[3], temp[5]]]
    templst = (masterlist[(temp[1]-1)][:temp[0]])#[::-1]
    masterlist[(temp[2]-1)] = (templst + masterlist[(temp[2]-1)])
    masterlist[(temp[1]-1)] = (masterlist[(temp[1]-1)][temp[0]:])
print("\nPart 2: ", end="")
for i in range(0, len(masterlist)):
    print(masterlist[i][0], end="")