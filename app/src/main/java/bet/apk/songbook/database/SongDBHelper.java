package bet.apk.songbook.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Taco on 2016-05-29.
 */
public class SongDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FeedReader.db";
    private static final String SQL_CREATE_TABLE =
            "CREATE TABLE " + SongContract.SongEntry.TABLE_NAME + " (" +
                    SongContract.SongEntry._ID + " INTEGER PRIMARY KEY," +
                    SongContract.SongEntry.COLUMN_NAME_ENTRY_ID + " TEXT," +
                    SongContract.SongEntry.COLUMN_NAME_TITLE + " TEXT)";

    public SongDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
       // db.execSQL();
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
