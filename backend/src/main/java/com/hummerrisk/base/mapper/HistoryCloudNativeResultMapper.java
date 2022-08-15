package com.hummerrisk.base.mapper;

import com.hummerrisk.base.domain.HistoryCloudNativeResult;
import com.hummerrisk.base.domain.HistoryCloudNativeResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HistoryCloudNativeResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    long countByExample(HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int deleteByExample(HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int insert(HistoryCloudNativeResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int insertSelective(HistoryCloudNativeResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    List<HistoryCloudNativeResult> selectByExampleWithBLOBs(HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    List<HistoryCloudNativeResult> selectByExample(HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    HistoryCloudNativeResult selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByExampleSelective(@Param("record") HistoryCloudNativeResult record, @Param("example") HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByExampleWithBLOBs(@Param("record") HistoryCloudNativeResult record, @Param("example") HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByExample(@Param("record") HistoryCloudNativeResult record, @Param("example") HistoryCloudNativeResultExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByPrimaryKeySelective(HistoryCloudNativeResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByPrimaryKeyWithBLOBs(HistoryCloudNativeResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table history_cloud_native_result
     *
     * @mbg.generated Tue Aug 16 01:12:36 CST 2022
     */
    int updateByPrimaryKey(HistoryCloudNativeResult record);
}