package com.miramicodigo.studyjam_ii_views_ii;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultado;
    private TextView Numero2;
    private int num1=0;
    private int num2;
    private int res;
    private double res2;
    private int ope=0;
    private int sw=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        resultado = (TextView) findViewById(R.id.tvResultado);
    }
    public void escribir1(View w){
        if(sw==1){
            num1=0;
            sw=0;
            res = num1 * 10+1;
            resultado.setText(res+"");
        }
        else{
            num1 = Integer.parseInt(resultado.getText().toString());
            res = num1 * 10+1;
            resultado.setText(res+"");
        }
    }
    public  void escribir2(View w){
        if(sw==1){
            num1=0;
            sw=0;
            res = num1 * 10+2;
            resultado.setText(res+"");
        }
        else{
            num1 = Integer.parseInt(resultado.getText().toString());
            res = num1 * 10+2;
            resultado.setText(res+"");
        }
    }
    public  void escribir3(View w){
        if(sw==1){
            num1=0;
            sw=0;
            res = num1 * 10+3;
            resultado.setText(res+"");
        }
        else{
            num1 = Integer.parseInt(resultado.getText().toString());
            res = num1 * 10+3;
            resultado.setText(res+"");
        }
    }
    public  void escribir4(View w){
        if(sw==1){
            num1=0;
            sw=0;
            res = num1 * 10+4;
            resultado.setText(res+"");
        }
        else{
            num1 = Integer.parseInt(resultado.getText().toString());
            res = num1 * 10+4;
            resultado.setText(res+"");
        }
    }
    public  void escribir5(View w){
        if(sw==1){
            num1=0;
            sw=0;
            res = num1 * 10+5;
            resultado.setText(res+"");
        }
        else{
            num1 = Integer.parseInt(resultado.getText().toString());
            res = num1 * 10+5;
            resultado.setText(res+"");
        }
    }
    public  void escribir6(View w){
        if(sw==1){
            num1=0;
            sw=0;
            res = num1 * 10+6;
            resultado.setText(res+"");
        }
        else{
            num1 = Integer.parseInt(resultado.getText().toString());
            res = num1 * 10+6;
            resultado.setText(res+"");
        }
    }
    public  void escribir7(View w){
        if(sw==1){
            num1=0;
            sw=0;
            res = num1 * 10+7;
            resultado.setText(res+"");
        }
        else{
            num1 = Integer.parseInt(resultado.getText().toString());
            res = num1 * 10+7;
            resultado.setText(res+"");
        }
    }
    public  void escribir8(View w){
        if(sw==1){
            num1=0;
            sw=0;
            res = num1 * 10+8;
            resultado.setText(res+"");
        }
        else{
            num1 = Integer.parseInt(resultado.getText().toString());
            res = num1 * 10+8;
            resultado.setText(res+"");
        }
    }
    public  void escribir9(View w){
        if(sw==1){
            num1=0;
            sw=0;
            res = num1 * 10+9;
            resultado.setText(res+"");
        }
        else{
            num1 = Integer.parseInt(resultado.getText().toString());
            res = num1 * 10+9;
            resultado.setText(res+"");
        }
    }
    public  void escribir0(View w){
        if(sw==1){
            num1=0;
            sw=0;
            res = num1 * 10;
            resultado.setText(res+"");
        }else{
            num1 = Integer.parseInt(resultado.getText().toString());
            res = num1 * 10;
            resultado.setText(res+"");
        }
    }
    public void borra(View w){
        res = 0;
        num1=0;
        num2=0;
        resultado.setText(res+"");
    }
    public void suma(View v){
        if(num2>0){
            if(ope==1){
                num1 = Integer.parseInt(resultado.getText().toString());
                res = num1 + num2;
                resultado.setText(res+"");
            }else{
                if(ope==2){
                    num1 = Integer.parseInt(resultado.getText().toString());
                    res = num1 - num2;
                    resultado.setText(res+"");
                }else{
                    if(ope==3){
                        num1 = Integer.parseInt(resultado.getText().toString());
                        res = num1 * num2;
                        resultado.setText(res+"");
                    }else{
                        if(ope==4){
                            num1 = Integer.parseInt(resultado.getText().toString());
                            res2 = num1 / num2;
                            resultado.setText(res+"");
                        }
                    }
                }
            }
        }
        sw=1;
        num2 = Integer.parseInt(resultado.getText().toString());
        ope=1;
    }
    public void resta(View v){
        if(num2>0){
            if(ope==1){
                num1 = Integer.parseInt(resultado.getText().toString());
                res = num2 + num1;
                resultado.setText(res+"");
            }else{
                if(ope==2){
                    num1 = Integer.parseInt(resultado.getText().toString());
                    res = num2 - num1;
                    resultado.setText(res+"");
                }else{
                    if(ope==3){
                        num1 = Integer.parseInt(resultado.getText().toString());
                        res =num1 * num2;
                        resultado.setText(res+"");
                    }else{
                        if(ope==4){
                            num1 = Integer.parseInt(resultado.getText().toString());
                            res2 = num1 / num2;
                            resultado.setText(res+"");
                        }
                    }
                }
            }
        }
        sw=1;
        num2 = Integer.parseInt(resultado.getText().toString());
        ope=2;
    }
    public void multi(View v){
        if(num2>0){
            if(ope==1){
                num1 = Integer.parseInt(resultado.getText().toString());
                res = num1 + num2;
                resultado.setText(res+"");
            }else{
                if(ope==2){
                    num1 = Integer.parseInt(resultado.getText().toString());
                    res = num1 - num2;
                    resultado.setText(res+"");
                }else{
                    if(ope==3){
                        num1 = Integer.parseInt(resultado.getText().toString());
                        res = num1 * num2;
                        resultado.setText(res+"");
                    }else{
                        if(ope==4){
                            num1 = Integer.parseInt(resultado.getText().toString());
                            res2 = num1 / num2;
                            resultado.setText(res+"");
                        }
                    }
                }
            }
        }
        num2 = Integer.parseInt(resultado.getText().toString());
        ope=3;
        sw=1;
    }
    public void divi(View v){
        if(num2>0){
            if(ope==1){
                num1 = Integer.parseInt(resultado.getText().toString());
                res = num1 + num2;
                resultado.setText(res+"");
            }else{
                if(ope==2){
                    num1 = Integer.parseInt(resultado.getText().toString());
                    res = num1 - num2;
                    resultado.setText(res+"");
                }else{
                    if(ope==3){
                        num1 = Integer.parseInt(resultado.getText().toString());
                        res = num1 * num2;
                        resultado.setText(res+"");
                    }else{
                        if(ope==4){
                            num1 = Integer.parseInt(resultado.getText().toString());
                            res2 = num2 / num1;
                            resultado.setText(res2+"");
                        }
                    }
                }
            }
        }
        num2 = Integer.parseInt(resultado.getText().toString());
        ope=4;
        sw=1;
    }
    public void igual(View w){
        if(ope==1){
            num1 = Integer.parseInt(resultado.getText().toString());
            res = num1 + num2;
            resultado.setText(res+"");
        }else{
            if(ope==2){
                num1 = Integer.parseInt(resultado.getText().toString());
                res = num2 - num1;
                resultado.setText(res+"");
            }else{
                if(ope==3){
                    num1 = Integer.parseInt(resultado.getText().toString());
                    res = num1 * num2;
                    resultado.setText(res+"");
                }else{
                    if(ope==4){
                        num1 = Integer.parseInt(resultado.getText().toString());
                        res2 = num2 / num1;
                        resultado.setText(res2+"");
                    }else{
                        res = 0;
                        resultado.setText(res+"");
                    }
                }
            }
        }
        sw=1;
        ope=0;
    }
}
