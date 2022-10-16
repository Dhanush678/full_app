package net.smallacademy.authenticatorapp.utility;

import static net.smallacademy.authenticatorapp.R.style.CustomAlertDialog;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;

import net.smallacademy.authenticatorapp.R;

public class NetworkChangeList extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, final Intent intent) {
        if (!common.isConnectedToInternet(context)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context, CustomAlertDialog);
            View layout_dialog = LayoutInflater.from(context).inflate(R.layout.check_internet_dialog, null);
            builder.setView(layout_dialog);
            AppCompatButton btnretry = layout_dialog.findViewById(R.id.btnRetry);


            final AlertDialog dialog = builder.create();
            dialog.show();
            dialog.setCancelable(false);
            dialog.getWindow().setGravity(Gravity.CENTER);

            btnretry.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                    onReceive(context, intent);


                }
            });

        }
    }
}
