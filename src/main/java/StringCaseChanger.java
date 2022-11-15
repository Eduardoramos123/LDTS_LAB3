public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                str.append(Character.toUpperCase(text.charAt(i)));
                continue;
            }
            if (Character.isUpperCase(text.charAt(i))) {
                str.append(Character.toLowerCase(text.charAt(i)));
                continue;
            }
            str.append(text.charAt(i));
        }

        drink.setText(str.toString());

    }

    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}
