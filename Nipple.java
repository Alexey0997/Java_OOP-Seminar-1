public class Nipple extends ChildrenProducts{

    public Nipple(String name, int price, int numbers, String measureUnit, Integer minAge, boolean hypoallergenic) {
        super(name, price, numbers, measureUnit, minAge, hypoallergenic); // Импорт характеристик родительского класса.
    }

    public String toString(){                             // Метод вывода на печать сведений о продуктах данного класса.
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nМинимальный возраст: " + minAge +
                "\nГипоалергенность:    " + hypoallergenic;
    }
}
