package uz.leetcode.traskModel;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    final ArrayList<String> list;
    int index = 0;

    public BrowserHistory(String homepage) {
        list = new ArrayList<>(List.of(homepage));
    }

    public void visit(String url) {
        list.add(url);
    }

    public String back(int steps) {
        index = Math.max(index - steps, 0);
        return list.get(index);
    }

    public String forward(int steps) {
        index = Math.min(index + steps, list.size() - 1);
        return list.get(index);
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.back(1));
        System.out.println(browserHistory.forward(1));
        browserHistory.visit("linkedin.com");
        System.out.println(browserHistory.forward(2));
        System.out.println(browserHistory.back(2));
        System.out.println(browserHistory.back(7));
    }
}
