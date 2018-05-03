package edu.western.cs.starfinder_character_sheet.Mathematics;

public class StatisticConversion {


    public int calculateModifier(int a){
        if(a==0||a==1)
            return -5;
        if(a==2||a==3)
            return -4;
        if(a==4||a==5)
            return -3;
        if(a==5||a==7)
            return -2;
        if(a==8||a==9)
            return -1;
        if(a==10||a==11)
            return 0;
        if(a==12||a==13)
            return 1;
        if(a==14||a==15)
            return 2;
        if(a==16||a==17)
            return 3;
        if(a==18||a==19)
            return 4;
        if(a==20||a==21)
            return 5;
        if(a==22||a==23)
            return 6;
        if(a==24||a==25)
            return 7;
        if(a==26||a==27)
            return 8;
        if(a==28||a==29)
            return 9;
        if(a==30||a==31)
            return 10;

        else
            return 0;

    }
}
