/*
Реализовать класс товар, содержащий следующие свойства:
1. Название
2. Цена
3. Количество
4. Единица измерения
 */

public class Product {
    // ОПРЕДЕЛЯЕМ ПОЛЯ КЛАССА PRODUCT
    String name;                     // Наименование товара.
    int price;                       // Цена.
    int numbers;                     // Количество.
    String measureUnit;              // Единицы измерения.

    // КОНСТРУКТОР КЛАССА PRODUCT
    public Product(String name, int price, int numbers, String measureUnit) {
        this.name = name;
        this.price = price;
        this.numbers = numbers;
        this.measureUnit = measureUnit;
    }

    // ОПРЕДЕЛЯЕМ ПОРЯДОК ВЫВОДА ИНФОРМАЦИИ НА ПЕЧАТЬ
    @Override
    public String toString() {
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:       " + price +
                "\nКоличество:         " + numbers +
                "\nЕдиницы измерения:  " + measureUnit;
    }
    // Используем селекторы для передачи данных наследуемым классам.
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getNumbers(){
        return numbers;
    }
    public String getMeasureUnit(){
        return measureUnit;
    }
}
