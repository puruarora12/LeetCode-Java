class Solution:
    def hasGroupsSizeX(self, deck: List[int]) -> bool:
        col = collections.Counter(deck)
        values = list(col.values())
        values.sort()
        print(values)
        if values[0]<2:
            return False
        print("till here")
        i =2
        bol=True
        while i <=values[0]:
            bol =True
            for j in values:
                
                if j%i!=0:
                    bol=False
                    continue
                    
            i=i+1
            if bol==True:
                return True
        return False
        
