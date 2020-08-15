class Solution:
    def merge(self, nums1, m, nums2, n) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # Set markers for both arrays
        i = 0
        j = 0
        
        # Compare the two smallest values in both arrays to decide
        # which to append
        while i < m and j < n:
            if nums1[i] > nums2[j]:
                nums1.append(nums2[j])
                j += 1
            else:
                nums1.append(nums1[i])
                i += 1
        
        # Append the untouched part of the other array
        if i >= m:
            nums1.extend(nums2[j:])
        else:
            nums1.extend(nums1[i:m])

        # Delete the front part
        del nums1[:n+m]

    def merge2(self, nums1, m, nums2, n) -> None:
        # m and n are now array indices
        m -= 1
        n -= 1
        
        # Preform similar loop in merge, but backwards
        while n >= 0:
            if nums1[m] < nums2[n] or m < 0:
                nums1[m+n+1] = nums2[n]
                n -= 1
            else:
                nums1[m+n+1] = nums1[m]
                m -= 1
    
    
        

if __name__ == "__main__":
    n1 = [1, 2, 3, 0, 0, 0]
    n2 = [2, 5, 6]
    # n1 = [2, 0]
    # n2 = [1]
    s = Solution()
    s.merge2(n1, 3, n2, 3)
    print(n1)