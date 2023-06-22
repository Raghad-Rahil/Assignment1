package com.example.assignment1;


public class oper {
    private String op;
    private String type;
    private String level;

    public static final oper[] opers = {

            //add - easy
            new oper(" 1 + 5 = 6 ","add", "easy"),
            new oper(" 2 + 3 = 5 ","add", "easy"),
            new oper(" 1 + 6 = 7","add", "easy"),
            new oper(" 7 + 3 = 10 ","add", "easy"),
            new oper(" 2 + 9 = 11 ","add", "easy"),
            new oper(" 5 + 9 = 14 ","add", "easy"),
            new oper(" 4 + 8 = 12 ","add", "easy"),
            new oper(" 5 + 3 = 8 ","add", "easy"),
            new oper(" 7 + 9 = 16 ","add", "easy"),
            new oper(" 3 + 5 = 8","add", "easy"),

            //add - difficult
            new oper(" 89 + 15 = 104 ","add", "difficult"),
            new oper(" 32 + 13 = 45 ","add", "difficult"),
            new oper(" 41 + 56 = 97 ","add", "difficult"),
            new oper(" 87 + 13 = 100 ","add", "difficult"),
            new oper(" 12 + 29 = 41 ","add", "difficult"),
            new oper(" 75 + 19 = 94 ","add", "difficult"),
            new oper(" 64 + 88 = 152 ","add", "difficult"),
            new oper(" 15 + 23 = 38 ","add", "difficult"),
            new oper(" 87 + 29 = 116 ","add", "difficult"),
            new oper(" 13 + 35 = 48 ","add", "difficult"),


            //sub - easy
            new oper(" 10 - 5 = 5 ","sub", "easy"),
            new oper(" 9 - 3 = 6 ","sub", "easy"),
            new oper(" 10 - 6 = 4 ","sub", "easy"),
            new oper(" 7 - 6 = 1 ","sub", "easy"),
            new oper(" 9 - 2 = 7 ","sub", "easy"),
            new oper(" 9 - 6 = 3 ","sub", "easy"),
            new oper(" 8 - 6 = 2 ","sub", "easy"),
            new oper(" 5 - 5 = 0 ","sub", "easy"),
            new oper(" 9 - 1 = 8 ","sub", "easy"),
            new oper(" 10 - 1 = 9 ","sub", "easy"),


            //sub - difficult
            new oper(" 13 - 5 = 8 ","sub", "difficult"),
            new oper(" 24 - 13 = 11 ","sub", "difficult"),
            new oper(" 13 - 6 = 7 ","sub", "difficult"),
            new oper(" 78 - 53 = 25 ","sub", "difficult"),
            new oper(" 21 - 19 = 2 ","sub", "difficult"),
            new oper(" 59 - 29 = 30 ","sub", "difficult"),
            new oper(" 40 - 18 = 22 ","sub", "difficult"),
            new oper(" 55 - 32 = 23 ","sub", "difficult"),
            new oper(" 73 - 39 = 34 ","sub", "difficult"),
            new oper(" 32 - 15 = 17 ","sub", "difficult"),


            //mul - easy
            new oper(" 3 * 5 = 15 ","mul", "easy"),
            new oper(" 9 * 3 = 27 ","mul", "easy"),
            new oper(" 10 * 6 = 60 ","mul", "easy"),
            new oper(" 7 * 6 = 42 ","mul", "easy"),
            new oper(" 9 * 3 = 27 ","mul", "easy"),
            new oper(" 9 * 6 = 54 ","mul", "easy"),
            new oper(" 8 * 6 = 48 ","mul", "easy"),
            new oper(" 5 * 5 = 25 ","mul", "easy"),
            new oper(" 9 * 2 = 18 ","mul", "easy"),
            new oper(" 10 * 1 = 10 ","mul", "easy"),


            //mul - difficult
            new oper(" 13 * 5 = 65 ","mul", "difficult"),
            new oper(" 24 * 3 = 72 ","mul", "difficult"),
            new oper(" 13 * 6 = 78 ","mul", "difficult"),
            new oper(" 78 * 3 = 234 ","mul", "difficult"),
            new oper(" 21 * 9 = 189 ","mul", "difficult"),
            new oper(" 59 * 9 = 531 ","mul", "difficult"),
            new oper(" 40 * 8 = 320 ","mul", "difficult"),
            new oper(" 55 * 2 = 110 ","mul", "difficult"),
            new oper(" 73 * 4 = 292 ","mul", "difficult"),
            new oper(" 32 * 5 = 160 ","mul", "difficult"),


            //div - easy
            new oper(" 18 / 2 = 9 ","div", "easy"),
            new oper(" 16 / 2 = 8 ","div", "easy"),
            new oper(" 14 / 2 = 7 ","div", "easy"),
            new oper(" 18 / 3 = 6 ","div", "easy"),
            new oper(" 10 / 2 = 5 ","div", "easy"),
            new oper(" 8 / 2 = 4 ","div", "easy"),
            new oper(" 8 / 4 = 2 ","div", "easy"),
            new oper(" 5 / 5 = 1 ","div", "easy"),
            new oper(" 9 / 3 = 3 ","div", "easy"),
            new oper(" 10 / 1 = 10 ","div", "easy"),


            //div - difficult
            new oper(" 125 / 5 = 25 ","div", "difficult"),
            new oper(" 240 / 3 = 80 ","div", "difficult"),
            new oper(" 148 / 4 = 37 ","div", "difficult"),
            new oper(" 78 / 3 = 26 ","div", "difficult"),
            new oper(" 210 / 10 = 21 ","div", "difficult"),
            new oper(" 91 / 13 = 7 ","div", "difficult"),
            new oper(" 400 / 50 = 8 ","div", "difficult"),
            new oper(" 105 / 7 = 15 ","div", "difficult"),
            new oper(" 306 / 18 = 17 ","div", "difficult"),
            new oper(" 135 / 27 = 5 ","div", "difficult"),
    };




    private oper(String op, String type, String level){
        this.op = op;
        this.type = type;
        this.level = level;
    }
    public String getOp(){return op;}
    public String getType(){return type;}
    public String getLevel(){return level;}

}
