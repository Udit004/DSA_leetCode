class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrace(n,k,1,new ArrayList<>(), result);
        return result;
    }

    private void backtrace(int n,int k,int start, List<Integer> current, List<List<Integer>> result){
        if(current.size() == k){
            result.add(new ArrayList<>(current));
            return ;
        }
        for(int i=start; i<=n; i++){
            current.add(i);
            backtrace(n,k,i+1,current,result);
            current.remove(current.size() - 1);
        }
    }

}