def twoSum(self, nums: List[int], target: int) -> List[int]:
    my_dictionary = {}
    for idx, x in enumerate(nums):
        diff = target - x
        if diff in my_dictionary:
            return [idx, my_dictionary[diff]]
        else:
            my_dictionary[x] = idx
    return
