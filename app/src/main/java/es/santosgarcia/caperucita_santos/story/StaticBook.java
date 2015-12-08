package es.santosgarcia.caperucita_santos.story;

import java.util.ArrayList;

import es.santosgarcia.caperucita_santos.R;

/**
 * Created by Santos García & Miguel Angel Nuñez on 06/12/2015.
 */

// @StaticBook It contains the array that stores the data of all screens that will be loading on demand
public class StaticBook {
    private static ArrayList<BookPage> BOOK = null;

    public static ArrayList<BookPage> getStaticBook() {
        if (BOOK == null) {
            BOOK = new ArrayList<BookPage>();
            BOOK.add(new BookPage(R.drawable.imagen1, R.string.title_page_1, R.string.desc_page_1,
                    R.string.option_A_page_1, R.string.option_B_page_1, 4, 3));
            BOOK.add(new BookPage(R.drawable.imagen3, R.string.title_page_3, R.string.desc_page_3,
                    R.string.option_A_page_3, R.string.option_B_page_3, 5, 5));
            BOOK.add(new BookPage(R.drawable.imagen2, R.string.title_page_2, R.string.desc_page_2,
                    R.string.option_A_page_2, R.string.option_B_page_2, 1, 1));
            BOOK.add(new BookPage(R.drawable.imagen4, R.string.title_page_4, R.string.desc_page_4,
                    R.string.option_A_page_4, R.string.option_B_page_4, 4, 2));
            BOOK.add(new BookPage(R.drawable.imagen5, R.string.title_page_5, R.string.desc_page_5,
                    R.string.option_A_page_5, R.string.option_B_page_5, 2, 2));

            BOOK.add(new BookPage(7, 6));// Lucha
            BOOK.add(new BookPage(R.raw.win)); //Video Final 1 Ganas
            BOOK.add(new BookPage(R.raw.lose)); // Video Final 2 Pierdes
        }
        return BOOK;
    }
}
