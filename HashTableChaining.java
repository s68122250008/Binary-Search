import java.util.LinkedList;

public class HashTableChaining {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int size = 9;
        LinkedList<Integer>[] table = new LinkedList[size];
        for (int i = 0; i < size; i++)
            table[i] = new LinkedList<>();

        int[] values = { 5, 28, 19, 15, 20, 33, 12, 17, 10 };
        for (int v : values) {
            int index = v % size;
            table[index].add(v);
        }

        for (int i = 0; i < size; i++) {
            System.out.println("ช่อง " + i + ": " + table[i]);
        }
    }
}