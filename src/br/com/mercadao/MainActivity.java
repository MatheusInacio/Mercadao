package br.com.mercadao;

import DAO.MercadaoDAO;
import DAO.UsuarioDAO;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText email;
	private EditText senha;
	private Button btOk;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		email = (EditText) findViewById(R.id.edEmail);
		senha = (EditText) findViewById(R.id.edSenha);
		btOk = (Button) findViewById(R.id.btOk);

		MercadaoDAO dao = new MercadaoDAO();
		dao.iniciarBanco(MainActivity.this);
		

		btOk.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				boolean nomeEncontrado = UsuarioDAO.verificarLogin(email
						.getText().toString(), senha.getText().toString(),
						MainActivity.this);

				if (nomeEncontrado) {

				}

			}
		});

	}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
