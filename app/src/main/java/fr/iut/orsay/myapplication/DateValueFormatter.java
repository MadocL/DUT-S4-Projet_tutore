package fr.iut.orsay.myapplication;

import com.github.mikephil.charting.formatter.ValueFormatter;

import java.util.Date;

public class DateValueFormatter extends ValueFormatter {
    @Override
    public String getFormattedValue(float value) {
        String out = "";
        String in = new Date(new Float(value).longValue()).toString();
        String[] parts = in.split(" ");
        
        out = parts[3] + " --- " + parts[2]+ " - " + parts[1]+ " - " + parts[5];
        
        return out;
    }
}
        return new Date(new Float(value).longValue()).toString();
    }
}
