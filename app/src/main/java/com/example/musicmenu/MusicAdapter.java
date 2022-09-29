package com.example.musicmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {
    public MusicAdapter(Context context, ArrayList<Music> musicList){
        super(context, 0 ,musicList);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Music myMusic = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.music_row_layout, parent, false);

        }
        TextView tvSongName = (TextView) convertView.findViewByID(R.id.songName);
        TextView tvArtistName = (TextView) convertView.findViewByID(R.id.artistName);
        TextView tvSongLength = (TextView) convertView.findViewByID(R.id.songLength);

        tvSongName.setText(myMusic.getName());
        tvArtistName.setText(myMusic.getArtist());
        tvSongLength.setText((int) myMusic.getLength());

        return convertView;
    }

}
