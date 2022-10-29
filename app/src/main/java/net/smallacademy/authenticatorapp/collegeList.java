package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import net.smallacademy.authenticatorapp.utility.NetworkChangeList;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class collegeList extends AppCompatActivity {
    NetworkChangeList networkChangeList = new NetworkChangeList();

    TextView shine,shine1,shine2,shine3,shine4,shine5,shine6,shine7,shine8,shine9,shine10,shine11,shine12,shine13,shine14,shine15,shine16,shine17,shine18,shine19,shine20,shine21,shine22,shine23,shine24,shine25,shine26,shine27,shine28,shine29,shine30,shine31,shine32,shine33,shine34,shine35,shine36,shine37,shine38,shine39,shine40,shine41,shine42,shine43,shine44,shine45,shine46,shine47,shine48,shine49,shine50,shine51,shine52,shine53,shine54,shine55,shine56,shine57,shine58,shine59,shine60,shine61,shine62,shine63,shine64,shine65,shine66,shine67,shine68,shine69,shine70,shine71,shine72,shine73,shine74,shine75,shine76,shine77,shine78,shine79,shine80,shine81,shine82,shine83,shine84,shine85,shine86,shine87,shine88,shine89,shine90,shine91,shine92,shine93,shine94,shine95,shine96,shine97,shine98,shine99,shine100,shine101,shine102,shine103,shine104,shine105,shine106,shine107,shine108,shine109,shine110,shine111,shine112,shine113,shine114,shine115,shine116,shine117,shine118,shine119,shine120,shine121,shine122,shine123,shine124,shine125,shine126,shine127,shine128,shine129,shine130,shine131,shine132,shine133,shine134,shine135,shine136,shine137,shine138,shine139,shine140,shine141,shine142,shine143,shine144,shine145,shine146,shine147,shine148,shine149,shine150,shine151,shine152,shine153,shine154,shine155,shine156,shine157,shine158,shine159,shine160,shine161,shine162,shine163,shine164,shine165,shine166,shine167,shine168,shine169,shine170,shine171,shine172,shine173,shine174,shine175,shine176,shine177,shine178,shine179,shine180,shine181,shine182,shine183,shine184,shine185,shine186,shine187,shine188,shine189,shine190,shine191,shine192,shine193,shine194,shine195,shine196,shine197,shine198,shine199,shine200,shine201,shine202,shine203,shine204,shine205,shine206,shine207,shine208,shine209,shine210,shine211,shine212,shine213,shine214,shine215,shine216,shine217;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_list);
        ImageView back = findViewById(R.id.back);

        shine=findViewById(R.id.shine);
        shine1=findViewById(R.id.shine1);
        shine2=findViewById(R.id.shine2);
        shine3=findViewById(R.id.shine3);
        shine4=findViewById(R.id.shine4);
        shine5=findViewById(R.id.shine5);
        shine6=findViewById(R.id.shine6);
        shine7=findViewById(R.id.shine7);
        shine8=findViewById(R.id.shine8);
        shine9=findViewById(R.id.shine9);
        shine10=findViewById(R.id.shine10);
        shine11=findViewById(R.id.shine11);
        shine12=findViewById(R.id.shine12);
        shine13=findViewById(R.id.shine13);
        shine14=findViewById(R.id.shine14);
        shine15=findViewById(R.id.shine15);
        shine16=findViewById(R.id.shine16);
        shine17=findViewById(R.id.shine17);
        shine18=findViewById(R.id.shine18);
        shine19=findViewById(R.id.shine19);
        shine20=findViewById(R.id.shine20);
        shine21=findViewById(R.id.shine21);
        shine22=findViewById(R.id.shine22);
        shine23=findViewById(R.id.shine23);
        shine24=findViewById(R.id.shine24);
        shine25=findViewById(R.id.shine25);
        shine26=findViewById(R.id.shine26);
        shine27=findViewById(R.id.shine27);
        shine28=findViewById(R.id.shine28);
        shine29=findViewById(R.id.shine29);
        shine30=findViewById(R.id.shine30);

        shine31=findViewById(R.id.shine31);
        shine32=findViewById(R.id.shine32);
        shine33=findViewById(R.id.shine33);
        shine34=findViewById(R.id.shine34);
        shine35=findViewById(R.id.shine35);
        shine36=findViewById(R.id.shine36);
        shine37=findViewById(R.id.shine37);
        shine38=findViewById(R.id.shine38);
        shine39=findViewById(R.id.shine39);
        shine40=findViewById(R.id.shine40);
        shine41=findViewById(R.id.shine41);
        shine42=findViewById(R.id.shine42);
        shine43=findViewById(R.id.shine43);
        shine44=findViewById(R.id.shine44);
        shine45=findViewById(R.id.shine45);
        shine46=findViewById(R.id.shine46);
        shine47=findViewById(R.id.shine47);
        shine48=findViewById(R.id.shine48);
        shine49=findViewById(R.id.shine49);
        shine50=findViewById(R.id.shine50);
        shine51=findViewById(R.id.shine51);
        shine52=findViewById(R.id.shine52);
        shine53=findViewById(R.id.shine53);
        shine54=findViewById(R.id.shine54);
        shine55=findViewById(R.id.shine55);
        shine56=findViewById(R.id.shine56);
        shine57=findViewById(R.id.shine57);
        shine58=findViewById(R.id.shine58);
        shine59=findViewById(R.id.shine59);
        shine60=findViewById(R.id.shine60);

        shine61=findViewById(R.id.shine61);
        shine62=findViewById(R.id.shine62);
        shine63=findViewById(R.id.shine63);
        shine64=findViewById(R.id.shine64);
        shine65=findViewById(R.id.shine65);
        shine66=findViewById(R.id.shine66);
        shine67=findViewById(R.id.shine67);
        shine68=findViewById(R.id.shine68);
        shine69=findViewById(R.id.shine69);
        shine70=findViewById(R.id.shine70);
        shine71=findViewById(R.id.shine71);
        shine72=findViewById(R.id.shine72);
        shine73=findViewById(R.id.shine73);
        shine74=findViewById(R.id.shine74);
        shine75=findViewById(R.id.shine75);
        shine76=findViewById(R.id.shine76);
        shine77=findViewById(R.id.shine77);
        shine78=findViewById(R.id.shine78);
        shine79=findViewById(R.id.shine79);
        shine80=findViewById(R.id.shine80);
        shine81=findViewById(R.id.shine81);
        shine82=findViewById(R.id.shine82);
        shine83=findViewById(R.id.shine83);
        shine84=findViewById(R.id.shine84);
        shine85=findViewById(R.id.shine85);
        shine86=findViewById(R.id.shine86);
        shine87=findViewById(R.id.shine87);
        shine88=findViewById(R.id.shine88);
        shine89=findViewById(R.id.shine89);
        shine90=findViewById(R.id.shine90);

        shine91=findViewById(R.id.shine91);
        shine92=findViewById(R.id.shine92);
        shine93=findViewById(R.id.shine93);
        shine94=findViewById(R.id.shine94);
        shine95=findViewById(R.id.shine95);
        shine96=findViewById(R.id.shine96);
        shine97=findViewById(R.id.shine97);
        shine98=findViewById(R.id.shine98);
        shine99=findViewById(R.id.shine99);
        shine100=findViewById(R.id.shine100);
        shine101=findViewById(R.id.shine101);
        shine102=findViewById(R.id.shine102);
        shine103=findViewById(R.id.shine103);
        shine104=findViewById(R.id.shine104);
        shine105=findViewById(R.id.shine105);
        shine106=findViewById(R.id.shine106);
        shine107=findViewById(R.id.shine107);
        shine108=findViewById(R.id.shine108);
        shine109=findViewById(R.id.shine109);
        shine110=findViewById(R.id.shine110);
        shine111=findViewById(R.id.shine111);
        shine112=findViewById(R.id.shine112);
        shine113=findViewById(R.id.shine113);
        shine114=findViewById(R.id.shine114);
        shine115=findViewById(R.id.shine115);
        shine116=findViewById(R.id.shine116);
        shine117=findViewById(R.id.shine117);
        shine118=findViewById(R.id.shine118);
        shine119=findViewById(R.id.shine119);
        shine120=findViewById(R.id.shine120);

        shine121=findViewById(R.id.shine121);
        shine122=findViewById(R.id.shine122);
        shine123=findViewById(R.id.shine123);
        shine124=findViewById(R.id.shine124);
        shine125=findViewById(R.id.shine125);
        shine126=findViewById(R.id.shine126);
        shine127=findViewById(R.id.shine127);
        shine128=findViewById(R.id.shine128);
        shine129=findViewById(R.id.shine129);
        shine130=findViewById(R.id.shine130);
        shine131=findViewById(R.id.shine131);
        shine132=findViewById(R.id.shine132);
        shine133=findViewById(R.id.shine133);
        shine134=findViewById(R.id.shine134);

        shine136=findViewById(R.id.shine136);
        shine137=findViewById(R.id.shine137);
        shine138=findViewById(R.id.shine138);
        shine139=findViewById(R.id.shine139);
        shine140=findViewById(R.id.shine140);
        shine141=findViewById(R.id.shine141);
        shine142=findViewById(R.id.shine142);
        shine143=findViewById(R.id.shine143);
        shine144=findViewById(R.id.shine144);
        shine145=findViewById(R.id.shine145);
        shine146=findViewById(R.id.shine146);
        shine147=findViewById(R.id.shine147);
        shine148=findViewById(R.id.shine148);
        shine149=findViewById(R.id.shine149);
        shine150=findViewById(R.id.shine150);
        shine151=findViewById(R.id.shine151);
        shine152=findViewById(R.id.shine152);
        shine153=findViewById(R.id.shine153);
        shine154=findViewById(R.id.shine154);
        shine155=findViewById(R.id.shine155);
        shine156=findViewById(R.id.shine156);
        shine157=findViewById(R.id.shine157);
        shine158=findViewById(R.id.shine158);
        shine159=findViewById(R.id.shine159);
        shine160=findViewById(R.id.shine160);

        shine161=findViewById(R.id.shine161);
        shine162=findViewById(R.id.shine162);
        shine163=findViewById(R.id.shine163);
        shine164=findViewById(R.id.shine164);
        shine165=findViewById(R.id.shine165);
        shine166=findViewById(R.id.shine166);
        shine167=findViewById(R.id.shine167);
        shine168=findViewById(R.id.shine168);
        shine169=findViewById(R.id.shine169);
        shine170=findViewById(R.id.shine170);
        shine171=findViewById(R.id.shine171);
        shine172=findViewById(R.id.shine172);
        shine173=findViewById(R.id.shine173);
        shine174=findViewById(R.id.shine174);
        shine175=findViewById(R.id.shine175);
        shine176=findViewById(R.id.shine176);
        shine177=findViewById(R.id.shine177);
        shine178=findViewById(R.id.shine178);
        shine179=findViewById(R.id.shine179);
        shine180=findViewById(R.id.shine180);
        shine181=findViewById(R.id.shine181);
        shine182=findViewById(R.id.shine182);
        shine183=findViewById(R.id.shine183);
        shine184=findViewById(R.id.shine184);
        shine185=findViewById(R.id.shine185);
        shine186=findViewById(R.id.shine186);
        shine187=findViewById(R.id.shine187);
        shine188=findViewById(R.id.shine188);
        shine189=findViewById(R.id.shine189);
        shine190=findViewById(R.id.shine190);

        shine191=findViewById(R.id.shine191);
        shine192=findViewById(R.id.shine192);
        shine193=findViewById(R.id.shine193);
        shine194=findViewById(R.id.shine194);

        shine196=findViewById(R.id.shine196);
        shine197=findViewById(R.id.shine197);
        shine198=findViewById(R.id.shine198);
        shine199=findViewById(R.id.shine199);
        shine200=findViewById(R.id.shine200);
        shine201=findViewById(R.id.shine201);
        shine202=findViewById(R.id.shine202);
        shine203=findViewById(R.id.shine203);
        shine204=findViewById(R.id.shine204);
        shine205=findViewById(R.id.shine205);
        shine206=findViewById(R.id.shine206);
        shine207=findViewById(R.id.shine207);
        shine208=findViewById(R.id.shine208);
        shine209=findViewById(R.id.shine209);
        shine210=findViewById(R.id.shine210);
        shine211=findViewById(R.id.shine211);
        shine212=findViewById(R.id.shine212);
        shine213=findViewById(R.id.shine213);
        shine214=findViewById(R.id.shine214);
        shine215=findViewById(R.id.shine215);
        shine216=findViewById(R.id.shine216);





        ScheduledExecutorService scheduledExecutorService= Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        setShine();

                    }
                });
            }
        },2,15, TimeUnit.SECONDS);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fin = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(fin);

            }
        });
    }

    private void setShine(){
        Animation animation=new TranslateAnimation(0,shine.getWidth()+shine1.getWidth()+shine2.getWidth()+shine3.getWidth()+shine4.getWidth()+shine5.getWidth()+shine6.getWidth()+shine7.getWidth()+shine8.getWidth()+shine9.getWidth()+shine10.getWidth()+shine11.getWidth()+shine12.getWidth()+shine13.getWidth()+shine14.getWidth()+shine15.getWidth(),0,0);
        animation.setDuration(100000);
        animation.setFillAfter(false);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        shine.startAnimation(animation);
        shine1.startAnimation(animation);
        shine2.startAnimation(animation);
        shine3.startAnimation(animation);
        shine4.startAnimation(animation);
        shine5.startAnimation(animation);
        shine6.startAnimation(animation);
        shine7.startAnimation(animation);
        shine8.startAnimation(animation);
        shine9.startAnimation(animation);
        shine10.startAnimation(animation);
        shine11.startAnimation(animation);
        shine12.startAnimation(animation);
        shine13.startAnimation(animation);
        shine14.startAnimation(animation);
        shine15.startAnimation(animation);
        shine16.startAnimation(animation);
        shine17.startAnimation(animation);
        shine18.startAnimation(animation);
        shine19.startAnimation(animation);
        shine20.startAnimation(animation);
        shine21.startAnimation(animation);
        shine22.startAnimation(animation);
        shine23.startAnimation(animation);
        shine24.startAnimation(animation);
        shine25.startAnimation(animation);
        shine26.startAnimation(animation);
        shine27.startAnimation(animation);
        shine28.startAnimation(animation);
        shine29.startAnimation(animation);
        shine30.startAnimation(animation);
        shine31.startAnimation(animation);
        shine32.startAnimation(animation);
        shine33.startAnimation(animation);
        shine34.startAnimation(animation);
        shine35.startAnimation(animation);
        shine36.startAnimation(animation);
        shine37.startAnimation(animation);
        shine38.startAnimation(animation);
        shine39.startAnimation(animation);
        shine40.startAnimation(animation);
        shine41.startAnimation(animation);
        shine42.startAnimation(animation);
        shine43.startAnimation(animation);
        shine44.startAnimation(animation);
        shine45.startAnimation(animation);
        shine46.startAnimation(animation);
        shine47.startAnimation(animation);
        shine48.startAnimation(animation);
        shine49.startAnimation(animation);
        shine50.startAnimation(animation);
        shine51.startAnimation(animation);
        shine52.startAnimation(animation);
        shine53.startAnimation(animation);
        shine54.startAnimation(animation);
        shine55.startAnimation(animation);
        shine56.startAnimation(animation);
        shine57.startAnimation(animation);
        shine58.startAnimation(animation);
        shine59.startAnimation(animation);
        shine60.startAnimation(animation);
        shine61.startAnimation(animation);
        shine62.startAnimation(animation);
        shine63.startAnimation(animation);
        shine64.startAnimation(animation);
        shine65.startAnimation(animation);
        shine66.startAnimation(animation);
        shine67.startAnimation(animation);
        shine68.startAnimation(animation);
        shine69.startAnimation(animation);
        shine70.startAnimation(animation);
        shine71.startAnimation(animation);
        shine72.startAnimation(animation);
        shine73.startAnimation(animation);
        shine74.startAnimation(animation);
        shine75.startAnimation(animation);
        shine76.startAnimation(animation);
        shine77.startAnimation(animation);
        shine78.startAnimation(animation);
        shine79.startAnimation(animation);
        shine80.startAnimation(animation);
        shine81.startAnimation(animation);
        shine82.startAnimation(animation);
        shine83.startAnimation(animation);
        shine84.startAnimation(animation);
        shine85.startAnimation(animation);
        shine86.startAnimation(animation);
        shine87.startAnimation(animation);
        shine88.startAnimation(animation);
        shine89.startAnimation(animation);
        shine90.startAnimation(animation);
        shine91.startAnimation(animation);
        shine92.startAnimation(animation);
        shine93.startAnimation(animation);
        shine94.startAnimation(animation);
        shine95.startAnimation(animation);
        shine96.startAnimation(animation);
        shine97.startAnimation(animation);
        shine98.startAnimation(animation);
        shine99.startAnimation(animation);
        shine100.startAnimation(animation);
        shine101.startAnimation(animation);
        shine102.startAnimation(animation);
        shine103.startAnimation(animation);
        shine104.startAnimation(animation);
        shine105.startAnimation(animation);
        shine106.startAnimation(animation);
        shine107.startAnimation(animation);
        shine108.startAnimation(animation);
        shine109.startAnimation(animation);
        shine110.startAnimation(animation);
        shine111.startAnimation(animation);
        shine112.startAnimation(animation);
        shine113.startAnimation(animation);
        shine114.startAnimation(animation);
        shine115.startAnimation(animation);
        shine116.startAnimation(animation);
        shine117.startAnimation(animation);
        shine118.startAnimation(animation);
        shine119.startAnimation(animation);
        shine120.startAnimation(animation);
        shine121.startAnimation(animation);
        shine122.startAnimation(animation);
        shine123.startAnimation(animation);
        shine124.startAnimation(animation);
        shine125.startAnimation(animation);
        shine126.startAnimation(animation);
        shine127.startAnimation(animation);
        shine128.startAnimation(animation);
        shine129.startAnimation(animation);
        shine130.startAnimation(animation);

        shine131.startAnimation(animation);
        shine132.startAnimation(animation);
        shine133.startAnimation(animation);
        shine134.startAnimation(animation);

        shine136.startAnimation(animation);
        shine137.startAnimation(animation);
        shine138.startAnimation(animation);
        shine139.startAnimation(animation);

        shine140.startAnimation(animation);
        shine141.startAnimation(animation);
        shine142.startAnimation(animation);
        shine143.startAnimation(animation);
        shine144.startAnimation(animation);
        shine145.startAnimation(animation);
        shine146.startAnimation(animation);
        shine147.startAnimation(animation);
        shine148.startAnimation(animation);
        shine149.startAnimation(animation);
        shine150.startAnimation(animation);
        shine151.startAnimation(animation);
        shine152.startAnimation(animation);
        shine153.startAnimation(animation);
        shine154.startAnimation(animation);
        shine155.startAnimation(animation);
        shine156.startAnimation(animation);
        shine157.startAnimation(animation);
        shine158.startAnimation(animation);
        shine159.startAnimation(animation);
        shine160.startAnimation(animation);

        shine160.startAnimation(animation);
        shine161.startAnimation(animation);
        shine162.startAnimation(animation);
        shine163.startAnimation(animation);
        shine164.startAnimation(animation);
        shine165.startAnimation(animation);
        shine166.startAnimation(animation);
        shine167.startAnimation(animation);
        shine168.startAnimation(animation);
        shine169.startAnimation(animation);

        shine170.startAnimation(animation);
        shine171.startAnimation(animation);
        shine172.startAnimation(animation);
        shine173.startAnimation(animation);
        shine174.startAnimation(animation);
        shine175.startAnimation(animation);
        shine176.startAnimation(animation);
        shine177.startAnimation(animation);
        shine178.startAnimation(animation);
        shine179.startAnimation(animation);

        shine180.startAnimation(animation);
        shine181.startAnimation(animation);
        shine182.startAnimation(animation);
        shine183.startAnimation(animation);
        shine184.startAnimation(animation);
        shine185.startAnimation(animation);
        shine186.startAnimation(animation);
        shine187.startAnimation(animation);
        shine188.startAnimation(animation);
        shine189.startAnimation(animation);

        shine190.startAnimation(animation);
        shine191.startAnimation(animation);
        shine192.startAnimation(animation);
        shine193.startAnimation(animation);
        shine194.startAnimation(animation);

        shine196.startAnimation(animation);
        shine197.startAnimation(animation);
        shine198.startAnimation(animation);
        shine199.startAnimation(animation);

        shine200.startAnimation(animation);
        shine201.startAnimation(animation);
        shine202.startAnimation(animation);
        shine203.startAnimation(animation);
        shine204.startAnimation(animation);
        shine205.startAnimation(animation);
        shine206.startAnimation(animation);
        shine207.startAnimation(animation);
        shine208.startAnimation(animation);
        shine209.startAnimation(animation);
        shine210.startAnimation(animation);

        shine211.startAnimation(animation);
        shine212.startAnimation(animation);
        shine213.startAnimation(animation);
        shine214.startAnimation(animation);

        shine215.startAnimation(animation);
        shine216.startAnimation(animation);









    }




    public void open1(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://uvce.ac.in/"));
        startActivity(browser);
    }
    public void more1(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/university-visvesvaraya-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open2(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gec.karnataka.gov.in/sksjti/public/en"));
        startActivity(browser);
    }
    public void more2(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/government-sri-krishnarajendra-silver-jubilee-technological-institute-bangalore");
        startActivity(intent);
    }

    public void open3(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bmsce.ac.in/"));
        startActivity(browser);
    }
    public void more3(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bms-college-of-engineering-bangalore");
        startActivity(intent);
    }

    public void open4(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https:https://drait.edu.in/"));
        startActivity(browser);
    }
    public void more4(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/dr-ambedkar-institute-of-technology-bangalore");
        startActivity(intent);
    }

    public void open5(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rvce.edu.in/"));
        startActivity(browser);
    }
    public void more5(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/rv-college-of-engineering-bangalore");
        startActivity(intent);
    }

    public void open6(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.msrit.edu/"));
        startActivity(browser);
    }
    public void more6(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/ramaiah-institute-of-technology-bangalore");
        startActivity(intent);
    }

    public void open7(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dsce.edu.in/"));
        startActivity(browser);
    }
    public void more7(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/dayananda-sagar-college-of-engineering-bangalore");
        startActivity(intent);
    }

    public void open8(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bit-bangalore.edu.in/"));
        startActivity(browser);
    }
    public void more8(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bangalore-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open9(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pes.edu/"));
        startActivity(browser);
    }
    public void more9(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/pes-university-bangalore");
        startActivity(intent);
    }

    public void open10(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://islamiahit.ac.in/"));
        startActivity(browser);
    }
    public void more10(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/islamiah-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open11(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mvjce.edu.in/"));
        startActivity(browser);
    }
    public void more11(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/mvj-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open12(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sirmvit.edu/"));
        startActivity(browser);
    }
    public void more12(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sir-m-visvesvaraya-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open13(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ghousiaedu.org/"));
        startActivity(browser);
    }
    public void more13(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/ghousia-college-of-engineering-ramanagara/amp");
        startActivity(intent);
    }

    public void open14(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sjcit.ac.in/"));
        startActivity(browser);
    }
    public void more14(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sjc-institute-of-technology-chickballapur/amp");
        startActivity(intent);
    }

    public void open15(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drttit.gvet.edu.in/"));
        startActivity(browser);
    }
    public void more15(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/dr-t-thimmaiah-institute-of-technology-kolar/amp");
        startActivity(intent);
    }

    public void open16(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sit.ac.in/"));
        startActivity(browser);
    }
    public void more16(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/siddaganga-institute-of-technology-tumkur/amp");
        startActivity(intent);
    }

    public void open17(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ssit.edu.in/"));
        startActivity(browser);
    }
    public void more17(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sri-siddhartha-institute-of-technology-tumkur/amp");
        startActivity(intent);
    }

    public void open18(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kittiptur.ac.in/"));
        startActivity(browser);
    }
    public void more18(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/kalpataru-institute-of-technology-tumkur/amp");
        startActivity(intent);
    }

    public void open21(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://jssstuniv.in/"));
        startActivity(browser);
    }
    public void more21(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/jss-science-and-technology-university-mysuru/amp");
        startActivity(intent);
    }

    public void open22(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nie.ac.in/"));
        startActivity(browser);
    }
    public void more22(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/nie-institute-of-technology-mysore/amp");
        startActivity(intent);
    }

    public void open23(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pescemandya.org/"));
        startActivity(browser);
    }
    public void more23(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/pes-college-of-engineering-mandya/amp");
        startActivity(intent);
    }

    public void open24(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.careers360.com/colleges/pes-college-of-engineering-mandya/amp"));
        startActivity(browser);
    }
    public void more24(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/malnad-college-of-engineering-hassan/amp");
        startActivity(intent);
    }

    public void open28(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tce.ac.in/"));
        startActivity(browser);
    }
    public void more28(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/tontadarya-college-of-engineering-gadag/amp");
        startActivity(intent);
    }

    public void open29(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mmec.edu.in/"));
        startActivity(browser);
    }
    public void more29(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/maratha-mandal-engineering-college-belgaum/amp");
        startActivity(intent);
    }

    public void open30(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kletech.ac.in/"));
        startActivity(browser);
    }
    public void more30(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/kle-technological-university-hubballi/amp");
        startActivity(intent);
    }

    public void open31(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.becbgk.edu/"));
        startActivity(browser);
    }
    public void more31(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bvv-sanghas-basaveshwar-engineering-college-bagalkot/amp");
        startActivity(intent);
    }

    public void open32(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rechulkoti.edu.in/"));
        startActivity(browser);
    }
    public void more32(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/rte-societys-rural-engineering-college-hulkoti/amp");
        startActivity(intent);
    }

    public void open33(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://stjit.ac.in/index.html"));
        startActivity(browser);
    }
    public void more33(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sri-taralbalu-jagadguru-institute-of-technology-haveri/amp");
        startActivity(intent);
    }

    public void open34(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sdmcet.ac.in/"));
        startActivity(browser);
    }
    public void more34(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sdm-college-of-engineering-and-technology-dharwad/amp");
        startActivity(intent);
    }

    public void open35(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aitm.edu.in/"));
        startActivity(browser);
    }
    public void more35(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/angadi-institute-of-technology-and-management-belgavi/amp");
        startActivity(intent);
    }

    public void open36(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.klescet.ac.in/"));
        startActivity(browser);
    }
    public void more36(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/kle-dr-ms-sheshgiri-college-of-engineering-and-technology-belgaum/amp");
        startActivity(intent);
    }

    public void open37(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.git.edu/"));
        startActivity(browser);
    }
    public void more37(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/kls-gogte-institute-of-technology-belagavi/amp");
        startActivity(intent);
    }

    public void open38(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bldeacet.ac.in/"));
        startActivity(browser);
    }
    public void more38(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bldeas-vp-dr-pg-halakatti-college-of-engineering-and-technology-bijapur/amp");
        startActivity(intent);
    }

    public void open40(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hsit.ac.in/"));
        startActivity(browser);
    }
    public void more40(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sjpn-trusts-hirasugar-institute-of-technology-belgaum/amp");
        startActivity(intent);
    }

    public void open41(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pdacek.ac.in/"));
        startActivity(browser);
    }
    public void more41(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/hke-societys-pda-college-of-engineering-gulbarga/amp");
        startActivity(intent);
    }

    public void open42(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kbn.university/"));
        startActivity(browser);
    }
    public void more42(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/khaja-bandanawaz-institute-of-medical-sciences-gulbarga/amp");
        startActivity(intent);
    }

    public void open43(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gndecb.ac.in/"));
        startActivity(browser);
    }
    public void more43(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/guru-nanak-dev-engineering-college-bidar/amp");
        startActivity(intent);
    }

    public void open44(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://recbhalki.org/"));
        startActivity(browser);
    }
    public void more44(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bheemanna-khandre-institute-of-technology-bhalki/amp");
        startActivity(intent);
    }

    public void open45(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rymec.in/"));
        startActivity(browser);
    }
    public void more45(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/rao-bahadur-y-mahabaleshwarappa-engineering-college-bellary/amp");
        startActivity(intent);
    }

    public void open46(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://slnceraichur.com/"));
        startActivity(browser);
    }
    public void more46(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/hke-societys-sln-college-of-engineering-raichur/amp");
        startActivity(intent);
    }

    public void open53(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nmamit.nitte.edu.in/"));
        startActivity(browser);
    }
    public void more53(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/nitte-university-mangalore/amp");
        startActivity(intent);
    }

    public void open54(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kvgengg.com/"));
        startActivity(browser);
    }
    public void more54(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/kvg-college-of-engineering-sullia/amp");
        startActivity(intent);
    }

    public void open55(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pace.edu.in/"));
        startActivity(browser);
    }
    public void more55(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/pa-college-of-engineering-mangalore/amp");
        startActivity(intent);
    }

    public void open61(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ubdtce.org/"));
        startActivity(browser);
    }
    public void more61(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/university-bdt-college-of-engineering-davangere/amp");
        startActivity(intent);
    }

    public void open62(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bietdvg.edu/"));
        startActivity(browser);
    }
    public void more62(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bapuji-institute-of-engineering-and-technology-davangere/amp");
        startActivity(intent);
    }

    public void open63(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sjmit.ac.in/"));
        startActivity(browser);
    }
    public void more63(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sjm-institute-of-technology-chitradurga/amp");
        startActivity(intent);
    }

    public void open64(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://aitckm.in/"));
        startActivity(browser);
    }
    public void more64(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/adichunchanagiri-institute-of-technology-chikmagalur/amp");
        startActivity(intent);
    }

    public void open65(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://jnnce.ac.in/jnndemo/"));
        startActivity(browser);
    }
    public void more65(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/jawaharlal-nehru-national-college-of-engineering-shimoga/amp");
        startActivity(intent);
    }

    public void open70(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bce.org.in/"));
        startActivity(browser);
    }
    public void more70(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bahubali-college-o");
        startActivity(intent);
    }

    public void open71(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vvce.ac.in/"));
        startActivity(browser);
    }
    public void more71(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/vidyavardhaka-college-of-engineering-mysore/amp");
        startActivity(intent);
    }

    public void open75(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bitm.edu.in/"));
        startActivity(browser);
    }
    public void more75(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/ballari-institute-of-technology-and-management-bellary/amp");
        startActivity(intent);
    }

    public void open76(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://pdit.ac.in/"));
        startActivity(browser);
    }
    public void more76(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/proudadevaraya-institute-of-technology-hospet/amp");
        startActivity(intent);
    }

    public void open77(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://vidyavikasengineering.com/"));
        startActivity(browser);
    }
    public void more77(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/vidya-vikas-institute-of-engineering-and-technology-mysore/amp");
        startActivity(intent);
    }

    public void open78(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.theoxford.edu/engineering/"));
        startActivity(browser);
    }
    public void more78(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/the-oxford-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open79(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.acharya.ac.in/"));
        startActivity(browser);
    }
    public void more79(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/acharya-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open81(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hmsit.ac.in/"));
        startActivity(browser);
    }
    public void more81(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/hms-institute-of-technology-tumkur/amp");
        startActivity(intent);
    }

    public void open82(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://jssateb.ac.in/"));
        startActivity(browser);
    }
    public void more82(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/jss-academy-of-technical-education-bangalore/amp");
        startActivity(intent);
    }

    public void open83(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hkbk.edu.in/"));
        startActivity(browser);
    }
    public void more83(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/hkbk-college-of-engineering-bangalore");
        startActivity(intent);
    }

    public void open85(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apsce.ac.in/"));
        startActivity(browser);
    }
    public void more85(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/aps-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open86(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sairamce.edu.in/"));
        startActivity(browser);
    }
    public void more86(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sri-sairam-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open87(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vitb.ac.in/"));
        startActivity(browser);
    }
    public void more87(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/vivekananda-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open88(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bcet.co.in/"));
        startActivity(browser);
    }
    public void more88(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bangalore-college-of-engineering-and-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open89(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more89(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","");
        startActivity(intent);
    }

    public void open90(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://srsect.edu.in/"));
        startActivity(browser);
    }
    public void more90(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sri-revana-siddeshwara-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open91(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ksit.ac.in/"));
        startActivity(browser);
    }
    public void more91(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/ks-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open92(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vemanait.edu.in/"));
        startActivity(browser);
    }
    public void more92(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/vemana-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open93(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.betbkec.com/"));
        startActivity(browser);
    }
    public void more93(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/basavakalyan-engineering-college-bidar/amp");
        startActivity(intent);
    }

    public void open94(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.citcoorg.edu.in/"));
        startActivity(browser);
    }
    public void more94(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/coorg-institute-of-technology-kodagu/amp");
        startActivity(intent);
    }

    public void open95(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://amcgroup.edu.in/"));
        startActivity(browser);
    }
    public void more95(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/amc-engineering-college-bangalore");
        startActivity(intent);
    }

    public void open96(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eastpoint.ac.in/"));
        startActivity(browser);
    }
    public void more96(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/east-point-college-of-engineering-and-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open97(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cmrit.ac.in/"));
        startActivity(browser);
    }
    public void more97(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/cmr-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open98(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://atria.edu/"));
        startActivity(browser);
    }
    public void more98(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/atria-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open99(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://newhorizonindia.edu/"));
        startActivity(browser);
    }
    public void more99(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/new-horizon-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open100(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.knsit.com/"));
        startActivity(browser);
    }
    public void more100(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/kns-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open101(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cittumkur.org/"));
        startActivity(browser);
    }
    public void more101(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/channabasaveshwara-institute-of-technology-tumkur/amp");
        startActivity(intent);
    }

    public void open102(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dbit.co.in/"));
        startActivity(browser);
    }
    public void more102(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/don-bosco-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open103(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gat.ac.in/"));
        startActivity(browser);
    }
    public void more103(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/global-academy-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open104(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ncet.co.in/"));
        startActivity(browser);
    }
    public void more104(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/nagarjuna-college-of-engineering-and-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open105(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nmit.ac.in/"));
        startActivity(browser);
    }
    public void more105(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/nitte-meenakshi-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open106(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://ewit.edu.in/"));
        startActivity(browser);
    }
    public void more106(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/east-west-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open107(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bnmit.org/"));
        startActivity(browser);
    }
    public void more107(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bnm-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open108(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sapthagiri.edu.in/"));
        startActivity(browser);
    }
    public void more108(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sapthagiri-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open109(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cityengineeringcollege.ac.in/"));
        startActivity(browser);
    }
    public void more109(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/city-engineering-college-bangalore/amp");
        startActivity(intent);
    }

    public void open110(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more110(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/yellamma-dasappa-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open111(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.svcengg.edu.in/"));
        startActivity(browser);
    }
    public void more111(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sri-venkateshwara-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open112(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.skit.org.in/"));
        startActivity(browser);
    }
    public void more112(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sri-krishna-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open113(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sambhramit.com/"));
        startActivity(browser);
    }
    public void more113(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sambhram-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open114(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmit.ac.in/"));
        startActivity(browser);
    }
    public void more114(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/gm-institute-of-technology-davangere/amp");
        startActivity(intent);
    }

    public void open115(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sjbit.edu.in/"));
        startActivity(browser);
    }
    public void more115(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sjb-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open116(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rljit.in/"));
        startActivity(browser);
    }
    public void more116(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/rl-jalappa-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open117(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more117(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/alpha-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open118(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rnsit.ac.in/"));
        startActivity(browser);
    }
    public void more118(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/rns-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open119(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kctengineering.edu.in/"));
        startActivity(browser);
    }
    public void more119(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/kct-engineering-college-gulbarga/cut-off");
        startActivity(intent);
    }

    public void open120(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://jvitedu.in/"));
        startActivity(browser);
    }
    public void more120(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/jnana-vikas-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open121(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vcetputtur.ac.in/"));
        startActivity(browser);
    }
    public void more121(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/vivekananda-college-of-engineering-and-technology-puttur/amp");
        startActivity(intent);
    }

    public void open123(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.canaraengineering.in/"));
        startActivity(browser);
    }
    public void more123(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/canara-engineering-college-mangalore/amp");
        startActivity(intent);
    }

    public void open124(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rgit.ac.in/"));
        startActivity(browser);
    }
    public void more124(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/rajiv-gandhi-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open126(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bmsit.ac.in/"));
        startActivity(browser);
    }
    public void more126(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bms-institute-of-technology-and-management-bangalore/courses/be-btech-idpg");
        startActivity(intent);
    }

    public void open127(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.msec.ac.in/"));
        startActivity(browser);
    }
    public void more127(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://engineering.careers360.com/colleges/list-of-ms-engineering-colleges-in-bangalore");
        startActivity(intent);
    }

    public void open128(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sharnbasvauniversity.edu.in/"));
        startActivity(browser);
    }
    public void more128(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/sharnbasva-university-kalaburagi/amp");
        startActivity(intent);
    }

    public void open129(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sjec.ac.in/"));
        startActivity(browser);
    }
    public void more129(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/st-joseph-engineering-college-mangalore/amp");
        startActivity(intent);
    }

    public void open130(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.shrideviengineering.org/"));
        startActivity(browser);
    }
    public void more130(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/shridevi-institute-of-engineering-and-technology-tumkur/amp");
        startActivity(intent);
    }

    public void open131(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more131(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/basava-academy-of-engineering-bangalore");
        startActivity(intent);
    }

    public void open132(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://siet.secab.org/"));
        startActivity(browser);
    }
    public void more132(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/secab-institute-of-engineering-and-technology-bijapur/amp");
        startActivity(intent);
    }

    public void open133(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geethashishu.in/"));
        startActivity(browser);
    }
    public void more133(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/gsss-institute-of-engineering-and-technology-for-women-mysore/amp");
        startActivity(intent);
    }

    public void open134(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://agadiengcollege.com/"));
        startActivity(browser);
    }
    public void more134(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/smt-kamala-and-sri-venkappa-m-agadi-college-of-engineering-and-technology-gadag/amp");
        startActivity(intent);
    }

    public void open135(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://klsvdit.edu.in/"));
        startActivity(browser);
    }
    public void more135(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/kls-vishwanathrao-deshpande-rural-institute-of-technology-haliyal/amp");
        startActivity(intent);
    }

    public void open136(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mitkundapura.com/"));
        startActivity(browser);
    }
    public void more136(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/moodlakatte-institute-of-technology-kundapura/amp");
        startActivity(intent);
    }

    public void open137(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nadgirinstitute.com/engtech.php"));
        startActivity(browser);
    }
    public void more137(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/nadgir-institute-of-engineering-and-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open139(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://iceas.ac.in/"));
        startActivity(browser);
    }
    public void more139(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/impact-college-of-engineering-and-applied-sciences-bangalore/amp");
        startActivity(intent);
    }

    public void open141(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://eccampus.pes.edu/"));
        startActivity(browser);
    }
    public void more141(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/pes-university-electronic-city-campus-bangalore/amp");
        startActivity(intent);
    }

    public void open142(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://acu.edu.in/"));
        startActivity(browser);
    }
    public void more142(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/adichunchanagiri-university-mandya/affiliated-colleges");
        startActivity(intent);
    }

    public void open144(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.srinivasgroup.com/"));
        startActivity(browser);
    }
    public void more144(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/srinivas-institute-of-technology-mangalore/amp");
        startActivity(intent);
    }

    public void open145(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rrce.org/"));
        startActivity(browser);
    }
    public void more145(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/rajarajeswari-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open146(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sdc.ac.in/sdit/"));
        startActivity(browser);
    }
    public void more146(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/shree-devi-institute-of-technology-mangalore/reviews");
        startActivity(intent);
    }

    public void open147(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.tjohncollege.com/home"));
        startActivity(browser);
    }
    public void more147(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/t-john-institute-of-technology-bangalore/all-questions");
        startActivity(intent);
    }

    public void open148(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more148(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/nandi-institute-of-technology-and-management-sciences-bangalore/amp");
        startActivity(intent);
    }

    public void open149(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cambridge.edu.in/"));
        startActivity(browser);
    }
    public void more149(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/cambridge-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open150(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pestrust.edu.in/n/index.html"));
        startActivity(browser);
    }
    public void more150(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/pes-institute-of-technology-and-management-shimoga/amp");
        startActivity(intent);
    }

    public void open151(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mite.ac.in/"));
        startActivity(browser);
    }
    public void more151(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/mangalore-institute-of-technology-and-engineering-mangalore/amp");
        startActivity(intent);
    }

    public void open152(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sdmit.in/"));
        startActivity(browser);
    }
    public void more152(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sri-dharmasthala-manjunatheshwara-institute-of-technology-ujire/amp");
        startActivity(intent);
    }

    public void open153(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://seaedu.ac.in/"));
        startActivity(browser);
    }
    public void more153(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sea-college-of-engineering-and-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open154(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gec-chamarajanagara.ac.in/"));
        startActivity(browser);
    }
    public void more154(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","");
        startActivity(intent);
    }

    public void open155(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gechassan.ac.in/"));
        startActivity(browser);
    }
    public void more155(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/government-engineering-college-hassan/amp");
        startActivity(intent);
    }

    public void open156(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more156(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/government-engineering-college-mandya/amp");
        startActivity(intent);
    }

    public void open157(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more157(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/government-engineering-college-ramanagara/amp");
        startActivity(intent);
    }

    public void open158(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mitmysore.in/"));
        startActivity(browser);
    }
    public void more158(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/maharaja-institute-of-technology-mysore/amp");
        startActivity(intent);
    }

    public void open159(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://karavaliinstituteoftechnology.com/"));
        startActivity(browser);
    }
    public void more159(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/karavali-institute-of-technology-mangalore/amp");
        startActivity(intent);
    }

    public void open160(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sahyadri.edu.in/"));
        startActivity(browser);
    }
    public void more160(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sahyadri-college-of-engineering-and-management-mangalore/admission");
        startActivity(intent);
    }

    public void open161(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://malur.in/geck/"));
        startActivity(browser);
    }
    public void more161(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/government-engineering-college-kushalnagar/amp");
        startActivity(intent);
    }

    public void open162(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gecraichur.ac.in/"));
        startActivity(browser);
    }
    public void more162(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://engineering.careers360.com/colleges/list-of-government-engineering-colleges-in-raichur");
        startActivity(intent);
    }

    public void open163(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more163(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/government-engineering-college-haveri/amp");
        startActivity(intent);
    }

    public void open164(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more164(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/government-engineering-college-bellary/amp");
        startActivity(intent);
    }

    public void open165(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.yit.edu.in/"));
        startActivity(browser);
    }
    public void more165(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/yenepoya-institute-of-technology-mangalore/amp");
        startActivity(intent);
    }

    public void open166(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kleit.ac.in/"));
        startActivity(browser);
    }
    public void more166(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/kle-technological-university-hubballi/amp");
        startActivity(intent);
    }

    public void open167(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://klecet.edu.in/"));
        startActivity(browser);
    }
    public void more167(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/kle-college-of-engineering-and-technology-chikodi/amp");
        startActivity(intent);
    }

    public void open168(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aiems.in/"));
        startActivity(browser);
    }
    public void more168(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/amruta-institute-of-engineering-and-management-sciences-bangalore/amp");
        startActivity(intent);
    }

    public void open169(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aiet.org.in/"));
        startActivity(browser);
    }
    public void more169(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/alvas-institute-of-engineering-and-technology-mangalore/amp");
        startActivity(intent);
    }

    public void open171(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.brindavancollege.com/"));
        startActivity(browser);
    }
    public void more171(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/brindavan-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open172(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rrit.ac.in/"));
        startActivity(browser);
    }
    public void more172(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/rr-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open173(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://saividya.ac.in/"));
        startActivity(browser);
    }
    public void more173(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sai-vidya-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open174(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drsmce.org/"));
        startActivity(browser);
    }
    public void more174(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/dr-sri-sri-sri-shivakumara-mahaswamy-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open175(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sgbit.edu.in/"));
        startActivity(browser);
    }
    public void more175(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sg-balekundri-institute-of-technology-belgaum/courses/engineering-and-architecture-istpg");
        startActivity(intent);
    }

    public void open176(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.navodaya.edu.in/engineering/"));
        startActivity(browser);
    }
    public void more176(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/navodaya-institute-of-technology-raichur/amp");
        startActivity(intent);
    }

    public void open177(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rithassan.ac.in/"));
        startActivity(browser);
    }
    public void more177(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/rajeev-institute-of-technology-hassan/amp");
        startActivity(intent);
    }

    public void open178(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nieit.ac.in/"));
        startActivity(browser);
    }
    public void more178(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/nie-institute-of-technology-mysore/amp");
        startActivity(intent);
    }

    public void open179(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more179(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/pns-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open180(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bitmangalore.edu.in/"));
        startActivity(browser);
    }
    public void more180(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bearys-institute-of-technology-mangalore/amp");
        startActivity(intent);
    }

    public void open181(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sbesinstitutions.com/"));
        startActivity(browser);
    }
    public void more181(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sri-basaveshwara-institute-of-technology-tiptur/amp");
        startActivity(intent);
    }

    public void open182(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://scetbgm.com/"));
        startActivity(browser);
    }
    public void more182(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/shaikh-college-of-engineering-and-technology-belgaum/courses");
        startActivity(intent);
    }

    public void open183(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shashibgroup.org/sha-shib-college-of-engineering-bangalore"));
        startActivity(browser);
    }
    public void more183(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sha-shib-college-of-engineering-chikkaballapur/amp");
        startActivity(intent);
    }

    public void open184(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://cbitkolar.edu.in/"));
        startActivity(browser);
    }
    public void more184(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/c-byregowda-institute-of-technology-kolar/cut-off");
        startActivity(intent);
    }

    public void open185(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://aitmbgm.ac.in/"));
        startActivity(browser);
    }
    public void more185(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/angadi-institute-of-technology-and-management-belgavi/cut-off");
        startActivity(intent);
    }

    public void open186(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.acsce.edu.in/"));
        startActivity(browser);
    }
    public void more186(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/acs-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open187(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more187(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/prasanna-college-of-engineering-and-technology-ujire/amp");
        startActivity(intent);
    }

    public void open188(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ndrkit.ac.in/"));
        startActivity(browser);
    }
    public void more188(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/vijaya-vittala-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open189(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ndrkit.ac.in/"));
        startActivity(browser);
    }
    public void more189(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/ndrk-institute-of-technology-hassan/amp");
        startActivity(intent);
    }

    public void open191(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ait-tumkur.ac.in/"));
        startActivity(browser);
    }
    public void more191(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/akshaya-institute-of-technology-tumkur/amp");
        startActivity(intent);
    }

    public void open193(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://srinivasuniversity.edu.in/"));
        startActivity(browser);
    }
    public void more193(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/srinivas-university-mangalore/amp");
        startActivity(intent);
    }

    public void open194(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.geckarwar.in/"));
        startActivity(browser);
    }
    public void more194(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/government-engineering-college-karwar/amp");
        startActivity(intent);
    }

    public void open195(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more195(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/ekalavya-institute-of-technology-chamarajanagar/amp");
        startActivity(intent);
    }

    public void open196(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jce.ac.in/"));
        startActivity(browser);
    }
    public void more196(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/jain-college-of-engineering-belgaum/amp");
        startActivity(intent);
    }

    public void open197(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://veerappanistyecs.org/"));
        startActivity(browser);
    }
    public void more197(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/veerappa-nisty-engineering-college-shorapur/amp");
        startActivity(intent);
    }

    public void open198(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sharnbasvauniversity.edu.in/"));
        startActivity(browser);
    }
    public void more198(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/sharnbasva-university-kalaburagi/amp");
        startActivity(intent);
    }

    public void open199(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://agmrcet.ac.in/"));
        startActivity(browser);
    }
    public void more199(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/agm-rural-college-of-engineering-and-technology-hubli/cut-off");
        startActivity(intent);
    }

    public void open201(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gopalancolleges.com/gcem/"));
        startActivity(browser);
    }
    public void more201(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/gopalan-college-of-engineering-and-management-bangalore/amp");
        startActivity(intent);
    }

    public void open202(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sampoornainstitutions.org/"));
        startActivity(browser);
    }
    public void more202(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sampoorna-institute-of-technology-and-research-bangalore/amp");
        startActivity(intent);
    }

    public void open203(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kssem.edu.in/"));
        startActivity(browser);
    }
    public void more203(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/ks-school-of-engineering-and-management-bangalore/amp");
        startActivity(intent);
    }

    public void open204(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://btibangalore.org/"));
        startActivity(browser);
    }
    public void more204(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bangalore-technological-institute-bangalore/amp");
        startActivity(intent);
    }

    public void open205(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.atme.in/"));
        startActivity(browser);
    }
    public void more205(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/atme-college-of-engineering-mysore/amp");
        startActivity(intent);
    }

    public void open206(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sode-edu.in/"));
        startActivity(browser);
    }
    public void more206(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/shri-madhwa-vadiraja-institute-of-technology-and-management-udupi/amp");
        startActivity(intent);
    }

    public void open207(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vsmit.ac.in/"));
        startActivity(browser);
    }
    public void more207(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/vsms-institute-of-technology-belgaum/amp");
        startActivity(intent);
    }

    public void open208(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more208(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/achutha-institute-of-technology-chikkaballapur/cut-off");
        startActivity(intent);
    }

    public void open209(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jyothyit.ac.in/"));
        startActivity(browser);
    }
    public void more209(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/jyothy-institute-of-technology-bangalore/courses");
        startActivity(intent);
    }

    public void open210(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gmitmandya.in/"));
        startActivity(browser);
    }
    public void more210(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/g-madegowda-institute-of-technology-mandya/amp");
        startActivity(intent);
    }

    public void open211(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jitd.in/"));
        startActivity(browser);
    }
    public void more211(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/jain-institute-of-technology-davangere/amp");
        startActivity(intent);
    }

    public void open212(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://dsatm.edu.in/"));
        startActivity(browser);
    }
    public void more212(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/dayananda-sagar-academy-of-technology-and-management-bangalore/amp");
        startActivity(intent);
    }

    public void open213(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lingaraj-appaec.in/"));
        startActivity(browser);
    }
    public void more213(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/lingarajappa-engineering-college-bidar/amp");
        startActivity(intent);
    }

    public void open216(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sitgulbarga.org/"));
        startActivity(browser);
    }
    public void more216(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/shetty-institute-of-technology-gulbarga/amp");
        startActivity(intent);
    }

    public void open217(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more217(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/girijabai-sail-institute-of-technology-karwar/amp");
        startActivity(intent);
    }

    public void open218(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more218(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/shri-pillappa-college-of-engineering-bangalore/amp");
        startActivity(intent);
    }

    public void open219(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cmcmmct.com/"));
        startActivity(browser);
    }
    public void more219(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/mangalore-marine-college-and-technology-mangalore/placement");
        startActivity(intent);
    }

    public void open220(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alliance.edu.in/"));
        startActivity(browser);
    }
    public void more220(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/alliance-university-bangalore/courses");
        startActivity(intent);
    }

    public void open221(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bgmitm.ac.in/"));
        startActivity(browser);
    }
    public void more221(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/biluru-gurubasava-mahaswamiji-institute-of-technology-mudhol/amp");
        startActivity(intent);
    }

    public void open222(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://northcampus.cambridge.edu.in/"));
        startActivity(browser);
    }
    public void more222(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/cambridge-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open223(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more223(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sri-vidya-vinayaka-institute-of-technology-bangalore/amp");
        startActivity(intent);
    }

    public void open227(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://citmandya.in/"));
        startActivity(browser);
    }
    public void more227(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/cauvery-institute-of-technology-mandya/amp");
        startActivity(intent);
    }

    public void open232(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reva.edu.in/"));
        startActivity(browser);
    }
    public void more232(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/reva-institute-of-technology-and-management-bangalore/amp");
        startActivity(intent);
    }

    public void open233(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more233(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/jain-agm-institute-of-technology-jamakandi/amp");
        startActivity(intent);
    }

    public void open235(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.msruas.ac.in/"));
        startActivity(browser);
    }
    public void more235(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/ms-ramaiah-university-of-applied-sciences-bangalore/amp");
        startActivity(intent);
    }

    public void open236(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.svgi.edu.in/"));
        startActivity(browser);
    }
    public void more236(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/sri-vinayaka-institute-of-technology-kolar/amp");
        startActivity(intent);
    }

    public void open237(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://presidencyuniversity.in/"));
        startActivity(browser);
    }
    public void more237(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/presidency-university-bangalore/amp");
        startActivity(intent);
    }

    public void open238(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mysururoyal.org/"));
        startActivity(browser);
    }
    public void more238(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/mysuru-royal-institute-of-technology-mandya/amp");
        startActivity(intent);
    }

    public void open239(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ewce.edu.in/"));
        startActivity(browser);
    }
    public void more239(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/east-west-college-of-engineering-bangalore/courses");
        startActivity(intent);
    }

    public void open240(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dsu.edu.in/"));
        startActivity(browser);
    }
    public void more240(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/dayananda-sagar-university-bangalore/amp");
        startActivity(intent);
    }

    public void open241(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kletech.ac.in/"));
        startActivity(browser);
    }
    public void more241(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/kle-technological-university-hubballi/amp");
        startActivity(intent);
    }

    public void open252(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mycem.edu.in/"));
        startActivity(browser);
    }
    public void more252(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/mysore-college-of-engineering-and-management-mysore/amp");
        startActivity(intent);
    }

    public void open254(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ajiet.edu.in/"));
        startActivity(browser);
    }
    public void more254(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/aj-institute-of-engineering-and-technology-mangalore/amp");
        startActivity(intent);
    }

    public void open255(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blrgst.gitam.edu/"));
        startActivity(browser);
    }
    public void more255(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/gitam-school-of-technology-bengaluru/amp");
        startActivity(intent);
    }

    public void open256(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://raitechuniversity.in/"));
        startActivity(browser);
    }
    public void more256(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/rai-technology-university-bangalore/amp");
        startActivity(intent);
    }

    public void open257(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cmr.edu.in/"));
        startActivity(browser);
    }
    public void more257(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/cmr-university-bangalore/amp");
        startActivity(intent);
    }

    public void open258(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mitmysore.in/"));
        startActivity(browser);
    }
    public void more258(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/maharaja-institute-of-technology-mysore/amp");
        startActivity(intent);
    }

    public void open264(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://best.edu.in/"));
        startActivity(browser);
    }
    public void more264(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/basav-engineering-school-of-technology-zalki/amp");
        startActivity(intent);
    }

    public void open265(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jcethbl.edu.in/"));
        startActivity(browser);
    }
    public void more265(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/jain-college-of-engineering-and-technology-hubballi/amp");
        startActivity(intent);
    }

    public void open269(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://jcer.in/"));
        startActivity(browser);
    }
    public void more269(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/jain-college-of-engineering-and-research-belagavi");
        startActivity(intent);
    }

    public void open275(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rvitm.edu.in/"));
        startActivity(browser);
    }
    public void more275(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/rv-institute-of-management-bangalore/amp");
        startActivity(intent);
    }

    public void open272(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more272(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/government-engineering-college-talakal/be-civil-engineering-course");
        startActivity(intent);
    }

    public void open48(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more48(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bms-college-of-engineering-bangalore");
        startActivity(intent);
    }

    public void open60(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nitk.ac.in/"));
        startActivity(browser);
    }
    public void more60(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/dr-ambedkar-institute-of-technology-bangalore");
        startActivity(intent);
    }

    public void open57(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://jssstuniv.in/"));
        startActivity(browser);
    }
    public void more57(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/university/jss-science-and-technology-university-mysuru/amp");
        startActivity(intent);
    }

    public void open56(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nie.ac.in/"));
        startActivity(browser);
    }
    public void more56(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/nie-institute-of-technology-mysore/amp");
        startActivity(intent);
    }

    public void open58(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pescemandya.org/"));
        startActivity(browser);
    }
    public void more58(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/pes-college-of-engineering-mandya/amp");
        startActivity(intent);
    }

    public void open47(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mcehassan.ac.in/"));
        startActivity(browser);
    }
    public void more47(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/malnad-college-of-engineering-hassan/amp");
        startActivity(intent);
    }

    public void open49(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.becbgk.edu/"));
        startActivity(browser);
    }
    public void more49(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/bvv-sanghas-basaveshwar-engineering-college-bagalkot/amp");
        startActivity(intent);
    }

    public void open59(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pdacek.ac.in/"));
        startActivity(browser);
    }
    public void more59(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/hke-societys-pda-college-of-engineering-gulbarga/amp");
        startActivity(intent);
    }

    public void open274(View view) {
        Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gecm.in/"));
        startActivity(browser);
    }
    public void more274(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("details_url","https://www.careers360.com/colleges/government-engineering-college-hassan/amp");
        startActivity(intent);
    }

    public void cutoff1(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/university-visvesvaraya-college-of-engineering-uvce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff2(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sksjt-institute-of-engineering-sksjti-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff3(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bms-college-of-engineering-bmsce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff4(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/dr-ambedkar-institute-of-technology-dr-ait-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff5(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/rv-college-of-engineering-rvce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff6(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/ms-ramaiah-institute-of-technology-msrit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff7(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/dayananda-sagar-college-of-engineering-dsce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff8(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bangalore-institute-of-technology-bit-v-v-puram-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff9(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/pes-institute-of-technology-pesit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff11(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/mvj-college-of-engineering-mvjce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff12(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sir-m-visveswaraya-institute-of-technology-smvit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff13(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/ghousia-engineering-college-gec-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff14(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sjc-institute-of-technology-sjcit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff15(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/dr-t-thimmaiah-institute-of-technology-dr-ttit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff16(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/siddaganga-institute-of-technology-sit-tumkur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff17(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sri-siddartha-institute-of-technology-ssit-tumkur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff18(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/kalpatharu-institute-of-technology-kit-tiptur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff21(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sri-jayachamarajendra-college-of-engineering-sjce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff22(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/the-national-institute-of-engineering-nie-mysore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff23(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/pes-college-of-engineering-pesce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff24(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/malnad-college-of-engineering-mce-hassan-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff28(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/tontadarya-college-of-engineering-tce-gadag-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff29(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/maratha-mandal-engineering-college-mmec-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff30(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bvb-college-of-engineering-and-technology-bvbcet-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff31(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/basaveshwara-engineering-college-bec-bagalkot-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff32(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/rte-socitys-rural-engineering-college-rtesrec-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff33(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sri-taralabalu-jagadguru-institute-of-technology-stjit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff34(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sri-dharmasthala-manjunatheshwara-college-of-engineering-and-technology-sdmcet-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff35(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/anjuman-engineering-college-aec-bhatkal-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff36(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/kle-dr-ms-sheshgiri-college-of-engineering-and-technology-msscet-belgaum-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff37(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/kls-gogte-institute-of-technology-klsgit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff38(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bldeas-vp-dr-pg-halakatti-college-of-engineering-and-technology-bldeacet-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff40(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/hira-sugar-institute-of-technology-hsit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff41(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/pda-college-of-engineering-pdace-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff42(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/khaja-banda-nawaz-college-of-engineering-kbnce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff43(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/gurunanak-dev-engineering-college-gdec-bidar-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff44(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bheemanna-khandre-institute-of-technology-bkit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff45(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/rao-bahadur-y-mahabaleswarappa-engineering-college-rbymec-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff46(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sln-college-of-engineering-slnce-raichur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff47(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/malnad-college-of-engineering-mce-hassan-kcet-2021-cutoff-and-fee-details-2/");
        startActivity(intent);
    }
    public void cutoff48(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bms-college-of-engineering-basavanagudi-bmsceb-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff49(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/basaveshwara-engineering-college-bec-bagalkot-kcet-2021-cutoff-and-fee-details-2/");
        startActivity(intent);
    }
    public void cutoff53(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/nmam-institutute-of-technology-nmamit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff54(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/kvg-college-of-engineering-kvgce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff55(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/pa-college-of-engineering-pace-mangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff56(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/the-national-institute-of-engineering-nie-mysore-kcet-2021-cutoff-and-fee-details-2/");
        startActivity(intent);
    }
    public void cutoff57(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sri-jayachamarajendra-college-of-engineering-sjce-kcet-2021-cutoff-and-fee-details-2/");
        startActivity(intent);
    }
    public void cutoff58(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/pes-college-of-engineering-pesce-kcet-2021-cutoff-and-fee-details-2/");
        startActivity(intent);
    }
    public void cutoff59(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/pda-college-of-engineering-pdace-kcet-2021-cutoff-and-fee-details-2/");
        startActivity(intent);
    }
    public void cutoff60(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/dr-ambedkar-institute-of-technology-dr-ait-kcet-2021-cutoff-and-fee-details-2/");
        startActivity(intent);
    }
    public void cutoff61(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/university-bdt-college-of-engineering-ubdtce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff62(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bapuji-institute-of-engineering-and-technology-biet-davangere-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff63(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sjm-institute-of-technology-sjmit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff64(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/adichunchanagiri-institute-of-technology-aitc-chickmagalur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff65(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/jawaharlal-nehru-national-college-of-engineering-jnnce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff70(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bahubali-college-of-engineering-bce-shravanabelagola-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff71(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/vidya-vardhaka-college-of-engineering-vvce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff75(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/ballari-institute-of-technology-and-management-bitm-bellary-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff76(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/proudadevaraya-institute-of-technology-pit-bellary-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff77(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/vidya-vikas-institute-of-engineering-and-technology-vviet-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff78(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/the-oxford-college-of-engineering-toce-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff79(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/acharya-institute-of-technology-ait-soladevanahalli-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff81(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/hms-institute-of-technology-hmsit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff82(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/jss-academy-of-technical-education-jssate-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff83(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/hkbk-college-of-engineering-hkbkce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff85(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/aps-college-of-engineering-somanahalli-apsces-somanahalli-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff86(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/shirdi-sai-engineering-college-anekal-ssec-anekal-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff87(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/vivekananda-institute-of-technology-vit-kengeri-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff88(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bangalore-college-of-engineering-and-technology-chandapura-bcet-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff90(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sri-revana-siddeswara-institute-of-technology-srsit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff91(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/ks-institute-of-technology-ksit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff92(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/vemana-institute-of-technology-vit-koramangala-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff93(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/basavakalyana-engineering-college-bec-bidar-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff94(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/coorg-institute-of-technology-cit-kodagu-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff95(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/amc-engineering-college-amcec-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff96(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/east-point-college-of-engineering-and-technology-epcet-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff97(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/cmr-institute-of-technology-cmrit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff98(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/atria-institute-of-technology-ait-hebbal-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }

    public void cutoff99(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/new-horizon-college-of-engineering-nhce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff100(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/kns-institute-of-technology-knsit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff101(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/channabasaveshwara-institute-of-technology-cit-tumkur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff102(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/don-bosco-institute-of-technology-dbit-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff103(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/global-academy-of-technology-gat-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff104(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/nagarjuna-college-of-engineering-and-technology-ncet-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff105(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/nitte-meenakshi-institute-of-technology-nmit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff106(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/east-west-institute-of-technology-ewit-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff107(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bnm-institute-of-technology-bnmit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }

    public void cutoff108(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/saptagiri-engineering-college-sec-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff109(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/city-engineering-college-cec-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff111(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sri-venkateshwara-college-of-engineering-svce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff112(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sri-krishna-institute-of-technology-skit-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff113(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sambhram-institute-of-technology-sit-jalahalli-east-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }

    public void cutoff114(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/gm-institute-of-technology-gmit-davanagere-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff115(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sjb-institute-of-technology-sjbit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff116(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/rl-jalappa-institute-of-technology-rljit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff118(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/rns-institute-of-technology-rnsit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff119(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/kct-engineering-college-kctec-gulbarga-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff120(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/jnanavikasa-institute-of-technology-jvit-banagalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff121(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/vivekananda-college-of-engineering-and-technology-vcet-dakshina-kannada-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff123(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/canara-engineering-college-cec-dakshina-kannada-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }

    public void cutoff124(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/rajiv-gandhi-institute-of-technology-rgit-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff126(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bms-institute-of-technology-and-management-bmsitm-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff127(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/ms-engineering-college-msec-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff128(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/appa-institute-of-engineering-and-technology-aiet-gulbarga-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff129(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/st-joseph-engineering-college-st-jec-mangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff130(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/shridevi-institute-of-engineering-and-technology-siet-tumkur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff132(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/secab-institute-of-engineering-and-technology-siet-bijapur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff133(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/gsss-institute-of-engineering-and-technology-for-women-gsssietw-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff134(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/smt-kamala-and-sri-venkappa-m-agadi-college-of-engineering-and-technology-sksvmacet-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff135(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/kls-vishwanathrao-deshpande-institute-of-technology-kls-vdit-uttara-kannada-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }

    public void cutoff136(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/moodlakatte-institute-of-technology-mit-kundapur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }

    public void cutoff139(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/impact-college-of-engineering-and-applied-sciences-iceas-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff141(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/pes-institute-of-technology-south-campus-pesit-konappana-agrahara-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff142(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bgs-institute-of-technology-bgsit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff144(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/srinivas-institute-of-technology-sit-mangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff145(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/rajarajeswari-college-of-engineering-rrce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff146(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/shreedevi-institute-of-technology-sdit-kenjar-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff147(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/t-john-institute-of-technology-tjit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff149(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/cambridge-institutute-of-technology-cit-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff150(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/pes-institute-of-technology-and-management-pesitm-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff151(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/mangalore-institute-of-technology-and-engineering-mite-mangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff152(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sdm-institute-of-technology-sdmit-dakshina-kannada-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff153(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sea-college-of-engineering-and-technology-seacet-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff154(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-gec-chamarajanagara-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff155(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-gec-hassan-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff156(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-gec-mandya-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff157(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-gec-ramanagara-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff158(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/maharaja-institute-of-technology-mit-mysore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff159(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/karavali-institute-of-technology-kit-mangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff160(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sahyadri-college-of-engineering-and-management-scem-mangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff161(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-gec-kodagu-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff162(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-gec-raichur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff163(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-gec-haveri-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff164(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-gec-bellary-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff165(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/dr-m-v-shetty-institute-of-technology-dr-mvsit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff166(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/kle-institute-of-technology-kleit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff167(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/kle-college-of-engineering-and-technology-klecet-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff168(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/amrutha-institute-of-engineering-and-mangement-aiems-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff169(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/alvas-institute-of-engineering-and-technology-aiet-dakshina-kannada-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff171(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/brindavan-college-of-engineering-yelahanka-bce-yelahanka-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff172(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/rr-institute-of-technology-chikkabanavara-rrit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff173(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sai-vidya-institute-of-technology-svit-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff174(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/dr-sri-sri-sri-shivakumara-mahaswamyji-college-of-engineering-dr-ssssmce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff175(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sg-balekundri-institute-of-technology-sgbit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff176(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/navodaya-institute-of-technology-nit-raichur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff177(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/rajeev-institute-of-technology-rit-hassan-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff178(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/nie-institute-of-technology-nieit-mysore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff180(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bearys-institute-of-technology-bit-mangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff181(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sri-basaveswara-institute-of-technology-sbit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff183(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sha-shib-college-of-engineering-ssce-chickballapur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff184(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/c-byre-gowda-institute-of-technology-cbgit-kolar-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff185(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/angadi-institute-of-technology-and-management-aitm-belgaum-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff186(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/acs-college-of-engineering-kengeri-hobli-acsce-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff188(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/vijaya-vittala-institute-of-technology-vvit-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff189(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/yagachi-institute-of-technology-yit-hassan-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff191(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/akshaya-institute-of-technology-ait-tumakuru-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff193(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/srinivas-school-of-engineering-sse-mangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff194(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-karwar-gec-karwar-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff196(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/jain-college-of-engineering-jce-belgaum-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff197(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/veerappa-nisty-engineering-college-vnec-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff198(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/godutai-engineering-college-for-women-gecw-gulbarga-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff199(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/agm-rural-engineering-college-agmrcet-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff201(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/gopalan-college-of-engineering-and-management-gcem-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff202(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/sampoorna-institute-of-technology-and-research-sitr-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff203(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/ks-school-of-engineering-and-management-kssem-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff204(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/bangalore-technological-institute-bti-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff205(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/academy-for-technical-and-management-excellence-atme-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff206(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/shri-madhwa-vadiraja-institute-of-technology-and-management-smvitm-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff207(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/vsm-institute-of-technology-vsmit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff208(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/achutha-institute-of-technology-ait-chikaballapur-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff209(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/jyothi-institute-of-technology-jit-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff210(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/g-madegowda-institute-of-technology-gmit-mandya-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff211(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/jain-institute-of-technology-jit-davanagere-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff212(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/dayananda-sagar-academy-of-technology-dsatm-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff213(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/lingaraj-appa-engineering-college-laec-bidar-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff216(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/shetty-institute-of-technology-sit-gulbarga-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff217(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/girijabai-sail-institute-of-technology-gsit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff219(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/mangalore-marine-engineering-college-and-technology-mmect-mangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff220(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/alliance-university-au-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff221(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/biluru-gurubasava-mahaswamiji-institute-of-technology-bgmit-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff222(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/adarsha-institute-of-technology-ait-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff227(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/cauvery-institute-of-technology-cit-mandya-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff232(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/reva-university-ru-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff235(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/m-s-ramaiah-university-of-applied-sciences-msruas-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff237(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/presidency-university-pu-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff238(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/mysuru-royal-institute-of-technology-mrit-mysore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff239(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/east-west-college-of-engineering-ewce-bengaluru-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff240(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/dayananda-sagar-university-dsu-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff241(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/kle-technological-university-formerly-bvbcet-kletu-hubli-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff252(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/mysore-college-of-engineering-and-management-mcem-mysore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff254(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/aj-institute-of-engineering-and-technology-ajiet-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff255(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/gitam-school-of-technology-gitam-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff257(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/cmr-university-cmru-bangalore-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff258(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/maharaja-institute-of-technology-mit-mysore-kcet-2021-cutoff-and-fee-details-2/");
        startActivity(intent);
    }
    public void cutoff260(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/nitte-school-of-architecture-nitte-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff265(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/jain-college-of-engineering-and-technology-jcet-hubli-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff269(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/jain-college-of-engineering-and-research-jcer-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff272(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-gec-talakal-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff273(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-gec-gangavathi-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff274(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/government-engineering-college-moselehosahalli-gecm-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }

    public void cutoff275(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/rv-institute-of-technology-and-management-rvitm-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff278(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/visvesvaraya-technological-university-muddenahalli-vtu-muddenahalli-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }
    public void cutoff279(View view) {
        Intent intent = new Intent(getApplicationContext(), webview1.class);
        intent.putExtra("content","cutoff");
        intent.putExtra("details_url","https://www.inspirenignite.com/vtu/visvesvaraya-technological-university-vtu-belgaum-kcet-2021-cutoff-and-fee-details/");
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        IntentFilter filter =new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(networkChangeList,filter);

        super.onStart();
    }

    @Override
    protected void onStop() {
        unregisterReceiver(networkChangeList);
        super.onStop();
    }



}

