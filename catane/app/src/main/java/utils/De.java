package utils;

import java.util.Random;

public class De {
    
    public Integer nbrFaces;
    private Integer valeurTirage;

    public De(Integer nbrFaces) {
        this.nbrFaces = nbrFaces;
        this.lance();
    }

    public Integer getValeurTirage() {
        return this.valeurTirage;
    }

    public void lance() {
        Random r = new Random();
        valeurTirage = 1 + r.nextInt(nbrFaces);
    }

}
