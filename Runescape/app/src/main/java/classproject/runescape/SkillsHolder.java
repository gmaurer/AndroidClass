package classproject.runescape;

public class SkillsHolder {
    boolean error;
    String[][] Skills; //name, rank, level, exp
    int current;

    public SkillsHolder(){
        error = false;
        Skills = new String[28][4];
        current = 0;
        Skills[0][0] = "Overall";
        Skills[1][0] = "Attack";
        Skills[2][0] = "Defence";
        Skills[3][0] = "Strength";
        Skills[4][0] = "Constitution";
        Skills[5][0] = "Ranged";
        Skills[6][0] = "Prayer";
        Skills[7][0] = "Magic";
        Skills[8][0] = "Cooking";
        Skills[9][0] = "Woodcutting";
        Skills[10][0] = "Fletching";
        Skills[11][0] = "Fishing";
        Skills[12][0] = "Firemaking";
        Skills[13][0] = "Crafting";
        Skills[14][0] = "Smithing";
        Skills[15][0] = "Mining";
        Skills[16][0] = "Herblore";
        Skills[17][0] = "Agility";
        Skills[18][0] = "Thieving";
        Skills[19][0] = "Slayer";
        Skills[20][0] = "Farming";
        Skills[21][0] = "Runecrafting";
        Skills[22][0] = "Hunting";
        Skills[23][0] = "Construction";
        Skills[24][0] = "Summoning";
        Skills[25][0] = "Dungeoneering";
        Skills[26][0] = "Divination";
        Skills[27][0] = "Invention";
        for(int i = 0; i < 28; i++){
            Skills[i][1] = "-1";
            Skills[i][2] = "-1";
            Skills[i][3] = "-1";
        }

    }

    public void CreateError(){
        error = true;
    }

    public void AddSkill(String Level, String Exp, String Rank){
        Skills[current][1] = Level;
        Skills[current][2] = Exp;
        Skills[current][3] = Rank;
        current++;
    }

    public String[][] getSkills(){
        return Skills;
    }
}