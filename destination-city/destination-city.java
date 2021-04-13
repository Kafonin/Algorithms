class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> city : paths) {
            set.add(city.get(1));
        }
        for (List<String> city : paths) {
            set.remove(city.get(0));
        }
        
        return set.iterator().next();
    }
}