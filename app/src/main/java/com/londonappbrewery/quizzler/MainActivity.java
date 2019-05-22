package com.londonappbrewery.quizzler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    // TODO: Declare constants here


    // TODO: Declare member variables here:
    Button mTrueButton;
    Button mFalseButton;
    TextView mScoreTextView;
    TextView mQuestionTextView;
    ProgressBar mProgressBar;


    // TODO: Uncomment to create question bank
//    private TrueFalse[] mQuestionBank = new TrueFalse[] {
//            new TrueFalse(R.string.question_1, true),
//            new TrueFalse(R.string.question_2, true),
//            new TrueFalse(R.string.question_3, true),
//            new TrueFalse(R.string.question_4, true),
//            new TrueFalse(R.string.question_5, true),
//            new TrueFalse(R.string.question_6, false),
//            new TrueFalse(R.string.question_7, true),
//            new TrueFalse(R.string.question_8, false),
//            new TrueFalse(R.string.question_9, true),
//            new TrueFalse(R.string.question_10, true),
//            new TrueFalse(R.string.question_11, false),
//            new TrueFalse(R.string.question_12, false),
//            new TrueFalse(R.string.question_13,true)
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTrueButton = findViewById(R.id.true_button);
        mFalseButton = findViewById(R.id.false_button);
        mScoreTextView = findViewById(R.id.score);
        mQuestionTextView = findViewById(R.id.question_text_view);
        mProgressBar = findViewById(R.id.progress_bar);


        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "True", Toast.LENGTH_SHORT).show();
                checkAnswer(true);
                updateQuestion();
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "False", Toast.LENGTH_SHORT).show();
                checkAnswer(false);
                updateQuestion();
            }
        });

    }

       /* public class TrueFalse{
            private int mQuestion;
            private boolean mAswer;

            public TrueFalse(int questionId, int trueOrFalse){
                return;
            }

            public int getQuestion() {
                return 0;
            }

            public boolean mAswer(){
                return mAswer;
            };


        }*/

    private boolean checkAnswer(boolean b) {
        return b;
    }

    private void updateQuestion() {

    }
}
