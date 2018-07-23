package sg.edu.rp.c346.contactslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contacts> alContact;
    CustomAdapter caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContact);
        alContact = new ArrayList<>();

        Contacts contact1 = new Contacts("Mary",65,65442334);
        Contacts contact2 = new Contacts("Ken",65,97442437);
        alContact.add(contact1);
        alContact.add(contact2);

        caContact = new CustomAdapter(this,R.layout.contact_item,alContact);

        lvContact.setAdapter(caContact);
    }
}
