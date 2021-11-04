package _20_behavioral.practice.template;

public class HamburgerMeal extends Meal {

    @Override
    protected void cleanUp() {
        System.out.println("Throwing away paper plates");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking burgers on grill and fries in oven");
    }

    @Override
    protected void prepareIngredients() {
        System.out.println("Getting burgers, buns, and french fries");
    }
}
