import random
# •Generate a list of random size between 1 and 15, inclusive
randSize = random.randint(1,15)
randList =[]

for i in range(1,randSize+1):
    randList.append(i)
print(randList)
# •Populate that list with all numbers in the list size included (not including 0)
# •Example: if the list is size 5, the list should be [1, 2, 3, 4, 5]'
# •Remove a random number from that list
removeNum = random.randint(1,randSize)
print("remove:"+ str(removeNum))
for x in range(1, randSize+1):
    if x == removeNum:
        randList.remove(x)
    else:
        continue
    # •Print the list with the random number removed
print("List with removed number: " + str(randList))
# •Write a function that will iterate through the list, determine the missing number, and add it back to the list
def missingNumber():
    for i in range(1,randSize):
        if i not in randList:
            randList.insert(i-1, i)
# •Your code MUST determine which number is missing without using whatever mechanism you used to remove the number
# •Print the list with the number added back in
missingNumber()
print("List with removed number returned: " + str(randList))
# •The list must be in order
