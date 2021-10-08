package com.fjmg.changetextsize.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.fjmg.changetextsize.ChangeSizeApplication;
import com.fjmg.changetextsize.data.Message;
import com.fjmg.changetextsize.databinding.ActivityChangeBinding;

/**
 * Esta clase genera un mensaje con un usuario , tamaño y mensaje de texto a una clase
 * @see ViewMessageActivity
 */
public class ChangeSizeTextActivity extends AppCompatActivity {
    ActivityChangeBinding binding;
    private final String Tag = "ChangeSizeTextManage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChangeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //Manda un mensaje
        binding.cambiarTextButton.setOnClickListener(view ->
        {
            //Creando mensaje
            Bundle mensaje = new Bundle();
            Message message = new Message(
                              ((ChangeSizeApplication) getApplication()).getUser(),
                              binding.textoModificar.getText().toString(),
                              binding.barraProgreso.getProgress()
                              );
            //Toda activity tiene acceso a la aplicacion y se debe hacer un casteo para obtenerlo
            //puede dar un error sino lo modificas en el manifiesto añdiendolo en el nombre
            Log.d(Tag,"((ChangeSizeApplication) getApplication()).getUser()");
            mensaje.putSerializable("message",message);
            Intent paquete = new Intent(this,ViewMessageActivity.class);
            paquete.putExtras(mensaje);
            startActivity(paquete);
        });
    }
    //Ciclo de vida

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag,"State: Start");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(Tag,"State: Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag,"State: Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag,"State: Stop");
    }
}