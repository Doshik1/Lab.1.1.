public class Ball {
    int diameter;
    String material;
    int pos_x, pos_y, pos_z;

    void beThrown (int x, int y, int z){
        pos_x += x;
        pos_y += y;
        pos_z += z;
    }

    int getPosition_x () {
        return pos_x;
    }
    int getPosition_y () {
        return pos_y;
    }
    int getPosition_z () {
        return pos_z;
    }

    void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    void  setMaterial(String material) {
        this.material = material;
    }

    String getInfo(){
        return "Thias ball is " + diameter + " in diameter and made out of " + material;
    }
}
