public class StringReplacer implements StringTransformer {
    private char c1;
    private char c2;
    private String original;

    public StringReplacer(char c1, char c2) {
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        original = text;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c1) {
                str.append(c2);
                continue;
            }

            str.append(text.charAt(i));

        }

        drink.setText(str.toString());
    }

    @Override
    public void undo(StringDrink drink) {
        drink.setText(original);
    }
}
