import java.util.List;

public class SumOfTheElementsInAnArray {

    public static void main(String[] args) {

        int[] arrayList = {2, 5, 6, 8, 6};
        int total = sumOfAnArray(arrayList);
        System.out.println(total);
    }

    public static int sumOfAnArray(int[] arrayList) {
        int sum = 0;
        for (int index = 0 ; index<arrayList.length ;index++) {
            sum += arrayList[index];
        }
        return sum;
    }
}
