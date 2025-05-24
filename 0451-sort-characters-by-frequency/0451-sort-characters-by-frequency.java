class Solution {
    public String frequencySort(String s) {
         // Step 1: Count frequency of each character
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Use a priority queue (max heap) to sort characters by frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freqMap.entrySet());

        // Step 3: Build the result string
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}