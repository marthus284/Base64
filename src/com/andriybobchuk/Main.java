package com.andriybobchuk;

public class Main {

    public static void main(String[] args) {


        String InFile = null, OutFile = null;

        if(args.length == 6)
        {
            for (int i = 0; i < 6; i++)
            {
                if(args[i].equals("-i"))
                {
                    InFile = args[i+1];
                }
                if(args[i].equals("-o"))
                {
                    OutFile = args[i+1];
                }
                if(args[i].equals("-m"))
                {
                    if(args[i+1].equals("c"))
                    {
                        new Functions().encode(InFile, OutFile);
                    }
                    if(args[i+1].equals("d"))
                    {
                        new Functions().decode(InFile, OutFile);
                    }
                }
            }
        }else {
            System.out.println("wasted");
        }
        //System.out.println("Dear Martin, your input file's name is '"+InFile+"', and your output file's name is '"+OutFile+"'.");
    }
}


