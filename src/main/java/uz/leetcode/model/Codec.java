package uz.leetcode.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Codec {
    public String serialize(TreeNode root) {
        return root != null ? root.val + "," + serialize(root.left) + serialize(root.right) : "#,";
    }

    public TreeNode deserialize(String data) {
        return deserialize(new StringBuilder(data));
    }

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
        return null;
    }

    public static void main(String[] args) {
        final Codec codec = new Codec();
        System.out.println(codec.serialize(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
        System.out.println(codec.deserialize(codec.serialize(new TreeNode(1, new TreeNode(2), new TreeNode(3)))));
    }
}
