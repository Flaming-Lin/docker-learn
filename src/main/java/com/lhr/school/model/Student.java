package com.lhr.school.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    /**
     * 学生ID
     */
    private Long studentId;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 院系
     */
    private String department;
    /**
     * 专业
     */
    private String major;
}
