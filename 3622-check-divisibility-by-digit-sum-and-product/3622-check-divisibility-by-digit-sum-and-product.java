class Solution {
    int findTotal(int n) {
        int sum = 0;
        int product = 1;

        while(n>0) {
            int num = n%10;
            sum += num;
            product *= num;
            n /= 10;
        }

        return product + sum;
    }
    public boolean checkDivisibility(int n) {
        if(n == 0) {
            return true;
        }

        int total = findTotal(n);

        if(n % total == 0) {
            return true;
        }
        return false;
    }
}