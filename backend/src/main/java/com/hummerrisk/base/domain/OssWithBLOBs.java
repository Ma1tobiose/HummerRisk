package com.hummerrisk.base.domain;

import java.io.Serializable;

public class OssWithBLOBs extends Oss implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oss.credential
     *
     * @mbg.generated Sun Nov 06 08:31:33 CST 2022
     */
    private String credential;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oss.regions
     *
     * @mbg.generated Sun Nov 06 08:31:33 CST 2022
     */
    private String regions;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oss
     *
     * @mbg.generated Sun Nov 06 08:31:33 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss.credential
     *
     * @return the value of oss.credential
     *
     * @mbg.generated Sun Nov 06 08:31:33 CST 2022
     */
    public String getCredential() {
        return credential;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss.credential
     *
     * @param credential the value for oss.credential
     *
     * @mbg.generated Sun Nov 06 08:31:33 CST 2022
     */
    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oss.regions
     *
     * @return the value of oss.regions
     *
     * @mbg.generated Sun Nov 06 08:31:33 CST 2022
     */
    public String getRegions() {
        return regions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oss.regions
     *
     * @param regions the value for oss.regions
     *
     * @mbg.generated Sun Nov 06 08:31:33 CST 2022
     */
    public void setRegions(String regions) {
        this.regions = regions == null ? null : regions.trim();
    }
}