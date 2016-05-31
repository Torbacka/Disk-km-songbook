package bet.apk.songbook;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Taco on 2016-05-29.
 */
public class SongListAdapter extends ArrayAdapter<Song> {
    private Activity activity;
    private ArrayList<Song> songs;
    private static LayoutInflater inflater = null;
    private static final String TAG = "SongListAdapter";

    public SongListAdapter(Activity activity, int textViewResourceId, ArrayList<Song> songs) {
        super(activity, textViewResourceId, songs);
        try {
            this.activity = activity;
            this.songs = songs;
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        } catch (Exception e) {
            Log.e(TAG, "Cought error inflating the application", e);
            Toast.makeText(activity.getApplicationContext(), "Error inflating song list", Toast.LENGTH_SHORT).show();
        }
    }

    public int getCount() {
        return songs.size();
    }

    public Song getItem(Integer position) {
        return songs.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        public TextView display_name;
        public TextView display_number;

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        final ViewHolder holder;

        if (convertView == null) {
            vi = inflater.inflate(R.layout.song_list, parent, false);
            holder = new ViewHolder();

            holder.display_name = (TextView) vi.findViewById(R.id.textView);
            holder.display_number = (TextView) vi.findViewById(R.id.textView2);

            vi.setTag(holder);
        } else {
            holder = (ViewHolder) vi.getTag();
        }

        holder.display_name.setText(songs.get(position).getTitle());
        String melody = songs.get(position).getMelody();
        if (melody != null) {
            holder.display_number.setText(melody);
        }


        return vi;
    }
}
