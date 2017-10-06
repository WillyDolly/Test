package com.popland.pop.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by hai on 23/12/2016.
 */

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    public void testEditText(){
        EditText et = (EditText)getActivity().findViewById(R.id.edtMass);
        assertNotNull(et);
    }
    @SmallTest
    public void testButton(){
        Button bt = (Button)getActivity().findViewById(R.id.btnCalculate);
        assertNotNull(bt);
    }
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
