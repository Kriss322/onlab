
package com.tribe.Tribes.village;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
class Position implements Serializable{
    
    private int xPosition;
    private int yPosition;
    private int zPosition;

}
