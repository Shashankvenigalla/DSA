def kadanesAlgorithm(a):
    currentSum = 0
    maxSum = float('-inf')
    for i in a:
        currentSum += i
        if currentSum <= 0:
            currentSum = 0
        maxSum = max(maxSum, currentSum)
    return maxSum

a = [-2,-3,4,-1,-2,1,5,-3]
maxSum = kadanesAlgorithm(a)
print(maxSum)