public class Dinner2 {
    public static void main(String[] args) {
        Dinner myDinner = new Dinner();
        Chicken myChicken = new Chicken();
        myDinner.eatDinner(myChicken);
    }

    public void eatDinner(Chicken chicken) {
        chicken.getFood();
    }
}