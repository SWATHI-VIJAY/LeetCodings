class Solution {
    public int lengthAfterTransformations(String s, int t) {
        final int MOD = 1_000_000_007;
        int[] freq = new int[26]; 
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int step = 0; step < t; step++) {
            int[] nextFreq = new int[26];
            for (int i = 0; i < 26; i++) {
                if (freq[i] == 0) continue;
                if (i == 25) { 
                    nextFreq[0] = (nextFreq[0] + freq[i]) % MOD; 
                    nextFreq[1] = (nextFreq[1] + freq[i]) % MOD; 
                } else {
                    nextFreq[i + 1] = (nextFreq[i + 1] + freq[i]) % MOD;
                }
            }
            freq = nextFreq;
        }
        int total = 0;
        for (int count : freq) {
            total = (total + count) % MOD;
        }

        return total;
    }
}
