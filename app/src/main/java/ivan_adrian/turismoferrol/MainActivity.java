package ivan_adrian.turismoferrol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ivan_adrian.turismoferrol.Intents.layoutDescubrePrueba;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void metodoMapa(View v){
        TextView t=findViewById(R.id.lblPrueba);
        t.setText("se pulso el boton mapa");
    }

    public void metodoDescubre(View v){
        Intent descubre=new Intent(getApplicationContext(), layoutDescubrePrueba.class);
        startActivity(descubre);
    }
    public void metodoNoche(View v){
        TextView t=findViewById(R.id.lblPrueba);
        t.setText("se pulso el boton noche en ferrol");
    }
    public void metodoRico(View v){
        TextView t=findViewById(R.id.lblPrueba);
        t.setText("se pulso el boton rico rico");
    }
    public void metodoActividades(View v){
        TextView t=findViewById(R.id.lblPrueba);
        t.setText("se pulso el boton actividades");
    }
    public void metodoMenu(View v){
        TextView t=findViewById(R.id.lblPrueba);
        t.setText("se pulso el boton de menu");
    }
    public void metodoIdiomas(View v){
        TextView t=findViewById(R.id.lblPrueba);
        t.setText("se pulso el boton de seleccion de idioma");
    }

}
