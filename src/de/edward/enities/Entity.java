package de.edward.enities;

public class Entity {

    protected String nam; //name
    protected double hp; //health points
    protected double mHp; //max health points
    protected double sp; //stamina points
    protected double mSp; //may stamina points
    protected String brnd; //brand
    protected String hr; //species
    protected double dmg; //damage output

    public Entity(String nam){
        this.nam = nam;
    }

    public void sHeal(){
        if (hp == mHp) {
            kurz();
            System.out.print(" already is at max health!");
            //System.out.println(mHp);
        }else if(hp+5 > mHp){ //If 5 hp is more than enough, only heal as much as needed
            //double i = hp+5;
            int j = (int) (mHp-hp);
            hp = mHp;
            kurz();
            System.out.print(" heals "+j+" HP. ("+hp+" HP)"); //Kinda pointless but we need those aesthetics
        }else{
            hp = hp+5;
            kurz();
            System.out.print(" heals 5 HP. ("+hp+" HP)");
        }
    }

    public void heal(){
        if (hp == mHp) {
            kurz();
            System.out.print(" already is at max health!");
            //System.out.println(mHp);
        }else if(hp+5 > mHp){ //If 5 hp is more than enough, only heal as much as needed
            //double i = hp+5;
            int j = (int) (mHp-hp);
            hp = mHp;
            kurz();
            System.out.print(" gets healed by "+j+" HP. ("+hp+" HP)"); //Kinda pointless but we need those aesthetics
        }else{
            hp = hp+5;
            kurz();
            System.out.print(" gets healed by 5 HP. ("+hp+" HP)");
        }
    }

    public void sRecover() {
        if (sp == mSp) {
            kurz();
            System.out.print(" already has full stamina!");
            //System.out.println(mHp);
        }else if(sp+5 > mSp){
            //double i = sp+5;
            int j = (int) (mSp-sp);
            sp = mSp;
            kurz();
            System.out.print(" recovers "+j+" sp. ("+sp+" SP)");
        }else{
            sp = sp+5;
            kurz();
            System.out.print(" recovers 5 sp. ("+sp+" SP)");
        }
    }

    public void atckAir(){
        if(sp >= 2) {
            int i = dc();
            if (i > 4 && i <= 16) {
                kurz();
                System.out.print(" punches the air. ");
                drslt(i);
                sp = sp - 2;
            } else if (i <= 4) {
                kurz();
                System.out.print(" tries to punch the air but blunders. They lose 1 HP. ");
                drslt(i);
                sp = sp - 2;
                hp = hp - 1;
            } else {
                kurz();
                System.out.print(" strikes a critical hit against the air. The atmosphere retreats. ");
                drslt(i);
                sp = sp - 2;
            }
        }else{
            noSP();
        }
    }

    public void atck(){
        if(sp >= 2) {
            int i = dc();
            if (i > 4 && i <= 16) {
                kurz();
                drslt(i);
                sp = sp - 2;
            } else if (i <= 4) {
                kurz();
                drslt(i);
                sp = sp - 2;
                hp = hp - 1;
            } else {
                kurz();
                drslt(i);
                sp = sp - 2;
            }
        }else{
            noSP();
        }
    }

    public void atckslf(){
        if(sp >= 1) {
            kurz();
            System.out.print(" decides that it isn't worth it. They loose 4 HP. ");
            hp = hp - 4;
            sp = sp - 1;
        }else{
            noSP();
        }
    }
    
    public void sStats(){
        System.out.print("\n\n The "+brnd()+" " + nam + " is a " + hr() + " with " + hp + " HP. They have a maximum stamina of " + mSp);
        if(mSp != sp) {
            System.out.print(" of which they have " + sp + " points left.");
            //System.out.print("\n\n " + nam + " is a " + hr() + " with " + hp + " HP. They have a maximum stamina of " + mSp + ".");
        }else{
            System.out.print(".");
        }
            //System.out.print("\n\n " + nam + " is a " + hr() + " with " + hp + " HP. They have a maximum stamina of " + mSp + " of which they have " + sp + " points left.");
    }

    public void takeDmg(double a){
        kurz();
        hp = hp - a;
        System.out.print(" looses "+a+" HP. ("+hp+"HP)");
    }

    public String hr(){
        return hr;
    }

    public String brnd(){
        return brnd;
    }

    public double getHp() {
        return hp;
    }

    public double getSp(){
        return sp;
    }

    public double getDmg() {
        return dmg;
    }

    protected void kurz(){
        System.out.print("\n\n "+nam+" the "+hr());
    }

    protected void noSP(){
        kurz();
        System.out.print(" does not have enough SP to do that.");
    }

    protected int dc(){
        return (int) (1 + Math.random() * 20);
    }

    public String getNam(){return nam;}

    protected void drslt(int i){
        System.out.print("(Threw "+i+")");
    }

    public void setSp(double sp){
        this.sp = sp;
        System.out.print("\n\n "+nam+"'s SP set to "+this.sp);
    }

    public void rcSp(double sp){
        this.sp = this.sp - sp;
    }

    public void setHp(double hp){
        this.hp = hp;
        System.out.print("\n\n "+nam+"'s HP set to "+this.hp);
    }
}