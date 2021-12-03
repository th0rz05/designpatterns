public class StringReplacer implements StringTransformer{
    private char to_replace;
    private char replace_with;

    public StringReplacer(char a, char b) {
        to_replace =a;
        replace_with = b;
    }

    public void execute(StringDrink drink){
        drink.setText(drink.getText().replace(to_replace,replace_with));
    }
}
