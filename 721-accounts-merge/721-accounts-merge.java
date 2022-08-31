class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, String> mailToName = new HashMap<>();
        Map<String, Set<String>> graph = new HashMap<>();
        Set<String> emails = new HashSet<>();
        Set<String> visited = new HashSet<>();
        for (List<String> account : accounts){
            String name = account.get(0);
            for (int i = 1; i < account.size(); ++i){
                String email = account.get(i);
                mailToName.put(email, name);
                emails.add(email);
                graph.putIfAbsent(email, new HashSet<>());
                if (i == 1)
                    continue;
                graph.get(email).add(account.get(i-1));
                graph.get(account.get(i-1)).add(email);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (String email : emails){
            if (visited.contains(email))
                continue;
            List<String> temp = new ArrayList<>();
            dfs(email, graph, visited, temp);
            Collections.sort(temp);
            temp.add(0, mailToName.get(email));
            res.add(temp);   
        }
        return res;
    }
    
    private void dfs(String cur, Map<String, Set<String>> graph, Set<String> visited, List<String> temp){
        if (visited.contains(cur))
            return;
        visited.add(cur);
        temp.add(cur);
        for (String email : graph.get(cur)){
            dfs(email, graph, visited, temp);
        }
    }
}