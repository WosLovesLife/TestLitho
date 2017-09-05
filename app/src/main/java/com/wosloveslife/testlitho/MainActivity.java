package com.wosloveslife.testlitho;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ComponentContext c = new ComponentContext(this);

//        final LithoView lithoView = LithoView.create(
//                this /* context */,
//                Text.create(c)
//                        .text("Hello, World!")
//                        .textSizeDip(50)
//                        .build());
//
//        setContentView(lithoView);

        Component<ListItem> build = ListItem.create(c).build();
        setContentView(LithoView.create(c,build));
    }
}
