public class HygieneItems extends Product {
    int piecesPerPack;                                     // Переменная о количестве штук в упаковке.
    public HygieneItems(String name, int price, int numbers, String measureUnit, Integer piecesPerPack) {
        super(name, price, numbers, measureUnit);          // Импорт характеристик родительского класса.
        this.piecesPerPack = piecesPerPack;                // Добавление нового элемента.
    }
    public String toString(){                              // Метод вывода на печать сведений о продуктах класса.
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nШт. в упаковке:      " + piecesPerPack;
    }
}
