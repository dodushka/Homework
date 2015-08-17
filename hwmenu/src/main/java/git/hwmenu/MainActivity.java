package git.hwmenu;


import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;



public class MainActivity extends ActionBarActivity {

    static final int GALLERY_REQUEST = 1;
    private CheckBox chb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        chb = (CheckBox) findViewById(R.id.chbExtMenu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        menu.setGroupVisible(0, chb.isChecked());
        return super.onPrepareOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.menu_1: {
                Intent intent = new Intent(getApplicationContext(), OneActivity.class);
                startActivity(intent);
                return true;
            }

            case R.id.menu_2: {
                Intent intentOne =new Intent("android.intent.action.showOneActivity");
                startActivity(intentOne);
                return true;
            }

            case R.id.menu_3:{
                Intent intentOne =new Intent("android.intent.action.showOneActivity");
                startActivity(intentOne);
                return true;
            }
            case R.id.menu_4: {
                Intent intentImage = new Intent(Intent.ACTION_PICK);
               intentImage.setType("image/*");
                startActivityForResult(intentImage, GALLERY_REQUEST);
                return true;
            }

            case R.id.menu_5: {
                Intent intent5 =new Intent("android.intent.action.showSixActivity");
                startActivity(intent5);
                return true;
            }

            case R.id.menu_6:
                Intent intentSix = new Intent(this, SixActivity.class);
                startActivity(intentSix);
                return true;
            case R.id.menu_7:
                Intent intentTwo = new Intent(this, TwoActivity.class);
                startActivity(intentTwo);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    }



