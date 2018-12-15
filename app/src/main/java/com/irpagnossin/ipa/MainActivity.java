package com.irpagnossin.ipa;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

import com.irpagnossin.ipa.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    Ipa ipa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding= DataBindingUtil.setContentView(this,R.layout.main_activity);
        ipa = new Ipa();
        binding.setIpa(ipa);

        Switch toggle;

        toggle = findViewById(R.id.switch00);
        toggle.setOnCheckedChangeListener(new SwitchObserver(0, 0, ipa));
        toggle = findViewById(R.id.switch01);
        toggle.setOnCheckedChangeListener(new SwitchObserver(0, 1, ipa));
        toggle = findViewById(R.id.switch02);
        toggle.setOnCheckedChangeListener(new SwitchObserver(0, 2, ipa));
        toggle = findViewById(R.id.switch10);
        toggle.setOnCheckedChangeListener(new SwitchObserver(1, 0, ipa));
        toggle = findViewById(R.id.switch11);
        toggle.setOnCheckedChangeListener(new SwitchObserver(1, 1, ipa));
        toggle = findViewById(R.id.switch12);
        toggle.setOnCheckedChangeListener(new SwitchObserver(1, 2, ipa));
        toggle = findViewById(R.id.switch20);
        toggle.setOnCheckedChangeListener(new SwitchObserver(2, 0, ipa));
        toggle = findViewById(R.id.switch21);
        toggle.setOnCheckedChangeListener(new SwitchObserver(2, 1, ipa));
        toggle = findViewById(R.id.switch22);
        toggle.setOnCheckedChangeListener(new SwitchObserver(2, 2, ipa));
    }
}
