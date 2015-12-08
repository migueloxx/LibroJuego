package es.santosgarcia.caperucita_santos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import es.santosgarcia.caperucita_santos.story.BookPage;
import es.santosgarcia.caperucita_santos.story.BookState;
import es.santosgarcia.caperucita_santos.story.StaticBook;

public class BookPageFragment extends Fragment {

    public static final String SELECTED_PAGE = "selected_page";

    private int selectedPage;
    private View rootView;

    public BookPageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null && getArguments().containsKey(SELECTED_PAGE)) {
            selectedPage = getArguments().getInt(SELECTED_PAGE);
        } else {
            selectedPage = 0;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_book_page, container, false);

        ((Button)rootView.findViewById(R.id.book_page_buttonoptionA)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PulseButtonA(v);
            }
        });

        ((Button)rootView.findViewById(R.id.book_page_buttonoptionB)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PulseButtonB(v);
            }
        });

        setBookPageContent();

        return rootView;
    }


    public void PulseButtonA(View view) {
        BookPage currentPage = StaticBook.getStaticBook().get(selectedPage);
        selectedPage = currentPage.getOptionANext();
        setBookPageContent();
    }

    public void PulseButtonB(View view){
        BookPage currentPage = StaticBook.getStaticBook().get(selectedPage);
        selectedPage = currentPage.getOptionBNext();
        setBookPageContent();
    }

    public void setSelectedPage(int selectedPage) {
        this.selectedPage = selectedPage;
        setBookPageContent();
    }

    private void setBookPageContent() {
        BookState.writeToFile(getContext(), "" + selectedPage);
        BookPage currentPage = StaticBook.getStaticBook().get(selectedPage);

        if (currentPage.getVideoId() > 0) {
            getActivity().finish();
            Intent intent = new Intent(getContext(), PantallaFinal2.class);
            intent.putExtra(PantallaFinal2.VIDEO_ID, currentPage.getVideoId());
            startActivity(intent);
        } else if (currentPage.getTitleId() > 0){
            ((TextView) rootView.findViewById(R.id.book_page_title)).setText(currentPage.getTitleId());
            ((TextView) rootView.findViewById(R.id.book_page_desc)).setText(currentPage.getDescriptionId());
            ((Button) rootView.findViewById(R.id.book_page_buttonoptionA)).setText(currentPage.getOptionAId());
            ((Button) rootView.findViewById(R.id.book_page_buttonoptionB)).setText(currentPage.getOptionBid());
            ((ImageView) rootView.findViewById(R.id.book_page_image)).setImageResource(currentPage.getImageId());
        } else {
            getActivity().finish();
            Intent intent = new Intent(getContext(), Battle1.class);
            intent.putExtra(SELECTED_PAGE, selectedPage);
            startActivity(intent);
        }
    }

}

