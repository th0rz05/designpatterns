import java.util.List;

public class StringRecipe {
    private List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> tranformers) {
        this.transformers = tranformers;
    }

    public void mix(StringDrink drink){
        for(StringTransformer transformer : transformers){
            transformer.execute(drink);
        }
    }
}
