package basic.lessonone_test.datatype_test;


import org.junit.Test;

public class practice {

    @Test
    public void intTest() {

        int x = 1;
        System.out.println("int data x = " + x);

        x = 100;
        System.out.println("int data change-x = " + x);

        int y;
        y = 2;
        System.out.println("int data y = " + y);

        y = 200;
        System.out.println("int data change-y = " + y);

        // ------------------------------------------------------

        int n = x;
        System.out.println("n = " + n);

        n = n + 100;
        System.out.println("x = " + x);
        System.out.println("n = " + n);


    }

}
