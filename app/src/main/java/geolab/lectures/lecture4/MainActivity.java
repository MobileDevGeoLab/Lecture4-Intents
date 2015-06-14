package geolab.lectures.lecture4;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMe(View view){
        /**
         * Google Search
         */
//        Intent searchIntent = new Intent();
//        searchIntent.setAction(Intent.ACTION_WEB_SEARCH);
//        searchIntent.putExtra(SearchManager.QUERY, "Who is Jemo");
//        startActivity(searchIntent);

        /**
         * Sms Intent
         */
//        Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:599888888"));
//        smsIntent.putExtra("sms_body", "Baro Chorna");
//        startActivity(smsIntent);

        /**
         * Call Intent
         */
//        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:Chorna"));
//        startActivity(callIntent);



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
