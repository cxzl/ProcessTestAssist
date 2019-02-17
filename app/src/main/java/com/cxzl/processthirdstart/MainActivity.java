package com.cxzl.processthirdstart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int START_STANDARD = 0;
    public static final int START_SINGLEINSTANCE = 1;
    public int startModel = START_STANDARD;

    public static final int MULTI_PROCESS_OFF = 0;
    public static final int MULTI_PROCESS_ON = 1;
    public int multiProcess = MULTI_PROCESS_OFF;

    public static final int PROCESS_DEFUALT = 0;
    public static final int PROCESS_PRIVATE = 1;
    public static final int PROCESS_PUBLIC = 2;
    public int process = PROCESS_DEFUALT;

    private static String PROCESSTEST_ACTION000 = "com.cxzl.processtest_action000";
    private static String PROCESSTEST_ACTION001 = "com.cxzl.processtest_action001";
    private static String PROCESSTEST_ACTION002 = "com.cxzl.processtest_action002";
    private static String PROCESSTEST_ACTION010 = "com.cxzl.processtest_action010";
    private static String PROCESSTEST_ACTION011 = "com.cxzl.processtest_action011";
    private static String PROCESSTEST_ACTION012 = "com.cxzl.processtest_action012";
    private static String PROCESSTEST_ACTION100 = "com.cxzl.processtest_action100";
    private static String PROCESSTEST_ACTION101 = "com.cxzl.processtest_action101";
    private static String PROCESSTEST_ACTION102 = "com.cxzl.processtest_action102";
    private static String PROCESSTEST_ACTION110 = "com.cxzl.processtest_action110";
    private static String PROCESSTEST_ACTION111 = "com.cxzl.processtest_action111";
    private static String PROCESSTEST_ACTION112 = "com.cxzl.processtest_action112";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRadio();
        initClick();
    }

    private void initRadio(){
        RadioGroup radioGroup = findViewById(R.id.rg_start);
        radioGroup.check(R.id.rb_standard);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.rb_standard:
                        startModel = START_STANDARD;
                        break;
                    case R.id.rb_singleinstance:
                        startModel = START_SINGLEINSTANCE;
                        break;
                }
            }
        });

        RadioGroup radioGroup1 = findViewById(R.id.rg_multiprocess);
        radioGroup1.check(R.id.rb_multprocess_off);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.rb_multprocess_off:
                        multiProcess = MULTI_PROCESS_OFF;
                        break;
                    case R.id.rb_multprocess_on:
                        multiProcess = MULTI_PROCESS_ON;
                        break;
                }
            }
        });

        RadioGroup radioGroup2 = findViewById(R.id.rg_process);
        radioGroup2.check(R.id.rb_process_default);
        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.rb_process_default:
                        process = PROCESS_DEFUALT;
                        break;
                    case R.id.rb_process_private:
                        process = PROCESS_PRIVATE;
                        break;
                    case R.id.rb_process_public:
                        process = PROCESS_PUBLIC;
                        break;
                }
            }
        });
    }

    private void initClick(){
        TextView tvClick = findViewById(R.id.tv_click);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                String activityCode = "" + startModel + multiProcess + process;
                switch (activityCode){
                    case "000":
                        i.setAction(PROCESSTEST_ACTION000);
                        startActivity(i);
                        break;
                    case "001":
                        i.setAction(PROCESSTEST_ACTION001);                        startActivity(i);
                        break;
                    case "002":
                        i.setAction(PROCESSTEST_ACTION002);                        startActivity(i);
                        break;
                    case "010":
                        i.setAction(PROCESSTEST_ACTION010);                        startActivity(i);
                        startActivity(i);
                        break;
                    case "011":
                        i.setAction(PROCESSTEST_ACTION011);                        startActivity(i);
                        startActivity(i);
                        break;
                    case "012":
                        i.setAction(PROCESSTEST_ACTION012);                        startActivity(i);
                        startActivity(i);
                        break;
                    case "100":
                        i.setAction(PROCESSTEST_ACTION100);                        startActivity(i);
                        startActivity(i);
                        break;
                    case "101":
                        i.setAction(PROCESSTEST_ACTION101);                        startActivity(i);
                        startActivity(i);
                        break;
                    case "102":
                        i.setAction(PROCESSTEST_ACTION102);                        startActivity(i);
                        startActivity(i);
                        break;
                    case "110":
                        i.setAction(PROCESSTEST_ACTION110);                        startActivity(i);
                        startActivity(i);
                        break;
                    case "111":
                        i.setAction(PROCESSTEST_ACTION111);                        startActivity(i);
                        startActivity(i);
                        break;
                    case "112":
                        i.setAction(PROCESSTEST_ACTION112);                        startActivity(i);
                        startActivity(i);
                        break;
                }
            }
        };
        tvClick.setOnClickListener(onClickListener);
    }
}

