package uz.leetcode.solutions;

import uz.leetcode.model.TreeNode;

import java.util.concurrent.atomic.AtomicBoolean;

public class S331 {
    public boolean isValidSerialization(String preorder) {
        final StringBuilder stringBuilder = new StringBuilder(preorder).append(',');
        deserialize(stringBuilder);
        return aBoolean.get() && stringBuilder.isEmpty();
    }

    AtomicBoolean aBoolean = new AtomicBoolean(true);

    public TreeNode deserialize(StringBuilder data) {
        final Integer number = getNumber(data);
        return number != null ? new TreeNode(number, deserialize(data), deserialize(data)) : null;
    }

    public Integer getNumber(StringBuilder data) {
        StringBuilder number = new StringBuilder();
        while (!data.isEmpty()) {
            char letter = data.charAt(0);
            data.deleteCharAt(0);
            if (Character.isDigit(letter)) {
                number.append(letter);
            } else if (letter == '#') {
                data.deleteCharAt(0);
                return null;
            } else if (letter == ',') {
                return Integer.parseInt(number.toString());
            }
        }
        aBoolean.compareAndSet(true, false);
        return null;
    }
}
