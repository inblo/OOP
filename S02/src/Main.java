//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Igor");
        Human human2 = new Human("Andrey");
        Human human3 = new Human("Alex");
        Market market = new Market();
        market.acceptToMarket(human1);
        market.update();
        System.out.println();
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}