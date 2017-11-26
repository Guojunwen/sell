package com.gary.dataobject;

import com.gary.enums.OrderStatusEnum;
import com.gary.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by Guo on 2017/11/26.
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
  private String orderId;
  private String buyerName;
  private String buyerPhone;
  private String buyerAddress;
  private String buyerOpenid;
  private String orderAmount;
  private Integer orderStatus= OrderStatusEnum.NEW.getCode();
  private Integer payStatus= PayStatusEnum.WAIT.getCode();
  private Date createTime;
  private Date updateTime;

}
