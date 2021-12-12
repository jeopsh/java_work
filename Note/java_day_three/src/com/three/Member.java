package com.three;

import java.util.Scanner;

public class Member {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入4位会员卡号：");
        int member = input.nextInt();

//        判断是否输入了4位数
        int mLength = String.valueOf(member).length();      //length()——求字符串长度。String.valueOf(member)将数字转换为字符串。
        while (mLength != 4) {      //当会员卡号不为4位数时，一直循环输入直到4位数为止！
            System.out.println("你输入的会员卡号不为4位数！\n请重新输入4位会员卡号：");
            member = input.nextInt();
            mLength = String.valueOf(member).length();
        }

        System.out.println("该会员为：" + member);

        int thousand = member / 1000;
        int hundred = member / 100 % 10;
        int ten = member % 100 / 10;
        int single = member % 10;
        int sum = thousand + hundred + ten + single;
        System.out.println("千：" + thousand + "，百：" + hundred + "，十：" + ten + "，个：" + single);
        System.out.println("会员卡号各位数之和为：" + sum);
        if(sum > 20 && sum <= 30) {
            System.out.println("恭喜" + member + "会员中奖了！奖品是苹果手机！");
        } else if (sum > 30) {
            System.out.println("恭喜" + member + "会员中奖了！奖品是苹果电脑！");
        }
    }
}