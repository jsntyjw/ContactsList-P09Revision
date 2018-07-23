package sg.edu.rp.c346.contactslist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16003753 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Contacts> contactList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contacts> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView;
        if(convertView ==null){
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(layout_id,parent,false);
        }
        else{
            rowView = convertView;
        }

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCountryCode = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvPhoneNumber = rowView.findViewById(R.id.textViewPhoneNum);

        Contacts currentItem = contactList.get(position);
        String name = currentItem.getName();
        int code = currentItem.getPhoneNum();
        int number = currentItem.getPhoneNum();

        tvName.setText(name);
        tvCountryCode.setText("+"+code+"");
        tvPhoneNumber.setText(number+"");

        return rowView;
    }
}
