import javax.xml.bind.Element;

public class Stack<T> {
    private StackNode<T> tailNode;
    private int size;

    public Stack(){
        size = 0;
        tailNode = new StackNode<T>();
    }
    public boolean isEmpty(){
//returns if there is nothing in the stack
        return size==0;
    }
    public int size(){
//returns number of nodes
        return size;
    }
    public T peek(){//look at the top element without removing

        return tailNode.get_data();

    }
    public void push(T element){ //add a new node to the top of the stack
//moves to last node
        //Creates a new node with data
        StackNode<T> newNode = new StackNode<T>(element);
        tailNode.set_next(newNode);
        newNode.set_prev(tailNode);
        tailNode = newNode;
        //adds 1 to size
        size++;
    }

    public T pop(){//remove and return the top element
//moves to last node
        StackNode<T> currNode = tailNode;
            tailNode=currNode.getPrev();
        size--;

        return currNode.get_data();
    }
}

