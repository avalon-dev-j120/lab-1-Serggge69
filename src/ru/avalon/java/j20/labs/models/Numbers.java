package ru.avalon.java.j20.labs.models;

public final class Numbers {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */
    private Numbers() {}

    /**
     * Возвращает сумму значений переданного массиа.
     *
     * @param <T>
     * @param values массив чисел
     * @return сумма элементов массива
     */
    public static <T extends Number> double sum(T[] values) {
        double sum = 0;
        for (T value : values) sum += value.doubleValue();
        return sum;
    }

    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param <T>
     * @param values массив значений
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
    public static <T extends Number> double avg(T[] values) {
        return sum(values) / values.length;
    }

    /**
     * Возвращает большее из дух переданных значений.
     *
     * @param <T>
     * @param <Number>
     * @param a перое значение
     * @param b второе значение
     * @return большее из двух значений
     */
    public static <T extends Comparable<T>, Number> T max(T a, T b) {//обобщённый метод max() для сравниваемых объектов
        return a.compareTo(b) >= 0 ? a : b;
    }

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param <T>
     * @param <Number>
     * @param values массив значений
     * @return максимальное значение массива
     */
    public static <T extends Comparable<T>, Number> T max(T[] values) { //обобщённый метод max() для массива сравниваемых объектов
        T result = values[0];
        for (T x:values) {
            result = max(result, x);
        }
        return result;
    }

    /**
     * Возвращает меньшее из двух переданных значений.
     *
     * @param <T>
     * @param <Number>
     * @param a первое значение
     * @param b второе значение
     * @return меньшее из дух значений
     */
    
    public static <T extends Comparable<T>, Number> T min(T a, T b) {
        return a.compareTo(b) <= 0 ? a : b;
    }

    /**
     * Выполняет поиск минимального значения массива.
     *
     * @param <T>
     * @param <Number>
     * @param values массив значений
     * @return минимальное значение массива
     */
    public static <T extends Comparable<T>, Number> T min(T[] values) {
        T result = values[0];
        for (T x:values) {
        result = min(result, x);
        }
        return result;
    }
}