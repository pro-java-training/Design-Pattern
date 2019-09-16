package Strategy.sort;

public class BinarySorter implements Sorter {
    Comparable[] data;

    @Override
    public void sort(Comparable[] data) {
        this.data = data;
        binarySort(0, data.length - 1);
    }

    // left 表示左边最大值的位置, right 表示右边最小值的位置.
    private void binarySort(int left, int right) {
        int tmp_left = left;
        int tmp_right = right;
        Comparable mid = data[(left + right) / 2];
        do {
            while (data[left].compareTo(mid) < 0) {
                left++;
            }
            while (mid.compareTo(data[right]) < 0) {
                right--;
            }
            if (left <= right) {
                Comparable tmp = data[left];
                data[left] = data[right];
                data[right] = tmp;
                left++;
                right--;
            }
        } while (left <= right);

        if (tmp_left < right) {
            binarySort(tmp_left, right);
        }
        if (left < tmp_right) {
            binarySort(left, tmp_right);
        }
    }
}
