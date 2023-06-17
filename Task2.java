import java.io.FileWriter;

// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class Task2 {
    public static void main(String[] args) {
        int [] array = {3, 6, 2, -8, 4, 7, 0};

        try{
            FileWriter file = new FileWriter("Task2.txt", false);

        for(int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i-1; j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            for (int k = 0; k < array.length; k++) {
                file.write(array[k]);
            }
            file.write("\n");
        }
        file.close();
        System.out.println("Получилось!");
    }
    catch (Exception e){
        System.out.println("Что то пошло не так");
    }
}
}
