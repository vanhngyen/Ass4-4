package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvContact;
    private List<ContactModel> listContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        lvContact = (ListView) findViewById(R.id.lvContact);
        ContactAdater adater = new ContactAdater(listContacts,this);
        lvContact.setAdapter(adater);
        lvContact.setOnClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                ContactModel contactModel = listContacts.get(position);
                Toast.makeText(MainActivity.this,contactModel.getName(),Toast.LENGTH_SHORT).show();
            }

        });
    }

    private void initData() {
        ContactModel contact = new ContactModel("Nguyen Van A",R.drawable.ic_user_a);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van B","122627673",R.drawable.ic_user_b);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van C","122627673",R.drawable.ic_user_c);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van D","122627673",R.drawable.ic_user_d);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van E","122627673",R.drawable.ic_user_e);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van F","122627673",R.drawable.ic_user_f);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van H","122627673",R.drawable.ic_user_h);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van G","122627673",R.drawable.ic_user_g);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van K","122627673",R.drawable.ic_user_k);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van Q","122627673",R.drawable.ic_user_q);



    }
}
