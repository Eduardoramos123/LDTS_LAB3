public class StringInverter implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        drink.setText(new StringBuilder(text).reverse().toString());
    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }

}
