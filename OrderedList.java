public interface OrderedList {

    String toString();
    
    int size();
    
    void add( int value);
    
    int get( int value);
    
    boolean remove( int value);

}