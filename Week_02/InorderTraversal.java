
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的中序遍历
 *
 * @author YanHuan
 * @date 2021-01-10 21:49
 */
public class InorderTraversal {

    /**
     * 解法1 递归
     * 时间复杂度: O(n)
     * 空间复杂度：O(n)
     *
     * @param root 二叉树
     * @return 遍历结果
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }


    /**
     * 解法2 迭代
     * 时间复杂度: O(n)
     * 空间复杂度：O(n)
     *
     * @param root 二叉树
     * @return 遍历结果
     */
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
