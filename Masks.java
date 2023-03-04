public class Masks extends HygieneItems{
    public Masks(String name, int price, int numbers, String measureUnit, Integer piecesPerPack) {
        super(name, price, numbers, measureUnit, piecesPerPack);  // Импорт характеристик родительского класса.
    }
    public String toString(){                                     // Метод вывода на печать сведений о продуктах класса.
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nШт. в упаковке:      " + piecesPerPack;
    }
}
