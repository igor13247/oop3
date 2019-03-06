import java.io.Console;

public class massiv {
    public static void main(String[] args) {
        int [] y = {1,2,3,4,5};
        int o = 4; // будем выводить 4 элемент массива
        //будем менять элементы r и w местами
        int r = 1;
        int w = 3;
        int u;
        for (int i=0 ; i<y.length; i++){
            System.out.print(" "+y[i]);
        }
// вывод заданного элемента массива
        System.out.println();
        System.out.println(o+" элемент массива равен = "+y[o-1]);
// перемещение двух элементов массива и вывод матрицы на экран
        u = y[r];
        y[r] = y[w];
        y[w] = u;
        System.out.println("Мы поменяли "+r+" элемент местами с "+w);
        for (int i=0 ; i<y.length; i++){
            System.out.print(" "+y[i]);}
// перевернуть массив и его вывод на экран
        for (int i = 0; i < y.length / 2; i++) {
            int tmp = y[i];
            y[i] = y[y.length - i - 1];
            y[y.length - i - 1] = tmp;
        }
        System.out.println();
        System.out.println("Вывод перевернутого массива");
        for (int i=0 ; i<y.length; i++){
            System.out.print(" "+y[i]);}

        Pair stringPair = new Pair();
        stringPair.arr("1,2,3,6,8,2,4,9,5");
        String s = (String)stringPair.getT();
        //Console.WriteLine(Pair(new[] { 3, 1, 2 }));
    }
}

class Pair<T> {  //объект для хранения данных
    Object object;
    public Object getT(){
        return object;

    }

    public void arr(Object object){
        Object [] arr = new Object[9];

    }
}
