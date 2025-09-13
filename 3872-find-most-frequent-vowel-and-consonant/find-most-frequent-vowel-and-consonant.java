class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int maxVowelFreq = 0;
        int maxConsonantFreq = 0;

        // Separate max frequency for vowels and consonants
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            if (vowels.contains(ch)) {
                maxVowelFreq = Math.max(maxVowelFreq, freq);
            } else if (Character.isLetter(ch)) {
                maxConsonantFreq = Math.max(maxConsonantFreq, freq);
            }
        }

        return maxVowelFreq + maxConsonantFreq;
    }
}