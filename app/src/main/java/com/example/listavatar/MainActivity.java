package com.example.listavatar;

import android.support.v7.app.AppCompatActivity;
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
        lvContact = (ListView)findViewById(R.id.lvContact);
        ContactAdapter adapter = new ContactAdapter(listContacts,this);
        lvContact.setAdapter(adapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ContactModel contactModel = listContacts.get(position);
                Toast.makeText(MainActivity.this,contactModel.getName(),Toast.LENGTH_LONG).show();
            }
        });

    }
    private void initData(){
        ContactModel contact = new ContactModel("Nguyen Van A","0329326112",R.drawable.ic_u1);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van B","0987654321",R.drawable.ic_u2);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van C","0987654321",R.drawable.ic_u3);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van D","0987654321",R.drawable.ic_u4);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van E","0987654321",R.drawable.ic_u5);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van F","0987654321",R.drawable.ic_u1);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van G","0987654321",R.drawable.ic_u2);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van H","0987654321",R.drawable.ic_u3);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van I","0987654321",R.drawable.ic_u4);
        listContacts.add(contact);
        contact = new ContactModel("Nguyen Van K","0987654321",R.drawable.ic_u5);
        listContacts.add(contact);
    }
}