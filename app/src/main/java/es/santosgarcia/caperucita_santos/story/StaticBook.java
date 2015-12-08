package es.santosgarcia.caperucita_santos.story;

import java.util.ArrayList;

import es.santosgarcia.caperucita_santos.R;

/**
 * Created by Santos García & Miguel Angel Nuñez on 06/12/2015.
 */
public class StaticBook {
    private static ArrayList<BookPage> BOOK = null;

    public static ArrayList<BookPage> getStaticBook() {
        if (BOOK == null) {
            BOOK = new ArrayList<BookPage>();
            BOOK.add(new BookPage(R.drawable.imagen1, R.string.title_page_1, R.string.desc_page_1,
                    R.string.option_A_page_1, R.string.option_B_page_1, 1, 2));// Boton A (array[1]) boton B (srray[2])
            BOOK.add(new BookPage(R.drawable.imagen3, R.string.title_page_3, R.string.desc_page_3,
                    R.string.option_A_page_1, R.string.option_B_page_1, 2, 3));
            BOOK.add(new BookPage(R.drawable.imagen2, R.string.title_page_2, R.string.desc_page_2,
                    R.string.option_A_page_2, R.string.option_B_page_2, 3, 3));
            BOOK.add(new BookPage(R.drawable.imagen4, R.string.title_page_4, R.string.desc_page_4,
                    R.string.option_A_page_2, R.string.option_B_page_2, 4, 4));

            BOOK.add(new BookPage(6, 5));// Lucha
            BOOK.add(new BookPage(R.raw.video)); //Video Final 1
            BOOK.add(new BookPage(R.raw.videoprueba)); // Video Final 2
        }
        return BOOK;
    }
}
