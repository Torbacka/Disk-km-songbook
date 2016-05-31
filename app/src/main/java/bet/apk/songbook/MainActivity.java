package bet.apk.songbook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = getSongs();
        final ListView listview = (ListView) findViewById(R.id.songListView);
        SongListAdapter songListAdapter = new SongListAdapter(this, 0, songs);
        listview.setAdapter(songListAdapter);


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
}
