package com.fjmg.changetextsize.UI;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.fjmg.changetextsize.data.Message;
import com.fjmg.changetextsize.databinding.ActivityChangeBinding;
import com.fjmg.changetextsize.databinding.ActivityViewMessageBinding;

/**
 * Clase que usamos para ver el mensaje generado por
 * @see com.fjmg.changetextsize.ChangeSizeApplication
 */
public class ViewMessageActivity extends AppCompatActivity
{
    ActivityViewMessageBinding binding;
    private static  final String Tag = "ActivityViewMessageManager:";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent paquete = getIntent();
        Message message = (Message) paquete.getExtras().getSerializable("message");
        binding.textView2.setText(message.getMessage());
        binding.textView2.setTextSize(message.getSize());

    }
}
