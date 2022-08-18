class Solution {
   public  int minSetSize(int[] arr) {
    Map<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
    for(int i : arr){
      map.put(i,map.getOrDefault(i,0) + 1);
    }
    int removals = 0;
    int count = 0;
    List<Integer> list = new ArrayList<>();
    for(Integer value : map.values()){
      list.add(value);
    }
    Collections.sort(list, Collections.reverseOrder());
    for(Integer value : list){
      if(removals >= arr.length/2){
        return count;
      }
      removals = removals + value;
      count++;
    }
    return count;
  }
}