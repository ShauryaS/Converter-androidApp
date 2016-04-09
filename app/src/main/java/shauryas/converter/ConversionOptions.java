package shauryas.converter;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConversionOptions extends AppCompatActivity {

    private String[] unitCategories;
    private String[] units;
    private String startUnit = "Start Unit";
    private String endUnit = "End Unit";
    private Button subutton;
    private Button eubutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_options);
        setUnits();
        subutton = (Button) findViewById(R.id.button2);
        eubutton = (Button) findViewById(R.id.button3);
        subutton.setText(startUnit);
        eubutton.setText(endUnit);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_conversion_options, menu);
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

    public void setUnits(){

    }

    public void setStartUnit(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Starting Units").setItems(unitCategories, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //startUnit = units[id];
                //subutton.setText(startUnit);
            }
        }).show();
    }

    public void setEndUnit(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ending Units").setItems(unitCategories, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                //endUnit = units[id];
                //eubutton.setText(endUnit);
            }
        }).show();
    }

    public void convert(View view){

    }

}
