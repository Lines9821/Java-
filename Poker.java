import java.util.*;

public class Poker {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<Integer, String>();
        List<Integer> pokernum = new ArrayList<Integer>();
        String[] nums = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        String[] colors = {"♠", "♥", "♣", "♦"};
        int index = 2;
        for (String n : nums) {
            for (String c : colors) {
                poker.put(index, c + n);
                pokernum.add(index);
                index++;
            }
        }
        poker.put(0, "大王");
        pokernum.add(0);
        poker.put(1, "小王");
        pokernum.add(1);

        Collections.shuffle(pokernum);
        //System.out.println(pokernum);
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> bottom = new ArrayList<Integer>();

        for (int i = 0; i < pokernum.size(); i++) {
            int pn = pokernum.get(i);
            if(i<3){
                bottom.add(pn);
            }
            else if (i % 3 == 0) {
                player1.add(pn);
            }
            else if (i % 3 == 1) {
                player2.add(pn);
            }
            else if (i % 3 == 2) {
                player3.add(pn);
            }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        //System.out.println(player1);
        //look((ArrayList<Integer>) pokernum,poker);
        look("player1:",player1,poker);
        look("player2:",player2,poker);
        look("player3:",player3,poker);
        look("底牌：",bottom,poker);

    }
    public static void look(String name,ArrayList<Integer> player,HashMap<Integer,String> poker){
        System.out.print(name+"  ");
        for(int i =0;i<player.size();i++){
            System.out.print(poker.get(player.get(i))+"  ");
        }
        System.out.println();
    }

}
