package DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class MercadaoDAO {
	
	
	
	public void iniciarBanco(Context ctx){
		try {
			
			SQLiteDatabase db = ctx.openOrCreateDatabase("mercadao.db",
					Context.MODE_PRIVATE, null);

			StringBuilder sql = new StringBuilder();		
			StringBuilder sql1 = new StringBuilder();		
			//StringBuilder sql2 = new StringBuilder();		

			sql.append("CREATE TABLE IF NOT EXISTS ");
			sql.append("PRODUTO(PRO_ID INTEGER PRIMARY KEY AUTOINCREMENT, PRO_NOME VARCHAR(30), PRO_DESCRICAO VARCHAR(100), PRO_PRECO DECIMAL(10,2)); ");
			
			sql1.append("CREATE TABLE IF NOT EXISTS ");
			sql1.append("USUARIO(USU_ID INTEGER PRIMARY KEY AUTOINCREMENT, USU_NOME VARCHAR(30), USU_EMAIL VARCHAR(40), USU_SENHA VARCHAR(20),USU_TELEFONE VARCHAR(20),  USU_ENDERECO VARCHAR(100), USU_CIDADE VARCHAR(20));");
			
		//	sql2.append("INSERT INTO USUARIO (USU_ID, USU_NOME, USU_EMAIl, USU_SENHA,USU_TELEFONE, USU_ENDERECO, USU_CIDADE) Values(787878, 'Matheus Inacio', 'mat', '123','88070552',  'Rua 1002, 221', 'Santo Antonio da Platina');");
			
			db.execSQL(sql.toString());
			db.execSQL(sql1.toString());
			//db.execSQL(sql2.toString());
			db.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
