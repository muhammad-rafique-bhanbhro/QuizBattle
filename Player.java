class Player {
    String name;
    int score;

    Player(String name) {
        this.name = name;
        score = 0;
    }

    void addScore() {
        score = score + 10;
    }
}

class StudentPlayer extends Player {

    StudentPlayer(String name) {
        super(name);
    }
}