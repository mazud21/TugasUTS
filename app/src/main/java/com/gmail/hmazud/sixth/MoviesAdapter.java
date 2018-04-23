package com.gmail.hmazud.sixth;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mhr on 11/04/2018.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private List<Movie> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre, rating;
        public ImageView imgFilm;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tvTitle);
            genre = (TextView) view.findViewById(R.id.tvgenre);
            year = (TextView) view.findViewById(R.id.tvYear);
            rating = (TextView) view.findViewById(R.id.tvRating);

            imgFilm = (ImageView) view.findViewById(R.id.imgFilm);
        }
    }

    public MoviesAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item_movie, parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
        holder.rating.setText(movie.getRating());
        holder.imgFilm.setImageResource(movie.getImage());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
