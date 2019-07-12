package com.suthirak;

public class ExceptionCatches {

    public static void main(String[] args) {

        try {

            int a[] = new int[6];
            a[6] = 8;
            int j = 10;
            int k = 0;
            int i = 20 / k;      // exception
                                 // if there not exception the code will execute
            System.out.println(i);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divided by Zero ");    // err means the output will be in red color

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Stay in your limit");

        } catch (Exception e) {
            System.out.println("Something's wrong");

        } finally {

            System.out.println("bye");

        }


    }

}
