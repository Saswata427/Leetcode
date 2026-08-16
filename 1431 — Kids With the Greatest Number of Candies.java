class Solution {
    public ListBoolean kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candy  candies) {
            maxCandies = Math.max(candy, maxCandies);
        }
        ListBoolean result = new ArrayList();
        for (int candy  candies) {
            result.add(candy + extraCandies = maxCandies);
        }

        return result;
    }
}
        