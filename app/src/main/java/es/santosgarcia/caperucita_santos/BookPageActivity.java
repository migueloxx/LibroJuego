package es.santosgarcia.caperucita_santos;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class BookPageActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_page);
        BookPageFragment fr = (BookPageFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_book_page);
        fr.setSelectedPage(getIntent().getIntExtra(BookPageFragment.SELECTED_PAGE, 0));
    }


    @Override
    public void onBackPressed() {
        // your code.
    }
}
