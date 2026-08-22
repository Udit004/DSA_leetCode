class Solution {
    static int findTotal(int n) {

        int sum = 0;
        int prod = 1;

        while (n > 0) {

            int num = n % 10;
            sum += num;
            prod *= num;
            n /= 10;
        }
        int total = sum + prod;

        return total;
    }
    public boolean checkDivisibility(int n) {

        if (n == 0) {
            return true;
        }

        int res = findTotal(n);

        if (n % res == 0) {
            return true;
        }
        
        return false;
    }
}