package com.example.ex08;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.inappmessaging.model.Button;

public class smsactivity extends AppCompatActivity { EditText edtsms;
        Button btnback2; ImageButton btnsendsms; @Override
        protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.sms_layout);
            edtsms = (EditText) findViewById(R.id.edtsms);
            btnback2 = (Button) findViewById(R.id.btnback2); btnsendsms = (ImageButton) findViewById(R.id.btnsendsms); btnsendsms.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callintent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:"+edtsms.getText().toString()));
                    startActivity(callintent);
                }
            });
            btnback2.setOnClickListener(new View.OnClickListener() { @Override
            public void onClick(View view) { finish();
            }
            });
        }
    }


