package com.hummerrisk.base.domain;

import java.io.Serializable;

public class PackageDependencyJsonItem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column package_dependency_json_item.id
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column package_dependency_json_item.result_id
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    private String resultId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column package_dependency_json_item.severity
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    private String severity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column package_dependency_json_item.name
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column package_dependency_json_item.source
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table package_dependency_json_item
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column package_dependency_json_item.id
     *
     * @return the value of package_dependency_json_item.id
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column package_dependency_json_item.id
     *
     * @param id the value for package_dependency_json_item.id
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column package_dependency_json_item.result_id
     *
     * @return the value of package_dependency_json_item.result_id
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    public String getResultId() {
        return resultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column package_dependency_json_item.result_id
     *
     * @param resultId the value for package_dependency_json_item.result_id
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    public void setResultId(String resultId) {
        this.resultId = resultId == null ? null : resultId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column package_dependency_json_item.severity
     *
     * @return the value of package_dependency_json_item.severity
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column package_dependency_json_item.severity
     *
     * @param severity the value for package_dependency_json_item.severity
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    public void setSeverity(String severity) {
        this.severity = severity == null ? null : severity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column package_dependency_json_item.name
     *
     * @return the value of package_dependency_json_item.name
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column package_dependency_json_item.name
     *
     * @param name the value for package_dependency_json_item.name
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column package_dependency_json_item.source
     *
     * @return the value of package_dependency_json_item.source
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column package_dependency_json_item.source
     *
     * @param source the value for package_dependency_json_item.source
     *
     * @mbg.generated Fri Sep 02 05:45:55 CST 2022
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }
}