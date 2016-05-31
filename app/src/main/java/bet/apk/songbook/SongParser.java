package bet.apk.songbook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import bet.apk.songbook.database.SongDBHelper;


/**
 * Created by Taco on 2016-05-29.
 */
public class SongParser {
    private Context context;

    public SongParser(Context context) {
        this.context = context;
    }

    public void jsonToSQL(String jsonString) {
        SongDBHelper songDBHelper = new SongDBHelper(context);
        SQLiteDatabase db = songDBHelper.getWritableDatabase();

    }
}
