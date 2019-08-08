package com.pandelicia.soundboardow;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Vitor on 14/09/2016.
 */
public class FalasReaperFragment extends Fragment{
    MediaPlayer mp = null;
    private ArrayList<String> data = new ArrayList<>();
    String nome_falas_reaper[] = {"Dá um tempo.", "Próximo.", "Psicopata.", "Tá olhando o quê?.",
            "De volta dos mortos.", "Eu já não te matei antes?.", "Fácil demais.", "Isso foi tudo?",
            "Mais um homem morto.", "Que fácil", "Se está vivo, pode morrer.", "Viu um fantasma?"};
    public int raw_falas_reaper[] = {R.raw.falas_reaper_1, R.raw.falas_reaper_2, R.raw.falas_reaper_3, R.raw.falas_reaper_4, R.raw.falas_reaper_5,
            R.raw.falas_reaper_6, R.raw.falas_reaper_7, R.raw.falas_reaper_8, R.raw.falas_reaper_9, R.raw.falas_reaper_10, R.raw.falas_reaper_11, R.raw.falas_reaper_12};
    
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_falas, container, false);
        generateListContent();
        ListView lv = (ListView) rootView.findViewById(R.id.list_view);
        lv.setAdapter(new ReaperListAdapter(getActivity(), R.layout.common_list_item, data));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                stopPlayng();
                mp = MediaPlayer.create(getActivity(), raw_falas_reaper[position]);
                mp.start();
            }
        });
        return rootView;
    }

    private void stopPlayng(){
        if (mp!=null){
            mp.stop();
            mp.release();
            mp = null;
        }
    }
    private void generateListContent(){
        for(int j=0; j<=11; j++){
            data.add(nome_falas_reaper[j]);
        }
    }
    private class ReaperListAdapter extends ArrayAdapter<String>{
        private int layout;
        public ReaperListAdapter(Context context, int resource, List<String> objects) {
            super(context, resource, objects);
            layout = resource;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            ViewHolder mainViewHolder = null;
           // if(convertView == null){
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(layout, parent, false);
                ViewHolder viewHolder  = new ViewHolder();
                viewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.list_item_thumbnail);
                viewHolder.thumbnail.setImageResource(R.drawable.reaper_cute);
                viewHolder.title = (TextView) convertView.findViewById(R.id.list_item_text);
                viewHolder.button = (ImageButton) convertView.findViewById(R.id.list_item_btn);
                viewHolder.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        File folder = new File(Environment.getExternalStorageDirectory().toString()+"/SonsOverwatch/Reaper/");
                        if(!folder.exists()) {
                            folder.mkdirs();
                        }
                        String path = Environment.getExternalStorageDirectory().toString() + "/SonsOverwatch/Reaper/";
                        File dir = new File(path);
                        try {
                            if (dir.mkdirs() || dir.isDirectory()) {
                                CopyRAWtoSDCard(raw_falas_reaper[position], path + File.separator + (nome_falas_reaper[position]+".mp3"));
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        final Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                        shareIntent.setType("audio/mp3");
                        shareIntent.putExtra(android.content.Intent.EXTRA_STREAM, Uri.parse(Environment.getExternalStorageDirectory().toString()
                                +"/SonsOverwatch/Reaper/"+(nome_falas_reaper[position]+".mp3")));
                        startActivity(Intent.createChooser(shareIntent, "Compartilhar via"));
                    }
                });
                convertView.setTag(viewHolder);
            //}else{
                mainViewHolder = (ViewHolder) convertView.getTag();
                mainViewHolder.title.setText(getItem(position));
            //}
            return convertView;
        }
    }

    public class ViewHolder{
        ImageView thumbnail;
        TextView title;
        ImageButton button;
    }

    private void CopyRAWtoSDCard(int id, String path) throws IOException {
        InputStream in = getResources().openRawResource(id);
        FileOutputStream out = new FileOutputStream(path);
        byte[] buff = new byte[1024];
        int read;

        try {
            while ((read = in.read(buff)) > 0) {
                out.write(buff, 0, read);
            }
        } finally {
            in.close();
            out.close();
        }
    }

}
