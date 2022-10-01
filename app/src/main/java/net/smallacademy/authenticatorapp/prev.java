package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class prev extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev);
        ImageView back2 =findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
                finish();

            }
        });
    }
    //2022 year paper
    public void openactivity22(View view){
        //Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://images.collegedunia.com/public/image/0476cee18626a1c12c4fdc3fbebf3549.pdf");
        intent.putExtra("pdf_url2","https://images.collegedunia.com/public/image/2ec69eed6e07bc1f7604276294afa081.pdf");
        intent.putExtra("pdf_url3","https://images.collegedunia.com/public/image/58ec63cc8816d69013830a8ea1713fa3.pdf");
        intent.putExtra("pdf_url4","https://images.collegedunia.com/public/image/44fbf8790de2b2e61306517819e74f43.pdf");
        intent.putExtra("pdf_url5","http://www.africau.edu/images/default/sample.pdf");
        startActivity(intent);
    }
    //2021 year paper
    public void openactivity21(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-question-paper-2021-2000.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-question-paper-2021-1998.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-question-paper-2021-1999.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-question-paper-2021-2001.pdf");
        intent.putExtra("pdf_url5","http://kea.kar.nic.in/ans_2021.pdf");
        startActivity(intent);
    }

    //2020 year paper
    public void openactivity20(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-question-paper-2020-1678.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-question-paper-2020-1681.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-question-paper-2020-1680.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-question-paper-2020-1679.pdf");
        intent.putExtra("pdf_url5","http://kea.kar.nic.in/ans_2020.pdf");
        startActivity(intent);
    }

    //2019 year paper
    public void openactivity19(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-question-paper-2019-1482.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-question-paper-2019-1477.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-question-paper-2019-1480.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-question-paper-2019-1489.pdf");
        intent.putExtra("pdf_url5","http://kea.kar.nic.in/ans_2019.pdf");
        startActivity(intent);
    }

    //2018 year paper
    public void openactivity18(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-question-paper-2018-762.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-question-paper-2018-758.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-question-paper-2018-760.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-question-paper-2018-764.pdf");
        intent.putExtra("pdf_url5","http://kea.kar.nic.in/ans_2018.pdf");
        startActivity(intent);
    }


    //2017 year paper
    public void openactivity17(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2017-418.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2017-416.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2017-417.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2017-419.pdf");
        intent.putExtra("pdf_url5","http://kea.kar.nic.in/ans_2017.pdf");
        startActivity(intent);
    }

    //2016 year paper
    public void openactivity16(View view){
        //Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2016-383.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2016-354.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2016-366.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2016-397.pdf");
        intent.putExtra("pdf_url5","http://kea.kar.nic.in/ans_2016.pdf");
        startActivity(intent);
    }

    //2015 year paper
    public void openactivity15(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2015-382.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2015-353.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2015-365.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2015-396.pdf");
        intent.putExtra("pdf_url5","http://kea.kar.nic.in/ans_2015.pdf");
        startActivity(intent);
    }

    //2014 year paper
    public void openactivity14(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2014-381.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2014-352.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2014-364.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2014-395.pdf");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2014-407.pdf");
        startActivity(intent);
    }

    //2013 year paper
    public void openactivity13(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2013-380.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2013-351.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2013-363.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2013-394.pdf");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2013-406.pdf");
        startActivity(intent);
    }

    //2012 year paper
    public void openactivity12(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2012-379.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2012-350.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2012-362.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2012-393.pdf");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2012-405.pdf");
        startActivity(intent);
    }

    //2011 year paper
    public void openactivity11(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://down.inyatrust.com/uploads/7/5/2/9/7529832/2011matwww.inyatrust.com.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2011-348.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2011-361.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2011-392.pdf");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2011-404.pdf");
        startActivity(intent);
    }

    //2010 year paper
    public void openactivity10(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2010-377.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2010-347.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2010-360.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2010-390.pdf");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2010-403.pdf");
        startActivity(intent);
    }

    //2009 year paper
    public void openactivity09(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2009-376.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2009-346.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2009-359.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2009-389.pdf");
        intent.putExtra("pdf_url5","https://cdn.tardigrade.in/file/exam/kcet-2009-answer-key.pdf");
        startActivity(intent);
    }

    //2008 year paper
    public void openactivity08(View view){
        //Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2008-375.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-chemistry-2008-345.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-physics-chemistry-2008-345.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2008-388.pdf");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2008-402.pdf");
        startActivity(intent);
    }

    //2007 year paper
    public void openactivity07(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2007-374.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-chemistry-2007-344.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-physics-chemistry-2007-344.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2007-387.pdf");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2007-401.pdf");
        startActivity(intent);
    }

    //2006 year paper
    public void openactivity06(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2006-373.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2006-343.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2006-357.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2006-386.pdf");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2006-400.pdf");
        startActivity(intent);
    }

    //2005 year paper
    public void openactivity05(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2005-372.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2005-342.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2005-356.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2005-385.pdf");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2005-399.pdf");
        startActivity(intent);
    }

    //2004 year paper
    public void openactivity04(View view){
        Intent intent = new Intent(this, subjects.class);
        intent.putExtra("pdf_url1","https://www.careerindia.com/entrance-exam/kcet-mathematics-2004-371.pdf");
        intent.putExtra("pdf_url2","https://www.careerindia.com/entrance-exam/kcet-physics-2004-341.pdf");
        intent.putExtra("pdf_url3","https://www.careerindia.com/entrance-exam/kcet-chemistry-2004-355.pdf");
        intent.putExtra("pdf_url4","https://www.careerindia.com/entrance-exam/kcet-biology-2004-384.pdf");
        intent.putExtra("pdf_url5","https://www.careerindia.com/entrance-exam/kcet-all-subjects-key-answers-2004-398.pdf");
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
        finish();

    }

}