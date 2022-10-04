package com.hummerrisk.base.domain;

import java.io.Serializable;

public class HistoryServerTask implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.server_id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String serverId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.server_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String serverName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.rule_id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String ruleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.rule_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String ruleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.rule_desc
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String ruleDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.result_status
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String resultStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.severity
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String severity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.create_time
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.update_time
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private Long updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.apply_user
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String applyUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.server_group_id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String serverGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.server_group_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String serverGroupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.plugin_icon
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String pluginIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.ip
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.port
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String port;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.user_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.password
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.is_severity
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private Boolean isSeverity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_server_task.return_log
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private String returnLog;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table history_server_task
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.id
     *
     * @return the value of history_server_task.id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.id
     *
     * @param id the value for history_server_task.id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.server_id
     *
     * @return the value of history_server_task.server_id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.server_id
     *
     * @param serverId the value for history_server_task.server_id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setServerId(String serverId) {
        this.serverId = serverId == null ? null : serverId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.server_name
     *
     * @return the value of history_server_task.server_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.server_name
     *
     * @param serverName the value for history_server_task.server_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.rule_id
     *
     * @return the value of history_server_task.rule_id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.rule_id
     *
     * @param ruleId the value for history_server_task.rule_id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.rule_name
     *
     * @return the value of history_server_task.rule_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.rule_name
     *
     * @param ruleName the value for history_server_task.rule_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.rule_desc
     *
     * @return the value of history_server_task.rule_desc
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getRuleDesc() {
        return ruleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.rule_desc
     *
     * @param ruleDesc the value for history_server_task.rule_desc
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc == null ? null : ruleDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.result_status
     *
     * @return the value of history_server_task.result_status
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getResultStatus() {
        return resultStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.result_status
     *
     * @param resultStatus the value for history_server_task.result_status
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus == null ? null : resultStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.severity
     *
     * @return the value of history_server_task.severity
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.severity
     *
     * @param severity the value for history_server_task.severity
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setSeverity(String severity) {
        this.severity = severity == null ? null : severity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.create_time
     *
     * @return the value of history_server_task.create_time
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.create_time
     *
     * @param createTime the value for history_server_task.create_time
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.update_time
     *
     * @return the value of history_server_task.update_time
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.update_time
     *
     * @param updateTime the value for history_server_task.update_time
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.apply_user
     *
     * @return the value of history_server_task.apply_user
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getApplyUser() {
        return applyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.apply_user
     *
     * @param applyUser the value for history_server_task.apply_user
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser == null ? null : applyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.server_group_id
     *
     * @return the value of history_server_task.server_group_id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.server_group_id
     *
     * @param serverGroupId the value for history_server_task.server_group_id
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId == null ? null : serverGroupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.server_group_name
     *
     * @return the value of history_server_task.server_group_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getServerGroupName() {
        return serverGroupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.server_group_name
     *
     * @param serverGroupName the value for history_server_task.server_group_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setServerGroupName(String serverGroupName) {
        this.serverGroupName = serverGroupName == null ? null : serverGroupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.plugin_icon
     *
     * @return the value of history_server_task.plugin_icon
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getPluginIcon() {
        return pluginIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.plugin_icon
     *
     * @param pluginIcon the value for history_server_task.plugin_icon
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setPluginIcon(String pluginIcon) {
        this.pluginIcon = pluginIcon == null ? null : pluginIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.ip
     *
     * @return the value of history_server_task.ip
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.ip
     *
     * @param ip the value for history_server_task.ip
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.port
     *
     * @return the value of history_server_task.port
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.port
     *
     * @param port the value for history_server_task.port
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.user_name
     *
     * @return the value of history_server_task.user_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.user_name
     *
     * @param userName the value for history_server_task.user_name
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.password
     *
     * @return the value of history_server_task.password
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.password
     *
     * @param password the value for history_server_task.password
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.is_severity
     *
     * @return the value of history_server_task.is_severity
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public Boolean getIsSeverity() {
        return isSeverity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.is_severity
     *
     * @param isSeverity the value for history_server_task.is_severity
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setIsSeverity(Boolean isSeverity) {
        this.isSeverity = isSeverity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_server_task.return_log
     *
     * @return the value of history_server_task.return_log
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public String getReturnLog() {
        return returnLog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_server_task.return_log
     *
     * @param returnLog the value for history_server_task.return_log
     *
     * @mbg.generated Wed Oct 05 03:58:56 CST 2022
     */
    public void setReturnLog(String returnLog) {
        this.returnLog = returnLog == null ? null : returnLog.trim();
    }
}