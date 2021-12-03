import java.util.List;

public class StringRecipe {
    private List<StringTransformer> tranformers;

    public StringRecipe(List<StringTransformer> tranformers) {
        this.tranformers = tranformers;
    }

    public void mix(StringDrink drink){
        for(StringTransformer transformer : tranformers){
            transformer.execute(drink);
        }
    }
}
