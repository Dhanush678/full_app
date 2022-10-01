package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class puc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puc);
    }
    public void openactivity_t1(View view){
        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        String s1 = getIntent().getStringExtra("subject1");
        if(s1.contentEquals("Mathematics")){
            Intent intent = new Intent(this, videotopics.class);
            intent.putExtra("heading1","First Year PUC Mathematics");
            intent.putExtra("topic1","Sets, Relations & Functions");
            intent.putExtra("topic2","Trigonometric Functions");
            intent.putExtra("topic3","Principle of Mathematical Induction");
            intent.putExtra("topic4","Complex numbers and Quadratic equations");
            intent.putExtra("topic5","Linear Inequalities");
            intent.putExtra("topic6","Permutations and Combination");
            intent.putExtra("topic7","Binomial Theorem");
            intent.putExtra("topic8","Sequence & Series");
            intent.putExtra("topic9","Straight Lines");
            intent.putExtra("topic10","Conic Sections");
            intent.putExtra("topic11","introduction to 3D-Geometry");
            intent.putExtra("topic12","Limits & Derivatives");
            intent.putExtra("topic13","Mathematical Reasoning");
            intent.putExtra("topic14","Statistics");
            intent.putExtra("topic15","Probability");
            startActivity(intent);
        }
        if(s1.contentEquals("Physics")){
            Intent intent = new Intent(this, videotopics.class);
            intent.putExtra("heading1","First Year PUC Physics");
            intent.putExtra("topic1","Physical World");
            intent.putExtra("topic2","Units and Measurements");
            intent.putExtra("topic3","Motion in a Straight Line");
            intent.putExtra("topic4","Motion in a Plane");
            intent.putExtra("topic5","Laws of Motion");
            intent.putExtra("topic6","Work, Energy & Power");
            intent.putExtra("topic7","Systems of Particles and Rotational Motion");
            intent.putExtra("topic8","Gravitation");
            intent.putExtra("topic9","Mechanical Properties of Solids");
            intent.putExtra("topic10","Mechanical Properties of Fluids");
            intent.putExtra("topic11","Thermal Properties of Matter");
            intent.putExtra("topic12","Thermodynamics, Kinetic Theory");
            intent.putExtra("topic13","Oscillations");
            intent.putExtra("topic14","Waves");
            intent.putExtra("topic15"," ");
            startActivity(intent);
        }
        if(s1.contentEquals("Chemistry")){
            Intent intent = new Intent(this, videotopics.class);
            intent.putExtra("heading1","First Year PUC Chemistry");
            intent.putExtra("topic1","Some Basic Concepts of Chemistry");
            intent.putExtra("topic2","Structure of Atom");
            intent.putExtra("topic3","Classification of Elements and Periodicity in Properties");
            intent.putExtra("topic4","Chemical Bonding and Molecular Structure States of Matter Gases and Liquids");
            intent.putExtra("topic5","Thermodynamics");
            intent.putExtra("topic6","Equilibrium");
            intent.putExtra("topic7","Redox reactions");
            intent.putExtra("topic8","Hydrogen");
            intent.putExtra("topic9","s – Block Elements");
            intent.putExtra("topic10","Some p – Block Elements");
            intent.putExtra("topic11","Organic Chemistry – Some basic principles & Techniques");
            intent.putExtra("topic12","Hydrocarbons");
            intent.putExtra("topic13","Environmental chemistry");
            intent.putExtra("topic14"," ");
            intent.putExtra("topic15"," ");
            startActivity(intent);
        }
        if(s1.contentEquals("Biology")){
            Intent intent = new Intent(this, videotopics.class);
            intent.putExtra("heading1","First Year PUC Biology");
            intent.putExtra("topic1","The living world");
            intent.putExtra("topic2","Biological classification");
            intent.putExtra("topic3","Plant Kingdom");
            intent.putExtra("topic4","Cell cycle and Cell divison");
            intent.putExtra("topic5","Morphology of flowering plants");
            intent.putExtra("topic6","Locomotion and movement");
            intent.putExtra("topic7","Anatomy of flowering plants");
            intent.putExtra("topic8","Excretory products and their elimination");
            intent.putExtra("topic9","Cell – The unit of life");
            intent.putExtra("topic10","Bio molecules");
            intent.putExtra("topic11","Photosynthesis in higher plants");
            intent.putExtra("topic12"," ");
            intent.putExtra("topic13"," ");
            intent.putExtra("topic14"," ");
            intent.putExtra("topic15"," ");
            startActivity(intent);
        }

    }
    public void openactivity_t2(View view){
        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        String s1 = getIntent().getStringExtra("subject1");
        if(s1.contentEquals("Mathematics")){
            Intent intent = new Intent(this, videotopics.class);
            intent.putExtra("heading1","Second Year PUC Mathematics");
            intent.putExtra("topic1","Relations & Functions");
            intent.putExtra("topic2","Inverse Trigonometric functions");
            intent.putExtra("topic3","Matrices");
            intent.putExtra("topic4","Determinants");
            intent.putExtra("topic5","Continuity and Differentiability");
            intent.putExtra("topic6","Application of Derivatives");
            intent.putExtra("topic7","Integrals");
            intent.putExtra("topic8","Application of Integrals");
            intent.putExtra("topic9","Differential Equations");
            intent.putExtra("topic10","Vector Algebra");
            intent.putExtra("topic11","Three Dimensional Geometry");
            intent.putExtra("topic12","Linear Programming");
            intent.putExtra("topic13","Probability");
            intent.putExtra("topic14"," ");
            intent.putExtra("topic15"," ");
            startActivity(intent);
        }
        if(s1.contentEquals("Physics")){
            Intent intent = new Intent(this, videotopics.class);
            intent.putExtra("heading1","Second Year PUC Physics");
            intent.putExtra("topic1","Electric Charges and Field");
            intent.putExtra("topic2","Electrostatic Potential and Capacitance");
            intent.putExtra("topic3","Current Electricity");
            intent.putExtra("topic4","Moving Charges and Magnetism");
            intent.putExtra("topic5","Magnetism and Matter");
            intent.putExtra("topic6","Electromagnetic Induction");
            intent.putExtra("topic7","Alternating Current");
            intent.putExtra("topic8","Electromagnetic Waves");
            intent.putExtra("topic9","Ray Optics and Optical Instruments");
            intent.putExtra("topic10","Wave Optics");
            intent.putExtra("topic11","Dual Nature of Radiation and Matter");
            intent.putExtra("topic12","Atoms");
            intent.putExtra("topic13","Nuclei");
            intent.putExtra("topic14","Semiconductor Electronics");
            intent.putExtra("topic15","Communication Systems");
            startActivity(intent);
        }
        if(s1.contentEquals("Chemistry")){
            Intent intent = new Intent(this, videotopics.class);
            intent.putExtra("heading1","Second Year PUC Chemistry");
            intent.putExtra("topic1","Solid State");
            intent.putExtra("topic2","Solutions");
            intent.putExtra("topic3","Electrochemistry");
            intent.putExtra("topic4","Chemical Kinetics, Surface chemistry");
            intent.putExtra("topic5","General Principles and Processes of Isolation of Elements");
            intent.putExtra("topic6","p-Block Elements");
            intent.putExtra("topic7","d and f Block Elements");
            intent.putExtra("topic8","Coordination Compounds");
            intent.putExtra("topic9","Haloalkanes and Haloarenes");
            intent.putExtra("topic10","Alcohols");
            intent.putExtra("topic11","Phenols and Ethers");
            intent.putExtra("topic12","Aldehydes");
            intent.putExtra("topic13","Ketones and Carboxylic acids");
            intent.putExtra("topic14","Organic Compounds Containing Nitrogen Biomolecules");
            intent.putExtra("topic15","Polymers");
            intent.putExtra("topic16","Chemistry in Everyday Life");
            startActivity(intent);
        }
        if(s1.contentEquals("Biology")){
            Intent intent = new Intent(this, videotopics.class);
            intent.putExtra("heading1","Second Year PUC Biology");
            intent.putExtra("topic1","Animal Kingdom");
            intent.putExtra("topic2","Structural organization in animals");
            intent.putExtra("topic3","Body fluids and circulation");
            intent.putExtra("topic4","Chemical Coordination and integration");
            intent.putExtra("topic5","Neural control and coordination");
            intent.putExtra("topic6","Breathing and exchange of gases");
            intent.putExtra("topic7","Mineral nutrition");
            intent.putExtra("topic8","Transport in Plants");
            intent.putExtra("topic9","Respiration in plants");
            intent.putExtra("topic10","Digestion and Absorption");
            intent.putExtra("topic11","Plant – Growth and Development");
            intent.putExtra("topic12"," ");
            intent.putExtra("topic13"," ");
            intent.putExtra("topic14"," ");
            intent.putExtra("topic15"," ");
            startActivity(intent);
        }
    }
}