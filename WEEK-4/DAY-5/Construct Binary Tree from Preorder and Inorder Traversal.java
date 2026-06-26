class Solution {
    int preIdx = 0;
    Map<Integer, Integer> inMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) inMap.put(inorder[i], i);
        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int left, int right) {
        if (left > right) return null;
        int val = preorder[preIdx++];
        TreeNode node = new TreeNode(val);
        node.left = build(preorder, left, inMap.get(val) - 1);
        node.right = build(preorder, inMap.get(val) + 1, right);
        return node;
    }
}
