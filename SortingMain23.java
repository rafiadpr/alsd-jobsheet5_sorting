public class SortingMain23 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting23 dataurut1 = new Sorting23(a, a.length);

        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.BubbleSort();
        System.out.println("Data sudah diurutkan dengan Bubble Sort (Ascending)");
        dataurut1.tampil();
    }
}
