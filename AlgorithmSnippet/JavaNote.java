//anonymous class in mehtod
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;

    public IterableFibonacci(int count) {
        n = count;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
        public boolean hasNext() { return n > 0; }
            public Integer next() {
            n--;
            return IterableFibonacci.this.next();
            }
        };
    }
}

// factory to create type instance
class ClassAsFactory<T> {
    T x;

    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

//difference between generic class type and parameter type
public class Main {
    public static void main(String[] args){
//    ArrayList<Fruit> myFruitArray = new ArrayList<Apple>; //compile error
        ArrayList<Fruit> myFruitArray = new ArrayList<>(); 
        myFruitArray.add(new Apple());
    }
}