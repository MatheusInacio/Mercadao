package DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

public class UsuarioDAO {

	public static boolean verificarLogin(String email, String senha, Context ctx) {
		try {
			SQLiteDatabase bancoDados = ctx.openOrCreateDatabase("mercadao.bd",
					Context.MODE_WORLD_READABLE, null);

			Cursor cursor = bancoDados.rawQuery("SELECT USU_EMAIL, USU_SENHA FROM USUARIO WHERE USU_EMAIL = ?", new String[] { email});

			///Pedro Gay
			
			if (cursor.getCount() > 0) {
				cursor.close();
				bancoDados.close();
				Toast.makeText(ctx, "Achou", Toast.LENGTH_LONG).show();
				return true;
			} else {
				cursor.close();
				bancoDados.close();
				return false;
			}
		} catch (Exception e) {
			Toast.makeText(ctx, "FAIL, se fodeu", Toast.LENGTH_LONG).show();
			return false;
		}

	}

}
