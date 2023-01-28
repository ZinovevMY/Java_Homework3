import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Task0 {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> int_list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println("Максимальное значение: " + getMax(int_list));
        System.out.println("Минимальное значение: " + getMin(int_list));
        System.out.println("Среднее значение: " + getAverage(int_list));
        System.out.println("Без четных чисел: " +removeEvenValue(int_list));

    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list){
        for (Iterator<Integer> itr = list.iterator(); itr.hasNext();){
            int num = itr.next();
            if(num % 2 == 0){
                itr.remove();
            }
        }
        return list;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) < min) min = list.get(i);
        }
        return min;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) > max) max = list.get(i);
        }
        return max;
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum/list.size();
    }

}