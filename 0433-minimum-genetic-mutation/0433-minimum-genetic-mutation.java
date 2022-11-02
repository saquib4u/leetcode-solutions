class Solution {
    public int minMutation(String start, String end, String[] bank) {
        char[] mutations = {'A', 'C', 'G', 'T'};
        Set<String> seen = new HashSet<>();
        Queue<String> queue = new ArrayDeque<>();
        Set<String> validMutations = new HashSet<>();
        int count = 0;
        queue.offer(start);
        for (String str: bank)
            validMutations.add(str);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                String currentMutation = queue.poll();
                
                if (currentMutation.equals(end))
                    return count;
                
                char[] mutationArr = currentMutation.toCharArray();
                for (int j = 0; j < mutationArr.length; j++) {
                    char old = mutationArr[j];
                    for (char change: mutations) {
                        mutationArr[j] = change;
                        String newMutation = new String(mutationArr);
                        if (seen.add(newMutation) && validMutations.contains(newMutation))
                            queue.offer(newMutation);
                    }
                    mutationArr[j] = old;
                }
            }
            
            count++;
        }
        
        return -1;
    }
}