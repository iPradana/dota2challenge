package team6point7.dota2challenge;

public class opsi_hero {
    String[][] oph;

    public opsi_hero(){
        oph = new String[116][5];

        oph[0][0]="Abaddon";
        oph[0][1]="Horseman";
        oph[0][2]="Darksider";
        oph[0][3]="King of Horse";
        oph[0][4]="Abaddon";

        oph[1][0]="Ogre Magi";
        oph[1][1]="Zombie Couple";
        oph[1][2]="Alchemist";
        oph[1][3]="Orcs";
        oph[1][4]="Alchemist";

        for(int i=2; i<116; i++){
            oph[i][0]="";
            oph[i][1]="";
            oph[i][2]="";
            oph[i][3]="";
            oph[i][4]="";
        }


        /*oph[][]={
                {"Abaddon","Horseman","Darksider","King of Horse","Abaddon"},
                {"Ogre Magi","Zombie Couple","Alchemist","Orcs","Alchemist"},
                {"Crystal","Ice Vortex","Ice Monster","Ancient Apparition","Ancient Apparition"},
                {"Mana Breaker","Purplepunk","Blinkman","Anti Mage","Anti Mage"},
                {"Nebula","Arc Warden","Robot Clone","Ballhead","Arc Warden"},
                {"Axe","Hellboy","Redbeast","Battle Hunger","Axe"},
                {"Bane","Darkseer","Enigma","Faceless Void","Bane"},
                {"Batrider","Alchemist","Joker","Sniper","Batrider"},
                {"Tribal Chief","Monster Leader","Beastmaster","Elder Titan","Beastmaster"},
                {"Bloodrite","Bloodseeker","Red Tribe","Blood Hunger","Bloodseeker"},
                {"Bounty Hunter","King of Thieves","Gold Chaser","Shadow Walk","Bounty Hunter"},
                {"Drunken Brawler","Panda Master","Kung Fu Master","Brewmaster","Brewmaster"},
                {"Sand King","Bristleback","Monster Spike","Quill Sprayer","Bristleback"},
                {"Spidermaster","Broodmother","Spiderling","Spider Bite","Broodmother"},
                {"Centa","Hoof Stomp","Stampede","Centaur Warrunner","Centaur Warrunner"},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""},
                {"","","","",""}
        };*/
    }

    public String getA(int A){
        return oph[A][0];
    }
    public String getB(int B){
        return oph[B][1];
    }
    public String getC(int C){
        return oph[C][2];
    }
    public String getD(int D){
        return oph[D][3];
    }
    public String getX(int X){
        return oph[X][4];
    }
}
