class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        dfs1(nums, 0, track, result);
        return result;
    }

    private void dfs1(int[] nums, int index, LinkedList<Integer> track, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new LinkedList<>(track));
            return;
        }

        dfs1(nums, index + 1, track, result);

        track.offerLast(nums[index]);
        dfs1(nums, index + 1, track, result);
        track.removeLast();
    }
}