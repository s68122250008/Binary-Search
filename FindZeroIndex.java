public class FindZeroIndex {
    public static int findZeroIndex(int[] a1, int[] a2) {
        int low = 1;
        int high = a1.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (a1[mid - 1] == a2[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] a1 = { 1, 3, 4, 6, 7, 8, 9, 20 };
        int[] a2 = { 1, 3, 0, 4, 6, 7, 8, 9, 20 };
        System.out.println("ตำแหน่งของ 0 คือ index ที่ " + findZeroIndex(a1, a2)); // 3
    }
}