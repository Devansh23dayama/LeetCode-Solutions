class Solution {
    void f(int n ,int o , int c, StringBuilder s , List<String> ans){
        //Base Case
        if(o==n && c==n){
        ans.add(s.toString());
        return;
        }
        //Recursive Case

        //opening
        if(o<n){
        s.append('(');
        f(n,o+1,c,s,ans);
        //backtracking
        s.deleteCharAt(s.length()-1);
        }
        //closing
        if(c<o){
        s.append(')');
        f(n,o,c+1,s,ans);
        //backtracking
        s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        f(n,0,0,s,ans);
        return ans;
    }
}