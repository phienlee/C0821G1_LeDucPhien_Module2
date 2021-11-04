package _20_behavioral.practice.template;

public abstract class Meal {
    public final void doMeal() {
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }

    protected abstract void cleanUp();

    protected  void eat(){
        System.out.println("Mmm, that's good");
    }

    protected abstract void cook();

    protected abstract void prepareIngredients();
}
