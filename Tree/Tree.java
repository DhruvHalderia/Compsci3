

public class Tree
{ 
    private int num; 
    private Tree right, left; 
    
    public Tree(int n, Tree l, Tree r){
     num = n; 
     right = r; 
     left = l; 
    }
    
    public Tree getRight(){
      return right;   
    }
    
    public Tree getLeft(){
        return left; 
    }
    
    public int getValue(){
        return num; 
    }
    
    public String inOrder(){
      String answer = ""; 
      if (left != null)
         answer += left.inOrder();
      answer+=num+" ";
      if(right !=null)
         answer+= right.inOrder(); 
      return answer; 
    }
    
    
    public String postOrder(){  
      String answer = ""; 
      if (left != null)
         answer += left.postOrder();
      if(right !=null)
         answer+= right.postOrder(); 
      answer+=num+" ";
      return answer;    
    }
}
