package less_2;

public class SortedArray<T extends Comparable> extends MyArrayList<T> {
    @Override
    public void add(T item) {
        int i = 0;
        super.add(item);
        super.insertSort();
    }

    @Override
    public void set(int index, T item) {
        throw new UnsupportedOperationException();
    }

    public boolean binaryFind(T item) {
        int min = 0;
        int max = size() - 1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (item.compareTo(get(mid)) < 0) {
                max = mid - 1;
            } else if (item.compareTo(get(mid)) > 0) {
                min = mid + 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
