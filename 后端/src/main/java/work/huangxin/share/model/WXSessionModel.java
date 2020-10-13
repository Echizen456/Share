package work.huangxin.share.model;

import lombok.Data;

@Data
public class WXSessionModel {

    private String session_key;
    private String openid;
    private String phoneNumber;
    private Integer userId;

}
