package com.company;

public class tack3 {
    public static void main(String[] args) {
        int randomNum;
        int num = (int) (Math.random() * 102);
        System.out.println("Згенероване число:" + num);
        System.out.println("Кількість цифр:" + Integer.toString(num).length());
    }

}
