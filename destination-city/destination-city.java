class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> list = new ArrayList<>();
        // for (int i=0; i<paths.size(); i++) {
        //     list.add(paths)
        // }
        for (List<String> city : paths) {
            list.add(city.get(1));
        }
        for (List<String> city : paths) {
            list.remove(city.get(0));
        }
        return list.get(0);
    }
}