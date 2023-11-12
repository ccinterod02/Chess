
public enum Color {
    BLACK("Black"),
    WHITE("White");

    private String str;

    private Color(String str) {
        this.str = str;
    }

    public String getString() {
        return str;
    }
}

