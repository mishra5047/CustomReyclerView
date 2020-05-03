package com.example.bookz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookz.Model.ItemAdapter;
import com.gauravk.bubblenavigation.BubbleNavigationConstraintView;
import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<ItemAdapter> mList = new ArrayList<>();
    private BooksAdapter mAdapter;
    private RecyclerView recyclerView;
    private BubbleNavigationConstraintView bubbleNavigationConstraintView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bubbleNavigationConstraintView = findViewById(R.id.bottom_navigation_constraint);

        recyclerView = findViewById(R.id.recyclerView);

        ItemAdapter itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.book_1);
        itemAdapter.setRatings("5.0");
        itemAdapter.setAuthorName("ABC Rowling");
        itemAdapter.setName("Chronicles");
        mList.add(itemAdapter);

        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.book_2);
        itemAdapter.setRatings("4.8");
        itemAdapter.setAuthorName("ABC Puth");
        itemAdapter.setName("Batman");
        mList.add(itemAdapter);

        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.book_3);
        itemAdapter.setRatings("4.5");
        itemAdapter.setAuthorName("XYZ Nolan");
        itemAdapter.setName("Game Of Thrones");
        mList.add(itemAdapter);


        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.book_4);
        itemAdapter.setRatings("4.3");
        itemAdapter.setAuthorName("XYZ Nolan");
        itemAdapter.setName("Game Of Thrones 2");
        mList.add(itemAdapter);


        itemAdapter = new ItemAdapter();
        itemAdapter.setImage(R.drawable.book_5);
        itemAdapter.setRatings("4.8");
        itemAdapter.setAuthorName("XYZ Nolan");
        itemAdapter.setName("Game Of Thrones 3");
        mList.add(itemAdapter);

        mAdapter = new BooksAdapter(mList, this);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter.notifyDataSetChanged();


        bubbleNavigationConstraintView.setNavigationChangeListener(new BubbleNavigationChangeListener() {
            @Override
            public void onNavigationChanged(View view, int position) {

            }
        });
    }
}
