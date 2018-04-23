package com.gmail.hmazud.sixth;

import android.content.Intent;
import android.media.Image;
import android.media.ImageReader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Pemrograman Mobile");

        mAdapter = new MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.action_version){
            Intent intent= new Intent(MainActivity.this,About.class);
            startActivity(intent);
        }
        return true;
    }

    private void prepareMovieData() {
        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015", "4", R.drawable.starter_image);
        movieList.add(movie);
        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015", "4", R.drawable.starter_image);
                movieList.add(movie);
        movie = new Movie("Star Wars: Episode VII - The Force Awakens", " Action", "2015", "4", R.drawable.starter_image);
                movieList.add(movie);
        movie = new Movie("Shaun the Sheep", "Animation", "2015", "4", R.drawable.starter_image);
        movieList.add(movie);
        movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015", "4", R.drawable.starter_image);
                movieList.add(movie);
        movie = new Movie("Mission: Impossible Rogue  Nation", " Action", "2015", "4", R.drawable.starter_image);
                movieList.add(movie);
        movie = new Movie("Up", "Animation", "2009", "4", R.drawable.starter_image);
        movieList.add(movie);
        movie = new Movie("Star Trek", "Science Fiction", "2009", "4", R.drawable.starter_image);
        movieList.add(movie);
        movie = new Movie("The LEGO Movie", "Animation", "2014", "4", R.drawable.starter_image);
        movieList.add(movie);
        movie = new Movie("Iron Man", "Action & Adventure", "2008", "4", R.drawable.starter_image);
        movieList.add(movie);
        movie = new Movie("Aliens", "Science Fiction","1986", "4", R.drawable.starter_image);
        movieList.add(movie);
        movie = new Movie("Chicken Run", "Animation","2000", "4", R.drawable.starter_image);
        movieList.add(movie);
        movie = new Movie("Back to the Future","Science Fiction","1985", "4", R.drawable.starter_image);
                movieList.add(movie);
        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981", "4", R.drawable.starter_image);
        movieList.add(movie);
        movie = new Movie("Goldfinger", "Action & Adventure", "1965", "4", R.drawable.starter_image);
                movieList.add(movie);
        movie = new Movie("Guardians of the Galaxy","Science Fiction & Fantasy", "2014", "4", R.drawable.starter_image);
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }
}