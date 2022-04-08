import java.util.*;
public class BinarySearchTreePrac
{
    private Comparable value; 
    private BinarySearchTreePrac left, right; 

    public BinarySearchTreePrac(Comparable x, BinarySearchTreePrac l , BinarySearchTreePrac r){
        left = l; 
        right = r; 
        value = x; 
    }

    public BinarySearchTreePrac(){
        value = 0;
    }

    public void makeTree(ArrayList<Integer> x){
        this.setValue(x.get(0)); 
        for(int i = 1; i<x.size(); i++){
            this.add(x.get(i));
        }
    }

    public void add(Comparable x){
        if(x.compareTo(value) < 0 && left == null)
            this.setLeft(new BinarySearchTreePrac(x,null,null));
        else if(x.compareTo(value) < 0)
            this.getLeft().add(x); 
        if(x.compareTo(value) > 0 && right == null)
            this.setRight(new BinarySearchTreePrac(x,null,null)); 
        else if(x.compareTo(value) > 0)
            this.getRight().add(x);
    }

    public BinarySearchTreePrac find(Comparable x){
        if(x.compareTo(value) == 0 ){
            return this; 
        }
        else if ((this.getRight() == null && this.getLeft() == null))
            return null; 
        else if (x.compareTo(value)>0 && this.getRight() != null)
            return this.getRight().find(x);
        else if (x.compareTo(value)<0 && this.getLeft() != null)
            return this.getLeft().find(x);
        return null; 
    }

    public void deleteMax(){
        if(this.getRight().getRight() == null){
            if(right.getLeft() !=null){
                BinarySearchTreePrac temp = right.getLeft();
                right = temp; 
            }
            else
                right = null; 
        }
        else 
            this.getRight().deleteMax(); 
    }

    public void deleteMin(){
        if (this.getLeft() == null && this.getRight() != null){
            BinarySearchTreePrac temp = left.getRight();
            left = temp; 
            return;
        }
        if(this.getLeft().getLeft() == null ){
            if(left.getRight() !=null){
                BinarySearchTreePrac temp = left.getRight();
                left = temp; 
            }
            else
                left = null; 
        }
        else 
            this.getLeft().deleteMin(); 
    }

    public BinarySearchTreePrac getMax(){
        if (this.getRight() != null)
            return this.getRight().getMax(); 
        return this; 
    }

    public BinarySearchTreePrac getMin(){
        if (this.getLeft() != null)
            return this.getLeft().getMin(); 
        return this;
    }

    public void delete(Comparable x){
        if(x.compareTo(value) == 0) {
            BinarySearchTreePrac temp = this.getLeft(); 
            this.setValue(this.getRight().getMin().getValue());
            if (this.getRight().getRight() != null){
                this.setRight(this.getRight().getRight());
            }
            if(this.getRight().getRight() == null) 
                this.deleteMax();
            else{
                this.getRight().deleteMin(); 
                
            }
        }
        else if(this.find(x) != null)
            this.find(x).delete(x); 
    }

    public BinarySearchTreePrac getRight(){
        return right;        
    }

    public BinarySearchTreePrac getLeft(){
        return left;        
    }

    public Comparable getValue(){
        return value; 
    }

    public void setLeft(BinarySearchTreePrac l){
        left = l; 
    }

    public void setRight(BinarySearchTreePrac r){
        right = r; 
    }

    public void setValue(Comparable x) {
        value = x;
    }

    public String toString(){
        String answer = ""; 
        if (left != null)
            answer += left.toString();
        answer+=value+" ";
        if(right !=null)
            answer+= right.toString(); 
        return answer; 
    }
}
