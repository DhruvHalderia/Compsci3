

public class TreeRunner
{
    public static void main(String[] args){
      Tree left = new Tree(12,new Tree(7,null,null),new Tree(13,null,null)); 
      Tree right = new Tree(18,null,new Tree(22,null,null)); 
      Tree root = new Tree(15, left, right);
      System.out.println("inOrder traversal: "+root.inOrder());
      System.out.println("inOrder traversal: "+root.postOrder());
    }
}
