class Solution:
    def removeElement(self, nums: list, val: int) -> int:
        i = 0
        while i < len(nums):
            if nums[i] == val:
                del nums[i]
                i -= 1
            i += 1
        return len(nums)

    @staticmethod
    def swap(nums: list, i1: int, i2: int) -> list:
        nums[i1] += nums[i2]
        nums[i2] = nums[i1] - nums[i2]
        nums[i1] -= nums[i2]
        return nums

    def removeElement2(self, nums: list, val: int) -> int:
        i = 0
        while i < len(nums):
            if nums[i] == val:
                while True:
                    self.swap(nums, i, -1)
                    if nums[i] != 3:
                        break
                    nums = nums[:-1]
                nums = nums[:-1]
            i += 1
        return len(nums)

    def removeElement3(self, nums: List[int], val: int) -> int:
        # Current Start Index?
        start = 0
        end = len(nums) - 1
        while(start < end):
            if nums[start] == val:
                if nums[end]!= val:
                    nums[end],nums[start] = nums[start],nums[end]
                    start += 1 #loop
                    end -=  1 #loop
                    nums.remove(val)
                else:
                    end -= 1 #end variable
                    nums[end],nums[start] = nums[start],nums[end]
                    start += 1
                    #end -= 1
                    nums.remove(val)
            else:
                start += 1
                end -= 1
        if nums:
            count_rem = nums.count(val)
            accumulator = 0
            while accumulator < count_rem:
                nums.remove(val)
                accumulator += 1
                

if __name__ == "__main__":
    nums = [3, 2, 2, 3]
    s = Solution()
    print(s.removeElement2(nums, 3))
    print(nums)