package android.example.com.visualizerpreferences;


import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by curti on 1/28/2018.
 */

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}



// TODO (5) In SettingsFragment's onCreatePreferences method add the preference file using the
// addPreferencesFromResource method