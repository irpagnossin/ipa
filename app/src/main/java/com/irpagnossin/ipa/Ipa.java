package com.irpagnossin.ipa;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.NonNull;


public class Ipa extends BaseObservable {
    private boolean metric[][];
    private String ipa;

    Ipa() {
        this.metric = new boolean[3][3];
        // TODO: it is 2018 and we still do this?
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                metric[i][j] = false;
            }
        }

        this.ipa = formattedIpa(ipa());
    }

    @Bindable
    public String getIpa() {
        return this.ipa;
    }

    void setProximity(int row, int column, boolean near) {
        this.metric[row][column] = near;
        this.ipa = formattedIpa(ipa());
        notifyPropertyChanged(com.irpagnossin.ipa.BR.ipa);
    }

    private String formattedIpa(Double ipa) {
        return String.format("%.1f", ipa);
    }

    @NonNull
    private Double ipa() {
        return (64 * professor() + 8 * student() + asset()) / 5.11;
    }

    private Double professor() {
        return r(metric[0][0], metric[0][1], metric[0][2]);
    }

    private Double student() {
        return r(metric[1][0], metric[1][1], metric[1][2]);
    }

    private Double asset() {
        return r(metric[2][0], metric[2][1], metric[2][2]);
    }

    private Double r(boolean interaction, boolean time, boolean space) {
        return 4 * toD(interaction) + 2 * toD(time) + toD(space);
    }

    private Double toD(boolean metric) {
        return metric ? 1.0 : 0.0;
    }
}