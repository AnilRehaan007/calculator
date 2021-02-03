package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import com.example.calculator.factorial.Nilu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    ArrayList<String> data=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        (findViewById(R.id.one)).setOnClickListener((view)->{  writeData(data,"1");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});


        (findViewById(R.id.two)).setOnClickListener((view)->{writeData(data,"2");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.three)).setOnClickListener((view)->{writeData(data,"3");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.four)).setOnClickListener((view)->{ writeData(data,"4");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.five)).setOnClickListener((view)->{   writeData(data,"5");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.six)).setOnClickListener((view)->{   writeData(data,"6");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.seven)).setOnClickListener((view)->{   writeData(data,"7");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.eight)).setOnClickListener((view)->{   writeData(data,"8");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.nine)).setOnClickListener((view)->{   writeData(data,"9");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.zero)).setOnClickListener((view)->{   writeData(data,"0");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.milti)).setOnClickListener((view)->{   writeData(data,"*");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.addition)).setOnClickListener((view)->{   writeData(data,"+");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.subtraction)).setOnClickListener((view)->{   writeData(data,"-");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.divide)).setOnClickListener((view)->{   writeData(data,"/");
            textView=findViewById(R.id.input);
            textView.setText(readData(data));});

        (findViewById(R.id.chancel)).setOnClickListener((view)->{  if(!data.isEmpty())
        {
            data.remove(data.size()-1);
            textView=findViewById(R.id.input);
            textView.setText(readData(data));
        }});

        (findViewById(R.id.equalTo)).setOnClickListener((view)->{  data=finalizer();

            finalResult(data);});


        (findViewById(R.id.factorial)).setOnClickListener((view)->{ data=finalizer();
            if(!data.isEmpty())
            {
                if(dataChecker(data))
                {
                    textView=findViewById(R.id.input);
                    textView.setText(R.string.invalid);
                    data.clear();
                }
                else
                {
                    textView=findViewById(R.id.input);
                    String value=String.valueOf(Nilu.nFactorial(Integer.parseInt(data.get(0))));
                    textView.setText(value);
                    data.clear();
                    data.add(value);
                }

            }});

        (findViewById(R.id.clearing)).setOnClickListener((view)->{  textView.setText("");
            data.clear();});

        (findViewById(R.id.square)).setOnClickListener((view)->{ data=finalizer();

            if(!data.isEmpty())
            {
                if(dataChecker(data))
                {
                    textView=findViewById(R.id.input);
                    textView.setText(R.string.invalid);
                    data.clear();
                }
                else
                {
                    textView=findViewById(R.id.input);
                    String value=String.valueOf(Nilu.square(Integer.parseInt(data.get(0))));
                    textView.setText(value);
                    data.clear();
                    data.add(value);
                }

            }});
    }

    public void finalResult(ArrayList<String> data)
    {
        textView=findViewById(R.id.input);
        if(!data.isEmpty() && data.size()>1)
        {
            Long a=null;
            Long b=null;
            Long result;
            int i=0;
            String operator = "";

            if(dataChecker(data))
            {
                while (i<data.size()-1)
                {

                    if(i==0)
                    {
                        a=Long.parseLong(data.get(i));
                        i++;
                    }
                    else if(i==1)
                    {
                        operator=data.get(i);

                        i++;

                    }
                    else if(i==2)
                    {
                        b=Long.parseLong(data.get(i));

                        i++;

                    }

                    if(a!=null && b!=null && operator.length()!=0)
                    {
                        switch (operator)
                        {

                            case "+":

                                result=(a+b);
                                textView.setText(String.valueOf(result));
                                data.remove(0);
                                data.remove(0);
                                data.remove(0);
                                a=null;
                                b=null;
                                operator="";
                                if(data.isEmpty())
                                {
                                    data.add(String.valueOf(result));
                                    i++;
                                }
                                else
                                {
                                    data.add(0, String.valueOf(result));
                                    i=0;
                                }
                                break;

                            case "-":
                                result=(a-b);
                                textView.setText(String.valueOf(result));
                                data.remove(0);
                                data.remove(0);
                                data.remove(0);
                                a=null;
                                b=null;
                                operator="";
                                if(data.isEmpty())
                                {
                                    data.add(String.valueOf(result));
                                    i++;
                                }
                                else
                                {
                                    data.add(0, String.valueOf(result));
                                    i=0;
                                }
                                break;

                            case "/":
                                result=(a/b);
                                textView.setText(String.valueOf(result));
                                data.remove(0);
                                data.remove(0);
                                data.remove(0);
                                a=null;
                                b=null;
                                operator="";
                                if(data.isEmpty())
                                {
                                    data.add(String.valueOf(result));
                                    i++;
                                }
                                else
                                {
                                    data.add(0, String.valueOf(result));
                                    i=0;
                                }
                                break;

                            case "*":
                                result=(a*b);
                                textView.setText(String.valueOf(result));
                                data.remove(0);
                                data.remove(0);
                                data.remove(0);
                                a=null;
                                b=null;
                                operator="";
                                if(data.isEmpty())
                                {
                                    data.add(String.valueOf(result));
                                    i++;
                                }
                                else
                                {
                                    data.add(0, String.valueOf(result));
                                    i=0;
                                }
                        }

                    }
                }

            }
            else
            {
                while (i<data.size())
                {

                    if(i==0)
                    {
                        a=Long.parseLong(data.get(i));

                        i++;
                    }
                    else if(i==1)
                    {
                        operator=data.get(i);

                        i++;

                    }
                    else if(i==2)
                    {
                        b=Long.parseLong(data.get(i));

                        i++;

                    }

                    if(a!=null && b!=null && operator.length()!=0)
                    {
                        switch (operator)
                        {
                            case "+":
                                result=(a+b);
                                textView.setText(String.valueOf(result));
                                data.remove(0);
                                data.remove(0);
                                data.remove(0);
                                a=null;
                                b=null;
                                operator="";
                                if(data.isEmpty())
                                {
                                    data.add(String.valueOf(result));
                                    i++;
                                }
                                else
                                {
                                    data.add(0, String.valueOf(result));
                                    i=0;
                                }
                                break;
                            case "-":
                                result=(a-b);
                                textView.setText(String.valueOf(result));
                                data.remove(0);
                                data.remove(0);
                                data.remove(0);
                                a=null;
                                b=null;
                                operator="";
                                if(data.isEmpty())
                                {
                                    data.add(String.valueOf(result));
                                    i++;
                                }
                                else
                                {
                                    data.add(0, String.valueOf(result));
                                    i=0;
                                }

                                break;
                            case "/":
                                try {
                                    result=(a/b);
                                    textView.setText(String.valueOf(result));
                                    data.remove(0);
                                    data.remove(0);
                                    data.remove(0);
                                    a=null;
                                    b=null;
                                    operator="";
                                    if(data.isEmpty())
                                    {
                                        data.add(String.valueOf(result));
                                        i++;
                                    }
                                    else
                                    {
                                        data.add(0, String.valueOf(result));
                                        i=0;
                                    }
                                }
                                catch (Exception e)
                                {
                                    textView.setText(R.string.divide_by_zero);
                                    data.clear();
                                }

                                break;
                            case "*":
                                result=(a*b);
                                textView.setText(String.valueOf(result));
                                data.remove(0);
                                data.remove(0);
                                data.remove(0);
                                a=null;
                                b=null;
                                operator="";
                                if(data.isEmpty())
                                {
                                    data.add(String.valueOf(result));
                                    i++;
                                }
                                else
                                {
                                    data.add(0, String.valueOf(result));
                                    i=0;
                                }

                                break;
                        }

                    }
                }

            }

        }


    }
    public ArrayList<String> finalizer()
    {

        ArrayList<String> input=new ArrayList<>();

        StringBuilder stringBuilder=new StringBuilder();

        if(data.get(0).equals("-"))
        {
            stringBuilder.append("-");
            for(int i=1;i<data.size();i++)
            {
                if(data.get(i).equals("+") || data.get(i).equals("-") || data.get(i).equals("/") || data.get(i).equals("*"))
                {
                    input.add(new String(stringBuilder));
                    input.add(data.get(i));
                    stringBuilder=new StringBuilder();
                }
                else
                    stringBuilder.append(data.get(i));

            }
        }
        else
        {
            for(int i=0;i<data.size();i++)
            {
                if(data.get(i).equals("+") || data.get(i).equals("-") || data.get(i).equals("/") || data.get(i).equals("*"))
                {
                    input.add(new String(stringBuilder));
                    input.add(data.get(i));
                    stringBuilder=new StringBuilder();
                }
                else
                    stringBuilder.append(data.get(i));

            }
        }
        if(stringBuilder.length()!=0)
        {
            input.add(new String(stringBuilder));
        }

        return input;
    }

    public String readData(ArrayList<String> data)
    {

        StringBuilder stringBuilder=new StringBuilder();

        for(String input:data)
        {
            stringBuilder.append(input);
        }
        return new String(stringBuilder);

    }
    public boolean dataChecker(ArrayList<String> data)
    {
        return (data.get(data.size()-1).equals("+") || data.get(data.size()-1).equals("-") || data.get(data.size()-1).equals("/")
                || data.get(data.size()-1).equals("*"));
    }
    public void writeData(ArrayList<String> data,String value)
    {

        if(data.size()<19)
        {

            data.add(value);
            if(data.size() == 2)
            {
                if(data.get(0).equals("0"))
                {
                    String twoInOne=data.get(data.size()-1);
                    if(!dataChecker(data))
                    {
                        data.clear();
                        data.add(twoInOne);
                    }

                }

            }
            if(data.get(0).equals("+")  ||  data.get(0).equals("*") || data.get(0).equals("/"))
            {
                data.clear();

            }
            else if(dataChecker(data))
            {
                if(data.size()>1)
                {
                    String forward=(data.get(data.size()-1));
                    String backward=(data.get(data.size()-2));

                    if(backward.equals("+") || backward.equals("-") || backward.equals("*") || backward.equals("/"))
                    {
                        if(forward.equals("/") || backward.equals("/"))
                        {

                            if(data.get(data.size()-3).equals("/"))
                            {

                                data.remove(data.size()-1);
                                data.remove(data.size()-1);

                            }
                            else if(forward.equals("*"))
                            {

                                data.remove(data.size()-1);
                                data.remove(data.size()-1);
                                data.add("*");

                            }
                            else if(forward.equals("-"))
                            {

                                data.remove(data.size()-1);
                                data.remove(data.size()-1);
                                data.add("-");
                            }
                            else if(forward.equals("+"))
                            {

                                data.remove(data.size()-1);
                                data.remove(data.size()-1);
                                data.add("+");
                            }
                            else if(!backward.equals("/"))
                            {
                                data.remove(data.size()-1);
                                data.remove(data.size()-1);
                                data.add("/");

                            }
                            else
                            {
                                data.remove(data.size()-1);
                            }

                        }
                        else if(backward.equals("-") || forward.equals("-"))
                        {
                            switch (forward)
                            {
                                case "-":
                                    data.remove(data.size()-1);
                                    data.remove(data.size()-1);
                                    data.add("-");
                                    break;
                                case "+":

                                    data.remove(data.size()-1);
                                    data.remove(data.size()-1);
                                    data.add("+");
                                    break;
                                case "*":
                                    data.remove(data.size()-1);
                                    data.remove(data.size()-1);
                                    data.add("*");
                                    break;

                            }
                        }
                        else if(forward.equals("+") || backward.equals("+"))
                        {

                            if(backward.equals("*"))
                            {
                                data.remove(data.size()-1);
                                data.remove(data.size()-1);

                                data.add("+");


                            }
                            else if(backward.equals(forward))
                            {
                                data.remove(data.size()-1);
                                data.remove(data.size()-1);
                                data.add("+");


                            }
                            else if(forward.equals("*"))
                            {
                                data.remove(data.size()-1);
                                data.remove(data.size()-1);
                                data.add("*");

                            }
                            else if(forward.equals("-"))
                            {
                                data.remove(data.size()-1);
                                data.remove(data.size()-1);
                                data.add("-");

                            }

                        }


                    }
                }
            }

        }
    }
}



