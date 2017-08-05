package assalaam.project.id.bandung;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity  implements View.OnClickListener {

    Button keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        keluar = (Button) findViewById(R.id.exitBtn);
        keluar.setOnClickListener(this);
    }

    public void onClick(View clicked) {
        switch (clicked.getId()) {
            case R.id.exitBtn:
                exit();
                break;
        }
    }

    private void exit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Kamu Benar-Benar ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface menu, int id) {
                        Menu.this.finish();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface menu, int arg1) {
                        // TODO Auto-generated method stub Menu.cancel();
                    }
                }).show();
    }
}
