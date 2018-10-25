package main;

import orm.annotation.Column;
import orm.impl.DefaultORMManger;

import java.util.Arrays;

public class Main {
    @Column(value = "hej")
    private static String start = "";

    public static void main(String args[]) {
        System.out.println(Arrays.toString(start.getClass().getDeclaredFields()));
        DefaultORMManger defaultORMManger = new DefaultORMManger();
    }
}
