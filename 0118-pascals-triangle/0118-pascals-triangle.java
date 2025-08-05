class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        for(int i=1;i<numRows;i++)
        {
            List<Integer> row=ans.get(i-1);
            List<Integer> prow=new ArrayList<>();
            prow.add(0);
            for(int j:row)
            {
                prow.add(j);
            }
            prow.add(0);
            ArrayList<Integer> nrow=new ArrayList<>();
            for(int k=0;k<prow.size()-1;k++)
            {
                nrow.add(prow.get(k)+prow.get(k+1));
            }
            ans.add(nrow);
        }
        return ans;
        
    }
}