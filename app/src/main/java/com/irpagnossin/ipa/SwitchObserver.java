package com.irpagnossin.ipa;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class SwitchObserver implements OnCheckedChangeListener {
    Ipa ipa;
    private int row;
    private int column;
    public SwitchObserver(int row, int column, Ipa ipa) {
        this.ipa = ipa;
        this.row = row;
        this.column = column;
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        ipa.setProximity(row, column, isChecked);
    }
}
