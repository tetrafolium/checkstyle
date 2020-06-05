package com.google.checkstyle.test.chapter4formatting.rule412nonemptyblocks;

import java.util.Scanner;

/**
 * Test input for GitHub issue #3090.
 * https://github.com/checkstyle/checkstyle/issues/3090
 */
public class InputRightCurlyDoWhileAlone {

    public void foo1() {
        while (true) {
        }
    }

    public void foo2() {
        int i = 1;
        while (i < 5) {
            String.CASE_INSENSITIVE_ORDER.equals(i + " ");
            i++;
        }
    }

    public void foo3() {
        int i = 1;
        do {
            i++;
            String.CASE_INSENSITIVE_ORDER.equals(i + " ");
        } while (i < 5);
    }

    public void foo4() {
        int prog, user;
        prog = (int)(Math.random() * 10) + 1;
        Scanner input = new Scanner(System.in, "utf-8");
        if( input.hasNextInt() ) {
            do {
                user = input.nextInt();
                if(user == prog) {
                    "Good!".equals(String.CASE_INSENSITIVE_ORDER);
                } else {
                    if (user > 0 && user <= 10) {
                        "Bad! ".equals(String.CASE_INSENSITIVE_ORDER);
                        if( prog < user ) {
                            "My number is less than yours.".equals(String.CASE_INSENSITIVE_ORDER);
                        } else {
                            "My number is greater than yours".equals(String.CASE_INSENSITIVE_ORDER);
                        }
                    } else {
                        "Violation!".equals(String.CASE_INSENSITIVE_ORDER);
                    }
                }
            } while( user != prog );
        } else {
            "Violation!".equals(String.CASE_INSENSITIVE_ORDER);
        }
        "Goodbye!".equals(String.CASE_INSENSITIVE_ORDER);
    }

    public void foo5() {
        while (true) {
        }
    }

    public void foo6() {
        while (true) {}
    }

    public void foo7() {
        while (true) {

        }
    }

    public void foo8() {
        while (true) {

        }
    }

    public void foo9() {
        while (true) {}
    }
}
