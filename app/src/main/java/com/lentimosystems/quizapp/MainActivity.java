package com.lentimosystems.quizapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnAnswer1, btnAnswer2, btnAnswer3, btnAnswer4;
    TextView txtScore, txtQuestion;
    private Questions mPresidents = new Questions();

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mPresidents.mPresidents.length;
    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();

        btnAnswer1 = (Button)findViewById(R.id.btnAnswer1);
        btnAnswer2 = (Button)findViewById(R.id.btnAnswer2);
        btnAnswer3 = (Button)findViewById(R.id.btnAnswer3);
        btnAnswer4 = (Button)findViewById(R.id.btnAnswer4);

        txtScore = (TextView)findViewById(R.id.txtScore);
        txtQuestion = (TextView)findViewById(R.id.txtQuestion);

        txtScore.setText("Score: " + mScore);

        updateQuestion(r.nextInt(mQuestionsLength));

        btnAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnAnswer1.getText() == mAnswer) {
                    mScore++;
                    txtScore.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });
        btnAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnAnswer2.getText() == mAnswer) {
                    mScore++;
                    txtScore.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }

            }
        });
        btnAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnAnswer3.getText() == mAnswer) {
                    mScore++;
                    txtScore.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }

            }
        });
        btnAnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnAnswer4.getText() == mAnswer) {
                    mScore++;
                    txtScore.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }

            }
        });

    }
    private void updateQuestion(int num) {
        txtQuestion.setText(mPresidents.getQuestion(num));
        btnAnswer1.setText(mPresidents.getChoice1(num));
        btnAnswer2.setText(mPresidents.getChoice2(num));
        btnAnswer3.setText(mPresidents.getChoice3(num));
        btnAnswer4.setText(mPresidents.getChoice4(num));

        mAnswer = mPresidents.getCorrectAnswer(num);
    }
    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Game Over! Your score is " + mScore + "points")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }

                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }

                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
}
