class Solution:
    def arrangeCoins(self, n: int) -> int:
        c=0
        for i in range (1,n+1):
            n=n-i
            if n>=0:
                c+=1
            else:
                break
        return c
        
            
        
