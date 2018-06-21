package navegador.up.edu.br.cortex;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conn extends SQLiteOpenHelper {
    private static Conn conn;
    public static Conn getInstance(){return conn;}

    public Conn(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super (context,name,factory,version);
        conn = this;

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String statement = "CREATE TABLE tarefa("+
                "id integer primary key autoincrement,"+
                "titulo varchar(250) not null,"+
                "descricao varchar(250),"+
                "dataInicio date not null,"+
                "dataFim date,"+
                "sequencial varchar(15),"+
                "statusTarefa boolean not null default 0"+
                ")";
        sqLiteDatabase.execSQL(statement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
