package _20_behavioral.practice.template;

public class TacoMeal extends Meal {
    @Override
    protected void cleanUp() {
        System.out.println("Doing the dishes");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking ground beef in pan");
    }

    @Override
    protected void prepareIngredients() {
        System.out.println("Getting ground beef and shells");
    }

    @Override
    public void eat() {
        System.out.println("The tacos are tasty");
    }
}
