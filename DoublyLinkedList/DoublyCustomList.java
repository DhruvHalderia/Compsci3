
import java.util.LinkedList;

public class DoublyCustomList
{
    private String theValue; 
    private DoublyCustomList next, prev;

    public DoublyCustomList(String x)
    { 
        theValue = x;
        next = null;
        prev = null;
    }

    public DoublyCustomList(String x, DoublyCustomList y, DoublyCustomList b){
        theValue = x; 
        next = y; 
        prev = b;
    }

    public DoublyCustomList getPrev(){
        return prev;
    }

    public void setPrev(DoublyCustomList x){
        prev = x;
    }

    public void setData(String x){
        theValue = x;
    }

    public void setNext(DoublyCustomList x){
        next = x; 
    }

    public void add(String x){
        DoublyCustomList temp = this;
        while(temp.getNext() != null){
            temp = temp.getNext();
        } 
        temp.setNext(new DoublyCustomList(x,null,temp));
    }

    public void add(int num ,String x){
        int counter= 0; 
        if (num == 0){
            DoublyCustomList n = new DoublyCustomList(theValue, next,prev);
            this.setData(x);
            this.setNext(n);
            this.getNext().getNext().setPrev(n);
            this.getNext().setPrev(this);
            this.setPrev(null);
        }
        else{ 
            DoublyCustomList temp = this.getNext(); 
            DoublyCustomList prev = this;
            while(num-1>counter){
                temp = temp.getNext();
                prev= prev.getNext();
                counter++;
            }
            DoublyCustomList n = new DoublyCustomList(temp.getData(), temp.getNext(),temp); 
            temp.setData(x);
            temp.getNext().setPrev(n);
            temp.setNext(n); 

        }
    }

    public String getData(){
        return theValue;   
    }

    public void set(int num ,String x){
        if(num == 0){
            theValue = x; 
        }
        else {
            DoublyCustomList temp = this;
            int counter  = 0; 
            while (counter < num)
            {
                temp = temp.getNext(); 
                counter++;
            }
            temp.setData(x);
        }

    }

    public String get(int x){
        DoublyCustomList temp = this;
        int counter  = 0; 
        while (counter < x)
        {
            temp = temp.getNext(); 
            counter++;
        } 

        return temp.getData(); 
    }

    public int size(){
        int counter = 1;
        DoublyCustomList temp = this;
        while(temp.getNext() != null){
            temp = temp.getNext();
            counter++;
        } 
        return counter;
    }

    public void remove(int x){
        if(x == 0){
            this.setData(next.getData());
            this.setNext(next.getNext());
            next.setPrev(this);
        }
        else{
            DoublyCustomList temp = this; 
            int counter = 0; 
            while(counter < x){
                temp = temp.getNext();  
                counter++;
            }
            temp.setData(temp.getNext().getData());
            temp.setNext(temp.getNext().getNext());
            temp.setPrev(temp.getPrev());
            if(temp.getNext() != null)
                temp.getNext().setPrev(temp);
        }
    }

    public DoublyCustomList getNext(){
        return next; 
    }

    public String reverse(){
        String ans = "CustomList = ";  
        DoublyCustomList temp = this; 
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }

        while(temp.getPrev() != null){
            ans += temp.getData()+" ";  
            temp = temp.getPrev();
        }
        return ans +""+temp.getData(); 
    }

    public String toString(){
        String ans = "CustomList = ";  
        DoublyCustomList temp = this; 
        while(temp.getNext()!=null){
            ans+= temp.getData()+" ";
            temp = temp.getNext();
        }
        return ans +""+temp.getData();
    }
}
