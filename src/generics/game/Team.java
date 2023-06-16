package generics.game;

import java.util.ArrayList;
import java.util.List;

public class Team<V extends Participant> {
    private String name;
    private List<V> participants;

    public Team(String name) {
        this.name = name;
        participants = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<V> getParticipants() {
        return participants;
    }

    public void addNewParticipant(V participant) {
        participants.add(participant);
        System.out.println("В команду " + this.name + " добавлен участник " + participant.getName());
    }

    public void playWith(Team<V> team) {
        int i = (int) (Math.random() + 1);

        if (i == 0)
            System.out.println("Win " + this.getName());
        else
            System.out.println("Win " + team.getName());
    }
}
