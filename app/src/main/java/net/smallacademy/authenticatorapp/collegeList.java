package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class collegeList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_list);
        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fin = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(fin);

            }
        });
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


}


