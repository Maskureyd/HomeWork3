public class BracketChecker {
    private String input;
    public BracketChecker(String input) {
        this.input = input;
    }

    public boolean check() {
        int size = input.length();
        LinkStack stack = new LinkStack();
        for (int i = 0; i < size; i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stack.isEmpty() && isMatchingPair(stack.peek(), ch)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
    private boolean isMatchingPair(char character1, char character2) {
        return (character1 == '{' && character2 == '}') ||
                (character1 == '[' && character2 == ']') ||
                (character1 == '(' && character2 == ')');
    }
}