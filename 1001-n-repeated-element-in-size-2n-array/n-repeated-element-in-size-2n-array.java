class Solution {
    public int repeatedNTimes(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();

for (int i = 0; i < nums.length; i++) {
    map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
}

int maxFreq = 0;
int mostRepeatedElement = -1;

for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() > maxFreq) {
        maxFreq = entry.getValue();
        mostRepeatedElement = entry.getKey();
    }
}

return mostRepeatedElement;

    }
}