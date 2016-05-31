package bet.apk.songbook.database;

import android.provider.BaseColumns;

/**
 * Created by Taco on 2016-05-29.
 */
public class SongContract {
    public SongContract() {}

    /* Inner class that defines the table contents */
    public static abstract class SongEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";

    }

}


