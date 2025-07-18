class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int maxPrime = 0;

        for (int i = 0; i < n; i++) {
            int d1 = nums[i][i];             // primary diagonal
            int d2 = nums[i][n - 1 - i];     // secondary diagonal

            if (isPrime(d1)) {
                maxPrime = Math.max(maxPrime, d1);
            }
            if (isPrime(d2)) {
                maxPrime = Math.max(maxPrime, d2);
            }
        }

        return maxPrime;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
