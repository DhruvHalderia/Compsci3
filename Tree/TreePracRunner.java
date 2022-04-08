
public class TreePracRunner
{
   public static void main(String[] args){
   TreePrac left = new TreePrac(80,new TreePrac(70,null,null), new TreePrac(85,null,null)); 
   TreePrac right = new TreePrac(100, new TreePrac(98,null,null), new TreePrac(120,null,null)); 
   TreePrac root = new TreePrac(90, left, right);
   System.out.println("IN ORDER\n"+root.inOrder()+"\n");
   System.out.println("PRE ORDER\n"+root.preOrder()+"\n");
   System.out.println("POST ORDER\n"+root.postOrder()+"\n");
   System.out.println("REVERSE ORDER\n"+root.reverseOrder()+"\n");
   System.out.println("\nTree height is "+root.getHeight());
   System.out.println("Tree Width is "+root.getWidth());
   System.out.println("Number of Leaves is "+root.getNumLeaves());
   System.out.println("Number of Nodes is "+root.getNumNodes());
   System.out.println("Number of levels is: "+root.getNumLevels() );
   System.out.println(root);
   if(root.isFull())
   System.out.println("The tree is full");
   else 
   System.out.println("The tree is not full");
 }
}
