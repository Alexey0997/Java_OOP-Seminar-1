public class Toilet_paper extends HygieneItems{
    int layersNumbers;                                           // Переменная о количестве слоев бумаги.
    public Toilet_paper(String name, int price, int numbers, String measureUnit, Integer piecesPerPack, Integer layersNumbers) {
        super(name, price, numbers, measureUnit, piecesPerPack); // Импорт характеристик родительского класса.
        this.layersNumbers = layersNumbers;                      // Добавление новой характеристики.
    }
    public String toString(){                                    // Метод вывода на печать сведений о продуктах класса.
        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nШт. в упаковке:      " + piecesPerPack +
                "\nКоличество слоев:    " + layersNumbers;
    }
}
