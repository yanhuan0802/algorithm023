import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的前序遍历
 *
 * @author YanHuan
 * @date 2021-01-10 22:01
 */
public class PreorderTraversal {
    /**
     * 解法1.递归
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param root 二叉树
     * @return 遍历结果
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    private void preorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }

    /**
     * 解法2.迭代
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param root 二叉树
     * @return 遍历结果
     */
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return list;
    }
}
