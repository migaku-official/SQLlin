package com.ctrip.sqllin.dsl.annotation

/**
 * Annotation for where property
 * @author yaqiao
 */

@Target(AnnotationTarget.CLASS)
annotation class DBRow(val tableName: String = "")