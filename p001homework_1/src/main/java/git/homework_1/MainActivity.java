package git.homework_1;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity  {

    Button connect;
    Button sign;
    Button log;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        connect = (Button)findViewById(R.id.connect);
        sign=(Button)findViewById(R.id.sign);
        log=(Button)findViewById(R.id.log);



        View.OnClickListener oclBtn= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

                switch (v.getId()) {
                    case R.id.connect:
                        connect.setBackgroundColor(color);
                        Toast.makeText(MainActivity.this, "this is button CONNECT WITH FACEBOOK",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.sign:
                        sign.setBackgroundColor(color);
                        Toast.makeText(MainActivity.this, "this is button SIGN UP",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.log:
                        log.setBackgroundColor(color);
                        Toast.makeText(MainActivity.this, "this is button LOG IN",Toast.LENGTH_LONG).show();
                        break;
                }

            }


        };
        connect.setOnClickListener(oclBtn);
        sign.setOnClickListener(oclBtn);
        log.setOnClickListener(oclBtn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
