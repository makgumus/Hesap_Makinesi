package com.example.mmakg.hesap_makinesi;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatTextView;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class DecimalCalculateFragment extends Fragment {

    View view = null;
    Button sayi_0, sayi_1, sayi_2, sayi_3, sayi_4, sayi_5, sayi_6,
            sayi_7, sayi_8, sayi_9, sayi_topla, sayi_cikar,
            sayi_carp, sayi_bol, sayi_sil, hesapla, kok, kare,
            virgul, sayi_yuzde, isaret, sayi_gerial, sayi_tersi, sayi_sil1;
    AppCompatTextView display;
    private int sayac = -1, islemsayac = 0;
    private double ilkdeger = 0, ikincideger = 0;
    private double sonuc = 0;
    private String islem;

    public DecimalCalculateFragment() {
        // Required empty public constructor
    }


    public void initView() {
        display = (AppCompatTextView) view.findViewById(R.id.display);
        hesapla = (Button) view.findViewById(R.id.hesapla);
        sayi_0 = (Button) view.findViewById(R.id.sayi0);
        sayi_1 = (Button) view.findViewById(R.id.sayi1);
        sayi_2 = (Button) view.findViewById(R.id.sayi2);
        sayi_3 = (Button) view.findViewById(R.id.sayi3);
        sayi_4 = (Button) view.findViewById(R.id.sayi4);
        sayi_5 = (Button) view.findViewById(R.id.sayi5);
        sayi_6 = (Button) view.findViewById(R.id.sayi6);
        sayi_7 = (Button) view.findViewById(R.id.sayi7);
        sayi_8 = (Button) view.findViewById(R.id.sayi8);
        sayi_9 = (Button) view.findViewById(R.id.sayi9);
        sayi_gerial = (Button) view.findViewById(R.id.sayi_sil);
        sayi_sil = (Button) view.findViewById(R.id.sayi_temizle);
        sayi_sil1 = (Button) view.findViewById(R.id.sayi_temizle1);
        sayi_tersi = (Button) view.findViewById(R.id.sayi_tersi);
        virgul = (Button) view.findViewById(R.id.virgul);
        isaret = (Button) view.findViewById(R.id.sayi_negatif);
        sayi_yuzde = (Button) view.findViewById(R.id.bolum);
        kok = (Button) view.findViewById(R.id.sayi_kok);
        kare = (Button) view.findViewById(R.id.sayi_kare);
        sayi_topla = (Button) view.findViewById(R.id.topla);
        sayi_cikar = (Button) view.findViewById(R.id.cikarma);
        sayi_carp = (Button) view.findViewById(R.id.carpim);
        sayi_bol = (Button) view.findViewById(R.id.bolum);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private void setBlackColor() {
        sayi_carp.setTextColor(Color.BLACK);
        sayi_cikar.setTextColor(Color.BLACK);
        sayi_bol.setTextColor(Color.BLACK);
        sayi_topla.setTextColor(Color.BLACK);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_decimal_calculate, container, false);
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
        virgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0 && !display.getText().toString().contains(".")) {
                    display.setText(display.getText() + ".");
                }

            }
        });
        sayi_yuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double k = 0;
                if (!display.getText().toString().equals("")) {
                    k = Float.parseFloat(display.getText().toString());
                    k = k / 100;
                    display.setText(String.valueOf(k));

                }

            }
        });
        sayi_tersi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double k = 0;
                if (!display.getText().toString().equals("")) {
                    k = Float.parseFloat(display.getText().toString());
                    k = 1 / k;
                    display.setText(String.valueOf(k));
                }

            }
        });
        try {

            sayi_sil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    sayac = -1;
                    setBlackColor();
                    display.setText("");
                }
            });
        } catch (Exception c) {
        }
        try {

            sayi_sil1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ilkdeger = 0;
                    sonuc = 0;
                    sayac = -1;
                    setBlackColor();
                    display.setText("");
                }
            });
        } catch (Exception c) {
        }
        try {

            isaret.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double k = 0;
                    if (!display.getText().toString().equals("")) {
                        k = Float.parseFloat(display.getText().toString());
                        display.setText(String.valueOf(-k));

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
                    islemsayac = 1;
                    if (!display.getText().toString().equals("") && sayac == 0) {
                        sayi_topla.setTextColor(Color.BLUE);
                        sayi_bol.setTextColor(Color.BLACK);
                        sayi_cikar.setTextColor(Color.BLACK);
                        sayi_carp.setTextColor(Color.BLACK);
                        if (ilkdeger == 0) {
                            ilkdeger = Float.parseFloat(display.getText().toString());
                            islem = "Toplama";
                        } else {
                            ikincideger = Float.parseFloat(display.getText().toString());
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
                            display.setText(String.valueOf(sonuc));
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
                    islemsayac = 1;
                    if (!display.getText().toString().equals("") && sayac == 0) {
                        sayi_topla.setTextColor(Color.BLACK);
                        sayi_bol.setTextColor(Color.BLACK);
                        sayi_cikar.setTextColor(Color.BLUE);
                        sayi_carp.setTextColor(Color.BLACK);
                        if (ilkdeger == 0) {
                            ilkdeger = Float.parseFloat(display.getText().toString());
                            islem = "Cikarma";
                        } else {
                            ikincideger = Float.parseFloat(display.getText().toString());
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
                            display.setText(String.valueOf(sonuc));
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
                    islemsayac = 1;
                    if (!display.getText().toString().equals("") && sayac == 0) {
                        sayi_topla.setTextColor(Color.BLACK);
                        sayi_bol.setTextColor(Color.BLACK);
                        sayi_cikar.setTextColor(Color.BLACK);
                        sayi_carp.setTextColor(Color.BLUE);
                        if (ilkdeger == 0) {
                            ilkdeger = Float.parseFloat(display.getText().toString());
                            islem = "Carpma";
                        } else {
                            ikincideger = Float.parseFloat(display.getText().toString());
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
                            display.setText(String.valueOf(sonuc));
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
                    islemsayac = 1;
                    if (!display.getText().toString().equals("") && sayac == 0) {
                        sayi_bol.setTextColor(Color.BLUE);
                        sayi_cikar.setTextColor(Color.BLACK);
                        sayi_carp.setTextColor(Color.BLACK);
                        sayi_topla.setTextColor(Color.BLACK);
                        if (ilkdeger == 0) {
                            ilkdeger = Float.parseFloat(display.getText().toString());
                            islem = "Bolme";
                        } else {
                            ikincideger = Float.parseFloat(display.getText().toString());
                            switch (islem) {
                                case "Toplama":
                                    sonuc = ilkdeger + ikincideger;
                                    break;
                                case "Cikarma":
                                    sonuc = ilkdeger - ikincideger;
                                    break;
                                case "carpma":
                                    sonuc = ilkdeger * ikincideger;
                                    break;
                                case "Bolme":
                                    sonuc = ilkdeger / ikincideger;
                                    break;
                            }
                            display.setText(String.valueOf(sonuc));
                            ilkdeger = sonuc;
                            islem = "Bolme";

                        }
                        sayac = -1;
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            kok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double k = 0;
                    if (!display.getText().toString().equals("")) {
                        k = Float.parseFloat(display.getText().toString());
                        k = Math.sqrt(k);
                        display.setText(String.valueOf(k));
                    }

                }
            });
        } catch (Exception c) {
        }
        try {

            kare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double k = 0;
                    if (!display.getText().toString().equals("")) {
                        k = Float.parseFloat(display.getText().toString());
                        k = k * k;
                        display.setText(String.valueOf(k));
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
                        sonuc = ilkdeger + Float.parseFloat(display.getText().toString());
                        display.setText(String.valueOf(sonuc));

                    } else if (islem.equals("Cikarma")) {
                        sonuc = ilkdeger - Float.parseFloat(display.getText().toString());
                        display.setText(String.valueOf(sonuc));

                    } else if (islem.equals("Carpma")) {
                        sonuc = ilkdeger * Float.parseFloat(display.getText().toString());
                        display.setText(String.valueOf(sonuc));
                    } else if (islem.equals("Bolme")) {
                        sonuc = ilkdeger / Float.parseFloat(display.getText().toString());
                        display.setText(String.valueOf(sonuc));
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
