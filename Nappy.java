public class Nappy extends ChildrenProducts{
    String size;                               // Переменные о размере, минимальном и максимальном весе,
    int minWeight;                             // а также о типе памперсов.
    int maxWeight;
    String type;

    public Nappy(String name, int price, int numbers, String measureUnit, Integer minAge, boolean hypoallergenic,
                 String size, Integer minWeight, Integer maxWeight, String type) {
        super(name, price, numbers, measureUnit, minAge, hypoallergenic); // Импорт данных родительского класса.
        this.size = size;                                                 // Добавление новых характеристик.
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public String toString(){                                             // Метод вывода на печать сведений о продуктах.
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nМинимальный возраст: " + minAge +
                "\nГипоалергенность:    " + hypoallergenic +
                "\nРазмер:              " + size +
                "\nМинимальный вес:     " + minWeight +
                "\nМаксимальный вес:    " + maxWeight +
                "\nТип:                 " + type;
    }
}
