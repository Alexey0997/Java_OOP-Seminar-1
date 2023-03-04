public class ChildrenProducts extends Product {
    int minAge;                                        // Переменная о минимальном возрасте.
    boolean hypoallergenic;                            // Данные о гипоаллергенности продукта.
    public ChildrenProducts(String name, int price, int numbers, String measureUnit, Integer minAge, boolean hypoallergenic) {
        super(name, price, numbers, measureUnit);     // Импорт характеристик родительского класса.
        this.minAge = minAge;                         // Добавление новых параметров.
        this.hypoallergenic = hypoallergenic;
    }
    public String toString(){                         // Метод вывода на печать сведений о продуктах класса.
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nМинимальный возраст: " + minAge +
                "\nГипоалергенность:    " + hypoallergenic;
    }
}


