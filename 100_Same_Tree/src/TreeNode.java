/**
 * @author Sparklemax
 * @date 2019/8/3 20:57
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x){
        val = x;
    }

    /*
    * 创建测试数据
    * 格式【1.2.3.4】
    *
    * */

    public static TreeNode createTreeNode(String data){
        if(data.equals("[]"))
            return null;
        data = data.substring(1,data.length()-1);
        String[] split = data.split(",");
        int len = split.length;
        TreeNode[] treeNodes = new TreeNode[len];
        data = data.substring(1,data.length()-1);
        for (int i = 0; i < len; i++) {
            if(!split[i].equals("null")){
                treeNodes[i] = new TreeNode(Integer.valueOf(split[i]));
            }
        }
        for (int i = 0; i < len; i++) {
            if(treeNodes[i]!=null){
                int leftIndex = i*2+1;
                if(leftIndex < len){
                    treeNodes[i].left = treeNodes[leftIndex];
                }
                int rightIndex = leftIndex+1;
                if(rightIndex<len){
                    treeNodes[i].right = treeNodes[rightIndex];
                }
            }
        }
        return treeNodes[0];
    }

    private static final String space = "      ";

    public void printSpace(int count){
        for (int i = 0; i < count; i++) {
            System.out.println(space);
        }
    }

    public void printNode(int val){
        StringBuilder res = new StringBuilder(val + "<");
        int spaceNum = space.length() - res.length();
        for (int i = 0; i < spaceNum; i++) {
            res.append(" ");
        }
        System.out.println(res);
    }


    public void print(TreeNode root){
        print(root,0);
    }

    public void print(TreeNode node , int depth){
        if(node == null){
            printSpace(depth);
            System.out.println("#");
            return;
        }
        print(node.right,depth+1);
        printSpace(depth);
        printNode(node.val);
        print(node.left,depth+1);
    }



}
