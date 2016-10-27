package tw.com.a4040e032.e032;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText UN;
    private EditText PW;
    private EditText PH;
    private EditText AG;
    private Button CL;
    private TextView tvmessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        UN = (EditText) findViewById(R.id.UN);
        PW = (EditText) findViewById(R.id.PW);
        PH = (EditText) findViewById(R.id.PH);
        AG = (EditText) findViewById(R.id.AG);
        CL = (Button) findViewById(R.id.CL);
        tvmessage = (TextView) findViewById(R.id.tvmessage);

        CL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UN.setText(null);
                PW.setText(null);
                PH.setText(null);
                AG.setText(null);
                tvmessage.setText(null);
                Toast.makeText(
                        MainActivity.this,
                        R.string.msg_ClearAllFields,
                        Toast.LENGTH_SHORT
                ).show();
            }

        });
    }
    public void  onSubmitClick(View view){
        String 帳號 = UN.getText().toString().trim();
        String 密碼 = PW.getText().toString().trim();
        String 電話 = PH.getText().toString().trim();
        String 年齡 = AG.getText().toString().trim();
        String text = "";
        text += "UN = " + 帳號 + "\n";
        text += "PW = " + 密碼 + "\n";
        text += "PH = " + 電話 + "\n";
        text += "AG = " + 年齡 + "\n";
        tvmessage.setText(text);
    }
}
