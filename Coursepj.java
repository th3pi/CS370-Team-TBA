
package com.example.coursepj;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Coursepj extends MainActivity {

    String Instructorname = Courseinfo.getInstructor();
    String website = Courseinfo.getWebsite();
    String email = Courseinfo.getEmail();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coursepj);
        final TextView Inst = (TextView) findViewById(R.id.textView2);
        Inst.setText(Instructorname);
        //Add the name of the instructor to the layout
        final TextView site = (TextView) findViewById(R.id.textView3);
        site.setText(website);
        //add the website to the layout
        final TextView em = (TextView) findViewById(R.id.textView4);
        em.setText(email);
        //add the email to the layout
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.coursepj,Courseinfo.Schedule);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        ArrayAdapter adapter2 = new ArrayAdapter<String>(this,R.layout.coursepj,Courseinfo.Resources);
        ListView listView2 = (ListView) findViewById(R.id.listview2);
        listView.setAdapter(adapter);
        //the list of resources and the schedule is added to the layout as a list, maybe gotten from the server
    }

}




