class Solution {
    public List<Integer> helper(TreeNode root,List<Integer> list){
        if(root==null) return list;

        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);

        return list;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        return helper(root,list);
    }
}
