class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        first = -1
        last = -1
        searchlist=[]
        for i in range(0,len(nums)) : 
            if (target != nums[i]) : 
                continue
            if (first == -1) : 
                first = i 
            last = i 
        searchlist.append(first)
        searchlist.append(last)
        return searchlist
        
         
