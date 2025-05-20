def twoSum(nums, target):
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            if nums[i] * nums[j] == target:
                print(i, j)
                return [i, j]
    return None
            
solution = twoSum([1,2,3,4,5,6,7,8,9], 9)


def twoMult(nums, target):
    num_map = {}

    for i, num in enumerate(nums):
        if num == 0:
            if target == 0:
                for j in range(i + 1, len(nums)):
                    if nums[j] == 0:
                        return [i, j]
            continue

        complement = target / num

        if complement in num_map:
            return [num_map[complement], i]

        num_map[num] = i

    return None
            
