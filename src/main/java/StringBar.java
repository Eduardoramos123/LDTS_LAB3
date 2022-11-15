import java.util.List;

public class StringBar extends Bar{
    private boolean happy = false;

    @Override
    public boolean isHappyHour() {
        return happy;
    }

    @Override
    public void startHappyHour() {
        happy = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        happy = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }

}
