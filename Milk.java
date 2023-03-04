public class Milk extends Food{
    double fatContent;                                               // Переменная процента жирности.
    public Milk(String name, int price, int numbers, String measureUnit, String expirationDate, Double fatContent) {
        super(name, price, numbers, measureUnit, expirationDate);    // Импорт свойств родительского класса.
        this.fatContent = fatContent;                                // Добавление нового параметра.
    }
    public String toString(){                                        // Метод вывода на печать сведений о продуктах,
        return "\nНаименование товара: " + name +                    // с учетом особенностей данного класса.
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nСрок годности:       " + expirationDate +
                "\nЖирность, %:         " + fatContent;
    }
}
