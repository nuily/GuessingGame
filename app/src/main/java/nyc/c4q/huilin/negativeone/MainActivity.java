package nyc.c4q.huilin.negativeone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView numberTV;
    private Button lowerBtn;
    private Button higherBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        numberTV.setText(String.valueOf(computerGuess()));
        lowerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void initViews() {
        numberTV = (TextView) findViewById(R.id.numberTV);
        lowerBtn = (Button) findViewById(R.id.lowerBtn);
        higherBtn = (Button) findViewById(R.id.higherBtn);
    }

    private int computerGuess() {
        Computer computer = new Computer();
        return computer.computerChoice();
    }




}
