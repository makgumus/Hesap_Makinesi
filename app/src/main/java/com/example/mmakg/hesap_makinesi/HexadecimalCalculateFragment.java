package com.example.mmakg.hesap_makinesi;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class HexadecimalCalculateFragment extends Fragment {
    public static String HEX_CHARACTERS = "0123456789ABCDEF";
    Button sayi_0, sayi_1, sayi_2, sayi_3, sayi_4, sayi_5, sayi_6,
            sayi_7, sayi_8, sayi_9, sayi_topla, sayi_cikar,
            sayi_carp, sayi_bol, sayi_sil, hesapla,
            isaret, sayi_a, sayi_b, sayi_c, sayi_d, sayi_e, sayi_f, sayi_gerial;
    TextView display;
    String hexdex;
    View view = null;
    private long ilkdeger = 0, ikincideger = 0;
    private long sonuc = 0;
    private String islem;
    private int sayac = -1, islemsayac = 0;

    public HexadecimalCalculateFragment() {
        // Required empty public constructor
    }

    private static String decimalToHex(int decimal) {
        String hex = "";
        while (decimal != 0) {
            int hexValue = decimal % 16;
            hex = toHexChar(hexValue) + hex;
            decimal = decimal / 16;
        }
        return hex;
    }

    private static char toHexChar(int hexValue) {
        if (hexValue <= 9 && hexValue >= 0)
            return (char) (hexValue + '0');
        else  // hexValue <= 15 && hexValue >= 10
            return (char) (hexValue - 10 + 'A');
    }

    public void initView() {
        display = (TextView) view.findViewById(R.id.display);
        hesapla = (Button) view.findViewById(R.id.hex_hesapla);
        sayi_0 = (Button) view.findViewById(R.id.hex_sayi0);
        sayi_1 = (Button) view.findViewById(R.id.hex_sayi1);
        sayi_2 = (Button) view.findViewById(R.id.hex_sayi2);
        sayi_3 = (Button) view.findViewById(R.id.hex_sayi3);
        sayi_4 = (Button) view.findViewById(R.id.hex_sayi4);
        sayi_5 = (Button) view.findViewById(R.id.hex_sayi5);
        sayi_6 = (Button) view.findViewById(R.id.hex_sayi6);
        sayi_7 = (Button) view.findViewById(R.id.hex_sayi7);
        sayi_8 = (Button) view.findViewById(R.id.hex_sayi8);
        sayi_9 = (Button) view.findViewById(R.id.hex_sayi9);
        sayi_a = (Button) view.findViewById(R.id.hex_sayia);
        sayi_b = (Button) view.findViewById(R.id.hex_sayib);
        sayi_c = (Button) view.findViewById(R.id.hex_sayic);
        sayi_d = (Button) view.findViewById(R.id.hex_sayid);
        sayi_e = (Button) view.findViewById(R.id.hex_sayie);
        sayi_f = (Button) view.findViewById(R.id.hex_sayif);
        sayi_gerial = (Button) view.findViewById(R.id.hex_sayi_sil);
        isaret = (Button) view.findViewById(R.id.hex_sayi_negatif);
        sayi_topla = (Button) view.findViewById(R.id.hex_topla);
        sayi_cikar = (Button) view.findViewById(R.id.hex_cikarma);
        sayi_carp = (Button) view.findViewById(R.id.hex_carpim);
        sayi_bol = (Button) view.findViewById(R.id.hex_bolum);
        sayi_sil = (Button) view.findViewById(R.id.hex_sayi_temizle);

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

    private void setBlackColor() {
        sayi_topla.setTextColor(Color.BLACK);
        sayi_carp.setTextColor(Color.BLACK);
        sayi_cikar.setTextColor(Color.BLACK);
        sayi_bol.setTextColor(Color.BLACK);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_hexadecimal_calculate, container, false);
        initView();
        int maxLength = 18;
        InputFilter[] FilterArray = new InputFilter[1];
        FilterArray[0] = new InputFilter.LengthFilter(maxLength);
        display.setFilters(FilterArray);
        sayi_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != -1 && display.getText() != "0") {
                    display.setText(display.getText() + "0");
                } else {
                    display.setText("0");
                    sayac = 0;
                }
            }
        });

        sayi_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "1");

            }
        });
        sayi_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "2");

            }
        });
        sayi_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "3");

            }
        });
        sayi_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "4");

            }
        });
        sayi_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "5");
            }
        });
        sayi_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "6");

            }
        });
        sayi_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "7");

            }
        });
        sayi_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "8");

            }
        });
        sayi_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "9");

            }
        });
        sayi_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "A");

            }
        });
        sayi_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "B");

            }
        });
        sayi_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "C");

            }
        });
        sayi_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "D");

            }
        });
        sayi_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "E");

            }
        });
        sayi_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != 0 || display.getText() == "0") {
                    display.setText("");
                    sayac = 0;
                }
                display.setText(display.getText() + "F");

            }
        });
        sayi_gerial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0 && !display.getText().equals("")) {
                    String display2 = display.getText().toString();
                    display2 = display2.substring(0, display2.length() - 1);
                    display.setText(display2);
                    if (display2.trim().length() == 0)
                        sayac = -1;
                }
            }
        });

        try {

            sayi_sil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setBlackColor();
                    ilkdeger = 0;
                    sonuc = 0;
                    sayac = -1;
                    display.setText("");
                }
            });
        } catch (Exception c) {
        }
        try {
            isaret.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!display.getText().toString().equals("")) {
                        int dec = hex2dec(display.getText().toString());
                        // long dec=Long.parseLong(display.getText().toString(),16);
                        String hex = Long.toHexString(-dec);
                        display.setText(hex.toUpperCase());
                    }
                }
            });
        } catch (Exception c) {
        }
        try {

            sayi_topla.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sonuc = 0;
                    if (!display.getText().toString().equals("") && sayac == 0) {
                        islemsayac = 1;
                        sayi_topla.setTextColor(Color.BLUE);
                        sayi_bol.setTextColor(Color.BLACK);
                        sayi_cikar.setTextColor(Color.BLACK);
                        sayi_carp.setTextColor(Color.BLACK);
                        int dec = hex2dec(display.getText().toString());
                        //  long dec=Long.parseLong(display.getText().toString(),16);
                        if (ilkdeger == 0) {
                            ilkdeger = dec;
                            islem = "Toplama";
                        } else {
                            ikincideger = dec;
                            switch (islem) {
                                case "Toplama":
                                    sonuc = ilkdeger + ikincideger;
                                    break;
                                case "Cikarma":
                                    sonuc = ilkdeger - ikincideger;
                                    break;
                                case "Carpma":
                                    sonuc = ilkdeger * ikincideger;
                                    break;
                                case "Bolme":
                                    sonuc = ilkdeger / ikincideger;
                                    break;
                            }
                            display.setText(Long.toHexString(sonuc).toUpperCase());
                            ilkdeger = sonuc;
                            islem = "Toplama";

                        }
                        sayac = -1;
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            sayi_cikar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sonuc = 0;
                    if (!display.getText().toString().equals("") && sayac == 0) {
                        islemsayac = 1;
                        sayi_topla.setTextColor(Color.BLACK);
                        sayi_bol.setTextColor(Color.BLACK);
                        sayi_cikar.setTextColor(Color.BLUE);
                        sayi_carp.setTextColor(Color.BLACK);
                        int dec = hex2dec(display.getText().toString());
                        // long dec=Long.parseLong(display.getText().toString(),16);
                        if (ilkdeger == 0) {
                            ilkdeger = dec;
                            islem = "Cikarma";
                        } else {
                            ikincideger = dec;
                            switch (islem) {
                                case "Toplama":
                                    sonuc = ilkdeger + ikincideger;
                                    break;
                                case "Cikarma":
                                    sonuc = ilkdeger - ikincideger;
                                    break;
                                case "Carpma":
                                    sonuc = ilkdeger * ikincideger;
                                    break;
                                case "Bolme":
                                    sonuc = ilkdeger / ikincideger;
                                    break;
                            }
                            display.setText(Long.toHexString(sonuc).toUpperCase());
                            ilkdeger = sonuc;
                            islem = "Cikarma";

                        }
                        sayac = -1;
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            sayi_carp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sonuc = 0;
                    if (!display.getText().toString().equals("") && sayac == 0) {
                        islemsayac = 1;
                        sayi_topla.setTextColor(Color.BLACK);
                        sayi_bol.setTextColor(Color.BLACK);
                        sayi_cikar.setTextColor(Color.BLACK);
                        sayi_carp.setTextColor(Color.BLUE);
                        int dec = hex2dec(display.getText().toString());
                        // long dec=Long.parseLong(display.getText().toString(),16);
                        if (ilkdeger == 0) {
                            ilkdeger = dec;
                            islem = "Carpma";
                        } else {
                            ikincideger = dec;
                            switch (islem) {
                                case "Toplama":
                                    sonuc = ilkdeger + ikincideger;
                                    break;
                                case "Cikarma":
                                    sonuc = ilkdeger - ikincideger;
                                    break;
                                case "Carpma":
                                    sonuc = ilkdeger * ikincideger;
                                    break;
                                case "Bolme":
                                    sonuc = ilkdeger / ikincideger;
                                    break;
                            }
                            display.setText(Long.toHexString(sonuc).toUpperCase());
                            ilkdeger = sonuc;
                            islem = "Carpma";
                        }
                        sayac = -1;
                    }
                }
            });
        } catch (Exception c) {
        }
        try {

            sayi_bol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    sonuc = 0;
                    if (!display.getText().toString().equals("") && sayac == 0) {
                        islemsayac = 1;
                        sayi_bol.setTextColor(Color.BLUE);
                        sayi_cikar.setTextColor(Color.BLACK);
                        sayi_carp.setTextColor(Color.BLACK);
                        sayi_topla.setTextColor(Color.BLACK);
                        int dec = hex2dec(display.getText().toString());
                        // long dec=Long.parseLong(display.getText().toString(),16);
                        if (ilkdeger == 0) {
                            ilkdeger = dec;
                            islem = "Bolme";
                        } else {
                            ikincideger = dec;
                            switch (islem) {
                                case "Toplama":
                                    sonuc = ilkdeger + ikincideger;
                                    break;
                                case "Cikarma":
                                    sonuc = ilkdeger - ikincideger;
                                    break;
                                case "Carpma":
                                    sonuc = ilkdeger * ikincideger;
                                    break;
                                case "Bolme":
                                    sonuc = ilkdeger / ikincideger;
                                    break;
                            }
                            display.setText(Long.toHexString(sonuc).toUpperCase());
                            ilkdeger = sonuc;
                            islem = "Bolme";
                        }
                        sayac = -1;
                    }

                }
            });
        } catch (Exception c) {
        }
        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac != -1 && islemsayac == 1) {
                    setBlackColor();
                    if (islem.equals("Toplama")) {
                        int dec2 = hex2dec(display.getText().toString());
                        //long dec2=Long.parseLong(display.getText().toString(),16);
                        sonuc = ilkdeger + dec2;
                        display.setText(Long.toHexString(sonuc).toUpperCase());
                    } else if (islem.equals("Cikarma")) {
                        int dec2 = hex2dec(display.getText().toString());
                        //long dec2=Long.parseLong(display.getText().toString(),16);
                        sonuc = ilkdeger - dec2;
                        display.setText(Long.toHexString(sonuc).toUpperCase());
                    } else if (islem.equals("Carpma")) {
                        int dec2 = hex2dec(display.getText().toString());
                        //long dec2=Long.parseLong(display.getText().toString(),16);
                        sonuc = ilkdeger * dec2;
                        display.setText(Long.toHexString(sonuc).toUpperCase());
                    } else if (islem.equals("Bolme")) {
                        int dec2 = hex2dec(display.getText().toString());
                        //long dec2=Long.parseLong(display.getText().toString(),16);
                        sonuc = ilkdeger / dec2;
                        display.setText(Long.toHexString(sonuc).toUpperCase());
                    }
                    ilkdeger = 0;
                    sonuc = 0;
                    sayac = 0;
                }
            }
        });
        return view;
    }
}
