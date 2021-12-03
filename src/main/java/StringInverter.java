public class StringInverter implements  StringTransformer{
    public void execute(StringDrink drink){
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append(drink.getText());
        sbuilder.reverse();
        drink.setText(sbuilder.toString());
    }
}
