package works.domain.views;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by pharr on 21/08/17.
 */

public class Adapter extends ArrayAdapter<String>{
    List<String> itemList;
    Context itemContext;



    public Adapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<String> objects) {
        super(context, resource, objects);

        itemList = objects;
        itemContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder = new ViewHolder();

        LayoutInflater adapInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = adapInflater.inflate(R.layout.itemvh,parent,false);

        viewHolder.viewHolderName = (TextView) convertView.findViewById(R.id.item_TV);

        viewHolder.viewHolderName.setText(itemList.get(position));

        convertView.setTag(viewHolder);

        return convertView;
    }

    static class ViewHolder{
        TextView viewHolderName;
    }

}