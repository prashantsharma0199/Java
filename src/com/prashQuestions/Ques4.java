package com.prashQuestions;
import java.util.*;

public class Ques4 {
    public static void main(String[] args) {

    }
}

class apples {
    int eatTime;
    int energy;
    int pos;

    apples(int eatTime, int energy, int pos)
    {
        this.eatTime = eatTime;
        this.energy = energy;
        this.pos = pos;
    }
}

class applesComparator implements Comparator<apples>
{
    @Override
    public int compare(apples o1, apples o2)
    {
        if (o1.energy < o2.energy)
            return -1;
        else if (o1.energy > o2.energy)
            return 1;
        else if(o1.pos < o2.pos)
            return -1;
        return 1;
    }
}


class Apples {
    static int  maxAppless(int eatTime[], int energy[], int n, int time) {
        ArrayList<apples> list = new ArrayList<>();

        for(int i = 0; i < eatTime.length; i++)
            list.add(new apples(eatTime[i], energy[i], i+1));

        applesComparator mc = new applesComparator();
        Collections.sort(list, mc);

        int answer=0;
        int max=0;
        for(int i = 0; i<eatTime.length; i++) {
            if(time==1){
                for(int k = 0;k<eatTime.length;k++) {
                    if(max<list.get(k).energy){
                        max=k;
                    }
                }
                answer+=list.get(max).energy;
            }
            else if(list.get(i).eatTime <= time) {
                time -= list.get(i).eatTime;
                answer+= list.get(i).energy;
                list.remove(i);
            }
        }

        return answer;
    }
}
