package com.anik.screenrecordapp;

import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.Surface;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    private static final SparseIntArray ORIENTATIONS=new SparseIntArray();
    private static final int REQUEST_CODE=1000;
    private static final int REQUEST_PERMISSION=1001;
    private MediaProjection mediaProjection;
    private MediaProjectionManager mediaProjectionManager;
    private VirtualDisplay virtualDisplay;
    private MediaProjectionCallBack callBack;
    private int mScreenDensity;
    private static final int DISPLAY_WIDTH=720;
    private static final int DISPLAY_HEIGHT=1280;

    static {
        ORIENTATIONS.append(Surface.ROTATION_0,90);
        ORIENTATIONS.append(Surface.ROTATION_90,0);
        ORIENTATIONS.append(Surface.ROTATION_180,270);
        ORIENTATIONS.append(Surface.ROTATION_270,180);
    }


    private ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private class MediaProjectionCallBack {
    }
}
