package com.three;

import java.util.Scanner;

public class Member {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������4λ��Ա���ţ�");
        int member = input.nextInt();

//        �ж��Ƿ�������4λ��
        int mLength = String.valueOf(member).length();      //length()�������ַ������ȡ�String.valueOf(member)������ת��Ϊ�ַ�����
        while (mLength != 4) {      //����Ա���Ų�Ϊ4λ��ʱ��һֱѭ������ֱ��4λ��Ϊֹ��
            System.out.println("������Ļ�Ա���Ų�Ϊ4λ����\n����������4λ��Ա���ţ�");
            member = input.nextInt();
            mLength = String.valueOf(member).length();
        }

        System.out.println("�û�ԱΪ��" + member);

        int thousand = member / 1000;
        int hundred = member / 100 % 10;
        int ten = member % 100 / 10;
        int single = member % 10;
        int sum = thousand + hundred + ten + single;
        System.out.println("ǧ��" + thousand + "���٣�" + hundred + "��ʮ��" + ten + "������" + single);
        System.out.println("��Ա���Ÿ�λ��֮��Ϊ��" + sum);
        if(sum > 20 && sum <= 30) {
            System.out.println("��ϲ" + member + "��Ա�н��ˣ���Ʒ��ƻ���ֻ���");
        } else if (sum > 30) {
            System.out.println("��ϲ" + member + "��Ա�н��ˣ���Ʒ��ƻ�����ԣ�");
        }
    }
}