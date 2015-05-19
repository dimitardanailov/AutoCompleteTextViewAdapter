package app.demo.adapter.autocompletetextview.autocompletetextviewadapter;

import android.widget.ArrayAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.Locale;

public class AutoCompleteTextViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        ArrayList<String> countriesNames = generateListWithCountryNames();
        ArrayAdapter<String> myCustomAdapter = new ArrayAdapter<String>(this, R.layout.text_custom_view, countriesNames);

        final AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.auto_complete_text_view);
        textView.setAdapter(myCustomAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_auto_complete_text_view, menu);
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

    /**
     * We generate ArrayList with all countries
     *
     * @return
     */
    private ArrayList<String> generateListWithCountryNames() {
        String[] locales = Locale.getISOCountries();
        ArrayList<String> countriesNames = new ArrayList<String>();

        for (String countryCode : locales) {
            Locale object = new Locale("", countryCode);
            countriesNames.add(object.getDisplayCountry());
        }

        return countriesNames;
    }
}
