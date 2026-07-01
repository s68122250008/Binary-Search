public class MergeSort {

    public static void sort(int[] values) {
        if (values.length <= 1)
            return; // base case

        int middle = values.length / 2;
        int[] left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = values[i];
        }
        int[] right = new int[values.length - middle];
        for (int i = 0; i < values.length - middle; i++) {
            right[i] = values[middle + i];
        }

        sort(left);
        sort(right);
        merge(values, left, right);
    }

    // ฟังก์ชันที่ต้องเขียนเพิ่ม: รวม left กับ right ที่เรียงแล้วให้เป็น values
    // ที่เรียงถูกต้อง
    public static void merge(int[] values, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                values[k] = left[i];
                i++;
            } else {
                values[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            values[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            values[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] values = { 15, 3, 9, 31, 11, 17, 7, 23 };
        sort(values);
        for (int v : values)
            System.out.print(v + " ");
    }
}