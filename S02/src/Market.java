import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehavior{
    private List<Actor> actorList = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        takeInQueue(actor);
        System.out.println(actor.getName() + " Пришел в магазин");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors){
            actorList.remove(actor);
            System.out.println(actor.getName() + " Вышел из магазина");
        }
    }

    @Override
    public void update() {
    takeOrders();
    giveOrders();
    releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        actorList.add(actor);
        System.out.println(actor.getName() + " Встал в очередь");
    }

    @Override
    public void takeOrders() {
        for(Actor actor : actorList){
            if(!actor.isTakeOrder){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " Сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for(Actor actor : actorList){
            if(!actor.isTakeOrder){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " Получил свой заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
    List<Actor> releasedActors = new ArrayList<>();
        for(Actor actor : actorList){
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + "Вышел из очереди");
            }
        }
        releaseFromMarket(releasedActors);
    }
}
