package com.example.tencentcloudim.constant;

/**
 * @description: 腾讯im相关API接口
 * @author: zyb
 * @date: 2021/5/27 17:58
 */
public class TencentCloudImApiConstant {
    /**
     * 账号管理
     */
    public static class AccountManage {
        /**导入单个帐号*/
        public static final String ACCOUNT_IMPORT = "v4/im_open_login_svc/account_import";
        /**导入多个帐号*/
        public static final String MULTI_ACCOUNT_IMPORT = "v4/im_open_login_svc/account_import";
        /**删除帐号*/
        public static final String ACCOUNT_DELETE = "v4/im_open_login_svc/account_delete";
        /**查询帐号*/
        public static final String ACCOUNT_CHECK = "v4/im_open_login_svc/account_check";
        /**失效帐号登录状态*/
        public static final String ACCOUNT_KICK = "v4/im_open_login_svc/kick";
        /**查询账号在线状态*/
        public static final String ACCOUNT_QUERY_STATE = "v4/openim/querystate";
    }

    /**
     * 单聊消息
     */
    public static class SingleChatManage {
        /**单发单聊消息*/
        public static final String SEND_MSG = "v4/openim/sendmsg";
        /**批量发单聊消息*/
        public static final String BATCH_SEND_MSG = "v4/openim/batchsendmsg";
        /**导入单聊消息*/
        public static final String IMPORT_MSG = "v4/openim/importmsg";
        /**查询单聊消息*/
        public static final String ADMIN_GET_ROAM_MSG = "v4/openim/admin_getroammsg";
        /**撤回单聊消息*/
        public static final String ADMIN_MSG_WITH_DRAW = "v4/openim/admin_msgwithdraw";
        /**设置单聊消息已读*/
        public static final String ADMIN_SET_MSG_READ = "v4/openim/admin_set_msg_read";
    }

    /**
     * 全员推送
     */
    public static class AllPushManage {
        /**全员推送*/
        public static final String IM_PUSH = "v4/all_member_push/im_push";
        /**设置应用属性名称*/
        public static final String IM_SET_ATTR_NAME = "v4/all_member_push/im_set_attr_name";
        /**获取应用属性名称*/
        public static final String IM_GET_ATTR_NAME = "v4/all_member_push/im_get_attr_name";
        /**获取用户属性*/
        public static final String IM_GET_ATTR = "v4/all_member_push/im_get_attr";
        /**设置用户属性*/
        public static final String IM_SET_ATTR = "v4/all_member_push/im_set_attr";
        /**删除用户属性*/
        public static final String IM_REMOVE_ATTR = "v4/all_member_push/im_remove_attr";
        /**获取用户标签*/
        public static final String IM_GET_TAG = "v4/all_member_push/im_get_tag";
        /**添加用户标签*/
        public static final String IM_ADD_TAG = "v4/all_member_push/im_add_tag";
        /**删除用户标签*/
        public static final String IM_REMOVE_TAG = "v4/all_member_push/im_remove_tag";
        /**删除用户所有标签*/
        public static final String IM_REMOVE_ALL_TAGS = "v4/all_member_push/im_remove_all_tags";
    }

    /**
     * 资料管理
     */
    public static class PortraitManage {
        /**设置资料*/
        public static final String PORTRAIT_SET = "v4/profile/portrait_set";
        /**拉取资料*/
        public static final String PORTRAIT_GET = "v4/profile/portrait_get";
    }

    /**
     * 关系链管理
     */
    public static class RelationManage {
        /**添加好友*/
        public static final String FRIEND_ADD = "v4/sns/friend_add";
        /**导入好友*/
        public static final String FRIEND_IMPORT = "v4/sns/friend_import";
        /**更新好友*/
        public static final String FRIEND_UPDATE = "v4/sns/friend_update";
        /**删除好友*/
        public static final String FRIEND_DELETE = "v4/sns/friend_delete";
        /**删除所有好友*/
        public static final String FRIEND_DELETE_ALL = "v4/sns/friend_delete_all";
        /**校验好友*/
        public static final String FRIEND_CHECK = "v4/sns/friend_check";
        /**拉取好友*/
        public static final String FRIEND_GET = "v4/sns/friend_get";
        /**拉取指定好友*/
        public static final String FRIEND_GET_LIST = "v4/sns/friend_get_list";
        /**添加黑名单*/
        public static final String BLACK_LIST_ADD = "v4/sns/black_list_add";
        /**删除黑名单*/
        public static final String BLACK_LIST_DELETE = "v4/sns/black_list_delete";
        /**拉取黑名单*/
        public static final String BLACK_LIST_GET = "v4/sns/black_list_get";
        /**校验黑名单*/
        public static final String BLACK_LIST_CHECK = "v4/sns/black_list_check";
        /**添加分组*/
        public static final String GROUP_ADD = "v4/sns/group_add";
        /**删除分组*/
        public static final String GROUP_DELETE = "v4/sns/group_delete";
        /**拉取分组*/
        public static final String GROUP_GET = "v4/sns/group_get";
    }

