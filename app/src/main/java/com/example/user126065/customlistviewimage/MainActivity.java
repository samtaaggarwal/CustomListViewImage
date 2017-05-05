package com.example.user126065.customlistviewimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    String[] animals = {"cat","dog","rat","pig","lion"};
    int[] images = {R.drawable.cat,R.drawable.dog,R.drawable.rat,R.drawable.pig,R.drawable.lion};

     ListView mylist;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomAdapter customAdapter = new CustomAdapter();
        mylist = (ListView)findViewById(R.id.mylist);
        mylist.setAdapter(customAdapter);

    }
    public class CustomAdapter extends BaseAdapter
    {


        @Override
        public int getCount()
        {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            convertView = getLayoutInflater().inflate(R.layout.custom_view_activity,null);
            TextView rowText = (TextView)convertView.findViewById(R.id.customTextView);
            ImageView rowImage = (ImageView) convertView.findViewById(R.id.customImageView);

            rowText.setText(animals[position]);
            rowImage.setImageResource(images[position]);
            return convertView;
        }
    }
}
