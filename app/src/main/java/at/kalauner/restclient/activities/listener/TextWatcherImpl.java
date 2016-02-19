package at.kalauner.restclient.activities.listener;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

/**
 * Created by Paul on 19.02.2016.
 */
public class TextWatcherImpl implements TextWatcher {

    private Button button;

    public TextWatcherImpl(Button button) {
        this.button = button;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (!this.button.isEnabled())
            this.button.setEnabled(true);
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
