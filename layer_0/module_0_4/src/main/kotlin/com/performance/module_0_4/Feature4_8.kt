package com.performance.module_0_4

data class Feature4Data1(
    val id: String = "data_1",
    val name: String = "Feature 4 Data 1",
    val description: String = "Description for data class 1",
    val timestamp: Long = System.currentTimeMillis(),
    val metadata: Map<String, Any> = emptyMap()
)
