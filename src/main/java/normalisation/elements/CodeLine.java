package normalisation.elements;

import normalisation.util.Text;

public class CodeLine implements JavaElement, Text {

    private String code = "";

    public CodeLine(String code) {
        this.code = code;
    }

    @Override
    public int length() {
        return code.length();
    }

    @Override
    public String getText() {
        return toString();
    }

    @Override
    public void setText(String text) {
        code = text;
    }

    public String toString() {
        return code;
    }
}
