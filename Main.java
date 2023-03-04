import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Product food = new Food("Сметана", 98, 120, "банка", "10.03.2023 года");
        Product milk = new Milk("Молоко", 150, 100, "бутылка", "13.03.2023 года", 3.5);
        Product bread = new Bread("Хлеб", 45, 400, "буханка", "07.03.2023 года", "пшеничная");
        Product eggs = new Eggs("Яйца", 120, 200, "упаковка", "13.03.2023 года", 10);

        Product drinks = new Drinks("Квас", 120, 50, "банка", 0.75);
        Product lemonade = new Lemonade("Тархун", 199, 200, "бутылка", 0.5);

        Product hygieneItems = new HygieneItems("Носовые платки", 90, 1000, "упаковка", 10);
        Product masks = new Masks("Защитные маски", 234, 102, "упаковка", 100);
        Product toiletPaper = new Toilet_paper("Туалетная бумага", 15, 1, "рулон", 12, 4);


        Product childrenProducts = new ChildrenProducts("Планшет", 20_000, 12, "штук", 12, true);
        Product nappy = new Nappy("Подгузники", 1599, 333, "упаковка", 90, true, "L", 0, 5, "одноразовые");
        Product nipple = new Nipple("Соска", 235, 100, "упаковка", 0, true);

        LinkedList<Product> foods = new LinkedList<>();
        foods.add(food);
        foods.add(milk);
        foods.add(bread);
        foods.add(eggs);

        LinkedList<Product> drink = new LinkedList<>();
        drink.add(drinks);
        drink.add(lemonade);

        LinkedList<Product> hygieneGoods = new LinkedList<>();
        hygieneGoods.add(hygieneItems);
        hygieneGoods.add(masks);
        hygieneGoods.add(toiletPaper);

        LinkedList<Product> childrenGoods = new LinkedList<>();
        childrenGoods.add(childrenProducts);
        childrenGoods.add(nappy);
        childrenGoods.add(nipple);
        Program.getData(foods, drink, hygieneGoods, childrenGoods);
    }
}