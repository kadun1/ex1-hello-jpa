package jpabook.jpashop.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

//@MappedSuperclass
public class BaseEntity {

    LocalDateTime createdDate;

}
