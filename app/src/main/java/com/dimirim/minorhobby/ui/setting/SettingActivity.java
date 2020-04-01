package com.dimirim.minorhobby.ui.setting;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import com.dimirim.minorhobby.R;
import com.dimirim.minorhobby.ui.main.MainActivity;
import com.dimirim.minorhobby.ui.profile.ProfileActivity;

public class SettingActivity extends AppCompatActivity {

    ImageButton back; // 뒤로가기
    Button profile_modify; // 프로필수정
    Switch push_notification; // 푸시 알림

    TextView nickname; // 닉네임
    TextView local_situation; //사는 곳

    Button updata_guide; //업데이트 안내
    Button hobbie_tag_add; //취미 및 태그 추가 안내
    Button service_check_guide; //서비스 점검/중단 안내

    Button open_source_license; //오픈소스 라이선스
    Button privacy_policy; // 개인정보 처리방침
    Button company_information; //회사정보

    TextView vs; //버전

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        back = (ImageButton)findViewById(R.id.back);
        profile_modify = (Button)findViewById(R.id.profile_modify);
        push_notification = (Switch)findViewById(R.id.push_notification);

        nickname = (TextView)findViewById(R.id.nickname);
        local_situation = (TextView)findViewById(R.id.local_situation);

        updata_guide = (Button)findViewById(R.id.updata_guide);
        hobbie_tag_add = (Button)findViewById(R.id.hobbie_tag_add);
        service_check_guide = (Button)findViewById(R.id.service_check_guide);

        open_source_license = (Button)findViewById(R.id.open_source_license);
        privacy_policy = (Button)findViewById(R.id.privacy_policy);
        company_information = (Button)findViewById(R.id.company_information);

        vs = (TextView)findViewById(R.id.vs);

        SetListener();
    }
    public void SetListener() {
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
        profile_modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        push_notification.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // 스위치 버튼이 체크되었는지 검사하여 텍스트뷰에 각 경우에 맞게 출력합니다.
                if (isChecked){
                    //체크 됐을 때
                    Bitmap mLargeIconForNoti = BitmapFactory.decodeResource(getResources(), R.drawable.logo);
                    PendingIntent mPendingIntent = PendingIntent.getActivity(SettingActivity.this, 0,
                            new Intent(getApplicationContext(), SettingActivity.class),
                            PendingIntent.FLAG_UPDATE_CURRENT);

                    NotificationCompat.Builder mBulider =
                            new NotificationCompat.Builder(SettingActivity.this)
                                    .setSmallIcon(R.drawable.logo)
                                    .setContentTitle("마하")
                                    .setContentText("마이너님이 게시물에 좋아요를 눌렀습니다.")
                                    .setDefaults(Notification.DEFAULT_SOUND)
                                    .setLargeIcon(mLargeIconForNoti)
                                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                                    .setAutoCancel(true)
                                    .setContentIntent(mPendingIntent);
                    NotificationManager mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    mNotificationManager.notify(0, mBulider.build());
                } else {
                    //체크 안됐을 때

                }
            }
        });
        updata_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        hobbie_tag_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        service_check_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        open_source_license.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        privacy_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        company_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
