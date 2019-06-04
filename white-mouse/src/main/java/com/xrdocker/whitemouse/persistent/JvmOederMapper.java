package com.xrdocker.whitemouse.persistent;

import org.apache.ibatis.annotations.Param;
import com.xrdocker.whitemouse.persistent.entity.JvmOeder;
import com.xrdocker.whitemouse.persistent.entity.JvmOederExample;
import com.xrdocker.whitemouse.persistent.entity.JvmOederWithBLOBs;

import java.util.List;

public interface JvmOederMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    int countByExample(JvmOederExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    int deleteByExample(JvmOederExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    int insert(JvmOederWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    int insertSelective(JvmOederWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    List<JvmOederWithBLOBs> selectByExampleWithBLOBs(JvmOederExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    List<JvmOeder> selectByExample(JvmOederExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    JvmOederWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") JvmOederWithBLOBs record, @Param("example") JvmOederExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") JvmOederWithBLOBs record, @Param("example") JvmOederExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    int updateByExample(@Param("record") JvmOeder record, @Param("example") JvmOederExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    int updateByPrimaryKeySelective(JvmOederWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(JvmOederWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jvm_oeder
     *
     * @mbggenerated Mon Jun 03 17:11:39 CST 2019
     */
    int updateByPrimaryKey(JvmOeder record);

    List<JvmOederWithBLOBs> selectAll();

    List<String> getMnemonicList();
}