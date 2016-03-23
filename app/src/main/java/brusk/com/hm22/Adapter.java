package brusk.com.hm22;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends ArrayAdapter{

    int []imgs={};
    String[]names ={};
    String[] languages={};
    Context c;
    LayoutInflater inflater ;

    public Adapter(Context context, String[]names, String[]languages, int[]imgs) {
        super(context, R.layout.row_icon,names);

        this.c=context;
        this.names=names;
        this.languages=languages;
        this.imgs=imgs;

    }

    public class ViewHolder{

        TextView nameTv;
        TextView languageTv;
        ImageView img;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.row_icon,null);

        }
        final ViewHolder holder=new ViewHolder();

        holder.nameTv= (TextView) convertView.findViewById(R.id.nameTv);
        holder.languageTv= (TextView) convertView.findViewById(R.id.languageTv);
        holder.img= (ImageView) convertView.findViewById(R.id.img);

        holder.img.setImageResource(imgs[position]);
        holder.nameTv.setText(names[position]);
        holder.languageTv.setText(languages[position]);

        return convertView;

    }
}
