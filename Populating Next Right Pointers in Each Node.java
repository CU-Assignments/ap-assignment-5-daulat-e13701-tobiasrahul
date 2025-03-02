class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        Node leftMost = root;

        while (leftMost.left != null) {
            Node currNode = leftMost;

            while (currNode != null) {
                currNode.left.next = currNode.right;
                if (currNode.next != null) {
                    currNode.right.next = currNode.next.left;
                }
                currNode = currNode.next;
            }

            leftMost = leftMost.left;
        }

        return root;
    }
}
