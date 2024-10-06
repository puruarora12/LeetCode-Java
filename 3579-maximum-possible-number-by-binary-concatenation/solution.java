class Solution {
    public int maxGoodNumber(int[] nums) {
       String[] binaryStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            binaryStrings[i] = Integer.toBinaryString(nums[i]);
        }

        Arrays.sort(binaryStrings, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        StringBuilder binaryStr = new StringBuilder();
        for (String binary : binaryStrings) {
            binaryStr.append(binary);
        }

        return Integer.parseInt(binaryStr.toString(), 2);
    }
}
