public interface OrderedList {

    String toString();

    void add( int value);
    
    int size();
    
    int get( int value);
    
    boolean remove( int value);

}