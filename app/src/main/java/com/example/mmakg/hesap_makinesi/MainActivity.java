package com.example.mmakg.hesap_makinesi;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    public static String HEX_CHARACTERS = "0123456789ABCDEF";
    Button sayi_0, sayi_1, sayi_2, sayi_3, sayi_4, sayi_5, sayi_6,
            sayi_7, sayi_8, sayi_9, sayi_topla, sayi_cikar,
            sayi_carp, sayi_bol, sayi_sil, hesapla, kok, kare,
            virgul, sayi_yuzde, sin, cos, tan, cot, isaret, sayi_a,
            sayi_b, sayi_c, sayi_d, sayi_e, sayi_f, sayi_gerial, sayi_tersi;
    CheckBox functions, hexdec;
    TextView display;
    String hexdex;
    int a = 0;
    private float ilkdeger = 0;
    private double sonuc = 0;
    private String islem;
    private int sayac = -1, sonuchex = 0, ilkdegerhex = 0;

    public static String decimalToHex(int decimal) {
        String hex = "";

        while (decimal != 0) {
            int hexValue = decimal % 16;
            hex = toHexChar(hexValue) + hex;
            decimal = decimal / 16;
        }

        return hex;
    }

    public static char toHexChar(int hexValue) {
        if (hexValue <= 9 && hexValue >= 0)
            return (char) (hexValue + '0');
        else  // hexValue <= 15 && hexValue >= 10
            return (char) (hexValue - 10 + 'A');
    }

    private int hex2dec(String hexValue) {
        hexValue = hexValue.toUpperCase();
        int decimalResult = 0;
        for (int i = 0; i < hexValue.length(); i++) {
            char digit = hexValue.charAt(i);
            int digitValue = HEX_CHARACTERS.indexOf(digit);
            decimalResult = decimalResult * 16 + digitValue;
        }
        return decimalResult;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hesapla = (Button) findViewById(R.id.hesapla);
        sayi_0 = (Button) findViewById(R.id.sayi_0);
        sayi_1 = (Button) findViewById(R.id.sayi_1);
        sayi_2 = (Button) findViewById(R.id.sayi_2);
        sayi_3 = (Button) findViewById(R.id.sayi_3);
        sayi_4 = (Button) findViewById(R.id.sayi_4);
        sayi_5 = (Button) findViewById(R.id.sayi_5);
        sayi_6 = (Button) findViewById(R.id.sayi_6);
        sayi_7 = (Button) findViewById(R.id.sayi_7);
        sayi_8 = (Button) findViewById(R.id.sayi_8);
        sayi_9 = (Button) findViewById(R.id.sayi_9);
        sayi_a = (Button) findViewById(R.id.sayi_a);
        sayi_b = (Button) findViewById(R.id.sayi_b);
        sayi_c = (Button) findViewById(R.id.sayi_c);
        sayi_d = (Button) findViewById(R.id.sayi_d);
        sayi_e = (Button) findViewById(R.id.sayi_e);
        sayi_f = (Button) findViewById(R.id.sayi_f);
        sayi_gerial = (Button) findViewById(R.id.sayi_gerial);
        sayi_tersi = (Button) findViewById(R.id.sayi_tersi);
        virgul = (Button) findViewById(R.id.virgul);
        isaret = (Button) findViewById(R.id.isaret);
        sayi_topla = (Button) findViewById(R.id.sayi_topla);
        sayi_cikar = (Button) findViewById(R.id.sayi_cikar);
        sayi_carp = (Button) findViewById(R.id.sayi_carp);
        sayi_bol = (Button) findViewById(R.id.sayi_bol);
        sayi_sil = (Button) findViewById(R.id.sayi_sil);
        sayi_yuzde = (Button) findViewById(R.id.sayi_yuzde);
        kok = (Button) findViewById(R.id.kok);
        kare = (Button) findViewById(R.id.kare);
        tan = (Button) findViewById(R.id.tan);
        cot = (Button) findViewById(R.id.cot);
        sin = (Button) findViewById(R.id.sin);
        cos = (Button) findViewById(R.id.cos);
        display = (TextView) findViewById(R.id.display);
        functions = (CheckBox) findViewById(R.id.checkBoxAci);
        hexdec = (CheckBox) findViewById(R.id.checkBoxHex);
        sayi_a.setVisibility(View.GONE);
        sayi_b.setVisibility(View.GONE);
        sayi_c.setVisibility(View.GONE);
        sayi_d.setVisibility(View.GONE);
        sayi_e.setVisibility(View.GONE);
        sayi_f.setVisibility(View.GONE);
        sin.setVisibility(View.GONE);
        cos.setVisibility(View.GONE);
        tan.setVisibility(View.GONE);
        cot.setVisibility(View.GONE);
        sayi_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText(display.getText() + "0");
            }
        });

        sayi_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "1");

            }
        });
        sayi_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "2");

            }
        });
        sayi_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "3");

            }
        });
        sayi_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "4");

            }
        });
        sayi_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "5");
            }
        });
        sayi_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "6");

            }
        });
        sayi_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "7");

            }
        });
        sayi_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "8");

            }
        });
        sayi_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "9");

            }
        });
        sayi_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "A");

            }
        });
        sayi_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "B");

            }
        });
        sayi_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "C");

            }
        });
        sayi_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "D");

            }
        });
        sayi_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "E");

            }
        });
        sayi_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0) {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "F");

            }
        });
        sayi_gerial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    String display2 = display.getText().toString();
                    display2 = display2.substring(0, display2.length() - 1);
                    display.setText(display2);
                }


            }
        });
        virgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    display.setText(display.getText() + ".");
                }

            }
        });
        sayi_yuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ilkdeger = 0;
                sonuc = 0;
                if (!display.getText().toString().equals("")) {
                    ilkdeger = Float.parseFloat(display.getText().toString());
                    sonuc = ilkdeger / 100;
                    display.setText(String.valueOf(sonuc));
                }

            }
        });
        sayi_tersi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ilkdeger = 0;
                sonuc = 0;
                if (!display.getText().toString().equals("")) {
                    ilkdeger = Float.parseFloat(display.getText().toString());
                    sonuc = 1 / ilkdeger;
                    display.setText(String.valueOf(sonuc));

                }

            }
        });
        try {

            sayi_sil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    display.setText("");
                }
            });
        } catch (Exception c) {
        }
        try {

            isaret.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    ilkdeger = Float.parseFloat(display.getText().toString());
                    if (!display.getText().toString().equals("")) {
                        sonuc = -ilkdeger;
                        display.setText(String.valueOf(sonuc));
                    }


                }
            });
        } catch (Exception c) {
        }

        try {

            sayi_topla.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    ilkdegerhex = 0;
                    sonuchex = 0;
                    sonuc = 0;
                    sayi_topla.setTextColor(Color.BLUE);
                    if (!display.getText().toString().equals("")) {
                        if (hexdec.isChecked()) {
                            int dec = hex2dec(display.getText().toString());
                            ilkdegerhex = dec;
                            sayac++;

                        } else {
                            ilkdeger = Float.parseFloat(display.getText().toString());
                            sayac++;
                        }

                        islem = "Toplama";
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            sayi_cikar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    ilkdegerhex = 0;
                    sonuchex = 0;
                    sayi_cikar.setTextColor(Color.BLUE);
                    if (!display.getText().toString().equals("")) {
                        if (hexdec.isChecked()) {
                            int dec = hex2dec(display.getText().toString());
                            ilkdegerhex = dec;
                            sayac++;

                        } else {
                            ilkdeger = Float.parseFloat(display.getText().toString());
                            sayac++;
                        }

                        islem = "Cikarma";
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            sayi_carp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    ilkdegerhex = 0;
                    sonuchex = 0;
                    sayi_carp.setTextColor(Color.BLUE);
                    if (!display.getText().toString().equals("")) {
                        if (hexdec.isChecked()) {
                            int dec = hex2dec(display.getText().toString());
                            ilkdegerhex = dec;
                            sayac++;

                        } else {
                            ilkdeger = Float.parseFloat(display.getText().toString());
                            sayac++;
                        }

                        islem = "Carpma";
                    }

                }
            });
        } catch (Exception c) {
        }

        try {

            sayi_bol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    ilkdegerhex = 0;
                    sonuchex = 0;
                    sayi_bol.setTextColor(Color.BLUE);
                    if (!display.getText().toString().equals("")) {
                        if (hexdec.isChecked()) {
                            int dec = hex2dec(display.getText().toString());
                            ilkdegerhex = dec;
                            sayac++;

                        } else {
                            ilkdeger = Float.parseFloat(display.getText().toString());
                            sayac++;
                        }

                        islem = "Bolme";
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            kok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    if (!display.getText().toString().equals("")) {
                        ilkdeger = Float.parseFloat(display.getText().toString());
                        sonuc = Math.sqrt(ilkdeger);
                        display.setText(String.valueOf(sonuc));

                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            kare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    if (!display.getText().toString().equals("")) {
                        ilkdeger = Float.parseFloat(display.getText().toString());
                        sonuc = ilkdeger * ilkdeger;
                        display.setText(String.valueOf(sonuc));
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            sin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    if (!display.getText().toString().equals("")) {
                        ilkdeger = Float.parseFloat(display.getText().toString());
                        sonuc = Math.sin(ilkdeger);
                        display.setText(String.valueOf(sonuc));
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    if (!display.getText().toString().equals("")) {
                        ilkdeger = Float.parseFloat(display.getText().toString());
                        sonuc = Math.cos(ilkdeger);
                        display.setText(String.valueOf(sonuc));
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            tan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    if (!display.getText().toString().equals("")) {
                        ilkdeger = Float.parseFloat(display.getText().toString());
                        sonuc = Math.tan(ilkdeger);
                        display.setText(String.valueOf(sonuc));
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            cot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    if (!display.getText().toString().equals("")) {
                        ilkdeger = Float.parseFloat(display.getText().toString());
                        sonuc = Math.cos(ilkdeger) / Math.sin(ilkdeger);
                        display.setText(String.valueOf(sonuc));
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            functions.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (((CheckBox) view).isChecked()) {
                        cot.setVisibility(View.VISIBLE);
                        tan.setVisibility(View.VISIBLE);
                        sin.setVisibility(View.VISIBLE);
                        cos.setVisibility(View.VISIBLE);
                    } else {
                        cot.setVisibility(View.GONE);
                        tan.setVisibility(View.GONE);
                        sin.setVisibility(View.GONE);
                        cos.setVisibility(View.GONE);
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            hexdec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (((CheckBox) view).isChecked()) {
                        sayi_a.setVisibility(View.VISIBLE);
                        sayi_b.setVisibility(View.VISIBLE);
                        sayi_c.setVisibility(View.VISIBLE);
                        sayi_d.setVisibility(View.VISIBLE);
                        sayi_e.setVisibility(View.VISIBLE);
                        sayi_f.setVisibility(View.VISIBLE);
                        sayi_yuzde.setVisibility(View.GONE);
                        virgul.setVisibility(View.GONE);
                        kok.setVisibility(View.GONE);
                        kare.setVisibility(View.GONE);
                        functions.setVisibility(View.GONE);
                        tan.setVisibility(View.GONE);
                        cot.setVisibility(View.GONE);
                        sin.setVisibility(View.GONE);
                        cos.setVisibility(View.GONE);
                    } else {
                        sayi_a.setVisibility(View.GONE);
                        sayi_b.setVisibility(View.GONE);
                        sayi_c.setVisibility(View.GONE);
                        sayi_d.setVisibility(View.GONE);
                        sayi_e.setVisibility(View.GONE);
                        sayi_f.setVisibility(View.GONE);
                        sayi_yuzde.setVisibility(View.VISIBLE);
                        virgul.setVisibility(View.VISIBLE);
                        kok.setVisibility(View.VISIBLE);
                        kare.setVisibility(View.VISIBLE);
                        functions.setVisibility(View.VISIBLE);
                    }

                }
            });
        } catch (Exception c) {
        }
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!display.getText().toString().equals("") && !String.valueOf(ilkdeger).equals("0")) {
                    if (islem.equals("Toplama")) {
                        sayi_topla.setTextColor(Color.BLACK);
                        if (hexdec.isChecked()) {
                            int dec2 = hex2dec(display.getText().toString());
                            sonuchex = ilkdegerhex + dec2;
                            decimalToHex(sonuchex);
                            display.setText(decimalToHex(sonuchex));
                        } else {
                            sonuc = ilkdeger + Float.parseFloat(display.getText().toString());
                            display.setText(String.valueOf(sonuc));
                        }

                    } else if (islem.equals("Cikarma")) {
                        sayi_cikar.setTextColor(Color.BLACK);
                        if (hexdec.isChecked()) {
                            int dec2 = hex2dec(display.getText().toString());
                            sonuchex = ilkdegerhex - dec2;
                            decimalToHex(sonuchex);
                            display.setText(decimalToHex(sonuchex));
                        } else {
                            sonuc = ilkdeger - Float.parseFloat(display.getText().toString());
                            display.setText(String.valueOf(sonuc));
                        }

                    } else if (islem.equals("Carpma")) {
                        sayi_carp.setTextColor(Color.BLACK);
                        if (hexdec.isChecked()) {
                            int dec2 = hex2dec(display.getText().toString());
                            sonuchex = ilkdegerhex * dec2;
                            decimalToHex(sonuchex);
                            display.setText(decimalToHex(sonuchex));
                        } else {
                            sonuc = ilkdeger * Float.parseFloat(display.getText().toString());
                            display.setText(String.valueOf(sonuc));
                        }
                    } else if (islem.equals("Bolme")) {
                        sayi_bol.setTextColor(Color.BLACK);
                        if (hexdec.isChecked()) {
                            int dec2 = hex2dec(display.getText().toString());
                            sonuchex = ilkdegerhex / dec2;
                            decimalToHex(sonuchex);
                            display.setText(decimalToHex(sonuchex));
                        } else {
                            sonuc = ilkdeger / Float.parseFloat(display.getText().toString());
                            display.setText(String.valueOf(sonuc));
                        }

                    }
                    ilkdeger = 0;
                    sonuc = 0;
                    ilkdegerhex = 0;
                    sonuchex = 0;

                } else {
                    display.setText("Deger Girmediniz..");

                }
                if (R.id.sayi_sil == view.getId()) {
                    ilkdeger = 0;
                    sonuc = 0;
                    ilkdegerhex = 0;
                    sonuchex = 0;
                    sayac = -1;
                    display.setText("");
                }
            }
        });

    }
}