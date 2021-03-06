package thomazini.com.br.covid_19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirCadastroPaciente(View view){
        Intent telaCadastroPaciente = new Intent(this, CadastroPacienteActivity.class);
        startActivity(telaCadastroPaciente);
    }

    public void abrirListarPacientes(View view){
        Intent telaListarPacientes = new Intent(this, JoseActivity.class);
        startActivity(telaListarPacientes);
    }
}
