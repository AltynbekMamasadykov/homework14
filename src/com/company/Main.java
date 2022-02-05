package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
            Class деген класс тузунуз
            ал класстын номер деген бутун сан сактаган, соз деген соз сактаган жана
            массив деген сан сактаган массив бар
            конструктор жазыныз
            мейн методтон Classтын объектисин тузунуз
            объекттин полелерине конструктор аркылуу маани бериниз
            ошол объекттин полелерин консольго чыгарыныз.
         */
        int[] masiv1 = {100,200,300};
        int[] masiv2 = {-5,-10,-20};

        Class klass1 = new Class(1,"salam",masiv1);
        klass1.getClassInfo();

        System.out.println();

        Class klass2 = new Class(2,"kanday",masiv2);
        klass2.getClassInfo();



    }
}
