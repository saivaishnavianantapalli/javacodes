public class SubArray{
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> a) {
        int maxEndingHere = a.get(0);
        int maxSoFar = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            maxEndingHere = Math.max(a.get(i), a.get(i) + maxEndingHere);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
