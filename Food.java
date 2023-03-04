public class Food extends Product{
    String expirationDate;
    public Food(String name, int price, int numbers, String measureUnit, String expirationDate) {
        super(name, price, numbers, measureUnit);
        this.expirationDate = expirationDate;

    }
    public String toString(){

        return "\nНаименование товара: " + name +
                "\nЦена, рублей:        " + price +
                "\nКоличество:          " + numbers +
                "\nЕдиницы измерения:   " + measureUnit +
                "\nСрок годности:       " + expirationDate;
    }


}