    /**
     * 群组管理
     */
    public static class GroupManage {
        /**创建群组*/
        public static final String CREATE_GROUP = "v4/group_open_http_svc/create_group";
        /**获取群详细资料*/
        public static final String GET_GROUP_INFO = "v4/group_open_http_svc/get_group_info";
        /**获取群成员详细资料*/
        public static final String GET_GROUP_MEMBER_INFO = "v4/group_open_http_svc/get_group_member_info";
        /**修改群基础资料*/
        public static final String MODIFY_GROUP_BASE_INFO = "v4/group_open_http_svc/modify_group_base_info";
        /**增加群成员*/
        public static final String ADD_GROUP_MEMBER = "v4/group_open_http_svc/add_group_member";
        /**删除群成员*/
        public static final String DELETE_GROUP_MEMBER = "v4/group_open_http_svc/delete_group_member";
        /**修改群成员资料*/
        public static final String MODIFY_GROUP_MEMBER_INFO = "v4/group_open_http_svc/modify_group_member_info";
        /**解散群组*/
        public static final String DESTROY_GROUP = "v4/group_open_http_svc/destroy_group";
        /**获取用户所加入的群组*/
        public static final String GET_JOINED_GROUP_LIST = "v4/group_open_http_svc/get_joined_group_list";
        /**查询用户在群组中的身份*/
        public static final String GET_ROLE_IN_GROUP = "v4/group_open_http_svc/get_role_in_group";
        /**批量禁言和取消禁言*/
        public static final String FORBID_SEND_MSG = "v4/group_open_http_svc/forbid_send_msg";
        /**获取被禁言群成员列表*/
        public static final String GET_GROUP_SHUT_UIN = "v4/group_open_http_svc/get_group_shutted_uin";
        /**在群组中发送普通消息*/
        public static final String SEND_GROUP_MSG = "v4/group_open_http_svc/send_group_msg";
        /**在群组中发送系统通知*/
        public static final String SEND_GROUP_SYSTEM_NOTIFICATION = "v4/group_open_http_svc/send_group_system_notification";
        /**撤回群消息*/
        public static final String GROUP_MSG_RECALL = "v4/group_open_http_svc/group_msg_recall";
        /**转让群主*/
        public static final String CHANGE_GROUP_OWNER = "v4/group_open_http_svc/change_group_owner";
        /**导入群基础资料*/
        public static final String IMPORT_GROUP = "v4/group_open_http_svc/import_group";
        /**导入群消息*/
        public static final String IMPORT_GROUP_MSG = "v4/group_open_http_svc/import_group_msg";
        /**导入群成员*/
        public static final String IMPORT_GROUP_MEMBER = "v4/group_open_http_svc/import_group_member";
        /**设置成员未读消息计数*/
        public static final String SET_UNREAD_MSG_NUM = "v4/group_open_http_svc/set_unread_msg_num";
        /**删除指定用户发送的消息*/
        public static final String DELETE_GROUP_MSG_BY_SENDER = "v4/group_open_http_svc/delete_group_msg_by_sender";
        /**拉取群历史消息*/
        public static final String GROUP_MSG_GET_SIMPLE = "v4/group_open_http_svc/group_msg_get_simple";
        /**获取直播群在线人数*/
        public static final String GET_ONLINE_MEMBER_NUM = "v4/group_open_http_svc/get_online_member_num";
    }

    /**
     * 全局禁言管理
     */
    public static class AllSinentManage {
        /**设置全局禁言*/
        public static final String SET_NO_SPEAKING = "v4/openconfigsvr/setnospeaking";
        /**查询全局禁言*/
        public static final String GET_NO_SPEAKING = "v4/openconfigsvr/getnospeaking";
    }

    /**
     * 运营管理
     */
    public static class OperationManage {
        /**拉取运营数据*/
        public static final String GET_APP_INFO = "v4/openconfigsvr/getappinfo";
        /**下载消息记录*/
        public static final String GET_HISTORY = "v4/open_msg_svc/get_history";
        /**获取服务器 IP 地址*/
        public static final String GET_IP_LIST = "v4/ConfigSvc/GetIPList";
    }
}
