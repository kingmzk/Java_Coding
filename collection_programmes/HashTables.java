import java.util.Hashtable;

class HashTables {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");

        String value = hashtable.get(2);
        System.out.println("Value for key 2: " + value);

        boolean containsKey = hashtable.containsKey(1);
        System.out.println("Contains key 1: " + containsKey);

        boolean containsValue = hashtable.containsValue("Banana");
        System.out.println("Contains value 'Banana': " + containsValue);

        hashtable.remove(3);
        System.out.println("After removing key 3: " + hashtable);

        hashtable.forEach((key, val) -> {
            System.out.println("Key: " + key + ", Value: " + val);
        });

    }
}