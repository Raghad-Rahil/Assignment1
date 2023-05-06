package com.example.assignment1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.assignment1.model.DAOperation;
import com.example.assignment1.model.Operation;

import java.util.ArrayList;
import java.util.List;

public class OptionsActivity extends AppCompatActivity {

    Button finish;
    Button done;
//    EditText editText;
//    TextView textView;
    Spinner Spinner1;
    Spinner Spinner2;
    private ListView lview ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        finish = (Button) findViewById(R.id.btn4);
        done = (Button) findViewById(R.id.btn3);
//        editText = (EditText) findViewById(R.id.txt);
//        textView = (TextView) findViewById(R.id.txtView);
        Spinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner2 = (Spinner) findViewById(R.id.spinner2);
        lview= (ListView) findViewById(R.id.lst);

        DAOperation oper=new DAOperation();

        //get type
        ArrayAdapter<String> TypeAd=new ArrayAdapter<>(OptionsActivity.this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,oper.getType());
        Spinner1.setAdapter(TypeAd);

        //get level
        ArrayAdapter<String> LevelAd=new ArrayAdapter<>(OptionsActivity.this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,oper.getLevel());
        Spinner2.setAdapter(LevelAd);


        //when user press done
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //To clear old content
                lview.deferNotifyDataSetChanged();
                lview.invalidateViews();
                lview.refreshDrawableState();

                List<Operation> list=oper.getOp(Spinner1.getSelectedItem().toString(),Spinner2.getSelectedItem().toString());
                ArrayList<String> s=new ArrayList();
                for (Operation i :list)
                {
                    s.add(i.getOper());
                }
                ArrayAdapter<String > bAd=new ArrayAdapter<>(OptionsActivity.this,
                        androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,s);
                lview.setAdapter(bAd);

            }
        });

        //when user press next
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(OptionsActivity.this, MainActivity.class);
                OptionsActivity.this.startActivity(intent);
                finish();

            }
        });

    }

}
