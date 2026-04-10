package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@AllArgsConstructor
@Getter
@Setter
public class Workshop {

    private int workshopNumber;
    private Date  startDate;
    private Date endDate;


}
