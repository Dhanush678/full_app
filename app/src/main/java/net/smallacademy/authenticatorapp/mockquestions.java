package net.smallacademy.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import net.smallacademy.authenticatorapp.utility.NetworkChangeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class mockquestions extends AppCompatActivity {
    NetworkChangeList networkChangeList = new NetworkChangeList();
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
            questionList.add(new Question(" The current in a coil of inductance 0.2 H changes from 5 A to 2 A in 0.5 sec. The magnitude of the average induced emf in the coil is",Uri.parse("https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw1K2dTojClrItsIxL15Aufg&ust=1663838777927000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOiThsvIpfoCFQAAAAAdAAAAABAE"), "0.3V", "0.6V", "1.2V", "12V", "1.2V"));
            questionList.add(new Question("  An object approaches a convergent lens from the left of the lens with a uniform speed 5m/s and stops at the focus, the image",Uri.parse("https://www.nitk.ac.in/"), "Moves towards the lens with a non-uniform acceleration.", "Moves away from the lens with uniform speed 5 m/s", "Moves away from the lens with uniform acceleration.", "Moves away from the lens with a non-uniform acceleration.", "Moves away from the lens with a non-uniform acceleration."));
            questionList.add(new Question(" question The refracting angle of a prism is A and refractive index of material of prism is cot A/2. The angle of minimum deviation is",Uri.parse("https://www.nitk.ac.in/"), " 180\u00b0 – 2A", "180\u00b0 – 3A", "180\u00b0 + 2A", "90\u00b0 – A", "180\u00b0 – 2A"));
            questionList.add(new Question(" Three polaroid sheets P\u2081, P\u2082 and P\u2083 are kept parallel to each other such that the angle between pass axes of P\u2081and P\u2082 is 45\u00b0 and that between P\u2082 and P\u2083 is 45\u00b0. If unpolarised beam of light of intensity 128 Wm\u00b2 is incident on P\u2081. What is the intensity of light coming out of P\u2083? ",Uri.parse("https://www.nitk.ac.in/"), "64Wm\u00b2", "128Wm\u00b2", "0", "16Wm\u00b2", "16Wm\u00b2"));
            questionList.add(new Question(" Two poles are by a distance of 3.14 m. The resolving power of human eye is minute of an arc. The maximum distance from which he can identify the two poles distinctly is ",Uri.parse("https://www.nitk.ac.in/"), "376 m", "10.8 km", "1.8 km", "109 km", "10.8 km"));
            questionList.add(new Question(" The de-Broglie wavelength associated with electron of hydrogen atom in this ground state is",Uri.parse("https://www.nitk.ac.in/"), " 10A\u00b0", "0.3A\u00b0", "3.3A\u00b0", "6.26A\u00b0", "3.3A\u00b0"));
            questionList.add(new Question("  In Young’s Double Slit Experiment, the distance between the slits and the screen is 1.2 m and the distance between the two slits is 2.4 mm. If a thin transparent mica sheet of thickness 1μm and R.I of 1.5 is introduced between one of the interfering beams, the shift in the position of central bright fringe is",Uri.parse("https://www.nitk.ac.in/"), "0.25 mm", "0.75 mm", "0.5 mm", "5 mm", "0.25 mm"));
            questionList.add(new Question(" The period of revolution of an electron revolving in nth orbit of H-atom is proportional to",Uri.parse("https://www.nitk.ac.in/"), "Independent of n", "n\u00b2", "1/n", "n\00b3", "n\00b3"));
            questionList.add(new Question(" A radio-active element has half-life of 15 years. What is the fraction that will decay in 30 years?",Uri.parse("https://www.nitk.ac.in/"), "0.73", "0.85", "0.33", "0.75", "0.75"));
            questionList.add(new Question( " A positive hole in a semiconductor is",Uri.parse("https://www.nitk.ac.in/"), "an artificially created particle", "an anti-particle of electron", "a vacancy created when an electron leaves a covalent bond", "absence of free electrons", "a vacancy created when an electron leaves a covalent bond"));
            questionList.add(new Question( " At a metro station, a girl walks up a stationary escalator in 20 sec. If she remains stationary on the escalator, then the escalator takes her up in 30 sec. The time taken by her to walk up on the moving escalator will be",Uri.parse("https://www.nitk.ac.in/"), "10 sec", "25 sec", "60 sec", "12 sec", "12 sec"));
            questionList.add(new Question( " Rain is falling vertically with a speed of 12 m/s. A woman rides a bicycle with a speed of 12 m/s in east to west direction. What is the direction in which she should hold her umbrella?",Uri.parse("https://www.nitk.ac.in/"), "45\u00b0 towards West", "30\u00b0 towards East", "105\u00b0 towards West", "45\u00b0 towards North", "45\u00b0 towards West"));
            questionList.add(new Question( " A body is initially at rest. It undergoes one-dimensional motion with constant acceleration. The power delivered to it at time ‘t’ is proportional to",Uri.parse("https://www.nitk.ac.in/"), "t\u00b2", "1\t\u00b2", "t", "1/t", "t"));
            questionList.add(new Question(" One end of a string of length I is connected to a particle of mass ‘m’ and the other to a small peg on a smooth horizontal table. If the particle moves in a circle with speed ‘v’, the net force on the particle (directed towards the centre) is: (T is the tension in the string)",Uri.parse("https://www.nitk.ac.in/"), "0", "T", "T - MV\u00b2", "T + \u00b2", "T"));
            questionList.add(new Question(" Young’s modulus of a perfect rigid body is",Uri.parse("https://www.nitk.ac.in/"), "Between zero and unity", "Zero", "Unity", "Infinity", "Zero"));
            questionList.add(new Question(" A wheel starting from rest gains an angular velocity of 10 rad/s after uniformly accelerated for 5 sec. The total angle through which it has turned is",Uri.parse("https://www.nitk.ac.in/"), "50 π rad about a vertical axis", "25 rad", "100 rad", "25 π rad", "25 rad"));
            questionList.add(new Question(" Iceberg floats in water with part of it submerged. What is the fraction of the volume of iceberg submerged if the density of ice is ρi = 0.917 g /cm\u00b3?",Uri.parse("https://www.nitk.ac.in/"), "0", "0.917", "1", "0.5", "0.917"));
            questionList.add(new Question("  The value of acceleration due to gravity at a height of 10 km from the surface of earth is x. At what depth inside the earth is the value of the acceleration due to gravity has the same value x?",Uri.parse("https://www.nitk.ac.in/"), " 15 km", " 5 km", " 20 km", " 30 km", " 20 km"));
            questionList.add(new Question(" In an adiabatic expansion of an ideal gas the product of pressure and volume",Uri.parse("https://www.nitk.ac.in/"), "At first increases and then decreases", " Decreases", " Increases", " Constant", " Decreases"));
            questionList.add(new Question(" A certain amount of heat energy is supplied to a monoatomic ideal gas which expands at constant pressure. What fraction of the heat energy is converted into work?",Uri.parse("https://www.nitk.ac.in/"), "5/7", "1", "2/3", "2/5", "2/5"));
            questionList.add(new Question("  A sphere, a cube and a thin circular plate all of same material and same mass initially heated to same high temperature are allowed to cool down under similar conditions. Then the",Uri.parse("https://www.nitk.ac.in/"), "Cube will cool the fastest and plate the slowest.", "Cube will cool the fastest and plate the slowest.", "Sphere will cool the fastest and cube the slowest.", " Plate will cool the fastest and sphere the slowest.", " Plate will cool the fastest and sphere the slowest."));
            questionList.add(new Question( " The difference between equivalent capacitances of two identical capacitors connected in parallel to that in series is 6 μF. The value of capacitance of each capacitor is",Uri.parse("https://www.nitk.ac.in/"), "6 μF", "2 μF", "1 μF", "4 μF", "4 μF"));
            questionList.add(new Question( " A hot filament liberates an electron with zero initial velocity. The anode potential is 1200 V. The speed of the electron when it strikes the anode is",Uri.parse("https://www.nitk.ac.in/"), "2.5 X 10\u00b8 m/s", "1.5 X 10\u00b5 m/s", "2.5 X 10\u00b6 m/s", "2.1 X 10\u00b7 m/s", "2.1 X 10\u00b7 m/s"));
            questionList.add(new Question(" The colour code for a carbon resistor of resistance 0.25k Ω± 10% is",Uri.parse("https://www.nitk.ac.in/"), "Red, Green, Silver", "Red, Green, Silver", "Red, Green, Brown, Silver", "Red, Grey, Silver, Silver", "Red, Green, Silver"));
            questionList.add(new Question("  A potentiometer has a uniform wire of length 5 m. A battery of emf 10 V and negligible internal resistance is connected between its ends. A secondary cell connected to the circuit gives balancing length at 200 cm. The emf of the secondary cell is",Uri.parse("https://www.nitk.ac.in/"), "8 V", "4 V", "2 V", "6 V", "4 V"));
            questionList.add(new Question(" body falls freely for 10 sec. Its average velocity during this journey (take g = 10 m/s\u00b2)",Uri.parse("https://www.nitk.ac.in/"), "100 m/s", "20 m/s", "50 m/s", "200 m/s", "50 m/s"));
            questionList.add(new Question(" The component of a vector r along x-axis has a maximum value i",Uri.parse("https://www.nitk.ac.in/"), " r is along + ve x-axis", "r is along with + ve y-axis", " r is along – ve y-axis", "r makes an angle of 45° with the x-axis", " r is along + ve x-axis"));
            questionList.add(new Question(" Maximum acceleration of the train in which a 50 kg box lying on its floor will remain stationary (Given: Coefficient of static friction between the box and the floor of the train is 0.3 and g = 10 m/s\u00b2)",Uri.parse("https://www.nitk.ac.in/"), "5.0 m/s\u00b2", "2.0 m/s\u00b2", "3.0 m/s\u00b2", "7.0 m/s\u00b2", "3.0 m/s\u00b2"));
            questionList.add(new Question(" A 12 kg bomb at rest explodes into two pieces of 4 kg and 8 kg piece is 20 Na, the kinetic energy of the 8 kg piece is -",Uri.parse("https://www.nitk.ac.in/"), "25J", "40J", "50J", "30J", "25J"));
            questionList.add(new Question(" A spring is stretched by applying a load to its free end. The strain produced in the spring is –",Uri.parse("https://www.nitk.ac.in/"), "Volumetric", "Shear", "Longitudinal & Shear", "Longitudinal", "Longitudinal & Shear"));
            questionList.add(new Question(" A pan filled with hot food from 94°C to 86°C in 2 minutes. When the room temperature is 20°C. How long will it cool from 74°C to 66°C?",Uri.parse("https://www.nitk.ac.in/"), " 2 minutes", " 2.8 minutes", " 2.5 minutes", " 1.8 minutes", " 2.8 minutes"));
            questionList.add(new Question(" Four rods with different radii r and length l are used to connect to heat reservoirs at different temperatures. Which one will conduct most heat?",Uri.parse("https://www.nitk.ac.in/"), "r = 1 cm, l = 2 m", "r = 1 cm, l = (1 / 2) m", " r = 2 cm, l = 2 m", " r = 2 cm, l = (1 / 2) m", " r = 2 cm, l = (1 / 2) m"));
            questionList.add(new Question(" A Carnot engine working between 300 K and 400 K has 800 J of useful work. The amount of heat energy supplied to the engine from the source is –",Uri.parse("https://www.nitk.ac.in/"), " 2400 J", "3200 J", "4200 J", "1200 J", "3200 J"));
            questionList.add(new Question(" A source of sound is moving with a velocity of 50 m/s towards the stationary observer. The observer measures the frequency of sound as 500 Hz. The apparent frequency of sound as heard by the observer when the source is moving away from him with the same speed is (Speed of sound at room temperature 350 m/s) –",Uri.parse("https://www.nitk.ac.in/"), "400 Hz", "675 Hz", "375 Hz", "975 Hz", "375 Hz"));
            questionList.add(new Question("  An electron of mass m, charge e falls through a distance h meter in a uniform electric field E. Then the time of fall –",Uri.parse("https://www.nitk.ac.in/"), "t = √2hm / Ee", "t = 2hm / Ee", " t = √2eE / hm", " t = 2√2eE / hm", "t = √2hm / Ee"));
            questionList.add(new Question(" Nature of equipotential surface for a point charge is –",Uri.parse("https://www.nitk.ac.in/"), "Ellipsoid with the charge at foci.", "Sphere with the charge at the centre of the sphere", "Sphere with the charge on the surface of the sphere", "Plane with the charge on the surface.", "Sphere with the charge at the centre of the sphere"));
            questionList.add(new Question(" A particle of mass 1 gm and charge 1 μ C is held at rest on a frictionless horizontal surface at distance 1 m from the fixed charge 2 mC. If the particle is released, it will be repelled. The speed of the particle when it is at a distance of 10 m from the fixed charge –",Uri.parse("https://www.nitk.ac.in/"), "20m/s", "280m/s", "90m/s", "180m/s", "180m/s"));
            questionList.add(new Question("  Mobility of free electrons in a conductor is –",Uri.parse("https://www.nitk.ac.in/"), "Directly proportional to relaxation time.", "Directly proportional to electron density.", "Inversely proportional to electron density.", "Inversely proportional to relaxation time.\n", "Directly proportional to relaxation time."));
            questionList.add(new Question("  Two heating coils of resistances 10 Ω and 20 Ω are connected in parallel and connected to a battery of emf 12V and internal resistance 1Ω. The power consumed by them are in the ratio –",Uri.parse("https://www.nitk.ac.in/"), "2 : 1", "2 : 8", "3 : 1", "4 : 1", "2 : 1"));
            questionList.add(new Question(" A portion is projected with a uniform velocity ‘v’ along the axis of a current-carrying solenoid, then –",Uri.parse("https://www.nitk.ac.in/"), "The proton will continue to move with velocity ‘v’ along the axis.", " The proton moves along a helical path.", "The proton path will be circular about the axis", "The proton will be accelerated along the axis", "The proton will continue to move with velocity ‘v’ along the axis."));
            questionList.add(new Question(" In the cyclotron, as the radius of the circular path of the charged particle increases (ω = angular velocity, v = linear velocity)",Uri.parse("https://www.nitk.ac.in/"), "both ω and v increases", "both ω and v increases", "both ω and v increases", " v increases, ω decreases", "both ω and v increases"));
            questionList.add(new Question(" The quantity of a charge that will be transferred by a current flow of 20 A over 1 hour 30 minutes period is –",Uri.parse("https://www.nitk.ac.in/"), "10.8 × 10\u00b3 C", "10.8 × 10\u00b4 C", "5.8 × 10\u00b3 C", "10.8 × 10\u00b5 C", "10.8 × 10\u00b4 C"));
            questionList.add(new Question(" A galvanometer coil has a resistance of 50 Ω and the meter shows full-scale deflection for a current of 5 mA. This galvanometer is converted into a voltmeter of range 0 – 20 V by connecting.",Uri.parse("https://www.nitk.ac.in/"), "3950 Ω in series with galvanometer", "4050 Ω in series with galvanometer", "3950 Ω in parallel with galvanometer", "3950 Ω in parallel with galvanometer", "3950 Ω in series with galvanometer"));
            questionList.add(new Question("  At a certain place, the horizontal component of earth’s magnetic field is 3.0 G and the angle dip at the place is 30°. The magnetic field of the earth at that location.",Uri.parse("https://www.nitk.ac.in/"), "3.5 G", "9.5 G", "1.5 G", "5.5 G", "3.5 G"));
            questionList.add(new Question(" The process of superimposing message signal on the high-frequency carrier wave is called –",Uri.parse("https://www.nitk.ac.in/"), "Modulation", "Transmission", "Demodulation", "Amplification", "Modulation"));
            questionList.add(new Question(" A long solenoid with 40 turns per cm carries a current of 1 A. The magnetic energy stored per unit volume is _____________ J/m\u00b3",Uri.parse("https://www.nitk.ac.in/"), "3.2π", "32π", "0.5π", "1.2π", "3.2π"));
            questionList.add(new Question(" The rms value of current in a 50 Hz AC circuit is 6 A. The average value of AC current over a cycle is –",Uri.parse("https://www.nitk.ac.in/"), "6√2", "6√2/10", "0", "10", "0"));
            questionList.add(new Question(" A capacitor of capacitance 10 μ F is connected to an AC source and an AC ammeter. If the source voltage varies as V = 50√2 sin 100t, the reading of the ammeter is -",Uri.parse("https://www.nitk.ac.in/"), "50 mA", "0.5 mA", "5 mA", "500 mA", "50 mA"));
            questionList.add(new Question(" In a series L.C.R circuit, the potential drop across L, C and R respectively are 40 V, 120 V and 60 V. Then the source voltage is –",Uri.parse("https://www.nitk.ac.in/"), "100 V", "100 V", "580 V", "80 V", "180 V"));
            questionList.add(new Question(" Electromagnetic radiation used to sterilise milk is –",Uri.parse("https://www.nitk.ac.in/"), " UV ray", "Radio", "Gamma rays", "X Rays", " UV ray"));
            questionList.add(new Question(" A plane glass plate is placed over various coloured letters (violet, green, yellow, red). The letter which appears to raise more.",Uri.parse("https://www.nitk.ac.in/"), "Green", "Red", "Violet", "Blue", "Violet"));
            questionList.add(new Question(" A ray of light suffers a minimum deviation when incident on an equilateral prism of refractive index √2. The angle of incidence is –",Uri.parse("https://www.nitk.ac.in/"), "30\u00b0", "60\u00b0", "0\u00b0", "90\u00b0", "30\u00b0"));
            questionList.add(new Question(" In Young’s double-slit experiment the source is white light. One slit is covered with a red filter and the other with a blue filter. There shall be ",Uri.parse("https://www.nitk.ac.in/"), "Alternate dark & pink fringes", " Alternate red & blue fringes", "No interference", "Alternate dark & yellow fringes\n", "No interference"));
            questionList.add(new Question(" For what distance is ray optics is a good approximation when the aperture is 4 mm and the wavelength of light is 400 \uD835\uDF02 m?",Uri.parse("https://www.nitk.ac.in/"), "24 m", "4 m", "14 m", "54 m", "24 m"));
            questionList.add(new Question(" The de Broglie wavelength of an electron accelerated to a potential of 400 V is approximately –",Uri.parse("https://www.nitk.ac.in/"), "0.03 nm", "0.2 nm", "0.06 nm", "0.12 nm", "0.06 nm"));
            questionList.add(new Question("  Total energy of an electron in an excited state of a hydrogen atom is – 3.4 eV. The kinetic and potential energy of an electron in this state –",Uri.parse("https://www.nitk.ac.in/"), " K = -3.4 eV U = - 6.8 eV", "K = 3.4 eV U = - 6.8 eV", " K = 10.2eV U = 3.6eV", " K = 10.2eV U = - 13.6eV", "K = 3.4 eV U = - 6.8 eV"));
            questionList.add(new Question(" When an electron jumps from n = 4 level to n = 1 level, the angular momentum of electron changes by –",Uri.parse("https://www.nitk.ac.in/"), "h / 2π", "3h / 2π", " 4h / 2π", " 8h / 2π", "3h / 2π"));
            questionList.add(new Question(" A radioactive sample of half-life 10 days contains 1000 x nuclei. Number of original nuclei present after 5 days is –\n",Uri.parse("https://www.nitk.ac.in/"), "707 x", "777 x", "407 x", "250 x", "707 x"));
            questionList.add(new Question(" A nucleus of mass 20 u emits a γ photon of energy 6 MeV. If the emission assume to occur when the nucleus is free and rest, then the nucleus will have kinetic energy nearest to ",Uri.parse("https://www.nitk.ac.in/"), "1 KeV", "0.1 KeV", "100 KeV", "10 KeV", "1 KeV"));
            questionList.add(new Question(" Constant DC voltage is required from a variable AC voltage. Which of the following is the correct order of operation?",Uri.parse("https://www.nitk.ac.in/"), "Rectifier, filter, regulator", "Regulator, filter, rectifier", " Rectifier, regulator, filter", "Filter, regulator, rectifier", "Rectifier, filter, regulator"));

            setQuestion();
        }
        //chemistry set1
        else if (url1111.contentEquals("chem_set1")) {
            questionList.add(new Question("  Phosphorous pentachloride ",Uri.parse("https://www.google.com/url?sa=i&url=AAAABAE"), "Has all the five equivalent bonds", "Exist as an ionic solid in which the cation has an octahedral structure and the anion has a tetrahedral structure", "On hydrolysis gives an oxo acid of phosphorous which is tribasic", "On hydrolysis gives an oxo acid of phosphorous which is a good reducing agent", "On hydrolysis gives an oxo acid of phosphorous which is tribasic"));
            questionList.add(new Question("  Identify the set of paramagnetic ions among the following:",Uri.parse("https://www.nitk.ac.in/"), "Ti\u00b3, Cu\u00b2, Mn\u00b3", "Sc\u00b3, Ti\u00b3, V\u00b3", "V\u00b2, Co\u00b2, Zn\u00b2", " Ni\u00b2,Cu\u00b2,Zn\u00b2", "Ti\u00b3, Cu\u00b2, Mn\u00b3"));
            questionList.add(new Question("  How many moles of K\u2082(Cr)\u2082O\u2087 is required to liberate 6 moles of I2 from an aqueous solution of I-? ",Uri.parse("https://www.nitk.ac.in/"), "0.25", "0.5", "2", "1", "2"));
            questionList.add(new Question("  Aqueous solution of a salt (A) forms a dense white precipitate with BaCl\u2082 solution. The precipitate dissolves in dilute HCl to produce a gas (B) which decolourises acidified KMnO\u2084 solution. A and B respectively are:",Uri.parse("https://www.nitk.ac.in/"), "BaSO\u2083, H\u2082S", "BaSO\u2084, SO\u2082", "BaSO\u2083, SO\u2082", "BaSO\u2084, H\u2082S", "BaSO\u2083, SO\u2082"));
            questionList.add(new Question("  Bond angle in PH\u2084+ is more than that of PH\u2083. This is because:",Uri.parse("https://www.nitk.ac.in/"), " PH\u2083 has a planar trigonal structure", "Hybridisation of P changes when PH\u2083 is converted to PH\u2084+", "Lone pair-bond pair repulsion exists in PH\u2083", "PH\u2084+ has a square planar structure", "\"Lone pair-bond pair repulsion exists in PH\\u2083"));
            questionList.add(new Question("  Incorrectly matched pair is:",Uri.parse("https://www.nitk.ac.in/"), "XeF\u2086 – distorted octahedral", "XeOF\u2084 – square pyramidal", "XeO\u2083 – pyramidal", " XeF\u2084 – tetrahedral", "XeF\u2084 – tetrahedral"));
            questionList.add(new Question("  Prolonged exposure of chloroform in humans may cause damage to the liver. It is due to the formation of the following compound:",Uri.parse("https://www.nitk.ac.in/"), "CH\u2082 Cl\u2082", "Cl\u2082", "CCl\u2084", "COCl\u2082", "COCl\u2082"));
            questionList.add(new Question("  Which of the following halides show the highest reactivity towards SN-1 reactions?",Uri.parse("https://www.nitk.ac.in/"), "CH\u2083-CH\u2082-CH\u2082-CH\u2082 I", "C\u2086 H\u2085 Cl", "C\u2086 H\u2085 CH\u2082 Cl", "CH\u2083 CH\u2082 Cl", "C\u2086 H\u2085 CH\u2082 Cl"));
            questionList.add(new Question("  The steps involved in the conversion of propan-2-ol to propan-1-ol are in the order:",Uri.parse("https://www.nitk.ac.in/"), "Heating with PCl\u2085, heating with alc.KOH, hydroboration-oxidation", "Dehydration, addition of HBr in the presence of a peroxide, heating with alc.KOH", "Dehydration, addition of HBr, heating with alc.KOH", "Heating with PCl\u2085, heating with alc.KOH, acid catalysed addition of water", "Heating with PCl\u2085, heating with alc.KOH, hydroboration-oxidation"));
            questionList.add(new Question("  he carbonyl compound that does not undergo aldol condensation is:",Uri.parse("https://www.nitk.ac.in/"), "Trichloroacetaldehyde", "Acetaldehyde", "Acetone", "Dichloroacetaldehyde", "Trichloroacetaldehyde"));
            questionList.add(new Question("  Which of the following vitamins is not stored in the adipose tissue?",Uri.parse("https://www.nitk.ac.in/"), "A", "D", "E", "B\u2086", "B\u2086"));
            questionList.add(new Question("  Hypothyroidism is caused by the deficiency of:",Uri.parse("https://www.nitk.ac.in/"), "Thyroxine", "Glucocorticoid", "Vitamin B-12", "Adrenalin", "Thyroxine"));
            questionList.add(new Question("  C\u2081-C\u2084 glycosidic bond is NOT found in:",Uri.parse("https://www.nitk.ac.in/"), "Lactose", "Starch", "Maltose", "Sucrose", "Sucrose"));
            questionList.add(new Question("  Which of the following polymers has the strongest intermolecular forces of attraction?",Uri.parse("https://www.nitk.ac.in/"), "Polythene", "Polystyrene", "Neoprene", "Terylene", "Terylene"));
            questionList.add(new Question("  A food additive that also acts as an anti-oxidant is:",Uri.parse("https://www.nitk.ac.in/"), "Sugar syrup", "Salt", "BHA", " Saccharin", "BHA"));
            questionList.add(new Question("  Which of the following monomers can undergo condensation polymerisation?",Uri.parse("https://www.nitk.ac.in/"), " Glycine", " Styrene", "Propene", "Isoprene", " Glycine"));
            questionList.add(new Question("  0.4 g of dihydrogen is made to react with 7.1 g of dichloride to form hydrogen chloride. The volume of hydrogen chloride formed at 273 K and 1 bar pressure is:",Uri.parse("https://www.nitk.ac.in/"), "90.8 L", "4.54 L", "45.4 L", "9.08 L", "4.54 L"));
            questionList.add(new Question("  With regard to the photoelectric effect, identify the correct statement among the following:",Uri.parse("https://www.nitk.ac.in/"), "Number of electrons ejected increases with the increase in work function", "Number of electrons ejected increases with the increase in the intensity of incident light", "Energy of ejected electrons increases with the increase in the intensity of incident light", "Numbers of electrons ejected increases with the increase in the frequency of the incident light", "Number of electrons ejected increases with the increase in the intensity of incident light"));
            questionList.add(new Question("  A gas mixture contains 25% He and 75% CH\u2084 by volume at a given temperature and pressure. The percentage by mass of methane in the mixture is approximately:",Uri.parse("https://www.nitk.ac.in/"), "92%", " 8%", "75%", "25%", "92%"));
            questionList.add(new Question("  The formal charge on the central oxygen atom in ozone is:",Uri.parse("https://www.nitk.ac.in/"), "+2", "+1", "-1", "0", "+1"));
            questionList.add(new Question("  When the same quantity of heat is absorbed by a system at two different temperatures T1 and T2, such that T1>T2, change in entropies are ∆S1 and ∆S2 respectively. Then:",Uri.parse("https://www.nitk.ac.in/"), "S2>S1", "∆S2<∆S1", "∆S1<∆S2", " ∆S2 = ∆S1", "∆S1<∆S2"));
            questionList.add(new Question("  The oxidation number of nitrogen atoms in NH\u2084 NO\u2083 are:",Uri.parse("https://www.nitk.ac.in/"), "+3,-5", "3,-3", " +5,-5", "-3,+5", "-3,+5"));
            questionList.add(new Question("  The metal that produces H\u2082 with both dil. HCl and NaOH (aq) is:",Uri.parse("https://www.nitk.ac.in/"), "Ca", "Fe", "Zn", "Mg", "Zn"));
            questionList.add(new Question("  Which of the following is not a pair of functional isomers?",Uri.parse("https://www.nitk.ac.in/"), " CH\u2083 CH\u2082 NO\u2082and H\u2082 NCH\u2082 COOH", " CH\u2083 COOH and HCOOCH\u2083", "C\u2082 H\u2085 OC\u2082 H\u2085and C\u2083 H\u2087 OCH\u2083", "CH\u2083 CH\u2082 OH and CH\u2083 OCH\u2083", "C\u2082 H\u2085 OC\u2082 H\u2085and C\u2083 H\u2087 OCH\u2083"));
            questionList.add(new Question("  Which of the following is NOT a greenhouse gas?",Uri.parse("https://www.nitk.ac.in/"), "O\u2082", "NO\u2082", "CFC", " CO\u2082", "O\u2082"));
            questionList.add(new Question("  Silicon doped with gallium forms:",Uri.parse("https://www.nitk.ac.in/"), "An intrinsic semiconductor", " p-type semiconductor", "n-type semiconductor", "n-type semiconductor", " p-type semiconductor"));
            questionList.add(new Question("  Solute `X’ dimerises in water to an extent of 80%.2.5 g of `X’ in 100 g of water increases the boiling point by 0.3 ℃. The molar mass of X is: [ K\u208b = 0.52 Kkgmol\u00b1]",Uri.parse("https://www.nitk.ac.in/"), "65", "26", "13", "52", ""));
            questionList.add(new Question("  If an aqueous solution of NaF is electrolyzed between inert electrodes, the product obtained at the anode is:",Uri.parse("https://www.nitk.ac.in/"), "Na", "O\u2082", "F\u2082", "H\u2082", "O\u2082"));
            questionList.add(new Question("  In which of the following cases, a chemical reaction is possible:",Uri.parse("https://www.nitk.ac.in/"), "Conc. HNO\u2083 is stored in a platinum vessel", "Gold ornaments are washed with dil. HCl", "ZnSO\u2084 is placed in a copper vessel", " AgNO\u2083 solution is stirred with a copper spoon", " AgNO\u2083 solution is stirred with a copper spoon"));
            questionList.add(new Question("  The time required for 60% completion of a first-order reaction is 50 min. The time required for 93.6% completion of the same reaction will be",Uri.parse("https://www.nitk.ac.in/"), "50 MIN", "150 MIN", "100 MIN", "83.8 MIN", "150 MIN"));
            questionList.add(new Question("  Copper is extracted from copper pyrites by:",Uri.parse("https://www.nitk.ac.in/"), "Electrometallurgy", " Auto reduction", " Thermal decomposition", "Reduction by coke", " Auto reduction"));
            questionList.add(new Question("  Function of potassium ethylxanthate in froth floatation process is to make ore:",Uri.parse("https://www.nitk.ac.in/"), "Hydrophilic", "Heavier", " hydrophobic", "Lighter", " hydrophobic"));
            questionList.add(new Question("  Sulphide ore on roasting gives a gas X. X reacts with Cl\u2082 in the presence of activated charcoal to give Y. Y is:",Uri.parse("https://www.nitk.ac.in/"), "SCl\u2086", "SOCl\u2082", " SO\u2082Cl\u2082", "S\u2082Cl\u2082", "SO\u2082Cl\u2082"));
            questionList.add(new Question("  The orbital nearest to the nucleus is",Uri.parse("https://www.nitk.ac.in/"), "4f", "5d", "4s", "7p", "4s"));
            questionList.add(new Question("  The intramolecular hydrogen bond is present in",Uri.parse("https://www.nitk.ac.in/"), "Phenol", "o-Nitrophenol", " p-Nitrophenol", " p-Cresol", "o-Nitrophenol"));
            questionList.add(new Question("  For an ideal gas, the compressibility factor is",Uri.parse("https://www.nitk.ac.in/"), "0", "1", "-1", "2", "11"));
            questionList.add(new Question("  Acidity of BF\u2083 can be explained on which of the following concepts?",Uri.parse("https://www.nitk.ac.in/"), " Arrhenius concept", "Bronsted-Lowry concept", "Lewis concept", "Bronsted-Lowry as well as Lewis concept", "Lewis concept"));
            questionList.add(new Question("  H\u2082O\u2082 is",Uri.parse("https://www.nitk.ac.in/"), "An oxidizing agent", "A reducing agent", "Both oxidizing and reducing agent", "Neither oxidizing nor reducing agent", "Both oxidizing and reducing agent"));
            questionList.add(new Question("  Identify the following compound which exhibits geometrical isomerism:",Uri.parse("https://www.nitk.ac.in/"), "But-2-ene", "But-1-ene", "Butane", "Isobutane", "But-2-ene"));
            questionList.add(new Question("  During the fusion of organic compound with sodium metal, nitrogen present in the organic compound is converted into",Uri.parse("https://www.nitk.ac.in/"), "NaNO\u2082", "NaNH\u2082", "NaCN", "NaNC", "NaCN"));
            questionList.add(new Question("  Which of the following oxides shows electrical properties like metals?",Uri.parse("https://www.nitk.ac.in/"), "SiO\u2082", "MgO", "SO\u2082(s)", "CrO\u2082", "CrO\u2082"));
            questionList.add(new Question("  Which of the following aqueous solutions should have the highest boiling point?",Uri.parse("https://www.nitk.ac.in/"), "1.0 M NaOH", "1.0 M Na\u2082SO\u2084", "1.0 M Na\u2082SO\u2084", "1.0 M KNO\u2083", " 1.0 M Na\u2082SO\u2084"));
            questionList.add(new Question("  Electrolytic refining is used to purify which of the following metals?",Uri.parse("https://www.nitk.ac.in/"), "Cu and Zn", "Ge and Si", "Zr and Ti", " Zn and Hg", "Cu and Zn"));
            questionList.add(new Question("  Dry ice is",Uri.parse("https://www.nitk.ac.in/"), "Solid CO", "Solid SO\u2082", "Solid CO\u2082", "Solid O\u2082", "Solid CO\u2082"));
            questionList.add(new Question("  Which of the following statements is true in the case of alkyl halides?",Uri.parse("https://www.nitk.ac.in/"), "They are polar in nature", "They can form hydrogen bonds", "They are highly soluble in water", "They undergo addition reactions", "They are polar in nature"));
            questionList.add(new Question("  Phenol can be distinguished from ethanol by the reagent",Uri.parse("https://www.nitk.ac.in/"), "Bromine water", "Sodium metal", "Iron metal", "Chlorine water", "Bromine water"));
            questionList.add(new Question("  Which of the following bases is not present in DNA?",Uri.parse("https://www.nitk.ac.in/"), "Adenine", "Guanine", "Cytosine", " Uracil", " Uracil"));
            questionList.add(new Question("  Which one of the following is a polyamide polymer?",Uri.parse("https://www.nitk.ac.in/"), "Terylene", "Nylon-6, 6", "Buna-S", " Bakelite", "Nylon-6, 6"));
            questionList.add(new Question("  In F.C.C. the cell is shared equally by how many unit cells?",Uri.parse("https://www.nitk.ac.in/"), "10", "8", "6", "2", "6"));
            questionList.add(new Question("  Isotonic solutions are solutions having the same",Uri.parse("https://www.nitk.ac.in/"), "Surface tension", "Vapour pressure", "Osmotic pressure", "Viscosity", "Osmotic pressure"));
            questionList.add(new Question("  The temperature coefficient of a reaction is 2. When the temperature is increased from 30° C to 90°C, the rate of reaction is increased by",Uri.parse("https://www.nitk.ac.in/"), "150 times", "410 times", "72 times", "64 times", "64 times"));
            questionList.add(new Question("  Gold sol is not a",Uri.parse("https://www.nitk.ac.in/"), "Lyophobic sol", " Negatively charged sol", "Macromolecular sol", "Multimolecular colloid", "Macromolecular sol"));
            questionList.add(new Question("  Which of the following oxidation states is common for all lanthanides?",Uri.parse("https://www.nitk.ac.in/"), "+2", "+3", "+4", "+5", "+4"));
            questionList.add(new Question("  When the vapours of tertiary butyl alcohol are passed through heated copper at 573 K, the product formed is",Uri.parse("https://www.nitk.ac.in/"), "But-2-ene", " 2-Butanone", "2-Methyl propene", "Butanal", "2-Methyl propene"));
            questionList.add(new Question("  Which of the following is more basic than aniline?",Uri.parse("https://www.nitk.ac.in/"), "Diphenylamine", "Triphenylamine", " p-nitroaniline", "Benzylamine", "Benzylamine"));
            questionList.add(new Question("  The two forms of D-Glucopyranose are called",Uri.parse("https://www.nitk.ac.in/"), " Diastereomers", "Anomers", "Anomers", "Enantiomers", "Anomers"));
            questionList.add(new Question("  Among the following, the branched-chain polymer is",Uri.parse("https://www.nitk.ac.in/"), "Polyvinyl chloride", "Bakelite", "Low-density polythene", "High-density polythene", "Low-density polythene"));
            questionList.add(new Question("  Edge length of a cube is 300 pm. Its body diagonal would be",Uri.parse("https://www.nitk.ac.in/"), "600 pm", " 423 pm", "519.6 pm", "450.5 pm", "519.6 pm"));
            questionList.add(new Question("  Which of the following is not a conductor of electricity?",Uri.parse("https://www.nitk.ac.in/"), "Solid NaCl", "Cu", "Fused NaCl", "Brine solution", "Solid NaCl"));

            setQuestion();
        }
        //maths set1
        else if (url1111.contentEquals("mat_set1")) {
            questionList.add(new Question("  The value of √24.99 is ",Uri.parse(""), "4.999", "4.899", "5.001", "4.897", "4.99"));
            questionList.add(new Question("  If 3x-5≤2 then",Uri.parse("https://www.nitk.ac.in/"), "1≤x≤7/3", "1≤x≤7/3", "1≤x≤9/3", "-1≤x≤9/3", "1≤x≤7/3"));
            questionList.add(new Question("  If A and B are two events of a sample space S such that P(A) =0.2, P(B) =0.6 and P(AB)=0.5 then P(A’|B)= ",Uri.parse("https://www.nitk.ac.in/"), "3/10", "2/3", "1/2", "1/3", "1/2"));
            questionList.add(new Question("  If ‘X’ has a binomial distribution with parameters n = 6, p and P(X = 2) = 12, P(X = 3) = 5 then P=",Uri.parse("https://www.nitk.ac.in/"), "5/12", "5/12", "1/2", "5/16", "1/2"));
            questionList.add(new Question("  A man speaks truth 2 out of 3 times. He picks one of the natural numbers in the set S = {1, 2, 3, 4, 5, 6, 7} and reports that it is even. The probability that it is actually even is ",Uri.parse("https://www.nitk.ac.in/"), "2/5", "1/5", "1/10", "3/5", "3/5"));
            questionList.add(new Question("  The domain of the function f:R→R defined by f(x) = √(x\u00b2-x+12) ",Uri.parse("https://www.nitk.ac.in/"), " (-∞,3] ⋃[4, ∞)", " (-∞,3] ⋃(4, ∞)", "(-∞,3] ⋂ [4, ∞)", "(3,4)", "(-∞,3] ⋃[4, ∞)"));
            questionList.add(new Question("  If cos x = sin x then, the general solution is ",Uri.parse("https://www.nitk.ac.in/"), "x = nπ ± π/4, n∈Z", "x = nπ ± π/4, n∈Z", "x = nπ+(-1)n π/4, n∈Z", "x = (2n+1)π ± π/4, n∈Z", "x = 2nπ ± π/4, n∈Z"));
            questionList.add(new Question("  If P(n): 2n <n! then the smallest positive integer for which P(n) is true, is",Uri.parse("https://www.nitk.ac.in/"), "2", "3", "4", "5", "4"));
            questionList.add(new Question("  Foot of the perpendicular drawn from the point (1,3,4) to the plane 2x-y+z+3=0 is ",Uri.parse("https://www.nitk.ac.in/"), "(-1,4,3)", "(0,-4,-7)", "(1,2,-3)", "(-3,5,2)", "(-1,4,3)"));
            questionList.add(new Question("  The distance of the point (1,2,1) form the line (x-1)/2 = (y-2)/1 = (z-3)/2 is",Uri.parse("https://www.nitk.ac.in/"), " 2√3/5", "2√5/3", "√5/3", "20/3", "2√5/3"));
            questionList.add(new Question("  If the curves are 2x = y2 and 2xy = K intersect perpendicularly, then the value of K2 is",Uri.parse("https://www.nitk.ac.in/"), "8", "4", "9.32", "3", "8"));
            questionList.add(new Question("  If the side of a cube is increased by 5%, then the surface area of a cube is increased by",Uri.parse("https://www.nitk.ac.in/"), "20%", "10%", "60%", "6%", "10%"));
            questionList.add(new Question("  The area of the region bounded by the curve y2 = 8x and the line y = 2x is",Uri.parse("https://www.nitk.ac.in/"), " (8/3) sq. units", "(16/3) sq. units", "(4/3) sq. units", "3/4) sq. units", "(4/3) sq. units"));
            questionList.add(new Question("  The general solution of the differential equation x\u00b2dy-2xydx = x\u00b4 cos x dx is ",Uri.parse("https://www.nitk.ac.in/"), "y = cos x+cx\u00b2", "y = x\u00b2 sin x+cx\u00b2", " y = x\u00b2sin x+cx", "y = sin x+cx\u00b2", "y = x\u00b2 sin x+cx\u00b2"));
            questionList.add(new Question("  The area of the region bounded by the line y = 2x+1, x- axis and the ordinates x = -1 and x = 1 is",Uri.parse("https://www.nitk.ac.in/"), "5", "9/4", "2", "5/2", "5/2"));
            questionList.add(new Question("  The curve passing through the point (1, 2) given that the slope of the tangent at any point (x,y) is 2x/y represents",Uri.parse("https://www.nitk.ac.in/"), "Hyperbola", "Circle", "Parabola", "Ellipse", "Hyperbola"));
            questionList.add(new Question("  The point(1,-3,4) lies in the octant",Uri.parse("https://www.nitk.ac.in/"), "Eighth", "Second", "Third", "Fourth", "Fourth"));
            questionList.add(new Question("  The distance of the point (1,2,-4) from the line (x-3)/2 = (y-3)/3 = (z+5)/6 is",Uri.parse("https://www.nitk.ac.in/"), "√293/49", "293/7", "√293/7", "293/49", "√293/7"));
            questionList.add(new Question("  The sine of the angle between the straight line (x-2)/3 = (3-y)/(-4) = (z-4)/5 and the plane ",Uri.parse("https://www.nitk.ac.in/"), "√2/10", "√2/10", "3/50", "4/5√2", "√2/10"));
            questionList.add(new Question("  If a line makes an angle of π/3 with each of x and y-axis, then the acute angle made by z-axis is ",Uri.parse("https://www.nitk.ac.in/"), "π/2", "π/2", "π/6", " π/3", "π/2"));
            questionList.add(new Question("  Corner points of the feasible region determined by the system of linear constraints are (0,3),(1,1) and (3,0). Let z = px+qy, where p,q>0. Condition on p and q so that the minimum of z occurs at (3,0) and (1,1) is ",Uri.parse("https://www.nitk.ac.in/"), "p = q", "p = 2q", "p = q/2", "p = 3q", "p = q/2"));
            questionList.add(new Question("  A die is thrown 10 times, the probability that an odd number will come up atleast one time is ",Uri.parse("https://www.nitk.ac.in/"), "1013/1024", "1/1024", "1023/1024", "11/1024", "1023/1024"));
            questionList.add(new Question("  If A and B are two events such that P(A) = 1/3, P(B) = 1/2 and P(A∩B) = 1/6, then P(A'|B) is",Uri.parse("https://www.nitk.ac.in/"), "1/12", "2/3", "1/3", "1/2", "2/3"));
            questionList.add(new Question("  Events E1 and E2 form a partition of the sample space S.A is any event such that P(E1) = P(E2) = 1/2, P(E2│A) = 1/2 and (A│E2) = 2/3 . Then P(E1│A) is ",Uri.parse("https://www.nitk.ac.in/"), "1/4", "1/2", "2/3", "1", "1/2"));
            questionList.add(new Question("  The probability of solving a problem by three persons A,B and C independently is 1/2,1/4 and 1/3 respectively. Then the probability that the problem is solved by any two of them is",Uri.parse("https://www.nitk.ac.in/"), "1/8", "1/12", "1/4", "1/24", "1/4"));
            questionList.add(new Question("  If n(A) = 2 and total number of possible relations from set A to set B is 1024, then n(B) is.",Uri.parse("https://www.nitk.ac.in/"), "5", "512", "20", "10", "5"));
            questionList.add(new Question("  If tan A+cot A=2, then the value of tan4\u00bA+cot4\u00bA=",Uri.parse("https://www.nitk.ac.in/"), "5", "2", "1", "4", "2"));
            questionList.add(new Question("  If A={1,2,3,4,5,6}, then the number of subsets of A which contain atleast two elements is",Uri.parse("https://www.nitk.ac.in/"), "58", "64", "63", "57", "57"));
            questionList.add(new Question("  If z = x + iy, then the equation |z+1| = |z-1| represents",Uri.parse("https://www.nitk.ac.in/"), "y-axis", "a circle", "a parabola", "x-axis", "y-axis"));
            questionList.add(new Question("  The number of terms in the expansion of (x+y+z)10 is ",Uri.parse("https://www.nitk.ac.in/"), "110", "66", "142", "11", "66"));
            questionList.add(new Question("  If P(n) ∶2n< n!,then the smallest positive integer for which P(n)is true if",Uri.parse("https://www.nitk.ac.in/"), "5", "2", "3", "4", "4"));
            questionList.add(new Question("  If the parabola x\u00b2 = 4ay passes through the point (2, 1), then the length of the latus rectum is",Uri.parse("https://www.nitk.ac.in/"), "8", "1", "4", "2", "4"));
            questionList.add(new Question("  If the sum of n terms of an A.P. is given by Sn = n\u00b2 + n, then the common difference of the A.P. is",Uri.parse("https://www.nitk.ac.in/"), "6", "4", "1", "2", "2"));
            questionList.add(new Question("  The negation of the statement “For all real numbers x and y, x + y = y + x” is ",Uri.parse("https://www.nitk.ac.in/"), "for some real numbers x and y, x - y = y - x", "for all real numbers x and y, x+y ≠ y+x", "for some real numbers x and y, x+y = y+x", " for some real numbers x and y,x+y ≠ y+x", " for some real numbers x and y,x+y ≠ y+x"));
            questionList.add(new Question("  The standard deviation of the data 6,7,8,9,10 is",Uri.parse("https://www.nitk.ac.in/"), "10", "2", "12", "8", "2"));
            questionList.add(new Question("  If a relation R on the set {1,2,3} be defined by R = {(1,1)}, then R is",Uri.parse("https://www.nitk.ac.in/"), "Only symmetric", "Reflexive and symmetric", "Reflexive and transitive", "Symmetric and transitive", "Symmetric and transitive"));
            questionList.add(new Question("  Let f ∶ [2, ∞] → R be the function defined by f(x) = x\u00b2-4x+5, then the range of f is ",Uri.parse("https://www.nitk.ac.in/"), "[5,∞)", " (-∞,∞)", "[1, ∞)", "(1,∞)", "[1, ∞)"));
            questionList.add(new Question("  If A,B,C are three mutually exclusive and exhaustive events of an experiment such that P(A) = 2P(B) = 3P(C), then P(B) is equal to ",Uri.parse("https://www.nitk.ac.in/"), "4/11", "1/11", "2/11", "3/11", "3/11"));
            questionList.add(new Question("  If A = {a,b,c}, then the number of binary operations on A is ",Uri.parse("https://www.nitk.ac.in/"), "3\u00b9", "3\u00b1", "3\u00b6", "3\u00b3", "3\u00b9"));
            questionList.add(new Question("  If A and B are square matrices of same order and B is a skew symmetric matrix, then A’BA is ",Uri.parse("https://www.nitk.ac.in/"), "Skew symmetric matrix", "Null matrix", "Diagonal matrix", "Symmetric matrix", "Skew symmetric matrix"));
            questionList.add(new Question("  If A is a square matrix of order 3 and |A| = 5, then |A adj A| is ",Uri.parse("https://www.nitk.ac.in/"), "625", "5", "125", "25", "125"));
            questionList.add(new Question("  The equation of the line parallel to the line 3x – 4y + 2 = 0 and passing through (–2, 3) is ",Uri.parse("https://www.nitk.ac.in/"), " 3x – 4y + 18 = 0", "3x – 4y – 18 = 0", "3x + 4y + 18 = 0", "3x + 4y – 18 = 0", " 3x – 4y + 18 = 0"));
            questionList.add(new Question("  The distance between the foci of a hyperbola is 16 and its eccentricity is √2. Its equation is",Uri.parse("https://www.nitk.ac.in/"), " x\u00b2 – y\u00b2 = 32", "[x\u00b2 / 4] - [y\u00b2 / 9] = 1", "2x\u00b2 – 3y\u00b2 = 7", "y\u00b2 – x\u00b2 = 32", " x\u00b2 – y\u00b2 = 32"));
            questionList.add(new Question("  The number of ways in which 5 girls and 3 boys can be seated in a row so that no two boys are together is",Uri.parse("https://www.nitk.ac.in/"), "14040", " 14440", "14000", " 14400", " 14400"));
            questionList.add(new Question("  The value of limx→0 |x| / x is ",Uri.parse("https://www.nitk.ac.in/"), "1", "-1", "0", "Does not exist", "Does not exist"));
            questionList.add(new Question("  Let f (x) = x – (1 / x) then f’(–1) is ",Uri.parse("https://www.nitk.ac.in/"), "0", "2", "1", "-2", "2"));
            questionList.add(new Question("  The negation of the statement “72 is divisible by 2 and 3” is ",Uri.parse("https://www.nitk.ac.in/"), "72 is not divisible by 2 or 72 is not divisible by 3", "72 is divisible by 2 or 72 is divisible by 3", "72 is divisible by 2 and 72 is divisible by 3", " 72 is not divisible by 2 and 3", "72 is not divisible by 2 or 72 is not divisible by 3"));
            questionList.add(new Question("  The probability of happening of an event A is 0.5 and that of B is 0.3. If A and B are mutually exclusive events, then the probability of neither A nor B is ",Uri.parse("https://www.nitk.ac.in/"), "0.4", "0.5", "0.2", "0.9", "0.2"));
            questionList.add(new Question("  In a simultaneous throw of a pair of dice, the probability of getting a total of more than 7 is ",Uri.parse("https://www.nitk.ac.in/"), "7 / 12", "5 / 36", "5 / 12", " 7 / 36", "5 / 12"));
            questionList.add(new Question("  If A and B are mutually exclusive events given that P (A) = 3 / 5, P (B) = 1 / 5, then P (A or B) is",Uri.parse("https://www.nitk.ac.in/"), "0.8", "0.6", "0.4", "0.2", "0.8"));
            questionList.add(new Question("  Let f, g : R → R be two functions define as f (x) = |x| + x and g (x) = |x| – x ∀ x ∈ R. Then (fog) (x) for x < 0 is ",Uri.parse("https://www.nitk.ac.in/"), "0", "4x", "-4x", "2x", "-4x"));
            questionList.add(new Question("  A is a set having 6 distinct elements. The number of distinct functions from A to A which are not bijections is",Uri.parse("https://www.nitk.ac.in/"), "6! – 6", " 6\u00b6 – 6", "6\u00b6 – 6!", "6!", "6\u00b6 – 6!"));
            questionList.add(new Question("  If f (x) = |cos x - sin x|, then f ‘(π / 6) is equal to",Uri.parse("https://www.nitk.ac.in/"), "(-1 / 2) (1 + √3)", "(1 / 2) (1 + √3)", "(-1 / 2) (1 - √3)", "(1 / 2) (1 - √3)", "(-1 / 2) (1 + √3)"));
            questionList.add(new Question("  Approximate change in volume V of a cube of side x metres caused by increasing the size by 3% is",Uri.parse("https://www.nitk.ac.in/"), " 0.09 x\u00b3 m\u00b3", " 0.03 x\u00b3 m\u00b3", " 0.06 x\u00b3 m\u00b3", " 0.04 x\u00b3 m\u00b3", " 0.09 x\u00b3 m\u00b3"));
            questionList.add(new Question("  The maximum area of a rectangle inscribed in the circle (x + 1)\u00b2 + (y – 3)\u00b2 = 64 is ",Uri.parse("https://www.nitk.ac.in/"), "64 sq. units", "72 sq. units", " 128 sq. units", "8 sq. units", " 128 sq. units"));
            questionList.add(new Question("  The area of the region bounded by the curve y = cos x between x = 0 and x = π is",Uri.parse("https://www.nitk.ac.in/"), "1 sq. unit", "4 sq. unit", "2 sq. unit", "3 sq. unit", "2 sq. unit"));
            questionList.add(new Question("  The area bounded by the line y = x, x-axis and ordinates x = –1 and x = 2 is ",Uri.parse("https://www.nitk.ac.in/"), "3/2", "5/2", "2", "3", "5/2"));
            questionList.add(new Question("  The solution of the differential equation x (dy / dx) – y = 3 represents a family of ",Uri.parse("https://www.nitk.ac.in/"), "straight lines", "circles", "parabolas", "ellipses", "straight lines"));
            questionList.add(new Question("  If a and b are mutually perpendicular unit vectors, then (3a + 2b) . (5a - 6b) =",Uri.parse("https://www.nitk.ac.in/"), "5", "3", "6", "12", "3"));
           questionList.add(new Question("   The maximum area of a rectangle inscribed in the circle (x + 1)\u00b2 + (y – 3)\u00b2 = 64 is",Uri.parse("https://www.nitk.ac.in/"), "64 sq. units", "72 sq. units", "128 sq. units", "8 sq. units", "128 sq. units"));

            setQuestion();
        }
        //biology set1
        else if (url1111.contentEquals("bio_set1")) {
            questionList.add(new Question("  Injection of an antidote against a snakebite is an example of ",Uri.parse(""), "  auto immunity", " innate immunity", " active immunity", " passive immunity", " passive immunity"));
            questionList.add(new Question("  Identify the labels M and N in the following agarose gel electrophoresis representation. ",Uri.parse("https://cdn1.byjus.com/wp-content/uploads/2020/10/kcet-2020-biology-paper-with-solutions-q13.png"), "a. M - Smallest DNA bands, N - Largest DNA bands", "b. M - Digested DNA bands, N - Undigested DNA bands", "c. M - Hybridised DNA bands, N - Unhybridised DNA bands", "d. M - Largest DNA bands, N - Smallest DNA bands", "d. M - Largest DNA bands, N - Smallest DNA bands"));
            questionList.add(new Question("  Which vector can clone a small fragment of DNA? ",Uri.parse("https://www.nitk.ac.in/"), "Bacterial artificial chromosome", "Yeast artificial chromosome", "Plasmid", "Cosmid", "Plasmid "));
            questionList.add(new Question("  Continuous self-pollination results in ",Uri.parse("https://www.nitk.ac.in/"), "Inbreeding depression", "Self-incompatibility", "Formation of unisexual flowers", "Gametes loose vigour", " Inbreeding depression"));
            questionList.add(new Question("  Seeds without fertilization are obtained from",Uri.parse("https://www.nitk.ac.in/"), " Parthenocarpy", "Apomixis", "Polyembryony", "Dormancy", "Apomixis"));
            questionList.add(new Question("  The hormone which acts on Sertoli cells and stimulates the process of spermiogenesis is",Uri.parse("https://www.nitk.ac.in/"), "Androgen", "LH", "GnRH", "FSH", "FSH"));
            questionList.add(new Question("  The nitrogen base only in DNA is also called",Uri.parse("https://www.nitk.ac.in/"), "5- methyl uracil", "NH4Cl", "Uracil", "Guanine", "Guanine"));
            questionList.add(new Question("  During sewage treatment biogas produced includes",Uri.parse("https://www.nitk.ac.in/"), "Methane, Oxygen, Hydrogen sulphide", "Hydrogen sulphide, Methane, Sulphur oxide", "Hydrogen sulphide, Nitrogen Methane", "Methane, Hydrogen sulphide, Carbon dioxide", "Methane, Hydrogen sulphide, Carbon dioxide"));
            questionList.add(new Question("  If 30j of energy is trapped at the producer level, then how much energy will be available to Peacock as food in the following chain? Plant → Mice →Snake →Peacock",Uri.parse("https://www.nitk.ac.in/"), "0.03j", "0.003j", " 0.3j", "0.0003j", "0.03j"));
            questionList.add(new Question("  Which of the following is not an ex-situ conservation?",Uri.parse("https://www.nitk.ac.in/"), "Cryopreservation", "Botanical garden", "Cryopreservation", "Biosphere reserves", "Biosphere reserves"));
            questionList.add(new Question("  One hormone hastens maturity period in juvenile conifers, a second hormone controls xylem differentiation, while the third increases the tolerance of plants to various stresses. They are respectively",Uri.parse("https://www.nitk.ac.in/"), "Auxin, Gibberellins, Cytokinin", "Auxin, Gibberellins ABA", "Gibberellin, Auxin, Cytokinin", "Gibberellin, Auxin, ABA", "Gibberellin, Auxin, ABA"));
            questionList.add(new Question("  In a human foetus the limbs and digits develop after",Uri.parse("https://www.nitk.ac.in/"), "First trimester", "8 weeks", "12 weeks", "5th month", "5th month"));
            questionList.add(new Question("  With respect to phenylketonuria identify which statement is not correct.",Uri.parse("https://www.nitk.ac.in/"), "It is an example of pleiotropy.", "It is an error in metabolism.", "It is a case of aneuploidy.", "Caused due to autosomal recessive trait.", "It is a case of aneuploidy."));
            questionList.add(new Question("  RNA polymerase-I transcribes eukaryotic ribosome which does not consist of",Uri.parse("https://www.nitk.ac.in/"), "28 SrRNA", "5 SrRNA", "5.8 SrRNA", "18 SrRNA", "5 SrRNA"));
            questionList.add(new Question("  The organism which completely lacks a cell and can live without oxygen are",Uri.parse("https://www.nitk.ac.in/"), "Archaebacteria", "Thermoacidophiles", "Mycoplasma", "Methanogens", "Mycoplasma"));
            questionList.add(new Question("  Double lines in the pedigree analysis show",Uri.parse("https://www.nitk.ac.in/"), "Sex unspecified", "Consanguineous marriage", "Unaffected offspring", "Normal mating", "Consanguineous marriage"));
            questionList.add(new Question("  Sonalika and Kalyan Sona are high yielding varieties of",Uri.parse("https://www.nitk.ac.in/"), "Rice", "Maize", "Sugarcane", "Wheat", "Wheat"));
            questionList.add(new Question("  BOD refers to",Uri.parse("https://www.nitk.ac.in/"), "The amount of oxygen consumed if all the organic matter in 1000 ml of water were oxidized by bacteria", "The amount of oxygen released when all the organic matter was consumed by bacteria in 1 litre of water", "The oxygen required for bacteria to grow in 1 litre of effluent", "The oxygen required for bacteria to grow in 1 litre of effluent", "The amount of oxygen consumed if all the organic matter in 1000 ml of water were oxidized by bacteria"));
            questionList.add(new Question("  During the menstrual cycle the cyclical changes takes place in",Uri.parse("https://www.nitk.ac.in/"), " Endometrium", "Myometrium", "Perimetrium", "Corpus luteum", " Endometrium"));
            questionList.add(new Question("  Choose the correct statement:",Uri.parse("https://www.nitk.ac.in/"), "Pyruvate is formed in the mitochondrial matrix", "Pyruvate is formed in the mitochondrial matrix", "Oxygen is vital in respiration for removal of Hydrogen", "There is a complete breakdown of glucose during fermentation", "Oxygen is vital in respiration for removal of Hydrogen"));
            questionList.add(new Question("  According to Robert Constanza, 50% of the total cost for ecosystem services goes to",Uri.parse("https://www.nitk.ac.in/"), "Recreation", "Climate regulation", "Nutrient cycling", "Soil formation", "Soil formation"));
            questionList.add(new Question("  Find the wrongly matched pair:",Uri.parse("https://www.nitk.ac.in/"), "Endemism– Species confined to one region and also found in other regions", "Alien species– Clarias gariepinus", "Lungs of the planet – Amazon rain forest", "Hot spots– Regions with species richness", "Endemism– Species confined to one region and also found in other regions"));
            questionList.add(new Question("  If an inheritable mutation is observed in a population at high frequency, it is referred to as",Uri.parse("https://www.nitk.ac.in/"), "DNA polymorphism", "Expressed sequence Tag", "Sequence annotation", "Linkage", "DNA polymorphism"));
            questionList.add(new Question("  Select the mismatch pair from the following :",Uri.parse("https://www.nitk.ac.in/"), "Insulin – Gluconeogenesis", "Glucagon – Glycogenolysis", "Oxytocin – Contraction of uterine muscles", "Prolactin – Milk production in mammary glands", "Insulin – Gluconeogenesis"));
            questionList.add(new Question("  In prokaryotes the Glycocalyx when it is thick is called?",Uri.parse("https://www.nitk.ac.in/"), "Slime layer", "Mesosome", "Capsule", "Cell wall", "Capsule"));
            questionList.add(new Question("  Which of the following is not correct with respect to malaria?",Uri.parse("https://www.nitk.ac.in/"), "Sporozoites multiply in the blood", "Malignant malaria is caused by Plasmodium falciparum", "RBCs rupture and release haemozoin causes chills", "Female anopheles mosquito is the vector", "Sporozoites multiply in the blood"));
            questionList.add(new Question("  In 125 amino acid sequence if the codon for 25th amino acid is mutated to UAA, then",Uri.parse("https://www.nitk.ac.in/"), "a polypeptide of 124 amino acids is formed", " a polypeptide of 25 amino acids is formed", "A polypeptide of 24 amino acids is formed", "No polypeptides are formed", "A polypeptide of 24 amino acids is formed"));
            questionList.add(new Question("  A scrubber in the exhaust of a chemical industrial plant removes",Uri.parse("https://www.nitk.ac.in/"), "Gases like Sulphur dioxide", "Particulate matter of the size 5 micrometers or above", "Gases like ozone or methane", "Gases like Nitrous oxide", "Gases like Sulphur dioxide"));
            questionList.add(new Question("  The formation of two species from one ancestral species is known as",Uri.parse("https://www.nitk.ac.in/"), "Phyletic evolution", " Divergent evolution", "Convergent evolution", "allopatry", " Divergent evolution"));
            questionList.add(new Question("  The breakdown of detritus into small particles by detrivores is called",Uri.parse("https://www.nitk.ac.in/"), "Humification", "Catabolism", "Leaching", "Fragmentation", "Fragmentation"));
            questionList.add(new Question("  Hibernating animals have tissue containing mitochondria with a membrane protein that accelerates electron transport while blocking the synthesis of ATP. What is the consequence of this?",Uri.parse("https://www.nitk.ac.in/"), "Energy is saved because glycolysis and the citric acid cycle shut down", "The energy of respiration is converted into heat", "Hibernating animals can synthesize fat instead of wasting the energy of respiration", "Pyruvate is converted to lactic acid by anaerobic fermentation", "The energy of respiration is converted into heat"));
            questionList.add(new Question("  The pioneer species in Xerarch and Hydrarch succession are respectively",Uri.parse("https://www.nitk.ac.in/"), "Lichens and sedges", "Lichens and rooted hydrophytes", "Lichens and phytoplanktons", "Phytoplanktons and lichens1", "Lichens and phytoplanktons"));
            questionList.add(new Question("  During the chemiosmotic synthesis of ATP in photosynthesis:",Uri.parse("https://www.nitk.ac.in/"), "The protons accumulate in the intermembrane space of chloroplast", "The proton gradient is not required", "The protons accumulate in the intermembrane space of the mitochondrion", "The protons accumulate within the lumen of the thylakoids", "The protons accumulate in the intermembrane space of the mitochondrion"));
            questionList.add(new Question("  When tripalmitin is used as a respiratory substrate. The process consumes 145 molecules of oxygen and releases 102 molecules of CO2, then RQ would be",Uri.parse("https://www.nitk.ac.in/"), "0.5", "0.7", "1.4", "1.0", "0.7"));
            questionList.add(new Question("  Identify the incorrect statement with reference to Biocontrol agents:",Uri.parse("https://www.nitk.ac.in/"), "They do not show any negative impact on crop plants", "They help to increase the use of synthetic pesticides", "They are significant in treating the ecologically sensitive area", "They are significant in treating the ecologically sensitive area", "They do not show any negative impact on crop plants"));
            questionList.add(new Question("   A farmer has applied chemical fertilisers in the crop field for many successive seasons, the crop growth was poor as soil lost its fertility. Suggest the suitable microorganism that replenishes the fertility of the soil in this field.",Uri.parse("https://www.nitk.ac.in/"), "Spirulina", "Nostoc", "Chlorella", "Spirogyra", "Nostoc"));
            questionList.add(new Question("  In cloning vectors, antibiotic resistance genes are helpful for.",Uri.parse("https://www.nitk.ac.in/"), "Transfer of foreign gene to the host", "Selection of recombinants", "Making the host cells competent", "Cleaving the vector by REN", "Selection of recombinants"));
            questionList.add(new Question("  A student while extracting DNA from Aspergillus fungus requires ___ enzyme to break open the cell wall.",Uri.parse("https://www.nitk.ac.in/"), "Cellulase", "Lysozyme", "Pectinase", "Chitinase", "Chitinase"));
            questionList.add(new Question("  Identify the DNA sequence which can be cut using EcoRI.",Uri.parse("https://www.nitk.ac.in/"), "5'TGCTTAGGTA3'", "5'ACGAATTCAT3'", "5'TGCTTAGGTA3'", "5'TGCTTAGGTA3'", "5'TGCTTAGGTA3'"));
            questionList.add(new Question("  In a crime investigation, the investigating officer collects different biological samples from the crime spot for DNA Finger-Printing Analysis. Which of the following samples is not helpful in the analysis?",Uri.parse("https://www.nitk.ac.in/"), "Skin shreds", "Erythrocytes", "Semen samples", "Hair Follicle", "Erythrocytes"));
            questionList.add(new Question("  A mature mRNA consists of bases without any stop codon in between. Calculate the number of amino acids coded by the mRNA during translation.",Uri.parse("https://www.nitk.ac.in/"), "9000", "299", "300", "450", "300"));
            questionList.add(new Question("  Which one of the following ecosystems has the highest annual net primary productivity?",Uri.parse("https://www.nitk.ac.in/"), "Desert", "Tropical deciduous forest", "Tropical rain forest", "Temperature evergreen forest", "Tropical rain forest"));
            questionList.add(new Question("  Of the total incident solar radiation of percentage photosynthetically Active Radiation (PAR) captured by the plants",Uri.parse("https://www.nitk.ac.in/"), "10-20% of PAR only", "2-10% of PAR only", "0-10% of PAR only", "30-40% of PAR only", "2-10% of PAR only"));
            questionList.add(new Question("  Which one of the following human activities has contributed as deforestation by north-eastern sides of India?",Uri.parse("https://www.nitk.ac.in/"), "Urbanisation", "Industrialisation", "Mono cropping", "Jhum cultivation", "Jhum cultivation"));
            questionList.add(new Question("  In an area where DDT has been used extensively, the population of birds declined significantly because -",Uri.parse("https://www.nitk.ac.in/"), "Birds became vulnerable to predators", "Birds stopped laying eggs", "Many of the eggs laid by birds showed pre-matured breaking", "Earthworms in the area got eradicated", "Many of the eggs laid by birds showed pre-matured breaking"));
            questionList.add(new Question("  The brain capacity of Homo habilis",Uri.parse("https://www.nitk.ac.in/"), "1800 cc", "Between 650 cc – 800 cc", "900 cc", "1400 cc", "Between 650 cc – 800 cc"));
            questionList.add(new Question("  In Bougainvillea and Cucurbita, the axillary bud is modified into thorn and tendril respectively. This is an example of",Uri.parse("https://www.nitk.ac.in/"), "Co-evolution", "Divergent Evolution", "Micro Evolution", "Convergent Evolution", "Divergent Evolution"));
            questionList.add(new Question("  A person shows symptoms like Sneezing, water eyes, morning cases and difficulty in breathing on exposure to certain substances in the air, which type of antibody is produced during such condition?",Uri.parse("https://www.nitk.ac.in/"), "IgG", "IgE", "IgM", "IgA", "IgE"));
            questionList.add(new Question("  A man was suffering from mental illness like depression and insomnia. Identify the drug which is normally used as medicine in such cases",Uri.parse("https://www.nitk.ac.in/"), "Morphine", "Lysergic Acid Diethylamides (LSD)", "Nicotine", "Heroine", "Lysergic Acid Diethylamides (LSD)"));
            questionList.add(new Question("   Plants like Marchantia and Funaria produce gametes by mitosis, because",Uri.parse("https://www.nitk.ac.in/"),"They are gametophytes", "Plant body is haploid", "They are dioecious", "They are dioecious", "Plant body is haploid"));
            questionList.add(new Question("  Nowadays agricultural practice is expensive to the farmers as they need to purchase hybrid seeds every year. Which of the following strategies can be employed to overcome this problem?",Uri.parse("https://www.nitk.ac.in/"),  "Synthetic seeds", "Production of Apomictic seeds", "Conventional plant breeding", "Parthenocarpy", "Conventional plant breeding"));
            questionList.add(new Question("  Identify the correct order of steps involved in Artificial hybridization in plants:",Uri.parse("https://www.nitk.ac.in/"),"Artificial Pollination → Emasculation → Rebagging → Bagging", "Rebagging → Artificial Pollination → Bagging → Emasculation", "Emasculation → Bagging → Artificial Pollination → Rebagging", "Bagging → Artificial pollination → Rebagging → Emasculation", "Emasculation → Bagging → Artificial Pollination → Rebagging"));
            questionList.add(new Question("  Which of the following protozoan parasites causes sleeping sickness?",Uri.parse("https://www.nitk.ac.in/"), "Plasmodium", "Entamoeba", "Entamoeba", "Trypanosoma", "Trypanosoma"));
            questionList.add(new Question("  Testa and Tegmen of the seed coat represent",Uri.parse("https://www.nitk.ac.in/"), "Dried integuments", "Dried Sepals", "Dried Tepals", "Dried petals", "Dried integuments"));
            questionList.add(new Question("  The trees growing in temperature regions show clear demarcation between springwood and autumn wood. This is because",Uri.parse("https://www.nitk.ac.in/"), "The climatic conditions are uniform throughout the year", "The water stress is more", "The temperature is high", "The climatic conditions are not uniform throughout the year", "The climatic conditions are uniform throughout the year"));
            questionList.add(new Question("  Which of these is not an advantage in genetically modified crops?",Uri.parse("https://www.nitk.ac.in/"), "Increases efficiency of mineral usage in plants", "Reduces the reliance on chemical pesticides", "Enhances the nutritional value of food", "Increases the post-harvest losses", "Increases the post-harvest losses"));
            questionList.add(new Question("  Some multinational companies have exploited the traditional knowledge of the indigenous people to produce commercially important bioproducts, without their consent. This is an example of:",Uri.parse("https://www.nitk.ac.in/"), "Biopatent", "Bioprospecting", "Biopiracy", "Bioremediation", "Biopiracy"));
            questionList.add(new Question("  In Amphibian and reptiles, the body temperature changes corresponding to external temperature. The organisms which show this kind of response is termed as :",Uri.parse("https://www.nitk.ac.in/"), " Partial Regulators", "Regulators", "Thermophiles", "Conformers", "Regulators"));
            questionList.add(new Question("  The nourishing cells in the Seminiferous tubules are",Uri.parse("https://www.nitk.ac.in/"), "Follicular cells", " Leydig cells", "Sertoli cells", "Spermatogonial cells", "Sertoli cells"));
            questionList.add(new Question("  If in a normal Menstruating woman, menses occur 5th April, what will be expected date of Ovulation",Uri.parse("https://www.nitk.ac.in/"), "10th April", "18th April", "29th April", "14th April", "18th April"));
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
    @Override
    public void onBackPressed() {

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