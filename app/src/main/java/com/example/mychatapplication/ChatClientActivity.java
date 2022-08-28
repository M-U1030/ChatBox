package com.example.mychatapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ChatClientActivity extends AppCompatActivity {

    public static final String EXTRA_NICKNAME = "NICKNAME";;
   // private static final String EXTRA_NICKNAME = "NICKNAME";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_client);

        // 呼び出し元からパラメータ取得
        Bundle extras = getIntent().getExtras();
        String m_strNickname = null;
        if( null != extras )
        {
            m_strNickname = extras.getString( EXTRA_NICKNAME );
        }

        // ニックネームの表示
        TextView textviewNickname = (TextView)findViewById( R.id.textview_nickname );
        textviewNickname.setText( m_strNickname );
    }
}