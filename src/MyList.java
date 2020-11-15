import java.util.Iterator;

class MyList <T>{
    private T[] list;
    private int size;

    public MyList(int capacity){
        list=(T[])new Object[capacity];
        size=0;
    }
    void add(T t){
        list[size]=t;
        size++;
    }
    void insert(int index,T t){
        if (size== list.length)
            throw new IllegalArgumentException("Add failed.List is full");
        if (index<0||index>size)
            throw new IllegalArgumentException("Add failed.List index>=0 and index<=size");
        for (int i=size-1;i>=index;i--)
            list[i+1]=list[1];
        list[index]=t;
        size++;
    }
    T get(int index){
        if(index<0)
            throw new IllegalArgumentException("Get failed.Index is illegal");
        return (T)list[index];
    }
    void replace(int index,T t){
        if (index<0||index>=size)
            throw new IllegalArgumentException("Add failed.List index>=0 and index<=size");
        list[index]=t;
    }
    void remove(int index){
        if (index<0||index>=size)
            throw new IllegalArgumentException("Add failed.List index>=0 and index<=size");
        for(int i=index+1;i<size;i++)
            list[i-1]=list[i];
        size--;
    }

    class Itr implements Iterator<T>{
        public boolean hasNext(){
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }
    public Iterator iterator(){
        return new Itr();
    }

}
