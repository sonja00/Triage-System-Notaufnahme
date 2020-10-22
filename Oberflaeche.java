
/**
 *Text genereted by Simple GUI Extension for BlueJ
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;

public class Oberflaeche extends JFrame {
    private JMenuBar menuBar;
    private JButton Anam_speichern;
    private JComboBox Geschlecht;
    private JTextField Hausnummer;
    private JCheckBox Infektionsverdacht;
    private JComboBox Jahr;

    private JComboBox Monat;
    private JTextField Name;
    private JButton Not_aufnehmen;
    private JTextField PLZ;
    private JButton Pat_aufnehmen;
    private JButton Pat_aufrufen;
    private JButton Pat_entlassen;
    private JTextField RR;
    private JComboBox Tag;
    private JTextField Vorname;
    private JTextArea akt_Pat_List;
    private JTextField allergien;
    private JTextArea anamnese;
    private JTextArea aufn_diagnose;
    private JTextField bz;
    private JComboBox c;
    private JButton end_aufnehmen;
    private JTextField gbort;
    private JTextField hausarzt;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JTextField medis;
    private JTextField pat_id;
    private JTextField puls;
    private JTextField spo2;
    private JTextField strasse;
    private JTextField tel_nr;
    private JTextField temp;
    private JTextField vorerkr;
    private JTextField weiterbehand;
    private JTextField wohnort;
    private JButton notfall_endgueltig_auf;

    //Constructor 
    public Oberflaeche(){

        this.setTitle("KKH Patienten-Verwaltung");
        this.setSize(996,523);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(996,523));
        contentPane.setBackground(new Color(192,192,192));

        Anam_speichern = new JButton();
        Anam_speichern.setBounds(844,471,90,35);
        Anam_speichern.setBackground(new Color(214,217,223));
        Anam_speichern.setForeground(new Color(0,0,0));
        Anam_speichern.setEnabled(true);
        Anam_speichern.setFont(new Font("sansserif",0,12));
        Anam_speichern.setText("Speichern");
        Anam_speichern.setVisible(false);
        //Set action for button click
        //Call defined method
        Anam_speichern.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Anam_speichern(evt);
                }
            });

        Geschlecht = new JComboBox();
        Geschlecht.setBounds(268,119,90,35);
        Geschlecht.setBackground(new Color(214,217,223));
        Geschlecht.setForeground(new Color(0,0,0));
        Geschlecht.setEnabled(true);
        Geschlecht.setFont(new Font("sansserif",0,12));
        Geschlecht.setVisible(false);
        Geschlecht.addItem("weiblich");
        Geschlecht.addItem("maennlich");

        Hausnummer = new JTextField();
        Hausnummer.setBounds(430,255,50,35);
        Hausnummer.setBackground(new Color(255,255,255));
        Hausnummer.setForeground(new Color(0,0,0));
        Hausnummer.setEnabled(true);
        Hausnummer.setFont(new Font("sansserif",0,12));
        Hausnummer.setText("Nr.");
        Hausnummer.setVisible(false);

        Infektionsverdacht = new JCheckBox();
        Infektionsverdacht.setBounds(390,23,150,35);
        Infektionsverdacht.setBackground(new Color(192,192,192));
        Infektionsverdacht.setForeground(new Color(255,51,0));
        Infektionsverdacht.setEnabled(true);
        Infektionsverdacht.setFont(new Font("sansserif",0,12));
        Infektionsverdacht.setText("Infektionsverdacht");
        Infektionsverdacht.setVisible(false);

        Jahr = new JComboBox();
        Jahr.setBounds(398,176,90,35);
        Jahr.setBackground(new Color(214,217,223));
        Jahr.setForeground(new Color(0,0,0));
        Jahr.setEnabled(true);
        Jahr.setFont(new Font("sansserif",0,12));
        Jahr.setVisible(false);
        Jahr.addItem("2020");
        Jahr.addItem("2019");
        Jahr.addItem("2018");
        Jahr.addItem("2017");
        Jahr.addItem("2016");
        Jahr.addItem("2015");
        Jahr.addItem("2014");
        Jahr.addItem("2013");
        Jahr.addItem("2012");
        Jahr.addItem("2011");
        Jahr.addItem("2010");
        Jahr.addItem("2009");
        Jahr.addItem("2008");
        Jahr.addItem("2007");
        Jahr.addItem("2006");
        Jahr.addItem("2005");
        Jahr.addItem("2004");
        Jahr.addItem("2003");
        Jahr.addItem("2002");
        Jahr.addItem("2001");
        Jahr.addItem("2000");
        Jahr.addItem("1999");
        Jahr.addItem("1998");
        Jahr.addItem("1997");
        Jahr.addItem("1996");
        Jahr.addItem("1995");
        Jahr.addItem("1994");
        Jahr.addItem("1993");
        Jahr.addItem("1992");
        Jahr.addItem("1991");
        Jahr.addItem("1990");
        Jahr.addItem("1989");
        Jahr.addItem("1988");
        Jahr.addItem("1987");
        Jahr.addItem("1986");
        Jahr.addItem("1985");
        Jahr.addItem("1984");
        Jahr.addItem("1983");
        Jahr.addItem("1982");
        Jahr.addItem("1981");
        Jahr.addItem("1980");
        Jahr.addItem("1979");
        Jahr.addItem("1978");
        Jahr.addItem("1977");
        Jahr.addItem("1976");
        Jahr.addItem("1975");
        Jahr.addItem("1974");
        Jahr.addItem("1973");
        Jahr.addItem("1972");
        Jahr.addItem("1971");
        Jahr.addItem("1970");
        Jahr.addItem("1969");
        Jahr.addItem("1968");
        Jahr.addItem("1967");
        Jahr.addItem("1966");
        Jahr.addItem("1965");
        Jahr.addItem("1964");
        Jahr.addItem("1963");
        Jahr.addItem("1962");
        Jahr.addItem("1961");
        Jahr.addItem("1960");
        Jahr.addItem("1959");
        Jahr.addItem("1958");
        Jahr.addItem("1957");
        Jahr.addItem("1956");
        Jahr.addItem("1955");
        Jahr.addItem("1954");
        Jahr.addItem("1953");
        Jahr.addItem("1952");
        Jahr.addItem("1951");
        Jahr.addItem("1950");
        Jahr.addItem("1949");
        Jahr.addItem("1948");
        Jahr.addItem("1947");
        Jahr.addItem("1946");
        Jahr.addItem("1945");
        Jahr.addItem("1944");
        Jahr.addItem("1943");
        Jahr.addItem("1942");
        Jahr.addItem("1941");
        Jahr.addItem("1940");
        Jahr.addItem("1939");
        Jahr.addItem("1938");
        Jahr.addItem("1937");
        Jahr.addItem("1936");
        Jahr.addItem("1935");
        Jahr.addItem("1934");
        Jahr.addItem("1933");
        Jahr.addItem("1932");
        Jahr.addItem("1931");
        Jahr.addItem("1930");
        Jahr.addItem("1929");
        Jahr.addItem("1928");
        Jahr.addItem("1927");
        Jahr.addItem("1926");
        Jahr.addItem("1925");
        Jahr.addItem("1924");
        Jahr.addItem("1923");
        Jahr.addItem("1922");
        Jahr.addItem("1921");
        Jahr.addItem("1920");

        Monat = new JComboBox();
        Monat.setBounds(333,176,60,35);
        Monat.setBackground(new Color(214,217,223));
        Monat.setForeground(new Color(0,0,0));
        Monat.setEnabled(true);
        Monat.setFont(new Font("sansserif",0,12));
        Monat.setVisible(false);
        Monat.addItem("01");
        Monat.addItem("02");
        Monat.addItem("03");
        Monat.addItem("04");
        Monat.addItem("05");
        Monat.addItem("06");
        Monat.addItem("07");
        Monat.addItem("08");
        Monat.addItem("09");
        Monat.addItem("10");
        Monat.addItem("11");
        Monat.addItem("12");

        Name = new JTextField();
        Name.setBounds(270,30,90,35);
        Name.setBackground(new Color(255,255,255));
        Name.setForeground(new Color(0,0,0));
        Name.setEnabled(true);
        Name.setFont(new Font("sansserif",0,12));
        Name.setText("Name");
        Name.setVisible(false);

        Not_aufnehmen = new JButton();
        Not_aufnehmen.setBounds(22,211,150,35);
        Not_aufnehmen.setBackground(new Color(255,51,51));
        Not_aufnehmen.setForeground(new Color(0,0,0));
        Not_aufnehmen.setEnabled(true);
        Not_aufnehmen.setFont(new Font("sansserif",0,12));
        Not_aufnehmen.setText("Notfall aufnehmen");
        Not_aufnehmen.setVisible(true);
        //Set action for button click
        //Call defined method
        Not_aufnehmen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Not_aufnehmen(evt);
                }
            });

        PLZ = new JTextField();
        PLZ.setBounds(270,290,90,35);
        PLZ.setBackground(new Color(255,255,255));
        PLZ.setForeground(new Color(0,0,0));
        PLZ.setEnabled(true);
        PLZ.setFont(new Font("sansserif",0,12));
        PLZ.setText("PLZ");
        PLZ.setVisible(false);

        Pat_aufnehmen = new JButton();
        Pat_aufnehmen.setBounds(22,176,150,35);
        Pat_aufnehmen.setBackground(new Color(214,217,223));
        Pat_aufnehmen.setForeground(new Color(0,0,0));
        Pat_aufnehmen.setEnabled(true);
        Pat_aufnehmen.setFont(new Font("sansserif",0,12));
        Pat_aufnehmen.setText("Patient aufnehmen");
        Pat_aufnehmen.setVisible(true);
        //Set action for button click
        //Call defined method
        Pat_aufnehmen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Pat_aufnehmen(evt);
                }
            });

        Pat_aufrufen = new JButton();
        Pat_aufrufen.setBounds(22,246,150,35);
        Pat_aufrufen.setBackground(new Color(214,217,223));
        Pat_aufrufen.setForeground(new Color(0,0,0));
        Pat_aufrufen.setEnabled(true);
        Pat_aufrufen.setFont(new Font("sansserif",0,12));
        Pat_aufrufen.setText("Patient aufrufen");
        Pat_aufrufen.setVisible(true);
        //Set action for button click
        //Call defined method
        Pat_aufrufen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Pat_aufrufen(evt);
                }
            });

        Pat_entlassen = new JButton();
        Pat_entlassen.setBounds(22,281,150,35);
        Pat_entlassen.setBackground(new Color(214,217,223));
        Pat_entlassen.setForeground(new Color(0,0,0));
        Pat_entlassen.setEnabled(true);
        Pat_entlassen.setFont(new Font("sansserif",0,12));
        Pat_entlassen.setText("Patient entlassen");
        Pat_entlassen.setVisible(true);
        //Set action for button click
        //Call defined method
        Pat_entlassen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Pat_entlassen(evt);
                }
            });

        RR = new JTextField();
        RR.setBounds(610,85,90,35);
        RR.setBackground(new Color(255,255,255));
        RR.setForeground(new Color(0,0,0));
        RR.setEnabled(true);
        RR.setFont(new Font("sansserif",0,12));
        RR.setText("RR Sys");
        RR.setVisible(false);

        Tag = new JComboBox();
        Tag.setBounds(268,176,60,35);
        Tag.setBackground(new Color(214,217,223));
        Tag.setForeground(new Color(0,0,0));
        Tag.setEnabled(true);
        Tag.setFont(new Font("sansserif",0,12));
        Tag.setVisible(false);
        Tag.addItem("01");
        Tag.addItem("02");
        Tag.addItem("03");
        Tag.addItem("04");
        Tag.addItem("05");
        Tag.addItem("06");
        Tag.addItem("07");
        Tag.addItem("08");
        Tag.addItem("09");
        Tag.addItem("10");
        Tag.addItem("11");
        Tag.addItem("12");
        Tag.addItem("13");
        Tag.addItem("14");
        Tag.addItem("15");
        Tag.addItem("16");
        Tag.addItem("17");
        Tag.addItem("18");
        Tag.addItem("19");
        Tag.addItem("20");
        Tag.addItem("21");
        Tag.addItem("22");
        Tag.addItem("23");
        Tag.addItem("24");
        Tag.addItem("25");
        Tag.addItem("26");
        Tag.addItem("27");
        Tag.addItem("28");
        Tag.addItem("29");
        Tag.addItem("30");
        Tag.addItem("31");

        Vorname = new JTextField();
        Vorname.setBounds(270,65,90,35);
        Vorname.setBackground(new Color(255,255,255));
        Vorname.setForeground(new Color(0,0,0));
        Vorname.setEnabled(true);
        Vorname.setFont(new Font("sansserif",0,12));
        Vorname.setText("Vorname");
        Vorname.setVisible(false);

        akt_Pat_List = new JTextArea();
        akt_Pat_List.setBounds(22,50,200,120);
        akt_Pat_List.setBackground(new Color(255,255,255));
        akt_Pat_List.setForeground(new Color(0,0,0));
        akt_Pat_List.setEnabled(true);
        akt_Pat_List.setFont(new Font("sansserif",0,12));
        akt_Pat_List.setText("");
        akt_Pat_List.setBorder(BorderFactory.createBevelBorder(1));
        akt_Pat_List.setVisible(true);

        allergien = new JTextField();
        allergien.setBounds(430,325,90,35);
        allergien.setBackground(new Color(255,255,255));
        allergien.setForeground(new Color(0,0,0));
        allergien.setEnabled(true);
        allergien.setFont(new Font("sansserif",0,12));
        allergien.setText("Allergien");
        allergien.setVisible(false);

        anamnese = new JTextArea();
        anamnese.setBounds(610,229,311,159);
        anamnese.setBackground(new Color(255,255,255));
        anamnese.setForeground(new Color(0,0,0));
        anamnese.setEnabled(true);
        anamnese.setFont(new Font("sansserif",0,12));
        anamnese.setText("");
        anamnese.setBorder(BorderFactory.createBevelBorder(1));
        anamnese.setVisible(false);

        aufn_diagnose = new JTextArea();
        aufn_diagnose.setBounds(270,420,250,80);
        aufn_diagnose.setBackground(new Color(255,255,255));
        aufn_diagnose.setForeground(new Color(0,0,0));
        aufn_diagnose.setEnabled(true);
        aufn_diagnose.setFont(new Font("sansserif",0,12));
        aufn_diagnose.setText("Aufnahmediagnose");
        aufn_diagnose.setBorder(BorderFactory.createBevelBorder(1));
        aufn_diagnose.setVisible(false);

        bz = new JTextField();
        bz.setBounds(720,155,90,35);
        bz.setBackground(new Color(255,255,255));
        bz.setForeground(new Color(0,0,0));
        bz.setEnabled(true);
        bz.setFont(new Font("sansserif",0,12));
        bz.setText("BZ");
        bz.setVisible(false);

        c = new JComboBox();
        c.setBounds(386,120,90,35);
        c.setBackground(new Color(214,217,223));
        c.setForeground(new Color(0,0,0));
        c.setEnabled(true);
        c.setFont(new Font("sansserif",0,12));
        c.setVisible(false);
        c.addItem("gelb");
        c.addItem("gruen");

        end_aufnehmen = new JButton();
        end_aufnehmen.setBounds(100,465,160,35);
        end_aufnehmen.setBackground(new Color(214,217,223));
        end_aufnehmen.setForeground(new Color(0,0,0));
        end_aufnehmen.setEnabled(true);
        end_aufnehmen.setFont(new Font("sansserif",0,12));
        end_aufnehmen.setText("Endgueltig aufnehmen");
        end_aufnehmen.setVisible(false);
        //Set action for button click
        //Call defined method
        end_aufnehmen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    endgueltig_aufnehmen(evt);
                }
            });

        notfall_endgueltig_auf = new JButton();
        notfall_endgueltig_auf.setBounds(100,430,160,35);
        notfall_endgueltig_auf.setBackground(new Color(214,217,223));
        notfall_endgueltig_auf.setForeground(new Color(0,0,0));
        notfall_endgueltig_auf.setEnabled(true);
        notfall_endgueltig_auf.setFont(new Font("sansserif",0,12));
        notfall_endgueltig_auf.setText("Endgueltig aufnehmen");
        notfall_endgueltig_auf.setVisible(false);
        //Set action for button click
        //Call defined method
        notfall_endgueltig_auf.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    notfall_endgueltig_auf(evt);
                }
            });

        gbort = new JTextField();
        gbort.setBounds(270,220,90,35);
        gbort.setBackground(new Color(255,255,255));
        gbort.setForeground(new Color(0,0,0));
        gbort.setEnabled(true);
        gbort.setFont(new Font("sansserif",0,12));
        gbort.setText("Geburtsort");
        gbort.setVisible(false);

        hausarzt = new JTextField();
        hausarzt.setBounds(430,360,90,35);
        hausarzt.setBackground(new Color(255,255,255));
        hausarzt.setForeground(new Color(0,0,0));
        hausarzt.setEnabled(true);
        hausarzt.setFont(new Font("sansserif",0,12));
        hausarzt.setText("Hausarzt");
        hausarzt.setVisible(false);

        label1 = new JLabel();
        label1.setBounds(270,149,50,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Tag");
        label1.setVisible(false);

        label2 = new JLabel();
        label2.setBounds(337,149,50,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Monat");
        label2.setVisible(false);

        label3 = new JLabel();
        label3.setBounds(400,149,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Jahr");
        label3.setVisible(false);

        label4 = new JLabel();
        label4.setBounds(270,95,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Geschlecht");
        label4.setVisible(false);

        label5 = new JLabel();
        label5.setBounds(390,95,90,35);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Kategorie");
        label5.setVisible(false);

        label6 = new JLabel();
        label6.setBounds(23,20,120,35);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("sansserif",0,12));
        label6.setText("Aktuelle Patienten");
        label6.setVisible(true);

        label7 = new JLabel();
        label7.setBounds(610,20,150,35);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("sansserif",0,12));
        label7.setText("Anamnesebogen");
        label7.setVisible(false);

        label8 = new JLabel();
        label8.setBounds(610,200,90,35);
        label8.setBackground(new Color(214,217,223));
        label8.setForeground(new Color(0,0,0));
        label8.setEnabled(true);
        label8.setFont(new Font("sansserif",0,12));
        label8.setText("Anamnese");
        label8.setVisible(false);

        label9 = new JLabel();
        label9.setBounds(610,390,120,35);
        label9.setBackground(new Color(214,217,223));
        label9.setForeground(new Color(0,0,0));
        label9.setEnabled(true);
        label9.setFont(new Font("sansserif",0,12));
        label9.setText("Weiterbehandlung");
        label9.setVisible(false);

        medis = new JTextField();
        medis.setBounds(270,360,150,35);
        medis.setBackground(new Color(255,255,255));
        medis.setForeground(new Color(0,0,0));
        medis.setEnabled(true);
        medis.setFont(new Font("sansserif",0,12));
        medis.setText("Medikamente");
        medis.setVisible(false);

        pat_id = new JTextField();
        pat_id.setBounds(610,50,120,35);
        pat_id.setBackground(new Color(255,255,255));
        pat_id.setForeground(new Color(0,0,0));
        pat_id.setEnabled(true);
        pat_id.setFont(new Font("sansserif",0,12));
        pat_id.setText("Patienten ID");
        pat_id.setVisible(false);

        puls = new JTextField();
        puls.setBounds(610,120,90,35);
        puls.setBackground(new Color(255,255,255));
        puls.setForeground(new Color(0,0,0));
        puls.setEnabled(true);
        puls.setFont(new Font("sansserif",0,12));
        puls.setText("Puls");
        puls.setVisible(false);

        spo2 = new JTextField();
        spo2.setBounds(720,120,90,35);
        spo2.setBackground(new Color(255,255,255));
        spo2.setForeground(new Color(0,0,0));
        spo2.setEnabled(true);
        spo2.setFont(new Font("sansserif",0,12));
        spo2.setText("SpO2");
        spo2.setVisible(false);

        strasse = new JTextField();
        strasse.setBounds(270,255,150,35);
        strasse.setBackground(new Color(255,255,255));
        strasse.setForeground(new Color(0,0,0));
        strasse.setEnabled(true);
        strasse.setFont(new Font("sansserif",0,12));
        strasse.setText("Strasse");
        strasse.setVisible(false);

        tel_nr = new JTextField();
        tel_nr.setBounds(390,65,90,35);
        tel_nr.setBackground(new Color(255,255,255));
        tel_nr.setForeground(new Color(0,0,0));
        tel_nr.setEnabled(true);
        tel_nr.setFont(new Font("sansserif",0,12));
        tel_nr.setText("Tel. Nr.");
        tel_nr.setVisible(false);

        temp = new JTextField();
        temp.setBounds(610,155,90,35);
        temp.setBackground(new Color(255,255,255));
        temp.setForeground(new Color(0,0,0));
        temp.setEnabled(true);
        temp.setFont(new Font("sansserif",0,12));
        temp.setText("Temp.");
        temp.setVisible(false);

        vorerkr = new JTextField();
        vorerkr.setBounds(270,325,150,35);
        vorerkr.setBackground(new Color(255,255,255));
        vorerkr.setForeground(new Color(0,0,0));
        vorerkr.setEnabled(true);
        vorerkr.setFont(new Font("sansserif",0,12));
        vorerkr.setText("Vorerkankungen");
        vorerkr.setVisible(false);

        weiterbehand = new JTextField();
        weiterbehand.setBounds(610,420,150,35);
        weiterbehand.setBackground(new Color(255,255,255));
        weiterbehand.setForeground(new Color(0,0,0));
        weiterbehand.setEnabled(true);
        weiterbehand.setFont(new Font("sansserif",0,12));
        weiterbehand.setText("");
        weiterbehand.setVisible(false);

        wohnort = new JTextField();
        wohnort.setBounds(370,290,110,35);
        wohnort.setBackground(new Color(255,255,255));
        wohnort.setForeground(new Color(0,0,0));
        wohnort.setEnabled(true);
        wohnort.setFont(new Font("sansserif",0,12));
        wohnort.setText("Wohnort");
        wohnort.setVisible(false);

        //adding components to contentPane panel
        contentPane.add(Anam_speichern);
        contentPane.add(Geschlecht);
        contentPane.add(Hausnummer);
        contentPane.add(Infektionsverdacht);
        contentPane.add(Jahr);
        contentPane.add(Monat);
        contentPane.add(Name);
        contentPane.add(Not_aufnehmen);
        contentPane.add(PLZ);
        contentPane.add(Pat_aufnehmen);
        contentPane.add(Pat_aufrufen);
        contentPane.add(Pat_entlassen);
        contentPane.add(RR);
        contentPane.add(Tag);
        contentPane.add(Vorname);
        contentPane.add(akt_Pat_List);
        contentPane.add(allergien);
        contentPane.add(anamnese);
        contentPane.add(aufn_diagnose);
        contentPane.add(bz);
        contentPane.add(c);
        contentPane.add(end_aufnehmen);
        contentPane.add(gbort);
        contentPane.add(hausarzt);
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(label3);
        contentPane.add(label4);
        contentPane.add(label5);
        contentPane.add(label6);
        contentPane.add(label7);
        contentPane.add(label8);
        contentPane.add(label9);
        contentPane.add(medis);
        contentPane.add(pat_id);
        contentPane.add(puls);
        contentPane.add(spo2);
        contentPane.add(strasse);
        contentPane.add(tel_nr);
        contentPane.add(temp);
        contentPane.add(vorerkr);
        contentPane.add(weiterbehand);
        contentPane.add(wohnort);
        contentPane.add(notfall_endgueltig_auf);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //Method actionPerformed for Anam_speichern
    private void notfall_endgueltig_auf (ActionEvent evt) {
        Name.setVisible(false);
        Vorname.setVisible(false);
        Infektionsverdacht.setVisible(false);
        notfall_endgueltig_auf.setVisible(false);
    }
    
    private void Anam_speichern (ActionEvent evt){
        label7.setVisible(false);
        label8.setVisible(false);
        label9.setVisible(false);
        temp.setVisible(false);
        weiterbehand.setVisible(false);
        pat_id.setVisible(false);
        puls.setVisible(false);
        spo2.setVisible(false);
        RR.setVisible(false);
        anamnese.setVisible(false);
        bz.setVisible(false);
        Anam_speichern.setVisible(false);
    }


    //Method actionPerformed for Not_aufnehmen
    private void Not_aufnehmen (ActionEvent evt) {
        Name.setVisible(true);
        Vorname.setVisible(true);
        Infektionsverdacht.setVisible(true);
        notfall_endgueltig_auf.setVisible(true);
    }

    //Method actionPerformed for Pat_aufnehmen
    private void Pat_aufnehmen (ActionEvent evt) 
    {
        Name.setVisible(true);
        Vorname.setVisible(true);
        Infektionsverdacht.setVisible(true);
        Geschlecht.setVisible(true);
        c.setVisible(true);
        Tag.setVisible(true);
        Jahr.setVisible(true);
        Monat.setVisible(true);
        gbort.setVisible(true);
        strasse.setVisible(true);
        Hausnummer.setVisible(true);
        PLZ.setVisible(true);
        wohnort.setVisible(true);
        vorerkr.setVisible(true);
        allergien.setVisible(true);
        medis.setVisible(true);
        hausarzt.setVisible(true);
        aufn_diagnose.setVisible(true);
        end_aufnehmen.setVisible(true);
        label1.setVisible(true);
        label2.setVisible(true);
        label3.setVisible(true);
        label4.setVisible(true);
        label5.setVisible(true);
    }

    //Method actionPerformed for Pat_aufrufen
    private void Pat_aufrufen (ActionEvent evt)
    {
        label7.setVisible(true);
        label8.setVisible(true);
        label9.setVisible(true);
        temp.setVisible(true);
        weiterbehand.setVisible(true);
        pat_id.setVisible(true);
        puls.setVisible(true);
        spo2.setVisible(true);
        RR.setVisible(true);
        anamnese.setVisible(true);
        bz.setVisible(true);
        Anam_speichern.setVisible(true);
    }

    //Method actionPerformed for Pat_entlassen
    private void Pat_entlassen (ActionEvent evt) {
        //TODO
    }

    //Method actionPerformed for end_aufnehmen
    private void endgueltig_aufnehmen (ActionEvent evt) {
        Name.setVisible(false);
        Vorname.setVisible(false);
        Infektionsverdacht.setVisible(false);
        Geschlecht.setVisible(false);
        c.setVisible(false);
        Tag.setVisible(false);
        Jahr.setVisible(false);
        Monat.setVisible(false);
        gbort.setVisible(false);
        strasse.setVisible(false);
        Hausnummer.setVisible(false);
        PLZ.setVisible(false);
        wohnort.setVisible(false);
        vorerkr.setVisible(false);
        allergien.setVisible(false);
        medis.setVisible(false);
        hausarzt.setVisible(false);
        aufn_diagnose.setVisible(false);
        end_aufnehmen.setVisible(false);
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem beenden = new JMenuItem("Beenden   ");
        JMenuItem patientsuchenid = new JMenuItem("Patient suchen (ID)   ");
        JMenuItem pateintsuchenname = new JMenuItem("Patient suchen (Name)   ");
        JMenuItem pateintloeschen = new JMenuItem("Patient loeschen   ");
        JMenuItem listeausgeben = new JMenuItem("Liste ausgeben   ");
        JMenuItem langzeitlisteausgeben = new JMenuItem("Langzeitliste ausgeben   ");
        JMenuItem anamnesebogenausgeben = new JMenuItem("Anamnesebogen ausgeben   ");
        JMenuItem datenblattausgeben = new JMenuItem("Datenblatt ausgeben   ");
        JMenuItem programminformationen = new JMenuItem("Programm-Informationen   ");

        //Setings action for menu item
        //Call defined method
        beenden.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    beenden(evt);
                }
            });

        //Setings action for menu item
        //Call defined method
        patientsuchenid.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Pat_suchen_ID(evt);
                }
            });

        //Setings action for menu item
        //Call defined method
        pateintsuchenname.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Pat_suchen_Name(evt);
                }
            });

        //Setings action for menu item
        //Call defined method
        pateintloeschen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Pat_loeschen(evt);
                }
            });

        //Setings action for menu item
        //Call defined method
        listeausgeben.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Liste_ausgeben(evt);
                }
            });

        //Setings action for menu item
        //Call defined method
        langzeitlisteausgeben.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    langliste_ausgeben(evt);
                }
            });

        //Setings action for menu item
        //Call defined method
        anamnesebogenausgeben.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    anam_ausgeben(evt);
                }
            });

        //Setings action for menu item
        //Call defined method
        datenblattausgeben.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Datenbl_ausgeben(evt);
                }
            });

        file.add(beenden);
        tools.add(patientsuchenid);
        tools.add(pateintsuchenname);
        tools.add(pateintloeschen);
        tools.add(listeausgeben);
        tools.add(langzeitlisteausgeben);
        tools.add(anamnesebogenausgeben);
        tools.add(datenblattausgeben);
        help.add(programminformationen);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }
    //Method for Beenden from menuFile 
    private void beenden (ActionEvent evt) {
        System.exit(0);
    }

    //Method for Patient suchen (ID) from menuTools 
    private void Pat_suchen_ID (ActionEvent evt) {
        //TODO
    }

    //Method for Pateint suchen (Name) from menuTools 
    private void Pat_suchen_Name (ActionEvent evt) {
        //TODO
    }

    //Method for Pateint loeschen from menuTools 
    private void Pat_loeschen (ActionEvent evt) {
        //TODO
    }

    //Method for Liste ausgeben from menuTools 
    private void Liste_ausgeben (ActionEvent evt) {
        //TODO
    }

    //Method for Langzeitliste ausgeben from menuTools 
    private void langliste_ausgeben (ActionEvent evt) {
        //TODO
    }

    //Method for Anamnesebogen ausgeben from menuTools 
    private void anam_ausgeben (ActionEvent evt) {
        //TODO
    }

    //Method for Datenblatt ausgeben from menuTools 
    private void Datenbl_ausgeben (ActionEvent evt) {
        //TODO
    }

    public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new Oberflaeche();
                }
            });
    }
}
