/**
 * @author Sparklemax
 * @date 2019/8/9 16:32
 */

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        val = x;
    }

    public static TreeNode createTreeeNode(String data){
        if(data.equals("[]"))
            return null;
        data = data.substring(1,data.length()-1);
        String[] split = data.split(",");
        int len = split.length;
        TreeNode[] treeNodes = new TreeNode[len];
        data = data.substring(1,data.length()-1);
        for (int i = 0; i < len; i++) {
           if(!split[i].equals("null"))
               treeNodes[i] = new TreeNode(Integer.valueOf(split[i]));
        }
        for (int i = 0; i < len; i++) {
            if(treeNodes[i]!=null){
                int leftIndex = i*2+1;
                if(leftIndex<len)
                    treeNodes[i].left = treeNodes[leftIndex];
                int rightIndex = leftIndex+1;
                if(rightIndex<len)
                    treeNodes[i].right = treeNodes[rightIndex];
            }
        }
        return treeNodes[0];
    }

    private static final String space = "      ";

    public static void print(TreeNode root) {
        print(root, 0);
    }

    private static void print(TreeNode node, int deep) {
        if (node == null) {
            printSpace(deep);
            System.out.println("#");
            return;
        }
        print(node.right, deep + 1);
        printSpace(deep);
        printNode(node.val);
        print(node.left, deep + 1);
    }

    private static void printSpace(int count) {
        for (int i = 0; i < count; i++) {
            System.out.printf(space);
        }
    }

    private static void printNode(int val) {
        StringBuilder res = new StringBuilder(val + "<");
        int spaceNum = space.length() - res.length();
        for (int i = 0; i < spaceNum; i++) {
            res.append(" ");
        }
        System.out.println(res);
    }
}
