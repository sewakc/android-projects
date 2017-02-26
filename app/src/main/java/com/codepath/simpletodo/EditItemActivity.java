package com.codepath.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        int pos = getIntent().getIntExtra("pos", 0);
        String editTextOriginal = getIntent().getStringExtra("editTextOriginal");

        EditText editText = (EditText) findViewById(R.id.etEditItem);
        editText.setText(editTextOriginal);
        //editText.setFocusable(true);
        editText.setSelection(editTextOriginal.length());
    }

    public void onSubmit(View v){
        EditText editText = (EditText) findViewById(R.id.etEditItem);
        Intent data = new Intent();
        data.putExtra("pos", getIntent().getIntExtra("pos", 0));
        data.putExtra("editTextModified", editText.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }


}
