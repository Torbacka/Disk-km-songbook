package bet.apk.songbook;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = getSongs();
        final SwipeMenuListView listview = (SwipeMenuListView) findViewById(R.id.songListView);
        SongListAdapter songListAdapter = new SongListAdapter(this, 0, songs);
        listview.setAdapter(songListAdapter);

        SwipeMenuCreator creator = new SwipeMenuCreator() {

            @Override
            public void create(SwipeMenu menu) {
                // create "open" item
                SwipeMenuItem openItem = new SwipeMenuItem(
                        getApplicationContext());
                // set item background
                openItem.setBackground(new ColorDrawable(Color.rgb(0xC9, 0xC9,
                        0xCE)));
                // set item width
                openItem.setWidth(90);
                // set item title
                openItem.setTitle("Open");
                // set item title fontsize
                openItem.setTitleSize(18);
                // set item title font color
                openItem.setTitleColor(Color.WHITE);
                // add to menu
                menu.addMenuItem(openItem);

                // create "delete" item
                SwipeMenuItem deleteItem = new SwipeMenuItem(
                        getApplicationContext());
                // set item background
                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9,
                        0x3F, 0x25)));
                // set item width
                deleteItem.setWidth(90);
                // set a icon
                deleteItem.setIcon(R.drawable.ic_delete);
                // add to menu
                menu.addMenuItem(deleteItem);
            }
        };

        listview.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {
                switch (index) {
                    case 0:
                        // open
                        break;
                    case 1:
                        // delete
                        break;
                }
                // false : close the menu; true : not close the menu
                return false;
            }
        });
        listview.setSwipeDirection(SwipeMenuListView.DIRECTION_RIGHT);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        return true;
    }

    private ArrayList<Song> getSongs() {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(
                "Nationalsången",
                "Melodi: Så rider jag mig över tolvmilan skog",
                "Text: Richard Dybeck",
                "Du gamla, Du fria, Du fjällhöga nord\nDu tysta, Du glädjerika sköna!\nJag hälsar Dig, vänaste land uppå jord,\n||: Din sol, Din himmel, Dina ängder gröna. :||\n\nDu tronar på minnen från fornstora dar,\ndå ärat Ditt namn flög över jorden.\nJag vet att Du är och Du blir vad Du var.\n||: Ja, jag vill leva jag vill dö i Norden. :||\n\nJag städs vill Dig tjäna mitt älskade land,\nDin trohet till döden vill jag svära.\nDin rätt, skall jag värna, med håg och med hand,\n||: Din fana, högt den bragderika bära. :||\n\nMed Gud skall jag kämpa, för hem och för härd,\nför Sverige, den kära fosterjorden.\nJag byter Dig ej, mot allt i en värld.\n||: Nej, jag vill leva jag vill dö i Norden. :||",
                "Sången är skriven till den västmanländska folkmelodin 'Så rider jag mig över tolvmilan skog...' och framfördes första gången vid Dybecks första 'aftonunderhållning med nordisk folkmusik' i Stockholm den 18 november 1844. Då började sången 'Du gamla, Du friska' men detta ändrades senare. Sången kom med tiden att betraktas som Sveriges nationalsång."));

        songs.add(new Song(
                "Gustafs Skål",
                "",
                "Text: Carl Michael Bellman",
                "||: Gustafs skål!\nDen bäste Kung, som Norden äger: \nHan ej tål,\nAt vigtskåln ojämt väger. :|| \n||: God och glad,\n\nHan Ilskans röst föraktar \nSamt afvaktar\nOch betraktar\nDårskap i sin grad. :||\n\n||: Sådan Kung\när värd att styra Sveriges öden:\nRask och ung,\nEj rådlös uti nöden. :||\n\n||: Wasa ätt\nHar aldrig lärt att svika, \nAldrig tvika,\nMen at fika\nTill at göra rätt. :||",
                "Sveriges första nationalsång. Blev allmänt känd efter Gustaf III:s statskupp den 19 augusti 1772, men komponerades sannolikt tidigare."));

        return songs;

    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://bet.apk.songbook/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://bet.apk.songbook/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
