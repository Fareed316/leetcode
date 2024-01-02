class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic = {}
        # traverse the list
        for i,num in enumerate(nums):
            # check if the target-num is in the dictionary  
            if target-num in dic:
                # return the value of the dictionary along with the current index
                return [dic[target-num],i]
            dic[num] = i
        