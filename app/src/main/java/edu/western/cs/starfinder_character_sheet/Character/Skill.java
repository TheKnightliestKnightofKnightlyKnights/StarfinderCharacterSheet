package edu.western.cs.starfinder_character_sheet.Character;

public class Skill {
    int ranks;
    int trained=3;
    boolean isTrained = false;
    boolean isClass = false;
    boolean reqTrain = false;
    int miscMod;
    int abilMod;


    public Skill(int ranks, boolean isTrained, boolean isClass, int miscMod, int abilMod, boolean reqTrain){
        this.ranks =ranks;
        this.isTrained=isTrained;
        this.isClass=isClass;
        this.miscMod=miscMod;
        this.abilMod=abilMod;
        this.reqTrain=reqTrain;
    }

    public int calculateSkillMod(Skill a){
        int skillMod=0;
        if(a.isTrained)
            skillMod+=trained;
        skillMod+=a.abilMod+a.miscMod+a.ranks;
        return skillMod;
    }


}