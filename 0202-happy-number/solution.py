class Solution:
    def isHappy(self, n: int) -> bool:
        seen = set()
        while n !=1:
            if n in seen:
                return False;
            temp =0
            seen.add(n)
            for c in str(n):
                temp = temp+ int(c)**2
            n=temp
        
        if n==1:
            return True
        else:
            return False

        
