import java.util.Objects;
public class StackNode<T> {
    private T data;
    private StackNode<T> prev;
    private StackNode<T> next;

    public StackNode(){
        prev = null;
        next = null;
    }
    public StackNode(T Data){
        this.data =Data;
    }
    public StackNode(T data, StackNode<T> prev, StackNode<T> next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    public T get_data(){
        return data;
    }
    public StackNode<T> getPrev(){
        return prev;
    }
    public StackNode<T> getNext(){
        return next;
    }
    public void set_data(T data){
         this.data = data;
    }
    public void set_prev(StackNode<T> prev){
         this.prev = prev;
    }
    public void set_next(StackNode<T> next){
         this.next = next;
    }

    public String toString(){
        return "StackNode: "+ data;
    }

    @Override // Inteli J did this for me, but it is overriding the .equals method
    public boolean equals(Object o) {
        if (this == o) return true; // if they have the same memory location
        if (o == null || getClass() != o.getClass()) return false;
        StackNode<?> stackNode = (StackNode<?>) o;
        return Objects.equals(data, stackNode.data) &&
                Objects.equals(prev, stackNode.prev) &&
                Objects.equals(next, stackNode.next);
    }
    @Override
    public int hashCode() {
        return Objects.hash(data, prev, next);
    }
}

