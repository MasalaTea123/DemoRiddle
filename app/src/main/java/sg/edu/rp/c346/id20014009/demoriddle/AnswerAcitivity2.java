package sg.edu.rp.c346.id20014009.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerAcitivity2 extends AppCompatActivity {
TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_acitivity2);

        tvAnswer=findViewById(R.id.textView3);
        Intent i=getIntent();
        String questionSelected=i.getStringExtra("Question");
        int value=i.getIntExtra("ValueB",-1);
        tvAnswer.setText(questionSelected+" answer is:Gone"+value);
    }
}