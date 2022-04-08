
import java.util.LinkedList;

public class CustomList
{
    private String theValue; 
    private CustomList next;
    public CustomList(String x)
    { 
        theValue = x;
        next = null;
    }

    public CustomList(String x, CustomList y){
        theValue = x; 
        next = y; 
    }

    public void setData(String x){
        theValue = x;
    }

    public void setNext(CustomList x){
        next = x; 
    }

    public void add(String x){
        CustomList temp = this;
        while(temp.getNext() != null){
            temp = temp.getNext();
        } 
        temp.setNext(new CustomList(x));
    }

    public void add(int num ,String x){
        int counter= 0; 
        if (num == 0){
            CustomList n = new CustomList(theValue, next);
            this.setData(x);
            this.setNext(n);
        }
        else{ 
            CustomList temp = this.getNext(); 
            CustomList prev = this;
            while(num-1>counter){
                temp = temp.getNext();
                prev= prev.getNext();
                counter++;
            }
            CustomList n = new CustomList(temp.getData(), temp.getNext()); 
            temp.setData(x);
            temp.setNext(n); 
            prev.setNext(temp); 
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
            CustomList temp = this;
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
        CustomList temp = this;
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
        CustomList temp = this;
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
        }
        else{
            CustomList temp = this; 
            int counter = 0; 
            while(counter < x){
                temp = temp.getNext();  
                counter++;
            }
            temp.setData(temp.getNext().getData());
            temp.setNext(temp.getNext().getNext());
        }
    }

    public CustomList getNext(){
        return next; 
    }

    public String toString(){
        String ans = "CustomList = ";  
        CustomList temp = this; 
        while(temp.getNext()!=null){
            ans+= temp.getData()+" ";
            temp = temp.getNext();
        }
        return ans +""+temp.getData();
    }
}
