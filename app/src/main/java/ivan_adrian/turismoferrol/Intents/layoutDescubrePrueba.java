package ivan_adrian.turismoferrol.Intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import ivan_adrian.turismoferrol.MainActivity;
import ivan_adrian.turismoferrol.R;

public class layoutDescubrePrueba extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_descubre_prueba);
    }

    public void atras(){
        Intent intent=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
