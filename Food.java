public class Food extends Product{
    String expirationDate;                             // Переменная срока годности.
    public Food(String name, int price, int numbers, String measureUnit, String expirationDate) {
        super(name, price, numbers, measureUnit);      // Импорт данных из родительского класса Program.
        this.expirationDate = expirationDate;          // Добавление переменной данного - наследуемого класса.

    }
    public String toString(){                          // Метод вывода на печать сведений о продуктах данного класса.
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nСрок годности:       " + expirationDate;
    }
}
