package com.greedygame.sampleappamit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private View.OnClickListener buttonListener;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch(v.getId())
                {
                    case R.id.button:
                        Toast.makeText(getApplicationContext(),"first button",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button2:
                        Toast.makeText(getApplicationContext(),"second button",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button3:
                        Toast.makeText(getApplicationContext(),"third button",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.button4:
                        Toast.makeText(getApplicationContext(),"fourth button",Toast.LENGTH_SHORT).show();
                    default:
                        break;
                }
            }

        };

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(buttonListener);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(buttonListener);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(buttonListener);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(buttonListener);
    }

/*
    public void toastMsg(String msg)
    {
        Toast toast = Toast.makeText(this,msg,Toast.LENGTH_LONG);
        toast.show();
    }
*/

}
