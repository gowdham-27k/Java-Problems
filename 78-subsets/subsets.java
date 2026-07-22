class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>a=new ArrayList<>();
        a.add(new ArrayList<>());
        for(int n:nums){
            int d=a.size();
            for(int i=0;i<d;i++){
                List<Integer>y=new ArrayList<>(a.get(i));
                y.add(n);
                a.add(y);


            }
        }return a;
    }
}