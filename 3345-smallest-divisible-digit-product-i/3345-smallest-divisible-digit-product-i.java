class Solution {
    static int product(int n){
        int mul = 1;
        while(n>0){
            mul *= n%10;
            n /= 10;
        }
        return mul;
    }

    public int smallestNumber(int n, int t) {
        while(product(n) % t != 0){
            n++;
        }
        return n;
    }
}