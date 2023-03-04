public class Eggs extends Food{
    int packageQuantity;                                            // Переменная о количестве яиц в упаковке.
    public Eggs(String name, int price, int numbers, String measureUnit, String expirationDate, Integer packageQuantity) {
        super(name, price, numbers, measureUnit, expirationDate);   // Импорт характеристик родительского класса.
        this.packageQuantity = packageQuantity;                     // Добавление новой характеристики.
    }
    public String toString(){                                       // Метод вывода на печать данных о продуктах класса.
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nШт. в упаковке:      " + packageQuantity;
    }
}
