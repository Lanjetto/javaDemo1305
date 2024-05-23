package java2.day3;

/**
 * Необходимо создать три потока, которые изменяют один и тот же объект. Каждый поток должен вывести на экран одну букву 100 раз, и затем увеличить значение символа на 1.
 * Создать класс расширяющий Thread.
 * Переопределить метод run() - здесь будет находиться синхронизированный блок кода.
 * Для того чтобы три объекта потока имели доступ к одному объекту, создаем конструктор принимающий на вход StringBuilder объект.
 * Синхронизированный блок кода будет получать монитор на объект StringBuilder из пункта 3.
 * Внутри синхронизированного блока кода выведите StringBuilder на экран 100 раз, а потом увеличьте значение символа на 1.
 * В методе main() создайте один объект класса StringBuilder, используя символ ‘a’.
 * Затем создайте три экземпляра объекта нашего класса и запустите потоки.
 */
public class ThreadPractice3 extends Thread {
    private final StringBuilder sb;


    public ThreadPractice3(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        synchronized (sb) {
            for (int i = 0; i < 10; i++) {
                System.out.println(sb);
            }
            sb.setCharAt(0, (char) (sb.charAt(0) +1));

        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a");
        ThreadPractice3 t1 = new ThreadPractice3(sb);
        ThreadPractice3 t2 = new ThreadPractice3(sb);
        ThreadPractice3 t3 = new ThreadPractice3(sb);
        t1.start();
        t2.start();
        t3.start();

    }
}
