package cat.itacademy.s05.t01.n01.model;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "players")
public class Player {
    @Id
    private int id;

    @NotNull
    private String name;

    private double score;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public Player(int id, String name, double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
