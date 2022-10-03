package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class mockquestions extends AppCompatActivity {
    ProgressBar pb;
    Button nxt_btn,clr_btn;
    int counter = 0;
    int index = 0;
    int count = 1;
    private TextView question, optionA, optionB, optionC, optionD, ic_exit,number;
    private CardView cardA, cardB, cardC, cardD;
    private ImageView image;
    private List<Question> questionList = new ArrayList<>();
    int correctcount = 0;
    int wrongcount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mockquestions);
        Hooks();
        prolog();
        String url1111;
        url1111 = getIntent().getStringExtra("pdf_url111");

        //physics set1
        if (url1111.contentEquals("phy_set1")) {
            questionList.add(new Question("question ",Uri.parse("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw1K2dTojClrItsIxL15Aufg&ust=1663838777927000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOiThsvIpfoCFQAAAAAdAAAAABAE"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question2 ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question4 ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            setQuestion();
        }
        //chemistry set1
        else if (url1111.contentEquals("chem_set1")) {
            questionList.add(new Question("question ",Uri.parse("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw1K2dTojClrItsIxL15Aufg&ust=1663838777927000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOiThsvIpfoCFQAAAAAdAAAAABAE"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question2 ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question4 ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            setQuestion();
        }
        //maths set1
        else if (url1111.contentEquals("mat_set1")) {
            questionList.add(new Question("question ",Uri.parse("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw1K2dTojClrItsIxL15Aufg&ust=1663838777927000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOiThsvIpfoCFQAAAAAdAAAAABAE"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question2 ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question4 ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            setQuestion();
        }
        //biology set1
        else if (url1111.contentEquals("bio_set1")) {
            questionList.add(new Question(" 1) Injection of an antidote against a snakebite is an example of ",Uri.parse(""), " a) auto immunity", "b) innate immunity", "c)  active immunity", "d) passive immunity", "d) passive immunity"));
            questionList.add(new Question("2) Identify the labels M and N in the following agarose gel electrophoresis representation. ",Uri.parse("https://cdn1.byjus.com/wp-content/uploads/2020/10/kcet-2020-biology-paper-with-solutions-q13.png"), "a. M - Smallest DNA bands, N - Largest DNA bands", "b. M - Digested DNA bands, N - Undigested DNA bands", "c. M - Hybridised DNA bands, N - Unhybridised DNA bands", "d. M - Largest DNA bands, N - Smallest DNA bands", "d. M - Largest DNA bands, N - Smallest DNA bands"));
            questionList.add(new Question("question ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question4 ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            questionList.add(new Question("question ",Uri.parse("https://www.nitk.ac.in/"), "A", "B", "C", "D", "A"));
            setQuestion();
        }



        ic_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 36000;
                Intent intent = new Intent(mockquestions.this, mocksubjects.class);
                startActivity(intent);
            }
        });

        clr_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enablebutton();
                resetcolour();
            }
        });

        nxt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < questionList.size() - 1) {
                    index++;
                    getQuestionsList();
                    setQuestion();
                }
                else {
                    counter = 36000;
                    gamewon();
                }

                if(index == questionList.size() - 1){
                    nxt_btn.setText("Submit");
                    nxt_btn.setBackgroundColor(getResources().getColor(R.color.Green));
                }

            }
        });

        cardA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disablebutton();
                if (questionList.get(index).getOptionA().equals(questionList.get(index).getAnswer())) {
                    Correct(cardA);

                } else {
                    Wrong(cardA);
                }

            }
        });
        cardB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disablebutton();
                if (questionList.get(index).getOptionB().equals(questionList.get(index).getAnswer())) {
                    Correct(cardB);
                } else {
                    Wrong(cardB);
                }

            }
        });
        cardC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disablebutton();
                if (questionList.get(index).getOptionC().equals(questionList.get(index).getAnswer())) {
                    Correct(cardC);

                } else {
                    Wrong(cardC);
                }

            }
        });
        cardD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disablebutton();
                if (questionList.get(index).getOptionD().equals(questionList.get(index).getAnswer())) {
                    Correct(cardD);
                } else {
                    Wrong(cardD);
                }

            }
        });

    }

    public void prolog() {
        pb = (ProgressBar) findViewById(R.id.pb);

        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {

                counter++;
                pb.setProgress(counter);


                if (counter == 100) {
                    t.cancel();
                    gamewon();

                }
            }
        };

        t.schedule(tt, 0, 36000);
    }

    public void Hooks() {
        question = findViewById(R.id.card_quetion);
        number = findViewById(R.id.number);
        optionA = findViewById(R.id.card_optiona);
        optionB = findViewById(R.id.card_optionb);
        optionC = findViewById(R.id.card_optionc);
        optionD = findViewById(R.id.card_optiond);
        cardA = findViewById(R.id.cardA);
        cardB = findViewById(R.id.cardB);
        cardC = findViewById(R.id.cardC);
        cardD = findViewById(R.id.cardD);
        nxt_btn = findViewById(R.id.nxt_btn);
        ic_exit = findViewById(R.id.ic_exit);
        clr_btn=findViewById(R.id.clr_btn);

    }

    private void getQuestionsList() {
        count=count+1;
        String count1 = String.format("%d)", count);
        number.setText(count1);
        setQuestion();

    }

    private void setQuestion() {
        question.setText(questionList.get(index).getQuestion());
        optionA.setText(questionList.get(index).getOptionA());
        optionB.setText(questionList.get(index).getOptionB());
        optionC.setText(questionList.get(index).getOptionC());
        optionD.setText(questionList.get(index).getOptionD());
    }

    public void Correct(CardView cardView) {
        cardView.setBackgroundColor(getResources().getColor(R.color.Green));

        nxt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                correctcount++;
                if (index < questionList.size() - 1) {
                    index++;
                    getQuestionsList();
                    resetcolour();
                    setQuestion();
                    enablebutton();
                } else {
                    counter = 100;
                    gamewon();
                }

            }
        });
    }

    public void Wrong(CardView cardView) {
        cardView.setBackgroundColor(getResources().getColor(R.color.Green));

        nxt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wrongcount++;
                if (index < questionList.size() - 1) {
                    index++;
                    getQuestionsList();
                    resetcolour();
                    setQuestion();
                    enablebutton();

                } else {
                    counter = 100;
                    gamewon();
                }
            }
        });


    }

    private void gamewon() {
        Intent intent = new Intent(mockquestions.this, wonactivity.class);
        intent.putExtra("Correct", correctcount);
        intent.putExtra("Wrong", wrongcount);
        startActivity(intent);
    }

    public void enablebutton() {
        cardA.setClickable(true);
        cardB.setClickable(true);
        cardC.setClickable(true);
        cardD.setClickable(true);
    }

    public void disablebutton() {
        cardA.setClickable(false);
        cardB.setClickable(false);
        cardC.setClickable(false);
        cardD.setClickable(false);
    }

    public void resetcolour() {
        cardA.setBackgroundColor(getResources().getColor(R.color.white));
        cardB.setBackgroundColor(getResources().getColor(R.color.white));
        cardC.setBackgroundColor(getResources().getColor(R.color.white));
        cardD.setBackgroundColor(getResources().getColor(R.color.white));
    }
}