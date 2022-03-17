package IfStatements;

public class CurlyBrackets {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x>y)
            y++;
            ++x;
            y = x+y;
            System.out.println("value of x is "+y);

            if (y>=x)
                ++y; ++x; y=x+y;
        System.out.println(y);

    }
}
