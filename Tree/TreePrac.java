
public class TreePrac
{
    private int value; 
    private TreePrac left, right; 

    public TreePrac(int n, TreePrac l, TreePrac r){
        value = n; 
        left = l; 
        right = r;   
    }

    public TreePrac getRight(){
        return right; 
    }

    public TreePrac getLeft(){
        return left; 
    }

    public int getValue(){
        return value; 
    }

    public void setValue(int x){
        value = x;
    }

    public String inOrder(){
        String answer = ""; 
        if (left != null)
            answer += left.inOrder();
        answer+=value+" ";
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
        answer+=value+" ";
        return answer;    
    }

    public String preOrder(){
        String answer = "";
        answer+=value+" ";
        if (left != null)
            answer += left.preOrder();
        if(right !=null)
            answer+= right.preOrder();
        return answer; 
    }

    public String reverseOrder(){
        String answer = ""; 
        if (right != null)
            answer += right.reverseOrder();
        answer+=value+" ";
        if(left !=null)
            answer+= left.reverseOrder(); 
        return answer; 
    }

    public int getHeight(){
        int leftAns = 0;
        int rightAns = 0;
        if (this.getRight() !=null){
            rightAns++; 
            rightAns+=right.getHeight();
        }
        if(this.getLeft() != null){
            leftAns++; 
            leftAns+=left.getHeight();
        }
        if(leftAns > rightAns)
            return leftAns; 
        else 
            return rightAns;
    }

    public int getWidth(){
        int leftAns = 0;
        int rightAns = 0;
        if (this.getRight() !=null){
            rightAns++; 
            rightAns+=right.getHeight();
        }
        if(this.getLeft() != null){
            leftAns++; 
            leftAns+=left.getHeight();
        }
        return leftAns + rightAns+1; 
    }

    public int getNumLeaves(){
        int ans = 0; 
        if(this.getRight() == null && this.getLeft() == null)
            ans++;
        if (this.getRight() != null)
            ans+= right.getNumLeaves(); 
        if (this.getLeft() !=null)
            ans+= left.getNumLeaves(); 
        return ans;  
    }

    public int getNumNodes(){
        int ans = 0; 
        if (this.getLeft() != null)
            ans += left.getNumNodes();
        if (this.getRight() != null)
            ans += right.getNumNodes();
        return ans+1;  
    }

    public boolean isFull(){
        boolean leftAns = true;
        boolean rightAns = true; 
        if (this.getRight() != null) {
            rightAns = right.isFull(); 
        }
        if (this.getLeft() != null){
            leftAns = left.isFull(); 
        }
        if (this.getLeft() !=null && this.getRight() == null)
            return false; 
        else if (this.getRight() !=null && this.getLeft() == null)
            return false; 
        else if (rightAns == true && leftAns == true)
            return true; 
        return false; 
    }

    public int getNumLevels(){
        return this.getHeight()+1; 
    }

    public String toString(){
        return "Tree as a string "+this.inOrder();   
    }
}
