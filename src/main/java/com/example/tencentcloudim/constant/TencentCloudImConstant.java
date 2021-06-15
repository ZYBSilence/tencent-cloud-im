package com.example.tencentcloudim.constant;

/**
 * @description: 腾讯im相关常量
 * @author: zyb
 * @date: 2021/5/31 16:37
 */
public class TencentCloudImConstant {
    /**
     * IM请求处理结果
     */
    public final static String ACTION_STATUS_OK = "OK";
    public final static String ACTION_STATUS_FAIL = "FAIL";

    /**
     * IM发消息是否同步到发送方（1-同步，2-不同步）
     */
    public final static Integer SYNC_OTHER_MACHINE_YES = 1;
    public final static Integer SYNC_OTHER_MACHINE_NO = 2;

    /**
     * IM消息对象类型：
     * TIMTextElem	文本消息。
     * TIMLocationElem	地理位置消息。
     * TIMFaceElem	表情消息。
     * TIMCustomElem	自定义消息，当接收方为 iOS 系统且应用处在后台时，此消息类型可携带除文本以外的字段到 APNs。一条组合消息中只能包含一个 TIMCustomElem 自定义消息元素。
     * TIMSoundElem	语音消息。
     * TIMImageElem	图像消息。
     * TIMFileElem	文件消息。
     * TIMVideoFileElem	视频消息。
     */
    public final static String TIM_TEXT_ELEM = "TIMTextElem";
    public final static String TIM_LOCATION_ELEM = "TIMLocationElem";
    public final static String TIM_FACE_ELEM = "TIMFaceElem";
    public final static String TIM_CUSTOM_ELEM = "TIMCustomElem";
    public final static String TIM_SOUND_ELEM = "TIMSoundElem";
    public final static String TIM_IMAGE_ELEM = "TIMImageElem";
    public final static String TIM_FILE_ELEM = "TIMFileElem";
    public final static String TIM_VIDEOFILE_ELEM = "TIMVideoFileElem";

    /**
     * 微信响应消息类型
     * WX_MSG_TYPE_EVENT：事件类型，事件类型对应"user_enter_tempsession"表示建立会话
     * WX_MSG_TYPE_TEXT：文本类型
     * WX_MSG_TYPE_TEXT：图片类型
     * WX_MSG_TYPE_TEXT：小程序卡片
     */
    public final static String WX_MSG_TYPE_EVENT = "event";
    public final static String WX_MSG_TYPE_TEXT = "text";
    public final static String WX_MSG_TYPE_IMAGE = "image";
    public final static String WX_MSG_TYPE_APPLET_CARD = "miniprogrampage";

}
