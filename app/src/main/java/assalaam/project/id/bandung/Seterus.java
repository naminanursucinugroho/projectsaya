package assalaam.project.id.bandung;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class Seterus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seterus);

    }

    public void onPressme(View view)
    {
        Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show();
    }
    }


