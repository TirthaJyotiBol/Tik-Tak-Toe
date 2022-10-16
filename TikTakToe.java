package com.example.bol;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TikTakToe extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset;
    String B1,B2,B3,B4,B5,B6,B7,B8,B9;
    TextView result;
    TextView nextPlayer;
    LinearLayout ll;
    boolean canClick = true;

    boolean flag = true;
    int moves = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tik_tak_toe);

        ll = findViewById(R.id.linearMain);
        // whenever my App is Opened I initialised
        init();

        result = findViewById(R.id.winnerResult);
        reset = findViewById(R.id.reset_game);
        nextPlayer = findViewById(R.id.nextPlayer);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });


    }

    // Whenever I Click on any of the Button It Works

    public void clickButton(View view){
       Button currentBtn = (Button) view;


       if(currentBtn.getText().equals("") && canClick == true ){
           moves++;
           if(flag){
               currentBtn.setText("X");
               currentBtn.setBackgroundColor(Color.RED);
               nextPlayer.setText("Player 2's Turn");
               flag = false;
           }
           else{
               currentBtn.setBackgroundColor(Color.GREEN);
               nextPlayer.setText("Player 1's Turn");
               currentBtn.setText("O");
               flag = true;
           }

           if(moves>4){
               B1 = b1.getText().toString();
               B2 = b2.getText().toString();
               B3 = b3.getText().toString();
               B4 = b4.getText().toString();
               B5 = b5.getText().toString();
               B6 = b6.getText().toString();
               B7 = b7.getText().toString();
               B8 = b8.getText().toString();
               B9 = b9.getText().toString();
               String winner;

               // Row 1
               if(B1.equals(B2) && B2.equals(B3) && !B1.equals("")){
                   if(B1.equals("X")){
                       winner = "Player 1";
                   }else{
                       winner = "Player 2";
                   }
                   result.setText(winner+" Wins");
                   canClick = false;  // to make further clickable possible
                   nextPlayer.setText(" ");
               }
               // Row 2
               else if(B4.equals(B5) && B5.equals(B6) && !B4.equals("")){
                   if(B4.equals("X")){
                       winner = "Player 1";
                   }else{
                       winner = "Player 2";
                   }
                   canClick = false;
                   result.setText(winner+" Wins");
                   nextPlayer.setText(" ");
               }
               // Row 3
               else if(B7.equals(B8) && B8.equals(B9) && !B7.equals("")){
                   if(B7.equals("X")){
                       winner = "Player 1";
                   }else{
                       winner = "Player 2";
                   }
                   canClick = false;
                   nextPlayer.setText(" ");
                   result.setText(winner+" Wins");
               }

               // Column 1
               else if(B1.equals(B4) && B4.equals(B7) && !B1.equals("")){
                   if(B1.equals("X")){
                       winner = "Player 1";
                   }else{
                       winner = "Player 2";
                   }
                   canClick = false;
                   nextPlayer.setText(" ");
                   result.setText(winner+" Wins");
               }

               // Column 2
               else if(B2.equals(B5) && B5.equals(B8) && !B2.equals("")){
                   if(B2.equals("X")){
                       winner = "Player 1";
                   }else{
                       winner = "Player 2";
                   }
                   canClick = false;
                   nextPlayer.setText(" ");
                   result.setText(winner+" Wins");
               }

               // Column 3
               else if(B3.equals(B6) && B6.equals(B9) && !B3.equals("")){
                   if(B3.equals("X")){
                       winner = "Player 1";
                   }else{
                       winner = "Player 2";
                   }
                   canClick = false;
                   nextPlayer.setText(" ");
                   result.setText(winner+" Wins");
               }

               // Diagonal 1
               else if(B1.equals(B5) && B5.equals(B9) && !B1.equals("") ){
                   if(B1.equals("X")){
                       winner = "Player 1";
                   }else{
                       winner = "Player 2";
                   }
                   canClick = false;
                   nextPlayer.setText(" ");
                   result.setText(winner+" Wins");
               }

               // Diagonal 2
               else if(B3.equals(B5) && B5.equals(B7) && !B3.equals("") ){
                   if(B3.equals("X")){
                       winner = "Player 1";
                   }else{
                       winner = "Player 2";
                   }
                   canClick = false;
                   nextPlayer.setText(" ");
                   result.setText(winner+" Wins");
               }

               // Condition For Draw
               else if(moves >= 9) {
                   canClick = false;
                   nextPlayer.setText("");
                   result.setText("DRAW");
               }
           }
       }
    }

    void reset(){
        canClick = true;
        flag = true;
        moves = 0;
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        b1.setBackgroundColor(Color.BLACK);
        b2.setBackgroundColor(Color.BLACK);
        b3.setBackgroundColor(Color.BLACK);
        b4.setBackgroundColor(Color.BLACK);
        b5.setBackgroundColor(Color.BLACK);
        b6.setBackgroundColor(Color.BLACK);
        b7.setBackgroundColor(Color.BLACK);
        b8.setBackgroundColor(Color.BLACK);
        b9.setBackgroundColor(Color.BLACK);
        nextPlayer.setText(" ");
        result.setText(" ");
    }

    void init(){
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
    }

}
