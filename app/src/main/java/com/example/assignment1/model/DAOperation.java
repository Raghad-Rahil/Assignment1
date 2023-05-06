package com.example.assignment1.model;

import java.util.ArrayList;
import java.util.List;

public class DAOperation {

    ArrayList<Operation> operation =new ArrayList<>();

    public  DAOperation()
    {
        //add - easy
        operation.add(new Operation( " 1 + 5 = 6 ","add", "easy"));
        operation.add(new Operation( " 2 + 3 = 5 ","add", "easy"));
        operation.add(new Operation( " 1 + 6 = 7","add", "easy"));
        operation.add(new Operation( " 7 + 3 = 10 ","add", "easy"));
        operation.add(new Operation( " 2 + 9 = 11 ","add", "easy"));
        operation.add(new Operation( " 5 + 9 = 14 ","add", "easy"));
        operation.add(new Operation( " 4 + 8 = 12 ","add", "easy"));
        operation.add(new Operation( " 5 + 3 = 8 ","add", "easy"));
        operation.add(new Operation( " 7 + 9 = 16 ","add", "easy"));
        operation.add(new Operation( " 3 + 5 = 8","add", "easy"));

        //add - difficult
        operation.add(new Operation( " 89 + 15 = 104 ","add", "difficult"));
        operation.add(new Operation( " 32 + 13 = 45 ","add", "difficult"));
        operation.add(new Operation( " 41 + 56 = 97 ","add", "difficult"));
        operation.add(new Operation( " 87 + 13 = 100 ","add", "difficult"));
        operation.add(new Operation( " 12 + 29 = 41 ","add", "difficult"));
        operation.add(new Operation( " 75 + 19 = 94 ","add", "difficult"));
        operation.add(new Operation( " 64 + 88 = 152 ","add", "difficult"));
        operation.add(new Operation( " 15 + 23 = 38 ","add", "difficult"));
        operation.add(new Operation( " 87 + 29 = 116 ","add", "difficult"));
        operation.add(new Operation( " 13 + 35 = 48 ","add", "difficult"));

        //sub - easy
        operation.add(new Operation( " 10 - 5 = 5 ","sub", "easy"));
        operation.add(new Operation( " 9 - 3 = 6 ","sub", "easy"));
        operation.add(new Operation( " 10 - 6 = 4 ","sub", "easy"));
        operation.add(new Operation( " 7 - 6 = 1 ","sub", "easy"));
        operation.add(new Operation( " 9 - 2 = 7 ","sub", "easy"));
        operation.add(new Operation( " 9 - 6 = 3 ","sub", "easy"));
        operation.add(new Operation( " 8 - 6 = 2 ","sub", "easy"));
        operation.add(new Operation( " 5 - 5 = 0 ","sub", "easy"));
        operation.add(new Operation( " 9 - 1 = 8 ","sub", "easy"));
        operation.add(new Operation( " 10 - 1 = 9 ","sub", "easy"));

        //sub - difficult
        operation.add(new Operation( " 13 - 5 = 8 ","sub", "difficult"));
        operation.add(new Operation( " 24 - 13 = 11 ","sub", "difficult"));
        operation.add(new Operation( " 13 - 6 = 7 ","sub", "difficult"));
        operation.add(new Operation( " 78 - 53 = 25 ","sub", "difficult"));
        operation.add(new Operation( " 21 - 19 = 2 ","sub", "difficult"));
        operation.add(new Operation( " 59 - 29 = 30 ","sub", "difficult"));
        operation.add(new Operation( " 40 - 18 = 22 ","sub", "difficult"));
        operation.add(new Operation( " 55 - 32 = 23 ","sub", "difficult"));
        operation.add(new Operation( " 73 - 39 = 34 ","sub", "difficult"));
        operation.add(new Operation( " 32 - 15 = 17 ","sub", "difficult"));

        //mul - easy
        operation.add(new Operation( " 3 * 5 = 15 ","mul", "easy"));
        operation.add(new Operation( " 9 * 3 = 27 ","mul", "easy"));
        operation.add(new Operation( " 10 * 6 = 60 ","mul", "easy"));
        operation.add(new Operation( " 7 * 6 = 42 ","mul", "easy"));
        operation.add(new Operation( " 9 * 3 = 27 ","mul", "easy"));
        operation.add(new Operation( " 9 * 6 = 54 ","mul", "easy"));
        operation.add(new Operation( " 8 * 6 = 48 ","mul", "easy"));
        operation.add(new Operation( " 5 * 5 = 25 ","mul", "easy"));
        operation.add(new Operation( " 9 * 2 = 18 ","mul", "easy"));
        operation.add(new Operation( " 10 * 1 = 10 ","mul", "easy"));

        //mul - difficult
        operation.add(new Operation( " 13 * 5 = 65 ","mul", "difficult"));
        operation.add(new Operation( " 24 * 3 = 72 ","mul", "difficult"));
        operation.add(new Operation( " 13 * 6 = 78 ","mul", "difficult"));
        operation.add(new Operation( " 78 * 3 = 234 ","mul", "difficult"));
        operation.add(new Operation( " 21 * 9 = 189 ","mul", "difficult"));
        operation.add(new Operation( " 59 * 9 = 531 ","mul", "difficult"));
        operation.add(new Operation( " 40 * 8 = 320 ","mul", "difficult"));
        operation.add(new Operation( " 55 * 2 = 110 ","mul", "difficult"));
        operation.add(new Operation( " 73 * 4 = 292 ","mul", "difficult"));
        operation.add(new Operation( " 32 * 5 = 160 ","mul", "difficult"));

        //div - easy
        operation.add(new Operation( " 18 / 2 = 9 ","div", "easy"));
        operation.add(new Operation( " 16 / 2 = 8 ","div", "easy"));
        operation.add(new Operation( " 14 / 2 = 7 ","div", "easy"));
        operation.add(new Operation( " 18 / 3 = 6 ","div", "easy"));
        operation.add(new Operation( " 10 / 2 = 5 ","div", "easy"));
        operation.add(new Operation( " 8 / 2 = 4 ","div", "easy"));
        operation.add(new Operation( " 8 / 4 = 2 ","div", "easy"));
        operation.add(new Operation( " 5 / 5 = 1 ","div", "easy"));
        operation.add(new Operation( " 9 / 3 = 3 ","div", "easy"));
        operation.add(new Operation( " 10 / 1 = 10 ","div", "easy"));

        //div - difficult
        operation.add(new Operation( " 125 / 5 = 25 ","div", "difficult"));
        operation.add(new Operation( " 240 / 3 = 80 ","div", "difficult"));
        operation.add(new Operation( " 148 / 4 = 37 ","div", "difficult"));
        operation.add(new Operation( " 78 / 3 = 26 ","div", "difficult"));
        operation.add(new Operation( " 210 / 10 = 21 ","div", "difficult"));
        operation.add(new Operation( " 91 / 13 = 7 ","div", "difficult"));
        operation.add(new Operation( " 400 / 50 = 8 ","div", "difficult"));
        operation.add(new Operation( " 105 / 7 = 15 ","div", "difficult"));
        operation.add(new Operation( " 306 / 18 = 17 ","div", "difficult"));
        operation.add(new Operation( " 135 / 27 = 5 ","div", "difficult"));

    }

    public List<Operation> getOp(String type, String level)
    {
        List<Operation> op =new ArrayList<>();

        for (Operation i:operation) {
            if(i.getType().equals(type)&i.getLevel().equals(level))
            {
                op.add(i);
            }
        }
        return op;
    }

    public String[] getType()
    {
        String[] type={"add","sub","mul","div"};
        return  type;
    }

    public String[] getLevel()
    {
        String[] level={"easy","difficult"};
        return  level;
    }

}
