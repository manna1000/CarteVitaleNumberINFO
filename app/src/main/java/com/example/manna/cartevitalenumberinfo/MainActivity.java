package com.example.manna.cartevitalenumberinfo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etid;
    Button btnenter;
    TextView tvresults;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        etid = findViewById(R.id.etid);
        btnenter = findViewById(R.id.btnenter);
        tvresults = findViewById(R.id.tvresults);

        tvresults.setVisibility(View.GONE);

        btnenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idnumber = etid.getText().toString().trim();

                int gender = Integer.parseInt(Character.toString(idnumber.charAt(0)));
                String sgender;
                if (gender == 1)
                    sgender = "Homme";
                else if (gender == 2)
                    sgender = "Femme";
                else sgender = "Autre";


                String doby = idnumber.substring(1, 3);
                int dobm =Integer.parseInt(idnumber.substring(3,5));
                String dobmm ;
                if (dobm == 1)
                    dobmm = "Janvier";
                else if (dobm ==2)
                    dobmm = "Février";
                else if (dobm ==3)
                    dobmm = "Mars";
                else if (dobm ==4)
                    dobmm = "Avril";
                else if (dobm ==5)
                    dobmm = "Mai";
                else if (dobm ==6)
                    dobmm = "Juin";
                else if (dobm ==7)
                    dobmm = "Juillet";
                else if (dobm ==8)
                    dobmm = "Août";
                else if (dobm ==9)
                    dobmm = "Septembre";
                else if (dobm ==10)
                    dobmm = "Octobre";
                else if (dobm ==11)
                    dobmm = "Novembre";
                else dobmm = "Décembre";

                int nationality = Integer.parseInt(idnumber.substring(5, 7));
                String snationality;
                if (nationality == 99)
                    snationality = "Résident en France";
                else
                    snationality = "Citoyen français";

                String commune = idnumber.substring(7, 10);
                String order = idnumber.substring(10, 13);

                String key = idnumber.substring(13);
                btnenter.onEditorAction(EditorInfo.IME_ACTION_DONE);


                String text = getString(R.string.doby)+"19" + doby + "\n" +
                        getString(R.string.dobm) + dobmm + "\n" +
                        getString(R.string.gender) + sgender + "\n" +
                        getString(R.string.nationality) + snationality + "\n" +
                        getString(R.string.commune) + commune + "\n" +
                        getString(R.string.order) + order + "\n" +
                        getString(R.string.key) + key;

                tvresults.setText(text);
                tvresults.setVisibility(View.VISIBLE);

            }

            });



    }
}
