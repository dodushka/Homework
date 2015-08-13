package git.homework_1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;


public class MainActivity extends Activity {

    Button connect;
    Button sign;
    Button log;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        connect = (Button) findViewById(R.id.connect);
        sign = (Button) findViewById(R.id.sign);
        log = (Button) findViewById(R.id.log);

       //на уровне интерфейсов не на уровни конкретики любой вью может иметь бэкграунд
        View.OnClickListener oclBtn = new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                GradientDrawable sd = (GradientDrawable) v.getBackground().mutate();
                sd.setColor(color);
                sd.invalidateSelf();
                if(v instanceof TextView){
                Toast.makeText(MainActivity.this, "this is button  " + ((TextView) v).getText(), Toast.LENGTH_LONG).show();}
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
