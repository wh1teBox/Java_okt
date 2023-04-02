package lesson2.enums;

import lombok.*;


public enum Gender {
    MALE(false), FEMALE(true);
@Getter
@Setter
    private boolean women;

    Gender(boolean woman){
        this.women = woman;
    }

}
