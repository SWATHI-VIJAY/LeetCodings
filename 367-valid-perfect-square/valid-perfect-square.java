class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        int low = 2, high = num / 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long power = (long) mid * mid;
            if (power == num)
                return true;
            else if (power < num)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}