import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.math.MathContext;

public class Kalkulator {
    private JTextField a0TextField;
    private JButton MCButton;
    private JButton MRButton;
    private JButton MSButton;
    private JButton mButton;
    private JButton mButton1;
    private JButton button6;
    private JButton CEButton;
    private JButton cButton;
    private JButton button9;
    private JButton button10;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button14;
    private JButton button15;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton button19;
    private JButton a1XButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton button24;
    private JButton button25;
    private JButton a0Button;
    private JButton button27;
    private JButton button28;
    private JPanel rootPanel;
    private final int maxDlugoscLiczby = 19;
    private BigDecimal wczytanaLiczba = new BigDecimal(0);
    private BigDecimal pamiec = new BigDecimal(0);
    private String dzialanie = "";
    private boolean obliczone = false;
    private boolean pierwszeMnozenie = true;
    private boolean pierwszeDzielenie = true;

    public Kalkulator() {
        MCButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        MRButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        MSButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        mButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        mButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        CEButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button9.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button10.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a7Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a8Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a9Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button14.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button15.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a4Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a5Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a6Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button19.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a1XButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a1Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a2Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a3Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button24.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button25.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a0Button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button27.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button28.setCursor(new Cursor(Cursor.HAND_CURSOR));
        a0TextField.setHighlighter(null);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText(), nowyTekst = "";

                if (staryTekst.length() - 1 == 0) a0TextField.setText("0");
                else {
                    for (int i = 0; i < staryTekst.length() - 1; i++) nowyTekst += staryTekst.charAt(i);
                    a0TextField.setText(nowyTekst);
                }
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a0TextField.setText("0");
                dzialanie = "";
                wczytanaLiczba = BigDecimal.valueOf(0);
                MCButton.setEnabled(true);
                MRButton.setEnabled(true);
                MSButton.setEnabled(true);
                mButton.setEnabled(true);
                mButton1.setEnabled(true);
                button6.setEnabled(true);
                button9.setEnabled(true);
                button10.setEnabled(true);
                a7Button.setEnabled(true);
                a8Button.setEnabled(true);
                a9Button.setEnabled(true);
                button14.setEnabled(true);
                button15.setEnabled(true);
                a4Button.setEnabled(true);
                a5Button.setEnabled(true);
                a6Button.setEnabled(true);
                button19.setEnabled(true);
                a1XButton.setEnabled(true);
                a1Button.setEnabled(true);
                a2Button.setEnabled(true);
                a3Button.setEnabled(true);
                button24.setEnabled(true);
                button25.setEnabled(true);
                a0Button.setEnabled(true);
                button27.setEnabled(true);
                button28.setEnabled(true);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText(), nowyTekst = "";

                if (!staryTekst.contains("-") && !staryTekst.equals("0") && staryTekst.length() != maxDlugoscLiczby) a0TextField.setText("-" + staryTekst);
                else if (staryTekst.contains("-")) {
                    for (int i = 1; i < staryTekst.length(); i++) nowyTekst += staryTekst.charAt(i);
                    a0TextField.setText(nowyTekst);
                }
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText();

                if (staryTekst.equals("0") || obliczone) {
                    a0TextField.setText("7");
                    obliczone = false;
                }
                else if (staryTekst.length() != maxDlugoscLiczby) a0TextField.setText(staryTekst + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText();

                if (staryTekst.equals("0") || obliczone) {
                    a0TextField.setText("8");
                    obliczone = false;
                }
                else if (staryTekst.length() != maxDlugoscLiczby) a0TextField.setText(staryTekst + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText();

                if (staryTekst.equals("0") || obliczone) {
                    a0TextField.setText("9");
                    obliczone = false;
                }
                else if (staryTekst.length() != maxDlugoscLiczby) a0TextField.setText(staryTekst + "9");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText();

                if (staryTekst.equals("0") || obliczone) {
                    a0TextField.setText("4");
                    obliczone = false;
                }
                else if (staryTekst.length() != maxDlugoscLiczby) a0TextField.setText(staryTekst + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText();

                if (staryTekst.equals("0") || obliczone) {
                    a0TextField.setText("5");
                    obliczone = false;
                }
                else if (staryTekst.length() != maxDlugoscLiczby) a0TextField.setText(staryTekst + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText();

                if (staryTekst.equals("0") || obliczone) {
                    a0TextField.setText("6");
                    obliczone = false;
                }
                else if (staryTekst.length() != maxDlugoscLiczby) a0TextField.setText(staryTekst + "6");
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText();

                if (staryTekst.equals("0") || obliczone) {
                    a0TextField.setText("1");
                    obliczone = false;
                }
                else if (staryTekst.length() != maxDlugoscLiczby) a0TextField.setText(staryTekst + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText();

                if (staryTekst.equals("0") || obliczone) {
                    a0TextField.setText("2");
                    obliczone = false;
                }
                else if (staryTekst.length() != maxDlugoscLiczby) a0TextField.setText(staryTekst + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText();

                if (staryTekst.equals("0") || obliczone) {
                    a0TextField.setText("3");
                    obliczone = false;
                }
                else if (staryTekst.length() != maxDlugoscLiczby) a0TextField.setText(staryTekst + "3");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText();

                if (obliczone) {
                    a0TextField.setText("0");
                    obliczone = false;
                }
                else if (!staryTekst.equals("0") && staryTekst.length() != maxDlugoscLiczby) a0TextField.setText(staryTekst + "0");
            }
        });
        button27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String staryTekst = a0TextField.getText();

                if (staryTekst.length() < maxDlugoscLiczby - 1) {
                    if (!staryTekst.contains(",")) a0TextField.setText(staryTekst + ",");
                    else Toolkit.getDefaultToolkit().beep();
                }
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a0TextField.setText("0");
                MCButton.setEnabled(true);
                MRButton.setEnabled(true);
                MSButton.setEnabled(true);
                mButton.setEnabled(true);
                mButton1.setEnabled(true);
                button6.setEnabled(true);
                button9.setEnabled(true);
                button10.setEnabled(true);
                a7Button.setEnabled(true);
                a8Button.setEnabled(true);
                a9Button.setEnabled(true);
                button14.setEnabled(true);
                button15.setEnabled(true);
                a4Button.setEnabled(true);
                a5Button.setEnabled(true);
                a6Button.setEnabled(true);
                button19.setEnabled(true);
                a1XButton.setEnabled(true);
                a1Button.setEnabled(true);
                a2Button.setEnabled(true);
                a3Button.setEnabled(true);
                button24.setEnabled(true);
                button25.setEnabled(true);
                a0Button.setEnabled(true);
                button27.setEnabled(true);
                button28.setEnabled(true);
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = a0TextField.getText();
                String zmienionyTekst = "";

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == ',') zmienionyTekst += ".";
                    else zmienionyTekst += tekst.charAt(i);
                }
                double liczba = Double.parseDouble(zmienionyTekst);

                if (liczba >= 0) {
                    tekst = String.valueOf(Math.sqrt(liczba));
                    zmienionyTekst = "";
                    for (int i = 0; i < tekst.length(); i++) {
                        if (tekst.charAt(i) == '.') zmienionyTekst += ",";
                        else zmienionyTekst += tekst.charAt(i);
                    }
                    a0TextField.setText(zmienionyTekst);
                }
                else {
                    a0TextField.setText("Błąd");
                    MCButton.setEnabled(false);
                    MRButton.setEnabled(false);
                    MSButton.setEnabled(false);
                    mButton.setEnabled(false);
                    mButton1.setEnabled(false);
                    button6.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    a7Button.setEnabled(false);
                    a8Button.setEnabled(false);
                    a9Button.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    a4Button.setEnabled(false);
                    a5Button.setEnabled(false);
                    a6Button.setEnabled(false);
                    button19.setEnabled(false);
                    a1XButton.setEnabled(false);
                    a1Button.setEnabled(false);
                    a2Button.setEnabled(false);
                    a3Button.setEnabled(false);
                    button24.setEnabled(false);
                    button25.setEnabled(false);
                    a0Button.setEnabled(false);
                    button27.setEnabled(false);
                    button28.setEnabled(false);
                }
            }
        });
        button28.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = a0TextField.getText();
                String zmienionyTekst = "";

                if (tekst.equals("")) return;

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == ',') zmienionyTekst += ".";
                    else zmienionyTekst += tekst.charAt(i);
                }
                if (dzialanie.equals("odejmowanie")) wczytanaLiczba = wczytanaLiczba.subtract(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                else if (dzialanie.equals("mnozenie")) wczytanaLiczba = wczytanaLiczba.multiply(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                else if (dzialanie.equals("dzielenie")) {
                    if (Double.parseDouble(zmienionyTekst) == 0) {
                        a0TextField.setText("Błąd");
                        MCButton.setEnabled(false);
                        MRButton.setEnabled(false);
                        MSButton.setEnabled(false);
                        mButton.setEnabled(false);
                        mButton1.setEnabled(false);
                        button6.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        a7Button.setEnabled(false);
                        a8Button.setEnabled(false);
                        a9Button.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        a4Button.setEnabled(false);
                        a5Button.setEnabled(false);
                        a6Button.setEnabled(false);
                        button19.setEnabled(false);
                        a1XButton.setEnabled(false);
                        a1Button.setEnabled(false);
                        a2Button.setEnabled(false);
                        a3Button.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        a0Button.setEnabled(false);
                        button27.setEnabled(false);
                        button28.setEnabled(false);
                        return;
                    }
                    wczytanaLiczba = wczytanaLiczba.divide(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)), MathContext.DECIMAL32);
                }
                else if (wczytanaLiczba.compareTo(new BigDecimal(0)) == 0) wczytanaLiczba = BigDecimal.valueOf(Double.parseDouble(zmienionyTekst));
                else wczytanaLiczba = wczytanaLiczba.add(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                dzialanie = "dodawanie";
                pierwszeMnozenie = false;
                pierwszeDzielenie = false;
                a0TextField.setText("");
            }
        });
        button24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = a0TextField.getText();
                String zmienionyTekst = "";

                if (tekst.equals("")) return;

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == ',') zmienionyTekst += ".";
                    else zmienionyTekst += tekst.charAt(i);
                }
                if (dzialanie.equals("dodawanie")) wczytanaLiczba = wczytanaLiczba.add(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                else if (dzialanie.equals("mnozenie")) wczytanaLiczba = wczytanaLiczba.multiply(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                else if (dzialanie.equals("dzielenie")) {
                    if (Double.parseDouble(zmienionyTekst) == 0) {
                        a0TextField.setText("Błąd");
                        MCButton.setEnabled(false);
                        MRButton.setEnabled(false);
                        MSButton.setEnabled(false);
                        mButton.setEnabled(false);
                        mButton1.setEnabled(false);
                        button6.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        a7Button.setEnabled(false);
                        a8Button.setEnabled(false);
                        a9Button.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        a4Button.setEnabled(false);
                        a5Button.setEnabled(false);
                        a6Button.setEnabled(false);
                        button19.setEnabled(false);
                        a1XButton.setEnabled(false);
                        a1Button.setEnabled(false);
                        a2Button.setEnabled(false);
                        a3Button.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        a0Button.setEnabled(false);
                        button27.setEnabled(false);
                        button28.setEnabled(false);
                        return;
                    }
                    wczytanaLiczba = wczytanaLiczba.divide(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)), MathContext.DECIMAL32);
                }
                else if (wczytanaLiczba.compareTo(new BigDecimal(0)) == 0) wczytanaLiczba = BigDecimal.valueOf(Double.parseDouble(zmienionyTekst));
                else wczytanaLiczba = wczytanaLiczba.subtract(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                dzialanie = "odejmowanie";
                pierwszeMnozenie = false;
                pierwszeDzielenie = false;
                a0TextField.setText("");
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = a0TextField.getText();
                String zmienionyTekst = "";

                if (tekst.equals("")) return;

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == ',') zmienionyTekst += ".";
                    else zmienionyTekst += tekst.charAt(i);
                }
                if (dzialanie.equals("dodawanie")) wczytanaLiczba = wczytanaLiczba.add(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                else if (dzialanie.equals("odejmowanie")) wczytanaLiczba = wczytanaLiczba.subtract(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                else if (dzialanie.equals("dzielenie")) {
                    if (Double.parseDouble(zmienionyTekst) == 0) {
                        a0TextField.setText("Błąd");
                        MCButton.setEnabled(false);
                        MRButton.setEnabled(false);
                        MSButton.setEnabled(false);
                        mButton.setEnabled(false);
                        mButton1.setEnabled(false);
                        button6.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        a7Button.setEnabled(false);
                        a8Button.setEnabled(false);
                        a9Button.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        a4Button.setEnabled(false);
                        a5Button.setEnabled(false);
                        a6Button.setEnabled(false);
                        button19.setEnabled(false);
                        a1XButton.setEnabled(false);
                        a1Button.setEnabled(false);
                        a2Button.setEnabled(false);
                        a3Button.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        a0Button.setEnabled(false);
                        button27.setEnabled(false);
                        button28.setEnabled(false);
                        return;
                    }
                    wczytanaLiczba = wczytanaLiczba.divide(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)), MathContext.DECIMAL32);
                }
                else if (wczytanaLiczba.compareTo(new BigDecimal(0)) == 0 && pierwszeMnozenie) {
                    wczytanaLiczba = BigDecimal.valueOf(Double.parseDouble(zmienionyTekst));
                    pierwszeMnozenie = false;
                }
                else wczytanaLiczba = wczytanaLiczba.multiply(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                dzialanie = "mnozenie";
                pierwszeDzielenie = false;
                a0TextField.setText("");
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = a0TextField.getText();
                String zmienionyTekst = "";

                if (tekst.equals("")) return;

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == ',') zmienionyTekst += ".";
                    else zmienionyTekst += tekst.charAt(i);
                }
                if (dzialanie.equals("dodawanie")) wczytanaLiczba = wczytanaLiczba.add(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                else if (dzialanie.equals("odejmowanie")) wczytanaLiczba = wczytanaLiczba.subtract(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                else if (dzialanie.equals("mnozenie")) wczytanaLiczba = wczytanaLiczba.multiply(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
                else if (wczytanaLiczba.compareTo(new BigDecimal(0)) == 0 && pierwszeDzielenie) {
                    wczytanaLiczba = BigDecimal.valueOf(Double.parseDouble(zmienionyTekst));
                    pierwszeDzielenie = false;
                }
                else {
                    if (Double.parseDouble(zmienionyTekst) == 0) {
                        a0TextField.setText("Błąd");
                        MCButton.setEnabled(false);
                        MRButton.setEnabled(false);
                        MSButton.setEnabled(false);
                        mButton.setEnabled(false);
                        mButton1.setEnabled(false);
                        button6.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        a7Button.setEnabled(false);
                        a8Button.setEnabled(false);
                        a9Button.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        a4Button.setEnabled(false);
                        a5Button.setEnabled(false);
                        a6Button.setEnabled(false);
                        button19.setEnabled(false);
                        a1XButton.setEnabled(false);
                        a1Button.setEnabled(false);
                        a2Button.setEnabled(false);
                        a3Button.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        a0Button.setEnabled(false);
                        button27.setEnabled(false);
                        button28.setEnabled(false);
                        return;
                    }
                    wczytanaLiczba = wczytanaLiczba.divide(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)), MathContext.DECIMAL32);
                }
                dzialanie = "dzielenie";
                pierwszeMnozenie = false;
                a0TextField.setText("");
            }
        });
        button25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = a0TextField.getText();
                String zmienionyTekst = "";

                if (tekst.equals("")) return;

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == ',') zmienionyTekst += ".";
                    else zmienionyTekst += tekst.charAt(i);
                }
                BigDecimal liczba = BigDecimal.valueOf(Double.parseDouble(zmienionyTekst));
                BigDecimal wynik;

                if (dzialanie.equals("dodawanie")) wynik = wczytanaLiczba.add(liczba);
                else if (dzialanie.equals("odejmowanie")) wynik = wczytanaLiczba.subtract(liczba);
                else if (dzialanie.equals("mnozenie")) wynik = wczytanaLiczba.multiply(liczba);
                else if (dzialanie.equals("dzielenie")) {
                    if (liczba.compareTo(new BigDecimal(0)) != 0) wynik = wczytanaLiczba.divide(liczba, MathContext.DECIMAL32);
                    else {
                        a0TextField.setText("Błąd");
                        MCButton.setEnabled(false);
                        MRButton.setEnabled(false);
                        MSButton.setEnabled(false);
                        mButton.setEnabled(false);
                        mButton1.setEnabled(false);
                        button6.setEnabled(false);
                        button9.setEnabled(false);
                        button10.setEnabled(false);
                        a7Button.setEnabled(false);
                        a8Button.setEnabled(false);
                        a9Button.setEnabled(false);
                        button14.setEnabled(false);
                        button15.setEnabled(false);
                        a4Button.setEnabled(false);
                        a5Button.setEnabled(false);
                        a6Button.setEnabled(false);
                        button19.setEnabled(false);
                        a1XButton.setEnabled(false);
                        a1Button.setEnabled(false);
                        a2Button.setEnabled(false);
                        a3Button.setEnabled(false);
                        button24.setEnabled(false);
                        button25.setEnabled(false);
                        a0Button.setEnabled(false);
                        button27.setEnabled(false);
                        button28.setEnabled(false);
                        return;
                    }
                }
                else return;

                tekst = wynik.toPlainString();
                zmienionyTekst = "";
                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == '.') zmienionyTekst += ",";
                    else zmienionyTekst += tekst.charAt(i);
                }

                a0TextField.setText(zmienionyTekst);
                wczytanaLiczba = new BigDecimal(0);
                obliczone = true;
                pierwszeMnozenie = true;
                pierwszeDzielenie = true;
                dzialanie = "";
            }
        });
        a1XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = a0TextField.getText();
                String zmienionyTekst = "";

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == ',') zmienionyTekst += '.';
                    else zmienionyTekst += tekst.charAt(i);
                }

                BigDecimal liczba = BigDecimal.valueOf(Double.parseDouble(zmienionyTekst));
                BigDecimal wynik = new BigDecimal(1);

                if (liczba.compareTo(new BigDecimal(0)) != 0) wynik = wynik.divide(liczba, MathContext.DECIMAL32);
                else {
                    a0TextField.setText("Błąd");
                    MCButton.setEnabled(false);
                    MRButton.setEnabled(false);
                    MSButton.setEnabled(false);
                    mButton.setEnabled(false);
                    mButton1.setEnabled(false);
                    button6.setEnabled(false);
                    button9.setEnabled(false);
                    button10.setEnabled(false);
                    a7Button.setEnabled(false);
                    a8Button.setEnabled(false);
                    a9Button.setEnabled(false);
                    button14.setEnabled(false);
                    button15.setEnabled(false);
                    a4Button.setEnabled(false);
                    a5Button.setEnabled(false);
                    a6Button.setEnabled(false);
                    button19.setEnabled(false);
                    a1XButton.setEnabled(false);
                    a1Button.setEnabled(false);
                    a2Button.setEnabled(false);
                    a3Button.setEnabled(false);
                    button24.setEnabled(false);
                    button25.setEnabled(false);
                    a0Button.setEnabled(false);
                    button27.setEnabled(false);
                    button28.setEnabled(false);
                    return;
                }

                tekst = wynik.toString();
                zmienionyTekst = "";
                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == '.') zmienionyTekst += ",";
                    else zmienionyTekst += tekst.charAt(i);
                }

                a0TextField.setText(zmienionyTekst);
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = a0TextField.getText();
                String zmienionyTekst = "";

                if (tekst.equals("")) return;

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == ',') zmienionyTekst += '.';
                    else zmienionyTekst += tekst.charAt(i);
                }

                double liczba = wczytanaLiczba.doubleValue() * Double.parseDouble(zmienionyTekst) / 100;
                tekst = String.valueOf(liczba);
                zmienionyTekst = "";

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == '.') zmienionyTekst += ',';
                    else zmienionyTekst += tekst.charAt(i);
                }

                a0TextField.setText(zmienionyTekst);
            }
        });
        MSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = a0TextField.getText();
                String zmienionyTekst = "";

                if (tekst.equals("")) return;

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == ',') zmienionyTekst += '.';
                    else zmienionyTekst += tekst.charAt(i);
                }

                pamiec = new BigDecimal(Double.parseDouble(zmienionyTekst));
            }
        });
        MRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = String.valueOf((double)Math.round(pamiec.doubleValue() * 100000) / 100000);
                String zmienionyTekst = "";

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == '.') zmienionyTekst += ',';
                    else zmienionyTekst += tekst.charAt(i);
                }

                a0TextField.setText(zmienionyTekst);
            }
        });
        MCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pamiec = BigDecimal.valueOf(0);
            }
        });
        mButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = a0TextField.getText();
                String zmienionyTekst = "";

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == ',') zmienionyTekst += '.';
                    else zmienionyTekst += tekst.charAt(i);
                }

                pamiec = pamiec.add(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
            }
        });
        mButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = a0TextField.getText();
                String zmienionyTekst = "";

                for (int i = 0; i < tekst.length(); i++) {
                    if (tekst.charAt(i) == ',') zmienionyTekst += '.';
                    else zmienionyTekst += tekst.charAt(i);
                }

                pamiec = pamiec.subtract(BigDecimal.valueOf(Double.parseDouble(zmienionyTekst)));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        ImageIcon ikona = new ImageIcon("ikona.png");
        frame.setIconImage(ikona.getImage());
        frame.setContentPane(new Kalkulator().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 340);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
