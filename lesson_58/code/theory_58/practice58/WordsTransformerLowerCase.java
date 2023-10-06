package theory_58.practice58;

public class WordsTransformerLowerCase extends WordsTransformer{
    @Override
    public boolean check(String input) {
        return input.length() == 4;
    }

    @Override
    public String transform(String string) {
        return string.toLowerCase();
    }
}
