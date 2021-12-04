import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private List<StringDrink> drinks = new ArrayList<>();
    private List<StringRecipe> recipes = new ArrayList<>();

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            bar.order(drink,recipe);
        }
        else{
            drinks.add(drink);
            recipes.add(recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        int i = 0;
        for(StringDrink drink:drinks){
            bar.order(drink,recipes.get(i));
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
