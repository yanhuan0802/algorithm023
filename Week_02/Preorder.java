import java.util.*;

/**
 * N叉树的前序遍历
 *
 * @author YanHuan
 * @date 2021-01-10 23:28
 */
public class Preorder {

    /**
     * 解法1：递归
     * 时间复杂度：O(M)  M为节点个数
     * 空间复杂度：O(M)
     *
     * @param root N叉树
     * @return 遍历结果
     */
    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    private void preorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        for (Node child : root.children) {
            preorder(child, list);
        }
    }

    /**
     * 解法2：迭代
     * 时间复杂度：O(M)  M为节点个数
     * 空间复杂度：O(M)
     *
     * @param root N叉树
     * @return 遍历结果
     */
    public List<Integer> preorder1(Node root) {
        if (root == null) {
            return Collections.emptyList();
        }
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.add(node.val);
            //将所有子节点逆序推入栈中，这样就保证了下一个遍历到的节点出现在栈顶的位置，即保证前序遍历
            Collections.reverse(node.children);
            stack.addAll(node.children);
        }
        return output;
    }
}
